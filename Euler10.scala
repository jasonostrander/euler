
object Euler10 extends Application {

    def isPrime(n:Long):Boolean = {
        for (i <- 2 to math.sqrt(n).toInt)
            if (n % i == 0) return false
        return true
    }

    override def main(args:Array[String]) = {
        val l = (2.toLong until args(0).toLong).toList.filter(isPrime)
        println(l.sum)
    }
}