package com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.TopGang

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.top_gang_adapter_layout.view.*

class TopGangViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView), TopGangRowView {

    override fun setStudyGangName(gangName: String) {
        itemView.gang_name.text = gangName
    }

    override fun setMemberCount(gangMemberCount: Int) {

    }

    override fun setStudyGangLeader(gangLeader: String) {
        itemView.gang_leader.text = gangLeader
    }

    override fun setStudyGangLogo(gangLogo: String) {
    }

    override fun setPostCount(gangPostCount: Int) {
    }

}


