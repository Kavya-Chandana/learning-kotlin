fun main() {
    val a = listOf(listOf(1,2),listOf(3,4))
    val b = listOf(listOf(5,6),listOf(7,8))
    val c = mutableListOf(mutableListOf(0,0),mutableListOf(0,0))
    println(a)
    println(b)

    for(i in 0..<a.size){
        for(j in 0..<b.size){
            for(k in 0..<b[j].size){
                c[i][j]=a[i][k]*b[k][j]+c[i][j] 
            }
        } 
    }
    println(c)
}
