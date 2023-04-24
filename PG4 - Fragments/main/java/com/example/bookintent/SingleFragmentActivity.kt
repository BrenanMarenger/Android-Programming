//Brenan Marenger
//Acts as a fragment generator
package com.example.bookintent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

abstract class SingleFragmentActivity : FragmentActivity() {

    protected abstract fun createFragment():Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val fm: FragmentManager? = supportFragmentManager
        var fragment: Fragment? = fm!!.findFragmentById(R.id.fragment_container)
        if (fragment==null) {
            fragment = createFragment()
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit()
        }
    }
}
