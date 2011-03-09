
def fact(x:BigInt):BigInt = if (x == 1) 1 else x * fact(x-1)

val r = fact(100).toString.view.foldLeft(0)( (s,n) => n.asDigit + s)

println(r)