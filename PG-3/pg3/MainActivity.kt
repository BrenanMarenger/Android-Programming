package com.example.pg3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var horrorBtn: Button? = findViewById(R.id.horrorBtn)
        var fantasyBtn: Button? = findViewById(R.id.fantasyBtn)
        var adventureBtn: Button? = findViewById(R.id.adventureBtn)
        var historyBtn: Button? = findViewById(R.id.historyBtn)
        var miscBtn: Button? = findViewById(R.id.miscBtn)
        var bookTitles: Array<String?> = arrayOfNulls(5)

        horrorBtn!!.setOnClickListener{
            bookTitles[0] = "Wisconsin Werewolves"
            bookTitles[1] = "Michigan Mega-Monsters"
            bookTitles[2] = "Ogres of Ohio"
            bookTitles[3] = "Florida Fog Phantoms"
            bookTitles[4] = "Minnesota Mall Mannequins"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            startActivity(i)
        }
        fantasyBtn!!.setOnClickListener{
            bookTitles[0] = "Harry Potter"
            bookTitles[1] = "Game of Thrones"
            bookTitles[2] = "The Lord of the Rings"
            bookTitles[3] = "Eragon"
            bookTitles[4] = "The Hobbit"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            startActivity(i)

        }
        historyBtn!!.setOnClickListener{
            bookTitles[0] = "1776"
            bookTitles[1] = "Guns, Germs, and Steel"
            bookTitles[2] = "Band of Brothers"
            bookTitles[3] = "An Army at Dawn"
            bookTitles[4] = "Salt"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            startActivity(i)

        }
        adventureBtn!!.setOnClickListener{
            bookTitles[0] = "Moby Dick"
            bookTitles[1] = "The  Three Musketeers"
            bookTitles[2] = "Hatchet"
            bookTitles[3] = "Around the World in Eighty Days"
            bookTitles[4] = "Dracula"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            startActivity(i)

        }
        miscBtn!!.setOnClickListener{
            bookTitles[0] = "The Time Machine"
            bookTitles[1] = "Can't Hurt Me"
            bookTitles[2] = "As a Man Thinketh"
            bookTitles[3] = "The Clean Body"
            bookTitles[4] = "Super Diaper Baby 2, The Invasion of the Potty Snatchers"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            startActivity(i)

        }
    }
}