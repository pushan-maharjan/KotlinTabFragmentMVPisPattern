package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter

import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel.TopStudyGangModel
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.TopGang.TopGangRowView

class TopStudyGangListPresenter(var topStudyGangModel: List<TopStudyGangModel>) {

    fun onBindTopStudyGangViewAtPosition(position: Int, rowView: TopGangRowView){
        val gModel: TopStudyGangModel = topStudyGangModel!![position]
        rowView.setRank(gModel.rank)
        rowView.setStudyGangName(gModel.gangName)
        rowView.setStudyGangLeader(gModel.gangLeader)
        rowView.setStudyGangLogo(gModel.gangLogo)
        rowView.setMemberCount(gModel.gangMemberCount)
        rowView.setPostCount(gModel.gangPostCount)
    }

    fun getTopGangRowsCount(): Int {
        return topStudyGangModel!!.size;
    }
}