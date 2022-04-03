package com.examonlineme.examme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuestionListAdapter() : RecyclerView.Adapter<QuestionListAdapter.QuestionListViewHolder>() {
    private var list = listOf<QuestionModel>()

    class QuestionListViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.examqueslist, parent, false)
        return QuestionListViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionListViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setQuest(list: List<QuestionModel>) {
        this.list = list
    }
}