def isPrime(n:Int) = (2 to math.sqrt(n).toInt).forall(n % _ != 0)
assert(isPrime(17))
assert(!isPrime(10))

val n = args(0).toLong

val result = (2 to math.sqrt(n).toInt).filter(n % _ == 0).filter(isPrime).last
println(result)
