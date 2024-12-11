/**
 * if condition 
 * used to excute set of code given a condition matches
 * if else 
 * if ,else if, else
 * logical operators - <,>,==,!=,<=,>=
 * concatenation operators - not(!),or(||),and(&&)
 * or-one true equation becomes true 
 * and -if one false equation becomes false
 * + ,-,*,/,% -arithmetic operation 
 * ceil(2.5,2.1 input - 3 output),
 * floor(2.5,2.1input-2output)
 * round(2.5 - 3 , 2.1-2) 
 */
fun main(){ 
   checkEvenOdd(5)// y not (5,6) will check later 
   checkEvenOdd(6) 
}
fun checkEvenOdd(a:Int){
    if(a%2 == 0){
        println("The given number, $a is even")
    }else{
        println("The given number, $a is odd ")   
    }   
}

