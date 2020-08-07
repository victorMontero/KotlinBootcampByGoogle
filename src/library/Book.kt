package library

import java.util.*

const val MAX_NUMBER_BOOKS = 20


open class Book(var title: String, var author: String, var pages: Int) {

    var currentPage = 1

    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
    }

    open fun readPage() {
        currentPage++
    }

    fun canBorrow(hasBooks: Int): Boolean {
        return if (hasBooks < MAX_NUMBER_BOOKS) true else false
    }

    fun printUrl(){
        println(BASE_URL + title + ".html")
    }
}

fun Book.bookWeight() = println(pages * 1.5)

fun Book.tornPages(tornPagesNumber: Int) = if (pages >= tornPagesNumber) pages -= tornPagesNumber else pages = 0

class EBook(title: String, author: String, var format: String = "text", pages: Int) : Book(title, author, pages){
    var wordCount = 0

    fun countWords() {
        wordCount = wordCount + 250  // bootcamp solution i've done this way, but i add an if to count it with an Int
    }

    override fun readPage(){
        wordCount+=250
        if(wordCount > 250) currentPage += 1
    }
}

class Puppy(){
    fun playWithBook(book: Book) {
         book.tornPages(Random().nextInt(12))
    }
}


