// Euler 30
val N = 5
val limit = Stream.from(1).takeWhile(n => (n*math.pow(9,N)).toInt.toString.length >= n).last
val r = Stream.from(2).takeWhile(n => n.toString.length <= limit).filter(n => n.toString.view.map(c => math.pow(c.asDigit,N) ).sum == n ).sum
println(r)