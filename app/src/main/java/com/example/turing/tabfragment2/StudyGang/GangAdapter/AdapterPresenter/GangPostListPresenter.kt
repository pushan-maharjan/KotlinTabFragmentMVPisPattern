package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter

import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel.GangPostModel
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.GangPost.GangPostRowView

class GangPostListPresenter(var gangPostModel : List<GangPostModel>) {
    fun onBindTGangPostViewAtPosition(position: Int, rowView: GangPostRowView){
        var gModel: GangPostModel = gangPostModel[position]
        rowView.setAnswerCount(gModel.anserCount)
        rowView.setGangName(gModel.gangName)
        rowView.setQuestionTitle(gModel.questionTitle)
        rowView.setQuestionBody(gModel.questionTitle)
        rowView.setLikeCount(gModel.likeCount)
        rowView.setPostedDate(gModel.postedDate)
        rowView.setProfilePicture(gModel.profilePicture)
    }

    fun getGangPostRowsCount(): Int {
        return gangPostModel.size
    }
}