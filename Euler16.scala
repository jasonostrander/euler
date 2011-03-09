
var result = BigInt(2).pow(args(0).toInt).toString.view.foldLeft(0)( (s, n) => n.asDigit + s)

println(result)