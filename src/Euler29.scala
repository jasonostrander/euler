// Euler 29

val t = for (i <- 2 to 100; j <- 2 to 100) yield (i,j)
val r = t.map(p => math.pow(p._1, p._2) ).toList.sortWith(_<_).distinct.length
println(r)