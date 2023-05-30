package com.example.circlemenue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.akki.circlemenu.CircleMenu
import com.akki.circlemenu.OnCircleMenuItemClicked


class MainActivity : AppCompatActivity(), OnCircleMenuItemClicked {
    lateinit var cirlcemenu: CircleMenu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cirlcemenu = findViewById(R.id.circle_menu1)

        cirlcemenu?.setOnMenuItemClickListener(this)


    }//end oncreat


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }

    override fun onMenuItemClicked(id: Int) {
        when (id) {
            R.drawable.baseline_emoji_emotions_24 -> showToast("emoji Button clicked")
            R.drawable.baseline_person_24 -> showToast("Person Button clicked")
            R.drawable.baseline_verified_24 -> showToast("Setting Button clicked")
            R.drawable.baseline_home_24 -> showToast("home Button clicked")
        }
    }


}