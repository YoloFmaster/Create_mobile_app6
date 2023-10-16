fun main() {
    var continued = true
    do {
        println("Первый шаг - Создать маршрут")
        val route = Itinerary().creatingRoute()
        println("Маршрут поезда: ${route[0]} - ${route[1]}")
        println()

        println("Второй шаг - Продать билеты")
        val soldTickets = CashiersOffice(5, 201).soldTickets()
        print("Продано билетов: $soldTickets")


        println("\nТретий шаг - Собрать состав")
        val countRailcars = Train().creatingRailcars(soldTickets)
        for (i in countRailcars.indices) {
            println("Вагон номер ${i + 1} вместимостью ${countRailcars[i]} пассажиров")
        }
        println()

        println("Четвёртый шаг - Отправить состав")
        println("Поезд ${route[0]} - ${route[1]}, состоящий из ${countRailcars.size} вагонов отправлен")
        println()

        println("Выберите дальнейшие действия:")
        println("Выйти - exit")
        println("Остаться - любое слово")
        val exit = readln()
        if (exit == "exit") continued = false
    }while(continued)
}