//check whether the given number is divisible by 2 or 3 or 6 

fun main(){ 
    checkDivBy6(5)
    checkDivBy6(12)
    checkDivBy6(144)
}

fun checkDivBy6(a:Int){
    if(a % 2 == 0 && a % 3 == 0){
        println("the given number,$a is divisible by 6")
    }else if(a % 2 == 0){
        println("the given number,$a is divisible by 2")
    }else if(a % 3 == 0){
        println("the given number,$a is divisible by 3")
    }else{
        println("the given number,$a is not divisible by 2 nor 3 nor 6")
    }
    
//     this condition to check all the cases and print them individually
//     if(a % 2 == 0 && a % 3 == 0){
//         println("the given number,$a is divisible by 6")
//     }
//     if(a % 2 == 0){
//         println("the given number,$a is divisible by 2")
//     }
//     if(a % 3 == 0){
//         println("the given number,$a is divisible by 3")
//     }else{
//         println("the given number,$a is not divisible by 2 nor 3 nor 6")
//     }
}
