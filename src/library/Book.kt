package library

//open class Book(var title: String, var author: String) {
//
//    var currentPage = 1
//
//    open fun readPage(){
//        currentPage ++
//    }
//}
//
//class EBook(title: String, author: String, var format: String = "text") : Book(title, author){
//    var wordCount = 0
//
//    fun countWords() {
//        wordCount = wordCount + 250  // bootcamp solution i've done this way, but i add an if to count it with an Int
//    }
//
//    override fun readPage(){
//        wordCount+=250
//        if(wordCount > 250) currentPage += 1
//    }
//}