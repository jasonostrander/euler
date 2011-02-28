
object SumOfPowers extends Application {
    def fact(n:Int):Int = {
        if (n < 2) return 1
        (2 to n).reduceLeft(_*_)
    }

    def bn(n:Int, k:Int):Int = fact(n)/(fact(n-k)*fact(k))

    def fract(k:Int):List[Double] = (1 to k+1).map(1.0/_).toList

    def nextRow(i:Int, k:Int, l:List[List[Double]]):List[Double] = {
        var result = List[Double]()
        var d = 0.0
        for (j <- 0 to k) {
            d = (j+1) * (l(i-1)(j) - l(i-1)(j+1))
            result = d :: result
        }
        result.reverse
    }

    def bernouli(k:Int):Double = {
        var l = List[List[Double]](fract(k))
        for (i <- 1 to k) {
            l = (nextRow(i, k-i, l) :: l.reverse).reverse
        }
        val result:List[Double] = l.map(_(0))
        result(k)
    }

    def S(m:Int, n:Int):Int = {
        var l = List[Double]()
        for (k <- 1 to n) {
            l = bn(m+1, k)*bernouli(k)*math.pow(n, m+1-k) :: l
            println(l)
        }
        println("result = " + l)
        (1.0/(m+1)*l.reduceLeft(_+_)).toInt
    }

    override def main(args: Array[String]) = {
        val k = args(0).toInt
        println("Bernouli number k=" + k)
        println(bernouli(k))
        println(S(10, 100))
    }
}
