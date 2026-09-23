fun main() {
    val fruits = mutableListOf("Pomme", "Banane", "Orange")
    fruits.addAll(listOf("Fraise", "Mangue"))
    fruits.remove("Banane")
    val search = "Orange"
    val exists = fruits.contains(search)
    println("Taille : ${fruits.size}")
    println("Contenu : $fruits")
    println("Présent : $exists")
}