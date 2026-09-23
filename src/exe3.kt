fun main() {

    val nombres: MutableSet<Int> = mutableSetOf()
    nombres.add(10)
    nombres.add(20)
    nombres.add(30)
    nombres.addAll(listOf(40, 50))

    println("Ensemble initial : $nombres")

    nombres.remove(20)
    println("Après suppression de 20 : $nombres")

    val nombreRecherche = 30
    if (nombres.contains(nombreSouhaite)) { // ou : if (nombreRecherche in nombres)
        println("Le nombre $nombreRecherche est bien présent dans l'ensemble.")
    } else {
        println("Le nombre $nombreRecherche n'est pas dans l'ensemble.")
    }
}