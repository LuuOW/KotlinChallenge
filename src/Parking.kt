data class Parking(val vehicles: MutableSet<Vehicle>) {
    val max = 20
    fun addVehicle(vehicle: Vehicle) : Boolean =
        if (vehicles.size < max) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            true
        } else {
            println("Sorry, the check-in failed")
            false
        }


}