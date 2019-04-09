package com.example.instances

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btnfrag1.setOnClickListener {
           val blankFragment=BlankFragment()
           val fragmentManager=supportFragmentManager
           val transaction=supportFragmentManager.beginTransaction()
           transaction.replace(R.id.fragcontainer, blankFragment)
           transaction.commit()
       }
        btnfrag2.setOnClickListener {
            val blankFragment2=BlankFragment2()
            val fragmentManager=supportFragmentManager
            val transaction=supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragcontainer, blankFragment2)
            transaction.commit()
        }




    }
}
