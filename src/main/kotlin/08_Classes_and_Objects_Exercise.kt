/*

Please create a class called MobilePhone. It should have three primary constructor variables, osName, brand and model.

Use the initializer to print those details.

Create three objects of that class in the Main function.

Examples of phones would be:
Samsung Galaxy S20 Ultra. Here the osName is Android, brand is Samsung, model is Galaxy S20 Ultra

*/

/*
Solution for Exercise Classes and Objects
*/

//Please find my sample solution for the exercise here:
//Of course, you probably have used other phones here.

fun main() {
    val iphone = MobilePhone("iOS", "Apple", "iPhone 12")
    val galaxyS20 = MobilePhone("Android", "Samsung", "Galaxy S20")
    val mateXS = MobilePhone("Android", "Huawei", "Mate X S")
}

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("The phone $model from $brand uses $osName as its Operating System")
    }
}