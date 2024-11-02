package edu.fullerton.fz.cs411.list02

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val logTag = "list02"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = this.supportFragmentManager.findFragmentById(R.id.person_list_fragment_container)
        if (currentFragment == null) {
            val fragment = PersonListFragment.newInstance()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.person_list_fragment_container, fragment)
                .commit()
        }
    }
}