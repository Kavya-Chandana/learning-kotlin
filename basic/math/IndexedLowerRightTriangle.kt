fun main() {
   val n = 5
   for (i in 0..<n){
       for(j in 0..<n-i){
           print("${j+1}")
       }
       print("\n")
   }
   
}
