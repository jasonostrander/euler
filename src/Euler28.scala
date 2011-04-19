// Euler 28
val N = 1001*1001

println( (1 to 100000).filter(_%2==0).map(p => List(p,p,p,p)).flatten
	.foldLeft((1,1))( (a, e) => if (a._2 < N) (a._1 + a._2 + e, a._2 + e) else a )._1 )