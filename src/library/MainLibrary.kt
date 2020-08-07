package library

fun main (){
    var myBook = Book("sabote", "sabotage", 500)
    var myEbook = EBook("milagre", "jonas","text", 750 )

    var myPuppy = Puppy()

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

   myBook.printUrl()

    myBook.bookWeight()
    myBook.tornPages(15)
    myBook.tornPages(8)
    myBook.tornPages(15)

    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
    myPuppy.playWithBook(myBook)
}


