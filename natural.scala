def natural(n:Int, sum:Int):Int = {
    if (n < 3) return sum
    if (n % 3 == 0 || n % 5 == 0) {
        return natural(n-1, sum+n)
    }
    return natural(n-1, sum)
}

println(natural(999, 0))
