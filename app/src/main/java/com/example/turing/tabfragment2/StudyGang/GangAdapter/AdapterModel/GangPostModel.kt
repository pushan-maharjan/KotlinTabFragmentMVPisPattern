package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GangPostModel(
        var postedDate: String,
        var questionTitle: String,
        var questionBody: String,
        var likeCount: Int,
        var profilePicture: String,
        var anserCount: Int,
        var gangName: String
) : Parcelable