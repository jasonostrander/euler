

object LargestPalindrome extends Application {
    val max = 999*999
    val min = 100*100

    def isPalindrome(a:Int):Boolean = a.toString == a.toString.reverse

    def from(): Stream[Int] = 
        (min to max).reverse.toStream.filter(a => isPalindrome(a))

    def tdf(a:Int):Boolean = {
        for (i <- 1 to a) {
            if (a % i == 0) {
                // this is a factor
                if (i > 99 && i < 1000 && a/i > 99 && a/i < 1000) {
                    println( (i, a/i, a) )
                    return true
                }
            }
        }
        return false
    }

    override def main(args: Array[String]) = {
        println("Largest palindrome of product of two 3-digit numbers")
        from().takeWhile(!tdf(_)).last
    }
}
