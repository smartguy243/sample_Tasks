package secondProject

class ProduitPanier {

    val items = mutableMapOf<Product, Int>()

    fun addItem(product: Product, quantity: Int = 1) {
        if(items.containsKey(product)) {
            items[product] = items[product]!! + quantity
        } else {
            items[product] = quantity
        }
    }

    fun removeItem(product: Product, quantity: Int = 1) {
        if (items.containsKey(product)) {
            val removedQuantity = items[product]!!
            if (removedQuantity > quantity) {
                items[product] = removedQuantity - quantity
            } else {
                items.remove(product)
            }
        }
    }
    
    fun calculatePrix() : Double {
        var total = 0.0 
        for ((product, quantity) in items) {
            total += product.price * quantity
        }
        return total
    }
    
    fun afficher() {
        println("Notre magasin contient ses phones")
        for ((product, quantity) in items) {
            println(" ${product.name}, ${product.capacite} ${product.price}} (quantity: $quantity)")
            println("Le prix total: ${calculatePrix()}")
        }
    }
    
}