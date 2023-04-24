//Brenan Marenger
//Creates a book fragment with the corresponding ID
package com.example.bookintent

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import java.util.*

class BookActivity : SingleFragmentActivity() {

    companion object {
        val EXTRA_BOOK_ID = "com.example.apoe.fragment1.book_id"

        fun newIntent (packageContext: Context?, bookID:UUID?):Intent? {
            val intent = Intent (packageContext!!,BookActivity::class.java)
            intent.putExtra (EXTRA_BOOK_ID,bookID)
            return intent
        }
    }
    override fun createFragment(): Fragment {
        val bookID: UUID? = intent.getSerializableExtra(EXTRA_BOOK_ID) as UUID?
        return BookFragment.newInstance (bookID)
    }

}