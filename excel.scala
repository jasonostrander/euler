
class Excel {
    def toLetter(index:Int):String = {
        val base = 65
        val col = index - 1
        var result = ""
        if (col >= 26) {
            result += Character.toChars(col/26 + base - 1)(0)
        }
        result += Character.toChars(col%26 + base)(0)
        result
    }

    def toNumber(col:String):Int = {
        var result = 0
        col.size match {
            case 1 => result = col.charAt(0) - 65 + 1
            case 2 => result = col.charAt(1) - 65 + 1 + 26*(col.charAt(0)-65 + 1)
        }
        result
    }

}

object Excel extends Application {
    override def main(args: Array[String]) = {
        val e = new Excel()
        //println(e.toLetter(Integer.parseInt(args(0))))
        println(e.toNumber(args(0)))
    }
}