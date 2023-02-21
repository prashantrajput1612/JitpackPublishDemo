package com.jitpackpublishdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jitpackpublishmodule.JitpackUtils

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var text = findViewById<TextView>(R.id.text_hello)
        text.text= JitpackUtils.suburbs[0]
    }
}