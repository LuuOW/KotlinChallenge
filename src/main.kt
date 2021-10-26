import java.util.*

fun main() {

    val vehicle1 = Vehicle("ABC123", VehicleType.CAR, "DISCOUNT_CARD_001")
    val vehicle2 = Vehicle("ABD123", VehicleType.CAR, "DISCOUNT_CARD_0045")
    val vehicle3 = Vehicle("ABD131", VehicleType.CAR, "DISCOUNT_CARD_0445")
    val vehicle4 = Vehicle("ABD133", VehicleType.CAR, "DISCOUNT_CARD_0145")
    val vehicle5 = Vehicle("ABD125", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_002")
    val vehicle6 = Vehicle("ABD126", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_102")
    val vehicle7 = Vehicle("ABD127", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_112")
    val vehicle8 = Vehicle("ABD128", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_113")
    val vehicle9 = Vehicle("ABD129", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_118")
    val vehicle10 = Vehicle("DSAD1231", VehicleType.MINIBUS, "DISCOUNT_CARD_003")
    val vehicle11 = Vehicle("DSAD1234", VehicleType.BUS, "DISCOUNT_CARD_004")
    val vehicle12 = Vehicle("DSAD1804", VehicleType.BUS, "DISCOUNT_CARD_114")
    val vehicle13 = Vehicle("DSAD1964", VehicleType.BUS, "DISCOUNT_CARD_224")
    val vehicle14 = Vehicle("DSAD1134", VehicleType.BUS, "DISCOUNT_CARD_484")
    val vehicle15 = Vehicle("DSAD1454", VehicleType.BUS, "DISCOUNT_CARD_994")
    val vehicle16 = Vehicle("DSAD1774", VehicleType.BUS, "DISCOUNT_CARD_554")
    val vehicle17 = Vehicle("DSAD1884", VehicleType.BUS, "DISCOUNT_CARD_164")
    val vehicle18 = Vehicle("DSAD1994", VehicleType.BUS, "DISCOUNT_CARD_184")
    val vehicle19 = Vehicle("DSAD1994", VehicleType.BUS, "DISCOUNT_CARD_184")
    val vehicle20 = Vehicle("AAA123", VehicleType.BUS, "DISCOUNT_CARD_184")
    val vehicle21 = Vehicle("AAA321", VehicleType.BUS, "DISCOUNT_CARD_184")
    val vehicle22 = Vehicle("AAA222", VehicleType.BUS, "DISCOUNT_CARD_184")
    val vehicle23 = Vehicle("AAA222", VehicleType.BUS, "DISCOUNT_CARD_184")


    val parking = Parking(mutableSetOf())
    val vehicles = mutableListOf<Vehicle>(vehicle1, vehicle2, vehicle3, vehicle4, vehicle5, vehicle6, vehicle7, vehicle8, vehicle9, vehicle10, vehicle11, vehicle12, vehicle13, vehicle14, vehicle15, vehicle16, vehicle17, vehicle18, vehicle19
        , vehicle20, vehicle21, vehicle22, vehicle23)


    for( i in vehicles.indices){
        parking.addVehicle(vehicles[i])
    }




    //val parking = Parking(mutableSetOf(car, moto, minibus, bus, car2, car3, car4))

    /*
    println(parking.vehicles.contains(car2))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))

    val car2Inserted = parking.vehicles.add(car2)
    val car2IsRemoved = parking.vehicles.remove(moto)
    println(car2Inserted)
    println(car2IsRemoved)
     */

}