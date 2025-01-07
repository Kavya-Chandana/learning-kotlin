fun main() {
   val n = 5
   var k = 0
   for (i in 0..<n){
       for(j in 0..i){
           print("${((j+k)+1)*2} ")
       }
       k = i+k+1
       print("\n")
   }
   
}

