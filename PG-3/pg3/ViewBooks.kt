package com.example.pg3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ViewBooks : AppCompatActivity() {

    companion object {
        fun newIntent (packageContext: Context?): Intent? { //, bookTitles:Array<String>
            val i:Intent? = Intent(packageContext!!, ViewBooks::class.java)
            //i!!.putExtra(R.string.someTitles, bookTitles)
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

        button1.setOnClickListener{

            finish()
        }
        button2.setOnClickListener{

            finish()
        }
        button3.setOnClickListener{

            finish()
        }
        button4.setOnClickListener{

            finish()
        }
        button5.setOnClickListener{

            finish()
        }

    }
}