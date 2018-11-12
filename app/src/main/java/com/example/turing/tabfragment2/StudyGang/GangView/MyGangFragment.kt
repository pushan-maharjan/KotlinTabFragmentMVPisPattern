package com.example.turing.tabfragment2.StudyGang.GangView

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel.TopStudyGangModel
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter.TopStudyGangListPresenter
import com.example.turing.tabfragment2.StudyGang.GangAdapter.TopGangLIstAdapter

class MyGangFragment: Fragment() {
    lateinit var topStudyGangPoster: ArrayList<TopStudyGangModel>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = inflater.inflate(R.layout.fragment_study_gang_my_gang, container, false)
        topStudyGangPoster = ArrayList<TopStudyGangModel>()
        topStudyGangPoster.clear()
        for (i in 1..5){
            var topStudyGangModel = TopStudyGangModel(
                    0+i,
                    "Gang Name$i",
                    31+i,
                    30+i,
                    "Gang Logo",
                    "Gang Leader$i")

            topStudyGangPoster.add(topStudyGangModel)
            var top_gang_list = v.findViewById(R.id.my_gang_list) as RecyclerView
            top_gang_list.layoutManager = LinearLayoutManager(activity)
            var presenter  =  TopStudyGangListPresenter(topStudyGangPoster)
            top_gang_list.adapter = TopGangLIstAdapter(presenter, activity)
        }
        return v
    }
}