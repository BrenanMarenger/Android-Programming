//Brenan Marenger
//Book list page, initializing, updating, and showing all book titles with their given ratings
package com.example.bookintent

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class BookListFragment : Fragment() {

    private var mBookRecyclerView: RecyclerView? = null
    private var mAdapter: BookAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_book_list, container, false)
        mBookRecyclerView = view.findViewById (R.id.books_recycler_view)
        mBookRecyclerView!!.layoutManager = LinearLayoutManager(activity)
        updateUI()
        return view
    }

    //Will change list view of that book, with the new input values
    private fun updateUI() {
        val bookLab = BookLab
        val books = bookLab.books
        if (mAdapter == null) {
            mAdapter = BookAdapter(books)
            mBookRecyclerView!!.adapter = mAdapter
        } else {
           mAdapter!!.notifyDataSetChanged()
        }
    }

    override fun onResume() {
        super.onResume()
        updateUI()
    }

    //Container for each book, showing the book object information
    private inner class BookHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

        private val mTitleTextView: TextView?
        private val mRatingTextView: TextView?
        private var mBook: Book? = null

        init {
            itemView.setOnClickListener(this)
            mTitleTextView = itemView.findViewById(R.id.list_item_book_title_text_view) as TextView
            mRatingTextView = itemView.findViewById(R.id.list_item_book_rating_text_view) as TextView

        }

        fun bindBook(book: Book?) {
            mBook = book
            mTitleTextView!!.text = mBook!!.mTitle
            mRatingTextView!!.text = mBook!!.mRating.toString()
        }

        override fun onClick(v: View) {

            Toast.makeText(activity, mBook!!.mTitle!! + " Clicked!", Toast.LENGTH_SHORT).show()
            val intent = BookPagerActivity.newIntent(activity as Context, mBook!!.mId)
            startActivity(intent)

        }
    }

    //initalize each book item, adding to the main list
    private inner class BookAdapter(private val mBooks: List<Book>?) : RecyclerView.Adapter<BookHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
            val layoutInflater = LayoutInflater.from(activity)
            val view = layoutInflater.inflate(R.layout.list_item_book, parent, false)
            return BookHolder(view)
        }

        override fun onDetachedFromRecyclerView(rv: RecyclerView) {
            super.onDetachedFromRecyclerView(rv)
        }

        override fun onBindViewHolder(holder: BookHolder, position: Int) {
            val book = mBooks!![position]
            holder.bindBook(book)
        }

        override fun getItemCount(): Int {
            return mBooks!!.size
        }
    }
}
