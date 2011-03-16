import scala.annotation.tailrec

def triangle(n:Int):Int = {
	@tailrec def inner(s:Int, n:Int):Int = n match {
		case 0 => s
		case _ => inner(s+n, n-1)
	}
	inner(0, n)
}
assert(triangle(7) == 28)

def factors(n:Int):Int = (1 to math.sqrt(n).toInt).count(n % _ == 0)*2
assert(factors(28) > 5)

val result = Stream.from(1).find( (a) => factors(triangle(a)) > 500).get
println(triangle(result))