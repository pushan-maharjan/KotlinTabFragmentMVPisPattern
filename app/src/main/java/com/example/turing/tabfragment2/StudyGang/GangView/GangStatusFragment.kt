package com.example.turing.tabfragment2.StudyGang.GangView

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.turing.tabfragment2.MainActivity
import com.example.turing.tabfragment2.R
import kotlinx.android.synthetic.main.fragment_study_gang_status.*

class GangStatusFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_study_gang_status, container,false)
    }
}