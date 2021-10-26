import java.util.*
import kotlin.math.abs
import kotlin.math.ceil

private val MINUTES_IN_MILLISECONDS = 60000

data class ParkingSpace(var vehicle: Vehicle, val checkInTime: Calendar = Calendar.getInstance()) {

    lateinit var parking: Parking

    val parkedTime: Long get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS

    fun checkOutVehicle(inputPlate: String, onSuccess: (Int) -> Int, onError: () -> Unit){

        val allPlates = parking.vehicles.filter { inputPlate == it.plate }
        if (allPlates.size == 1) {
            println("anda joya")
            onSuccess(25)
        }
    }

    fun onSuccess(amount: Int){

    }

    fun onError() {

    }

    fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean) : Int {
        val amount = type.fare + abs(ceil((parkedTime - 120).toDouble()/15)*5)
        amount = return when(hasDiscountCard) {
            true -> ceil((amount * 0.85)).toInt()
            else -> amount.toInt()
        }
    }



}