//Brenan Marenger
//Android Programming: PG3
//Data: 2/24/23
//This program presents 5 book categories. When the user picks a category,
//they are prompted with 5 books relating to it. They may select a book which
//will be displayed as their favorite
//The goal of this program is to learn the use of activities, specifically passing and returning parameters
package com.example.pg3

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts

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
        var feedback: TextView = findViewById(R.id.feedback)

        //This function will launch a given intent(with parameters specific to it) and catch the returning result
        val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result -> if(result.resultCode == Activity.RESULT_OK) {
            var data: Intent? = result.data
            var bestBook = data?.getStringExtra("result")
            println(data?.getStringExtra("result"))
            feedback.text = "Best book is: ${bestBook}"
        }
        }

        horrorBtn!!.setOnClickListener{
            bookTitles[0] = "Wisconsin Werewolves"
            bookTitles[1] = "Michigan Mega-Monsters"
            bookTitles[2] = "Ogres of Ohio"
            bookTitles[3] = "Florida Fog Phantoms"
            bookTitles[4] = "Minnesota Mall Mannequins"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            resultLauncher.launch(i)
        }
        fantasyBtn!!.setOnClickListener{
            bookTitles[0] = "Harry Potter"
            bookTitles[1] = "Game of Thrones"
            bookTitles[2] = "The Lord of the Rings"
            bookTitles[3] = "Eragon"
            bookTitles[4] = "The Hobbit"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            resultLauncher.launch(i)

        }
        historyBtn!!.setOnClickListener{
            bookTitles[0] = "1776"
            bookTitles[1] = "Guns, Germs, and Steel"
            bookTitles[2] = "Band of Brothers"
            bookTitles[3] = "An Army at Dawn"
            bookTitles[4] = "Salt"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            resultLauncher.launch(i)

        }
        adventureBtn!!.setOnClickListener{
            bookTitles[0] = "Moby Dick"
            bookTitles[1] = "The  Three Musketeers"
            bookTitles[2] = "Hatchet"
            bookTitles[3] = "Around the World in Eighty Days"
            bookTitles[4] = "Dracula"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            resultLauncher.launch(i)

        }
        miscBtn!!.setOnClickListener{
            bookTitles[0] = "The Time Machine"
            bookTitles[1] = "Can't Hurt Me"
            bookTitles[2] = "As a Man Thinketh"
            bookTitles[3] = "The Clean Body"
            bookTitles[4] = "Super Diaper Baby 2, The Invasion of the Potty Snatchers"

            val i = ViewBooks.newIntent(this)
            i?.putExtra("bookTitles", bookTitles)
            resultLauncher.launch(i)

        }


        }
    }