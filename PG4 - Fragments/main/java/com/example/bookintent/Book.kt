//Brenan Marenger
//simple Book object holding book title, id, and rating
package com.example.bookintent

import java.util.*

class Book {
    var mId: UUID? = UUID.randomUUID() //random ID number, Kotlin library
    var mTitle:String? = ""
    var mRating:String? = ""
    var mNumPages:Int? = 0
}