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
        setContentView(R.layout.activity_main)
        button.setOnClickListener({
            var clickintent = Intent(this, StudyGangMainActivity::class.java)
            startActivity(clickintent)
        })
    }
}
