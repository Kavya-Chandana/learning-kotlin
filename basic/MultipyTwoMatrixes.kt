/*
 * to multipy two matrix values 
 * define 3 val A,B,C
 * A,B are the two matrix and c is the solution we get when we multipy A,B
 * i - iterates the no of rows in the matrix A(i*j)
 * j - iterates the no of col in the matrix A or no the rows in B
 * k - iterates the no of col in the matrix B(j*k)
 * simply -C[i][k]= A(i*j)*B(j*k)+ C[i][k] (j is cancelled)
 * size of the C[i][k] = i*k
 */
fun main() {
    val a = listOf(listOf(2,4),listOf(6,8))
    val b = listOf(listOf(1,3),listOf(5,7))
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
