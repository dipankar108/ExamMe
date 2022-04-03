package com.examonlineme.examme

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuestionListAdapter() : RecyclerView.Adapter<QuestionListAdapter.QuestionListViewHolder>() {
    private var list = listOf<QuestionModel>()

    class QuestionListViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        val ques: TextView = itemview.findViewById(R.id.tv_question_id)
        val ans1: RadioButton = itemview.findViewById(R.id.rb_answer1_id)
        val ans2: RadioButton = itemview.findViewById(R.id.rb_answer2_id)
        val ans3: RadioButton = itemview.findViewById(R.id.rb_answer3_id)
        val ans4: RadioButton = itemview.findViewById(R.id.rb_answer4_id)
        val radioGroup: RadioGroup = itemview.findViewById(R.id.rg_answerList_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.examqueslist, parent, false)
        return QuestionListViewHolder(view)
    }

    override fun onBindViewHolder(holder: QuestionListViewHolder, position: Int) {
        val res = list[position]
        holder.ques.text = res.ques
        holder.ans1.text = res.ans1
        holder.ans2.text = res.ans2
        holder.ans3.text = res.ans3
        holder.ans4.text = res.ans4
        holder.radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when (radioGroup.checkedRadioButtonId) {
                holder.ans1.id -> {
                    Log.d("TAG", "onBindViewHolder: ans1 clicked")
                    holder.ans1.isEnabled = false
                    holder.ans2.isEnabled = false
                    holder.ans3.isEnabled = false
                    holder.ans4.isEnabled = false
                }
            }
            Log.d("TAG", "onBindViewHolder: ${radioGroup.checkedRadioButtonId}")
        }
        holder.radioGroup.setOnCheckedChangeListener(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setQuest(list: List<QuestionModel>) {
        this.list = list
    }
}

private fun RadioGroup.setOnCheckedChangeListener(position: Int) {
    Log.d("TAG", "setOnCheckedChangeListener: $position")
}
