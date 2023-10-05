fun main() {
    // code here
    val constant = 3.14
    var name = "Zuck"

    var language: String      // variable declaration of type String
    language = "French"       // variable initialization

    val score: Int          // variable declaration of type Int 
    score = 95             // variable initialization 

    /*
    val (Immutable reference) - The variable declared using val keyword cannot be changed once the value is assigned.
        It is similar to final variable in Java.

    var (Mutable reference) - The variable declared using var keyword can be changed later in the program.
        It corresponds to regular Java variable.
    */

    /* 
    Numbers
    
    Characters
    
    Booleans
    
    Arrays
    */

    /*
    Number Type
    
    Numbers in Kotlin are similar to Java. There are 6 built-in types representing numbers.

    Byte  --> 8bit
    Short --> 16bit
    Int --> 4byte
    Long --> 8byte
    Float --> 4byte floating point. 
    Double --> 8byte floating point. 
    */

    /*
    Character Type
    char --> one Character eg: 'k'
    */

    /*
    Boolean --> true or false
    */

    // Number Type
    val byteNumber: Byte = 12
    val shortNumber: Short = 130
    val intNumber :Int = 5478934
    val longNumber :Int = 2547
    
    val floatNumber :Float = 12.5F
    val doubleNumber :Double = 5.33

    val charText :Char = 'a'

    val booleanValuel :Boolean = true


    println(" Byte :: $byteNumber \n Short :: $shortNumber \n Integer :: $intNumber \n Long :: $longNumber \n Float :: $floatNumber \n Double :: $doubleNumber \n Char :: $charText \n Boolean :: $booleanValuel")
}