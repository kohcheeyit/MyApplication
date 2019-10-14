package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //onCreate = main() funciton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Display UI. R = resources
        setContentView(R.layout.activity_main)
        //TODO : countinue your code here
        //val = value,= var =variable

        //Linking code to UI
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener { showname() }
        button2.setOnClickListener{ showname2()}
    }

    private fun showname2() {
        textViewName.setText("Hellow lmao world")
    }

    private fun showname() {
        textViewName.setText("Hello <your name here>")
    }
}
