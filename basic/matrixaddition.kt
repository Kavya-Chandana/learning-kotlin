/*An identity matrix of size 2 would be represented as val i = [ [1,0],[0,1] ]
 * 
 * adding two matrix a,b into c 
 */
fun main() {
    val a = mutableListOf(mutableListOf(1,2,3),mutableListOf(4,5,6))
    val b = mutableListOf(mutableListOf(-3,-1,2),mutableListOf(-4,-1,0))
    val c = mutableListOf(mutableListOf(0,0,0),mutableListOf(0,0,0))
    println(a)
    println(b)
    for (i in 0..< a.size){//1 for init i  + condition m = m+1 + m ite = 2m+2 
        for (j in 0..< a[i].size){// m*(2n+2)=2mn+2m
            c[i][j] = a[i][j]+b[i][j]//4*m*(2n+2)
            println(c[i][j]) //4*m*(2n+2)+1 = 8mn+8m+1    n^2
        }
    }
    println(c)
}
