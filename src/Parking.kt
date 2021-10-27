data class Parking(val vehicles: MutableSet<Vehicle>) {
    private val max = 20
    val Total: Pair<Int,Int> = Pair(0,0)

    fun addVehicle(vehicle: Vehicle) : Boolean =
        if (vehicles.size < max) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            true
        } else {
            println("Sorry, the check-in failed")
            false
        }

    fun removeVehicle(vehicle: Vehicle){
        vehicles.remove(vehicle)
    }

    fun listVehicles(){
        vehicles.forEach { v ->
            println(v.plate)
        }
    }


}