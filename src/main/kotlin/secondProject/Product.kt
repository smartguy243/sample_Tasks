// Créez un programme Kotlin pour un système d'achat en ligne.
// Implémentez des classes pour les produits,
// les paniers et les commandes.
// Les clients peuvent ajouter des produits à leur panier,
// passer des commandes et consulter l'historique des commandes. NB: Le OPP


package secondProject

class Product(val productId: Int,
              val name: String,
              var price: Double,
              val capacite: Int) {
    override fun toString(): String {
        return "ProductId: $productId, Name: $name, Prix: $price, Capicite: $capacite"
    }
}