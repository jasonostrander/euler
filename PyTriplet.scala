
object PyTriplet extends Application {
    def c1(a:Int, b:Int, c:Int) = a < b && b < c
    def c2(a:Int, b:Int, c:Int) = math.pow(a,2) + math.pow(b,2) == math.pow(c, 2)
    def c3(a:Int, b:Int, c:Int) = a + b + c == 1000

    def brute():List[Int] = {
       for (a <- 1 until 1000) {
            for (b <- 1 until 1000) {
                for (c <- 1 until 1000) {
                    if (c1(a,b,c) && c2(a,b,c) && c3(a,b,c)) return List(a,b,c)
                }
            }
        }
        return List()
    }

    override def main(args:Array[String]) = {
        val result = brute()
        println(result, result.product)
    }
}