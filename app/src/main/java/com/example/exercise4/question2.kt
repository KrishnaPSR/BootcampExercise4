package com.example.exercise4

//Create a list of Employee which will have name and age as properties. print the name of all employees age >30.
data class employee(val name: String ,val age: Int)

fun main(args:Array<String>){
    var list:List<employee> = listOf(
            employee("Krishna",25),
            employee("Bhavesh",31),
            employee("Shivam",32),
            employee("Utsav",26),
            employee("Mayur",35),
            employee("Prakhar",38)

    )
    val l = list.filter { employee ->employee.age>30  }
    println(l)
}