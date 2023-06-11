package arrayExample

class ArrayExampleClass {
    fun array1() {
     val hobbies = arrayOf("Frodo","Sam","Marry","Pippin" )
        var x = 0
        while (x < hobbies.size) {
            println("${hobbies[x]} is a good Hobbit namo")
            x+= 1
        }
    }

    fun array2() {
        val firemen = arrayOf("Pugh", "Pugh", "Anannd", "Rahul", "Varsha", "Monti")
        var sizeArray = 0
        while (sizeArray < 6) {
            println("Firemen number $sizeArray is ${firemen[sizeArray]}")
            sizeArray+= 1
        }
    }

}

fun main() {
    var arrayExampleClass = ArrayExampleClass()
    //arrayExampleClass.array1()
    arrayExampleClass.array2()
}