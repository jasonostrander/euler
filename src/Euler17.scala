// Euler 17

def split(n:Int):List[Int] = n.toString.toList.map(_.asDigit)
assert(split(342) == List(3,4,2))

def first(n:Int):String = {
    assert(n < 20)

    n match {
        case 0 => ""
	    case 1 => "one"
	    case 2 => "two"
        case 3 => "three"
        case 4 => "four"
        case 5 => "five"
        case 6 => "six"
        case 7 => "seven"
        case 8 => "eight"
        case 9 => "nine"
        case 10 => "ten"
        case 11 => "eleven"
        case 12=> "twelve"
        case 13 => "thirteen"
        case 14 => "fourteen"
        case 15 => "fifteen"
        case 16 => "sixteen"
        case 17 => "seventeen"
        case 18 => "eighteen"
        case 19 => "nineteen"
    }
}

def second(n:Int):String = {
    val l = split(n)

    if (l.length < 2)
        return first(n)

    l.head match {
        case 2 => "twenty" + first(l.tail.mkString.toInt)
        case 3 => "thirty" + first(l.tail.mkString.toInt)
        case 4 => "forty" + first(l.tail.mkString.toInt)
        case 5 => "fifty" + first(l.tail.mkString.toInt)
        case 6 => "sixty" + first(l.tail.mkString.toInt)
        case 7 => "seventy" + first(l.tail.mkString.toInt)
        case 8 => "eighty" + first(l.tail.mkString.toInt)
        case 9 => "ninety" + first(l.tail.mkString.toInt)
        case x => first(n)
    }
}
assert(second(42).length == 8)

def number(n:Int):String = n match {
    case x if x < 20 => first(x)
    case x if x < 100 => second(x)
    case 1000 => "onethousand"
    case x if x % 100 == 0 => {
        val l = split(x)
        first(l.head) + "hundred"
    }
    case x if x < 1000 => {
        val l = split(x)
        first(l.head) + "hundredand" + second(l.tail.mkString.toInt)
    }
    case _ => println("something went wrong"); "" // should never be here
}

def count(n:Int) = number(n).length

assert(count(342) == 23)
assert(count(115) == 20)
assert(count(100) == 10)
assert(count(5) == 4)
assert(count(1000) == 11)
assert( (1 to 5).map(count).sum == 19 )

println( (1 to 1000).map(number).map(_.length).sum )

