fun main() {
    val utilisateurs: MutableMap<String, Int> = mutableMapOf()
    utilisateurs["Alice"] = 25
    utilisateurs["Bob"] = 30
    utilisateurs["Charlie"] = 35
    utilisateurs.put("Diana", 28)

    println("Carte initiale : $utilisateurs")

    utilisateurs.remove("Bob")
    println("Après suppression de Bob : $utilisateurs")

    val utilisateurRecherche = "Alice"
    if (utilisateurs.containsKey(utilisateurRecherche)) {
        val age = utilisateurs[utilisateurRecherche]
        println("L'âge de $utilisateurRecherche est de $age ans.")
    } else {
        println("L'utilisateur $utilisateurRecherche n'est pas présent dans la carte.")
    }
    println("\n--- Affichage des clés et valeurs ---")
    println("Utilisateurs (Clés) : ${utilisateurs.keys}")
    println("Âges (Valeurs) : ${utilisateurs.values}")

    println("\nDétail complet :")
    for ((nom, age) in utilisateurs) {
        println("- $nom : $age ans")
    }
}