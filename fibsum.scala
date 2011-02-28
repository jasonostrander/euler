
def fib(n:Int):Int = {
    var sum = 0
    var prev = 1
    var cur = 1
    var temp=0
    var i = 0
    while (cur < n) {
        if (cur % 2 == 0) sum += cur
        temp = cur
        cur = cur + prev
        prev = temp
        if (i % 10 == 0) print('.')
        i += 1
    }
    println()
    sum
}

println(fib(4000000))