package Library

fun main (){
    var myBook = Book("sabote", "sabotage")
    var myEbook = EBook("milagre", "jonas")

    myBook.readPage()
    myBook.readPage()
    myBook.readPage()
    myBook.readPage()
    myBook.readPage()
    myBook.readPage()
    println(myBook.currentPage)

    myEbook.readPage()
    myEbook.readPage()
    myEbook.readPage()
    myEbook.readPage()
    myEbook.readPage()
    myEbook.readPage()
    println(myEbook.currentPage)

    myEbook.countWords()
    myEbook.countWords()
    myEbook.countWords()
    myEbook.countWords()
    myEbook.countWords()
    myEbook.countWords()
    println(myEbook.wordCount)

}
