// Euler 23

def abundant(n:Int):Boolean = (1 until n).filter(n % _ == 0).sum > n
assert(abundant(12))
assert((1 until 12).forall(!abundant(_)))

val abuns = (1 to 28123).filter(abundant)

val exc = abuns.view.flatMap { a => 
  abuns.takeWhile(_ <= (28123 - a)).map(a + _)
}

val result = 1 to 28123 diff exc
println(result.sum)