// euler 22

def worth(s:String):Int = s.view.map( _.toInt - 'A'.toInt + 1).sum
assert(worth("COLIN") == 53)

val names = io.Source.fromFile("names.txt").mkString.split(',').toList.map( s => s.slice(1, s.length-1) ).sortWith( (a,b) => a<b)

val result = names.zipWithIndex.foldLeft(0)( (s, n) => s + (worth(n._1) * (n._2 + 1) ) )

println(result)
