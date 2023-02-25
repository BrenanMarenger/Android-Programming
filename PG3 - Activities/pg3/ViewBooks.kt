//Brenan Marenger
//This file acts as the second activity, receiving a string array, populating the button text accordingly
//Depending on the button pressed, the program will return the book title
package com.example.pg3

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ViewBooks : AppCompatActivity() {

    //Catches intent with passed params
    companion object {
        fun newIntent (packageContext: Context?): Intent? {
            val i:Intent? = Intent(packageContext!!, ViewBooks::class.java)

            return i
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_books)

        var books = intent.getStringArrayExtra("bookTitles")

        var button1:Button = findViewById(R.id.book1)
        var button2:Button = findViewById(R.id.book2)
        var button3:Button = findViewById(R.id.book3)
        var button4:Button = findViewById(R.id.book4)
        var button5:Button = findViewById(R.id.book5)

        button1.text = books?.get(0)
        button2.text = books?.get(1)
        button3.text = books?.get(2)
        button4.text = books?.get(3)
        button5.text = books?.get(4)

        var returnIntent = Intent()

        button1.setOnClickListener{
            returnIntent.putExtra("result", button1.text)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
        button2.setOnClickListener{
            returnIntent.putExtra("result", button2.text)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
        button3.setOnClickListener{
            returnIntent.putExtra("result", button3.text)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
        button4.setOnClickListener{
            returnIntent.putExtra("result", button4.text)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }
        button5.setOnClickListener{
            returnIntent.putExtra("result", button5.text)
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }

    }
}