package secondProject

class Commande(val id: Int,
               val product: Product,
               val clientId: Int ) {

    fun afficherCommander() : String = """
        commandeId: $id
        client: $clientId
        product: $product
    """.trimIndent()
}