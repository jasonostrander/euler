

object LargestPrime extends Application {
    def from(n:Long): Stream[Long] = 
        Stream.cons(n, from(n + 1))

    
    def primeFactor(n:Long):List[Long] = {
        var values = List[Long]()
        var t = n
        var i = 2
        while(true) {
            println(values)
            while (t % i == 0) {
                values = i :: values
                t /= i
            }

            if (i > n) return values
            i += 1
        }
        return values
    }
    

    override def main(args: Array[String]) = {
        val n = args(0).toLong
        println("Prime factors of " + n)


        println(primeFactor(n))
    }
}
