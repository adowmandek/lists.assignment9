import java.io.CharArrayReader

fun main() {


   println(filteredNames(listOf("jane","daniso","jatopaso","marie","beldingo","Babraa","Qamaraqoso","lamipada","rastaras" ,"zizo" ,"unicef" )))
    var numbers = listOf(45.6, 23.4, 56.7, 43.1, 34.5)
    println(numbers.sum())
    println(numbers.average())
    combination()
    information()


var cars= listOf(
    Car("fdr343",89078.59),
    Car("NMI908",2134.0),
    Car("QAZ567",9012.0))
println(car(cars))

}

fun filteredNames(names:List<String>):List<String> {
        var nameList= mutableListOf<String>()
        for (evenName in names) {
            if (names.indexOf(evenName) % 2 == 0) {
                nameList.add(evenName)
            }
        }
        return(nameList)

        }
        data class AvgAndSum(var average:Double ,var sum:Double)
fun heightMetres(metres:List<Double>):AvgAndSum {
    var  sum=metres.sum()
    var average=metres.average()
    var averageSum=AvgAndSum(average,sum)

    return(averageSum)
}


 data class Person(var name: String, var age: Int, var height: Double,var weight:Double)
fun information() {
   var peopleList = listOf(
      Person("Adan", 35, 34.5,40.1),
        Person("Vaso ", 25, 37.6,42.3),
      Person("Kamii ", 41, 22.4,34.2),
     )
var sorted=peopleList.sortedByDescending { person ->person.age  }
    println(sorted)
}
fun combination(){
    var peopleList= mutableListOf(
        Person("Adan", 35, 34.5,40.1),
        Person("Vaso ", 25, 37.6,42.3),
        Person("Kamii ", 41, 22.4,34.2),
    )
    peopleList.addAll(
        listOf(
            Person("Adaso",24,46.7,58.1),
            Person("Kalaso",21,23.1,35.0)
        )
    )
println(peopleList)

}
    data class Car(var registration:String,var mileage:Double)
    fun car(cars:List<Car>):Double{
        var totalMileage = 0.0
cars.forEach{car ->
    totalMileage+=car.mileage
}
        var averageMileage=totalMileage/cars.count()
        return averageMileage
    }
































