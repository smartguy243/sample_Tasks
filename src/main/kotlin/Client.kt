class Client(val id: Int, val name: String) {
    val borrowedBook = mutableListOf<Book>()

    fun borrowBook(personalLibrary: Library, id: Int) {
        val book = personalLibrary.findBook(id)
        if (book != null && book.isAvailable) {
            borrowedBook.add(book)
            book.isAvailable = false
            println("$name borrowed ${book.title}")
        } else "$name can not borrow"
    }
    fun returnBook(personalLibrary: Library, id: Int) {
        val book = personalLibrary.findBook(id)
        if (book != null && borrowedBook.contains(book)) {
            borrowedBook.remove(book)
            book.isAvailable = true
            println("$name returned ${book.title}")
        } else println(borrowedBook)
    }
}