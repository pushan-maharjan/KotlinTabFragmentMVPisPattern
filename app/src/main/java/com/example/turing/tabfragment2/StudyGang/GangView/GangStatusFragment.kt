package com.example.turing.tabfragment2.StudyGang.GangView

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel.TopStudyGangModel
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter.TopStudyGangListPresenter
import com.example.turing.tabfragment2.StudyGang.GangAdapter.TopGangLIstAdapter

class GangStatusFragment : Fragment() {
    lateinit var topStudyGangPoster: ArrayList<TopStudyGangModel>

    @SuppressLint("LogNotTimber")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = inflater.inflate(R.layout.fragment_study_gang_status, container,false)
        Log.d("12345", "Imhere")
        topStudyGangPoster = ArrayList<TopStudyGangModel>()
        topStudyGangPoster.clear()
        for (i in 1..50){

            Log.d("Iamhere", "Gang Name$i"+31+i+"Gang Logo"+"Gang Leader$i")

            var topStudyGangModel = TopStudyGangModel(
                    i,
                    "Gang Name$i",
                    31+i,
                    30+i,
                    "Gang Logo",
                    "Gang Leader$i")
            Log.d("gangleader",topStudyGangModel.gangName)

            topStudyGangPoster.add(topStudyGangModel)
            var top_gang_list = v.findViewById(R.id.top_gang_list) as RecyclerView
            top_gang_list.layoutManager = LinearLayoutManager(activity)
//            top_gang_list.visibility = View.VISIBLE
            var presenter  =  TopStudyGangListPresenter(topStudyGangPoster)
            top_gang_list.adapter = TopGangLIstAdapter(presenter, activity)
        }
        return v
    }

//    private fun topStudyGangListSetUp(){
//        for (i in 1..5){
//            Log.d("Iamhere", "Gang Name$i"+"31+i"+"Gang Logo"+"Gang Leader$i")
//            val topStudyGangModel = TopStudyGangModel("Gang Name$i", 31 + i,30+i,"Gang Logo", "Gang Leader$i")
//            this.topStudyGangPoster!!.add(topStudyGangModel)
//            setBiderListRecycler(topStudyGangPoster)
//        }
//    }
//
//    private fun setBiderListRecycler(topStudyGangPoster: ArrayList<TopStudyGangModel>){
//        top_gang_list.layoutManager = LinearLayoutManager(context)
//        top_gang_list.visibility = View.VISIBLE
//        val presenter  =  TopStudyGangListPresenter(topStudyGangPoster)
//        top_gang_list.adapter = TopGangLIstAdapter(presenter, activity?.applicationContext!!)
//    }
}