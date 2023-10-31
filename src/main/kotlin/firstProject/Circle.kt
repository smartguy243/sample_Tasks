package firstProject

class Circle(val rayon: Double) : Figure(), Draw {
    override fun perimeter(): Double {
        return 2 * Math.PI * rayon
    }

    override fun surface(): Double {
        return Math.PI * rayon * rayon
    }

    override fun drawFigure() {
        println("Here we are drawing a circle  !")
    }
}