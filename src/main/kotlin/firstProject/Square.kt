package firstProject

class Square(val cote: Double) : Figure(), Draw {
    override fun drawFigure() {
        println("Here we are drawing a square!")
    }

    override fun perimeter(): Double {
        return 4 * cote
    }

    override fun surface(): Double {
        return cote * cote
    }

    fun diagonalSquare() : Double {
        return Math.sqrt((cote * cote) + (cote * cote))
    }
}