// When as an expression
// Just like if-else, when can also be used as an expression by assigning it to a variable. Here is an example:

/**
var x : Any = 13.37
when(x) {
is Int -> println("$x is an Int")
!is Double -> println("$x is not Double")
is String -> println("$x is a String")
else -> println("$x is none of the above")
}
 **/

fun main() {
    val x : Any = 13.37
    //assign when to a variable
    val result =  when(x) {
    //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result")
}

// Now we have simplified the first when statement to a shorter and cleaner code using expression