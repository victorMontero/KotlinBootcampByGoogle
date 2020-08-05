package pairs

fun main(){
    val myBook = Book("falcon", "jorge", "1986")
    val bookTitleAuthor = myBook.titleAuthor()

    val myBookTwo = Book("guinness", "world", "2020")
    val bookTitleAuthorYearTwo = myBookTwo.titleAuthorYear()

    println("here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")
    println("here is your book ${bookTitleAuthorYearTwo.first} " + "by ${bookTitleAuthorYearTwo.second} written in ${bookTitleAuthorYearTwo.third}" )

}

class Book (
    val title: String,
    val author: String,
    val year: String
) {

    fun titleAuthor () : Pair<String, String>{
        return (title to author)
    }

    fun titleAuthorYear() : Triple<String, String, String>{
        return Triple(title, author, year)
    }
}



