//Brenan Marenger
//Fragment of the page that displays entire book list
package com.example.bookintent

import androidx.fragment.app.Fragment

class BookListActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return BookListFragment()
    }

}
