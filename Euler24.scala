// Euler 24

val s = "0123456789"

def permutations[T](xs:List[T]):List[List[T]] = xs match {
	case Nil => List(Nil)
	case _ => for (x <- xs; ys <- permutations(xs diff List(x)) ) yield x::ys
}

println(permutations(s.toList)(1000000))