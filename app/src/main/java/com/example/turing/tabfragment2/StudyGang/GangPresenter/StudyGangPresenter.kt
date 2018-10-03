package com.example.turing.tabfragment2.StudyGang.GangPresenter

import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import com.example.turing.tabfragment2.StudyGang.GangView.GangPostFragment
import com.example.turing.tabfragment2.StudyGang.GangView.GangStatusFragment
import com.example.turing.tabfragment2.StudyGang.GangView.MyGangFragment
import com.example.turing.tabfragment2.StudyGang.ViewPagerAdpater

class StudyGangPresenter: AppCompatActivity(), IStudyGangPresenter {
    override fun setupViewPager(viewPager: ViewPager) {
        var adapter = ViewPagerAdpater(supportFragmentManager)
        adapter.addFragment(GangStatusFragment(), "Gang Status")
        adapter.addFragment(GangPostFragment(), "Posts")
        adapter.addFragment(MyGangFragment(), "My Gang")
        viewPager.adapter = adapter
    }
}