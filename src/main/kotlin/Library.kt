class Library {
    val catalog = mutableListOf<Book>()

    fun addBook(book: Book) = catalog.add(book)
    fun findBook(id: Int): Book? = catalog.find{it.id==id}
    fun isAvailableBooks() {
        println("Available books :")
        for (book in catalog) {
            if (book.isAvailable) book.title
        }
    }
}