// Euler 24

def fact(n:Int):Int = n match {
	case 0 => 1
	case _ => (1 to n).reduceLeft(_*_)
}

def factoradic(n:Int):List[Int] = {
	val N = (1 to 10).map(fact).findIndexOf(_ >= n) + 1
	var t = n
	var r:List[Int] = Nil
	for (i <- List.range(0, N).reverse) {
		var f = fact(i)
		var temp = t/f
		r = temp :: r
		t = t - temp*f
	}
	r.reverse
}
assert(factoradic(13) == List(2,0,1,0))
assert(factoradic(859) == List(1,1,0,3,0,1,0))

val N = factoradic(999999) // euler is indexing from 1

var result:List[Int] = Nil
var nat = List.range(0, 10)
for (i <- N) {
	var t = nat(i)
	nat = nat.filterNot(_ == t)
	result = t :: result
}
println(result.reverse.mkString(""))