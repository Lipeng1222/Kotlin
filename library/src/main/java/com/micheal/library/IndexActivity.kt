package com.micheal.library

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
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
        lv_test.setOnItemClickListener(object :AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@IndexActivity,""+p2, Toast.LENGTH_SHORT).show()
            }
        })
    }


}
