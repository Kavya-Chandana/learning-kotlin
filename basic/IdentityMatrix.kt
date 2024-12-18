fun main() {
    val a = listOf(listOf(1,2,3),listOf(2,3,7),listOf(4,5,6))
    val b = listOf(listOf(0,2,3),listOf(2,2,7),listOf(4,5,5))
    val c = mutableListOf(mutableListOf(0,0,0),mutableListOf(0,0,0),mutableListOf(0,0,0))
    println(a)
    println(b)
    
    for(i in 0..<a.size){
        for(j in 0..<a[i].size){
            c[i][j] = a[i][j]-b[i][j]
        }
    }
    println(c)
}
