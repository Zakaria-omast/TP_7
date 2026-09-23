fun main() {
    val mutableNombres: MutableList<Int> = mutableListOf()

    mutableNombres.add(42)
    mutableNombres.addAll(listOf(12, 5, 89, 23))
    println("Liste mutable initiale : $mutableNombres")

    val immutableNombres: List<Int> = mutableNombres.toList()

    mutableNombres.sort()

    println("\n--- Résultats ---")
    println("Liste mutable triée    : $mutableNombres")
    println("Liste immuable (copie) : $immutableNombres")
}