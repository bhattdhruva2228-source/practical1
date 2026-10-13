fun main() {
    val car = Car("SUV", "Range Rover", 8000000.0, "Prachi", 25000)
    car.displayCarInfo()
}
class Car(
    var type: String,
    var model: String,
    var price: Double,
    var owner: String,
    var milesDriven: Int
) {
    fun getCarInfo() {
        println("Type: $type")
        println("Model: $model")
        println("Owner: $owner")
        println("Miles Driven: $milesDriven")
    }
    fun getOriginalCarPrice() {
        println("Original Price: ₹$price")
    }
    fun getCurrentCarPrice() {
        val currentPrice = price - (milesDriven * 5)
        println("Current Price: ₹$currentPrice")
    }
    fun displayCarInfo() {
        getCarInfo()
        getOriginalCarPrice()
        getCurrentCarPrice()
    }
}

