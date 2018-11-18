package com.example.turing.tabfragment2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.turing.tabfragment2.StudyGang.GangPresenter.StudyGangPresenter
import com.example.turing.tabfragment2.StudyGang.GangView.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var presenter: StudyGangPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        instance = this
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startActivity(Intent(this, StudyGangMainActivity::class.java))
//            var clickintent: Intent = Intent(MainActivity.instance, StudyGangMainActivity::class.java)
//
//            MainActivity.instance.startActivity(clickintent)
        }
        button2.setOnClickListener {
            startActivity(Intent(this, GangProfileActivity::class.java))
//            var clickintent: Intent = Intent(MainActivity.instance, StudyGangMainActivity::class.java)
//
//            MainActivity.instance.startActivity(clickintent)
        }
    }

//    companion object {
//        lateinit var instance: MainActivity
//            private set
//    }
}