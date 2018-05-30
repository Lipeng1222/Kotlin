package com.micheal.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import com.micheal.library.IndexActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view : View){
//        message.text="好难用啊"
        var intent:Intent=Intent();
        intent.setClass(this, IndexActivity::class.java)
        startActivity(intent)
    }


    fun fun1():Int{
        return 0;
    }
}
