object FindPrime extends Application {
    def from(n:Int):Stream[Int] = Stream.cons(n, from(n+1))

    def sieve(s: Stream[Int]): Stream[Int] = 
        Stream.cons(s.head, sieve(s.tail.filter(_ % s.head != 0)))

    def isPrime(x:Int):Boolean = {
        for (i <- 2 to math.sqrt(x).toInt) {
            if (x % i == 0) return false
        }
        return true
    }

    def primes = from(2).filter(isPrime)

    override def main(args:Array[String]) {
        println(primes take args(0).toInt last)
    }
}