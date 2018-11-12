package com.example.turing.tabfragment2.StudyGang.GangView

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel.GangPostModel
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter.GangPostListPresenter
import com.example.turing.tabfragment2.StudyGang.GangAdapter.GangPostListAdapter

class GangPostFragment : Fragment() {
    lateinit var studyGangPostPoster: ArrayList<GangPostModel>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View =  inflater.inflate(R.layout.fragment_study_gang_post, container, false)
        studyGangPostPoster = ArrayList<GangPostModel>()
        studyGangPostPoster.clear()
        for(i in 1..5){
            var studyGangPostModel = GangPostModel(
                    "July 20, 2019",
                    "What is the question you want to ask all the time?$i",
                    "This is the brief explanation of the question title which will make you undersand more clearly about this question in ranfom way$i",
                    3,
                    "pp",
                    0,
                    "DopeGang$1"
            )

            studyGangPostPoster.add(studyGangPostModel)
            var gang_post_list = v.findViewById(R.id.gang_post_list) as RecyclerView
            gang_post_list.layoutManager = LinearLayoutManager(activity)
            var presenter = GangPostListPresenter(studyGangPostPoster)
            gang_post_list.adapter = GangPostListAdapter(presenter, activity)
        }
        return v
    }
}