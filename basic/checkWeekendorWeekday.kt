//check whether the given day is a weekday or weekend

fun main(){ 
    checkDays("monday")
    checkDays("tuesday")
    checkDays("sunday")
    checkDays("kavya")
}

fun checkDays(a:String){
    if(a=="sunday"){
        println("the given day,$a is weekend")
    }else if(a=="saturday"){
        println("the given day,$a is weekend")
    }else if(a=="monday"){
        println("the given day,$a is weekday")
    }else if(a=="tuesday"){
        println("the given day,$a is weekday")
    }else if(a=="thursday"){
        println("the given day,$a is weekday")
    }else if(a=="friday"){
        println("the given day,$a is weekday")
    }else if(a=="wednesday"){
        println("the given day,$a is weekday")
    }else{
        println("invalid input")
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
