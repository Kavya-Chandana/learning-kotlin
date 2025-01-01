fun main() {
   val n = 5
   for (i in 0..<n){
       for(j in 0..<n-i-1){
           print(" ")
       }
       for(j in 0..i*2){
           print("*")
       }
       print("\n")
   }
   
}
