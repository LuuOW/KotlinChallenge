import java.util.*
import kotlin.math.abs
import kotlin.math.ceil

private val MINUTES_IN_MILLISECONDS = 60000

 class ParkingSpace() {

    lateinit var parking: Parking

    fun checkOutVehicle(inputPlate: String, onSuccess: (Int) -> Unit, onError: () -> Unit){

        val vehicleMatch = parking.vehicles.filter { inputPlate == it.plate }
        if (vehicleMatch.size == 1) {
            val hasDiscount: Boolean = !vehicleMatch[0].discountCard.isNullOrBlank()
            val parkedTime = (Calendar.getInstance().timeInMillis - vehicleMatch[0].checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
            val amount = calculateFee(vehicleMatch[0].type, parkedTime.toInt(), hasDiscount)
            parking.removeVehicle(vehicleMatch[0])
            onSuccess(amount)
        }
        else{
            onError()
        }
    }


    fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean) : Int {
        val amount = type.fare + abs(ceil((parkedTime - 120).toDouble()/15)*5)
        amount = return when(hasDiscountCard) {
            true -> ceil((amount * 0.85)).toInt()
            else -> amount.toInt()
        }

    }



}