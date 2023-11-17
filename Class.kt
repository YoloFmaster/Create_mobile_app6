class CashiersOffice(minSoldTicekts: Int, maxSoldTickets: Int) {

    val a = minSoldTicekts
    val b = maxSoldTickets
    fun soldTickets(): Int {
        val soldTikets = (a .. b).random()
        return soldTikets
    }
}

class Itinerary {

    val city = arrayListOf(
        "Москва","Санкт-Петербург","Уфа",
        "Омск","Томск","Тамбов",
        "Стерлитомак","Орёл","Екатиренбург",
        "Кемерово","Минск","Брест",
        "Гомель","Псков","Якутск"
    )

    fun creatingRoute(): ArrayList<String> {
        val route = ArrayList<String>()
        val primaryCity = (0 .. 14).random()
        var endCity = (0 .. 14).random()
        if (city[primaryCity] != city[endCity]){
            route.add(city[primaryCity])
            route.add(city[endCity])
            return route
        }
        else {
            endCity = (0 .. 14).random()
            route.add(city[primaryCity])
            route.add(city[endCity])
            return route
        }
    }
}

class Train {
    fun creatingRailcars(passenger: Int): ArrayList<Int> {
        var capacity: Int
        var countRailcars = ArrayList<Int>()
        var capacityRailcars = 0
        do {
            capacity = (5 .. 25).random()
            capacityRailcars += capacity
            countRailcars.add(capacity)
        } while(capacityRailcars < passenger)
        return countRailcars
    }
}