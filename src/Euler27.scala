// Euler 27

def prime(n:Int):Boolean = Stream.from(2).takeWhile(x => x*x <= math.abs(n)).find(n % _ == 0).isEmpty
assert(prime(3))
assert(prime(5))
assert(prime(11))
assert(!prime(-1000))

def quad(a:Int, b:Int)(n:Int) = n*n + a*n + b

val limit = 1000
var max = (0,0,0)
for (i <- -limit to limit) {
	for (j <- -limit to limit) {
		val l = Stream.from(0).map(quad(i, j)(_)).takeWhile(prime).length
		if (l > max._3) {
			max = (i, j, l)
		}
	}
}

println(max)