package section11

fun address(street: String = "", city: String, state: String, postCode: String, number: Int = 0) {
    println("Street: $street, $number")
    println("City: $city, $state - $postCode")

}

fun main() {
    address("8 miles", "São Paulo,", "São Paulo", "2344554", 12)
    address(city = "São Paulo", state = "São Paulo", postCode = "2344434")
}