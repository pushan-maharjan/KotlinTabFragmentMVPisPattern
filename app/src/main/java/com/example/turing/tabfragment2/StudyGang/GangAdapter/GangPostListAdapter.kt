package com.example.turing.tabfragment2.StudyGang.GangAdapter

import android.support.v4.app.FragmentActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.turing.tabfragment2.R
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterPresenter.GangPostListPresenter
import com.example.turing.tabfragment2.StudyGang.GangAdapter.AdapterViewHolder.GangPost.GangPostViewHolder

class GangPostListAdapter(private var presenter: GangPostListPresenter, private var context: FragmentActivity?) : RecyclerView.Adapter<GangPostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GangPostViewHolder {
        return GangPostViewHolder(LayoutInflater.from(context)
                .inflate(R.layout.gang_post_adapter_layout, parent, false));
    }

    override fun getItemCount(): Int {
        return presenter.getGangPostRowsCount()
          }

    override fun onBindViewHolder(holder: GangPostViewHolder, position: Int) {
        presenter.onBindTGangPostViewAtPosition(position, holder)      }
}