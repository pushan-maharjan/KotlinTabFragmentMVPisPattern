package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterModel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TopStudyGangModel(
    var gangName: String,
    var gangMemberCount: Int,
    var gangPostCount: Int,
    var gangLogo: String,
    var gangLeader: String
) : Parcelable