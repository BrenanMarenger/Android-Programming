//Brenan Marenger
//Populates book data set, initializing variables with basic info
package com.example.bookintent

import java.util.*

object BookLab {
    private val mBooks:MutableList<Book>?

    val books:List<Book>?
        get() = mBooks

    fun getBook (id: UUID?):Book? {
        for (book in mBooks!!)
            if (book.mId==id) return book
        return null
    }

    fun addBook(){}

    fun removeBook(){}

    init {
        mBooks = ArrayList()
        for (i in 1..30) {
            val book = Book()
            book.mTitle = "Initial Book #${i}"
            book.mRating = "Initial Rating: 0"
            book.mNumPages = 500

            mBooks.add(book)
        }

        mBooks[1].mTitle = "The Chamber of Secrets"
        mBooks[1].mRating = "Rating: 4"
        mBooks[1].mNumPages = 1202

        mBooks[2].mTitle = "Delirium"
        mBooks[2].mRating = "Rating: 3"
        mBooks[2].mNumPages = 545


        mBooks[3].mTitle = "Harry Potter"
        mBooks[3].mRating = "Rating: 1"
        mBooks[3].mNumPages = 122


        mBooks[4].mTitle = "Faithful"
        mBooks[4].mRating = "Rating: 5"
        mBooks[4].mNumPages = 747


        mBooks[5].mTitle = "Path of Exile"
        mBooks[5].mRating = "Rating: 2"
        mBooks[5].mNumPages = 643


        mBooks[6].mTitle = "Exiled"
        mBooks[6].mRating = "Rating: 5"
        mBooks[6].mNumPages = 673


        mBooks[7].mTitle = "Jupiter"
        mBooks[7].mRating = "Rating: 3"
        mBooks[7].mNumPages = 435


        mBooks[8].mTitle = "Cave, Delving into the Depths"
        mBooks[8].mRating = "Rating: 2"
        mBooks[8].mNumPages = 831


        mBooks[9].mTitle = "The Jungle"
        mBooks[9].mRating = "Rating: 5"
        mBooks[9].mNumPages = 230


        mBooks[10].mTitle = "Hatchet"
        mBooks[10].mRating = "Rating: 4"
        mBooks[10].mNumPages = 350


        mBooks[11].mTitle = "Militant Faith"
        mBooks[11].mRating = "Rating: 5"
        mBooks[11].mNumPages = 932


        mBooks[12].mTitle = "Object Designs in Programming"
        mBooks[12].mRating = "Rating: 2"
        mBooks[12].mNumPages = 674


        mBooks[13].mTitle = "Operating Systems"
        mBooks[13].mRating = "Rating: 5"
        mBooks[13].mNumPages = 1052


        mBooks[14].mTitle = "The Grand Heist"
        mBooks[14].mRating = "Rating: 3"
        mBooks[14].mNumPages = 272


        mBooks[15].mTitle = "Bankrupt"
        mBooks[15].mRating = "Rating: 4"
        mBooks[15].mNumPages = 673


        mBooks[16].mTitle = "Fightclub"
        mBooks[16].mRating = "Rating: 5"
        mBooks[16].mNumPages = 712


        mBooks[17].mTitle = "Ritual"
        mBooks[17].mRating = "Rating: 5"
        mBooks[17].mNumPages = 324


        mBooks[18].mTitle = "Blood Diamonds"
        mBooks[18].mRating = "Rating: 4"
        mBooks[18].mNumPages = 628


        mBooks[19].mTitle = "The Boy Who Cried"
        mBooks[19].mRating = "Rating: 3"
        mBooks[19].mNumPages = 325


        mBooks[20].mTitle = "Blighted"
        mBooks[20].mRating = "Rating: 3"
        mBooks[20].mNumPages = 593


        mBooks[21].mTitle = "The Civil War"
        mBooks[21].mRating = "Rating: 5"
        mBooks[21].mNumPages = 235


        mBooks[22].mTitle = "Archnemesis"
        mBooks[22].mRating = "Rating: 4"
        mBooks[22].mNumPages = 127


        mBooks[23].mTitle = "Asian History From The 15th Century"
        mBooks[23].mRating = "Rating: 3"
        mBooks[23].mNumPages = 923


        mBooks[24].mTitle = "The French Revolution"
        mBooks[24].mRating = "Rating: 2"
        mBooks[24].mNumPages = 352


        mBooks[25].mTitle = "Crucible"
        mBooks[25].mRating = "Rating: 4"
        mBooks[25].mNumPages = 243


        mBooks[26].mTitle = "The Great Depression"
        mBooks[26].mRating = "Rating: 4"
        mBooks[26].mNumPages = 341


        mBooks[27].mTitle = "The Spiritual Medicine"
        mBooks[27].mRating = "Rating: 3"
        mBooks[27].mNumPages = 710


        mBooks[28].mTitle = "Therapy Plants"
        mBooks[28].mRating = "Rating: 4"
        mBooks[28].mNumPages = 539


        mBooks[29].mTitle = "Do Androids Dream of Electric Sheep?"
        mBooks[29].mRating = "Rating: 3"
        mBooks[29].mNumPages = 684


        mBooks[0].mTitle = "As I Lay Dying"
        mBooks[0].mRating = "Rating: 5"
        mBooks[0].mNumPages = 730

    }


}