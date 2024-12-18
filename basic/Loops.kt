/**
 * loop - condition based excution of a block of code over iterations
 * iteration - one cycle of excution of a given {block of code} 
 * two kind of loop
 * for - iterate over a collection (ex-weekday- m,t,w,th,f)
 * while - iterate until the condition becomes false , checks before iteration
 * do while - check for the condition after the iteration - 
 * it run atleast 1 time even the condition is false 
 * for(i in a..b){ 
 * do something here 
 * } 
 * a <= i <= b - used math notation
 * a..<b 
 * 

 */
fun main(){
    for(i in 0..5){
        println(i)//-----case-increment 1
    }
    println("------------")
    for(i in 5 downTo 0){
        println(i)//-----case- decrement 1
    } 
//       5<=i<=0
    println("------------")
    for(i in 0..10 step 2){
        println(i)//case - increment x steps 
    }
}
