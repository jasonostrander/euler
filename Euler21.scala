// Euler21

def d(n:Int):Int = (1 until n).filter(n % _ == 0).sum
assert(d(220) == 284)
assert(d(284) == 220)

def test(n:Int):Boolean = {
	val r = d(n)
	if (r != n && d(r) == n) true
	else false
}
assert(test(220))

val result = (1 until 10000).filter(test(_))
println(result, result.sum)