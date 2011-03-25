// Euler 26
// I found these links very helpful in solving this
// http://mathworld.wolfram.com/DecimalExpansion.html
// http://www.lrz.de/~hr/numb/period.html

def k(n:Int):Int = Stream.from(1).find( x => (BigInt(10).pow(x)-1) % n == 0).get

val r = List.range(1, 1000)
	.filterNot(_ % 2 == 0)
	.filterNot(_ % 5 == 0)
	.foldLeft( (0, 0) )( (s, n) => if (k(n) > s._1) (n, k(n)) else s )

println(r)

