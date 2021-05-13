package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var btnAdd: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd=findViewById(R.id.button)

        btnAdd!!.setOnClickListener(View.OnClickListener{
            Toast.makeText(this@MainActivity,"hello",Toast.LENGTH_SHORT).show()
            var result =etV1.text.toString().toInt()+etV2.text.toString().toInt()
            textView.text = result.toString()
        })
    }
}