package com.example.turing.tabfragment2.StudyGang.GangView

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangPresenter.StudyGangPresenter
import com.example.turing.tabfragment2.StudyGang.ViewPagerAdpater
import kotlinx.android.synthetic.main.activity_sudy_gang_main_activity.*

class StudyGangMainActivity : AppCompatActivity(), IStudyGangMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sudy_gang_main_activity)
        setSupportActionBar(toolbar)
        var adapter = ViewPagerAdpater(supportFragmentManager)
        adapter.addFragment(GangStatusFragment(), "Gang Status")
        adapter.addFragment(GangPostFragment(), "Posts")
        adapter.addFragment(MyGangFragment(), "My Gang")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
    override fun initView() {

    }

}