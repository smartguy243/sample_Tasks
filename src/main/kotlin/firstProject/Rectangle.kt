package firstProject

class Rectangle(val longueur: Double, val largeur: Double) : Figure(), Draw {
    override fun drawFigure() {
        println("Here we are drawing a rectangle!")
    }

    override fun perimeter(): Double {
        return 2 * (longueur + largeur)
    }

    override fun surface(): Double {
        return longueur * largeur
    }

    fun diagonalRectangle(): Double {
        return Math.sqrt( (longueur * longueur) + (largeur * largeur) )
    }
}