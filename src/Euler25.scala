// euler 25

lazy val fib:Stream[BigInt] = 1 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)
val limit = (10:BigInt).pow(999)
println( (fib takeWhile(p => p < limit) size) + 1)
