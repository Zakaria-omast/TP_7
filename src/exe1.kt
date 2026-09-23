fun String.containsSubstring(substring: String): Boolean {
    return this.contains(substring)
}

fun main() {
    val message = "Bienvenue dans le cours de programmation Kotlin."
    val lang = "Kotlin"
    val search1 = "cours"
    val search2 = "Java"

    val contientCours = message.containsSubstring(search1)
    val contientJava = message.containsSubstring(search2)
    val contientLang = message.containsSubstring(lang)

    println("Le message contient \"$search1\" ? -> $contientCours")
    println("Le message contient \"$search2\" ? -> $contientJava")
    println("Le message contient \"$lang\" ? -> $contientLang")
}