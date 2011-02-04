
def jenkens(key:String):Int = {
	var hash:Int = 0
	for (i <- 0 until key.length) {
		hash += key(i)
		hash += hash << 10
		hash ^= hash >> 6
	}

	hash += hash << 3
	hash ^= hash >> 11
	hash += hash << 15
	hash
}

def upHash(key:String):Int = {
	jenkens(key) >> 16
}

def downHash(key:String):Int = {
	jenkens(key) & 0x0000ffff
}

println(upHash("jason"))
println(downHash("jason"))