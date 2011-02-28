
def qsort: List[Int] => List[Int] = {
  case Nil => Nil
  case pivot :: tail =>
    println(pivot, tail)
    val (smaller, rest) = tail.partition(_ < pivot)
    qsort(smaller) ::: pivot :: qsort(rest)
}

val l = List(1,5,4,3,6,7,4,5,3,8)
println("orig list = " + l)
println(qsort(l))