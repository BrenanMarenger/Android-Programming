//Brenan Marenger
//List view, initializing, updating, and displaying all book items
package com.example.bookintent

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
//import com.example.bookintent.R
import java.util.*


class BookFragment : Fragment() {

    var mBook:Book? = null
    var mTitleField: EditText? = null
    var mRatingField: EditText? = null
    var mNumberPages: TextView? = null

    companion object {
        val ARG_BOOK_ID = "book_id"

        fun newInstance (bookID: UUID?):BookFragment {
            val args = Bundle()
            args.putSerializable(ARG_BOOK_ID,bookID)
            val fragment = BookFragment()
            fragment.arguments = args
            return fragment
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bookID:UUID? = requireArguments().getSerializable(ARG_BOOK_ID) as UUID?
        mBook = BookLab.getBook(bookID)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v:View? = inflater.inflate(R.layout.fragment_book, container, false)

        mTitleField = v!!.findViewById (R.id.book_title)
        mTitleField!!.setText (mBook!!.mTitle)
        mRatingField = v!!.findViewById(R.id.book_rating)
        mRatingField!!.setText(mBook!!.mRating)
        mNumberPages = v!!.findViewById(R.id.book_pages)
        mNumberPages!!.text = "Number of Pages: " + mBook!!.mNumPages

        mTitleField!!.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
                mBook!!.mTitle = s!!.toString()
            }
        })


        mRatingField!!.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(s: Editable) {}

            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mBook!!.mRating = s!!.toString()
            }
        })

         return v
    }
}