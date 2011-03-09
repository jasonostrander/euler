// euler 6

def ssq(n:Int):Int = (1 to n).map(math.pow(_, 2)).sum.toInt
def sqs(n:Int):Int = math.pow((1 to n).sum, 2).toInt
def dif(n:Int):Int = sqs(n) - ssq(n)
assert(dif(10) == 2640)

println(dif(100))