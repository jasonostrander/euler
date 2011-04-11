lazy val fib:Stream[BigInt] = 0 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)

println(fib.takeWhile(_ < 4000000).filter(_%2==0).sum)