package firstProject

class TriangleEquilateral(val cote: Double, val hauteur: Double) : Figure(), Draw {
    override fun drawFigure() {
        println("Here we are drawing an equilateral triangle")
    }

    override fun perimeter(): Double {
        return 3 * cote
    }

    override fun surface(): Double {
        return (hauteur / 2) * cote
    }

}