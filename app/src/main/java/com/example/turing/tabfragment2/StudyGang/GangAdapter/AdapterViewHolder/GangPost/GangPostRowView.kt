package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.GangPost

interface GangPostRowView {
    fun setPostedDate(postedDate: String)
    fun setQuestionTitle(questionTitle: String)
    fun setQuestionBody(questionBody: String)
    fun setLikeCount(likeCount: Int)
    fun setProfilePicture(profilePicture: String)
    fun setAnswerCount (answerCount: Int)
    fun setGangName(gangName: String)
}