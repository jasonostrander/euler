
def from(n:BigInt):Stream[BigInt] = {
	if (n == 1)
		Stream.cons(n, Stream.empty)
	else if (n%2 == 0)
		Stream.cons(n, from(n/2))
	else
		Stream.cons(n, from(n*3 + 1))
}

var m = 0
var num = 1
for (i <- 1 until 1000000) {
	var r = from(i).takeWhile(_ >= 1).length
	if (r >= m) {
		m = r
		num = i
	}
}

println(num, m)

