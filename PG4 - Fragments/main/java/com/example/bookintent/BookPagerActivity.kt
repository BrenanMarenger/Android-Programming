//Brenan Marenger
//Views selected book from list, initializing and starting the new activity
package com.example.bookintent

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.bookintent.BookActivity.Companion.EXTRA_BOOK_ID
import java.util.*

class BookPagerActivity : AppCompatActivity() {

    private var mViewPager: ViewPager2? = null
    private var mBooks:List<Book>? = null

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate (savedInstanceState)
        setContentView (R.layout.activity_book_pager)
        val bookId = intent.getSerializableExtra(EXTRA_BOOK_ID) as UUID
        mViewPager = findViewById (R.id.book_view_pager)
        mBooks = BookLab.books
        val fragmentManager = supportFragmentManager
        mViewPager!!.adapter = object : FragmentStateAdapter(fragmentManager,lifecycle) {

            override fun createFragment (position:Int) : Fragment {
                val book = mBooks!![position]
                return BookFragment.newInstance(book.mId)
            }

            override fun getItemCount():Int {
                return mBooks!!.size
            }

        }
        for (i in mBooks!!.indices) {
            if (mBooks!![i].mId==bookId) {
                mViewPager!!.currentItem = i
                break
            }
        }

     }

    companion object {
        fun newIntent (packageContext: Context, bookId:UUID?): Intent {
            val intent = Intent(packageContext,BookPagerActivity::class.java)
            intent.putExtra(EXTRA_BOOK_ID,bookId);
            return intent
        }
    }
}