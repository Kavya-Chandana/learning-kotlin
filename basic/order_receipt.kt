/* function to print the receipt of an order given the
 *  weight, flavour, steps and price
 * 
 * */
fun main(){
   printReceipt(500,"Butterschotch",3,1500.00)
  
}
fun printReceipt(weight:Int,flavour:String,steps:Int,price:Double){
    println("===============\nreceipt of your order:\n=================")
    println("Weight: ${weight}kg")
    println("Flavour: $flavour")
    println("Steps: $steps")
    println("Amount: $price")
    println("==================")
    
}
