package com.example.turing.tabfragment2.StudyGang.GangAdapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter.TopStudyGangListPresenter
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.TopGang.TopGangViewHolder

class TopGangLIstAdapter(private val presenter: TopStudyGangListPresenter, private val context: Context) : RecyclerView.Adapter<TopGangViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopGangViewHolder {
        return TopGangViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.top_gang_adapter_layout, parent, false));
    }

    override fun onBindViewHolder(holder: TopGangViewHolder, position: Int) {
        presenter.onBindTopStudyGangViewAtPosition(position, holder)
    }

    override fun getItemCount(): Int {
        return presenter.getTopGangRowsCount()
    }
}