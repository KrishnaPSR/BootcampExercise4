package com.example.exercise4
//lambda Function to calculate SimpleInterest
fun main(args: Array<String>){
    val SI={p:Int,r:Int,t:Int->p*r*t/100}
    val result=SI(1000,5,2)
    println(result)
}