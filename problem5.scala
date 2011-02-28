object Problem5 extends Application {
    var end = 0

    def from(n: Int): Stream[Int] =
        Stream.cons(n, from(n + 1))

    def sieve(s: Stream[Int]): Stream[Int] =
        Stream.cons(s.head, sieve(s.tail filter { _ % s.head != 0 }))

    def primes = sieve(from(2))

    def verify(n:Int):Boolean = {
        for (i <- 2 to end) {
            if (n % i != 0) {
                return false
            }
        }
        return true
    }

    def find(n:Int):Int = {
        var running = n
        for (i <- (2 to end).reverse) {
            if (running%i != 0) {
                running = find( (running * i)/(n%i))
            }
        }
        return running
    }

    override def main(args: Array[String]) = {
        end = args(0).toInt
        println("Largest number event divisible by 1 to " + end)
        var init = primes.takeWhile(_<=end).reduceLeft(_*_)
        var result = find(init)
        println(result + " " + verify(result))
    }
}
