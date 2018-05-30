package com.micheal.kotlin.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.micheal.kotlin.R
import kotlinx.android.synthetic.main.activity_index.*


class IndexActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)
        initData()
    }

    fun initData(){
        var strList:Array<String> = arrayOf("1","2","3")
        lv_test.adapter= ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,strList)
    }


}
