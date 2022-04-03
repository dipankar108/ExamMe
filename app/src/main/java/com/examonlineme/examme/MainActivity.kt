package com.examonlineme.examme

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.examonlineme.examme.quesmvvm.Repository

class MainActivity : AppCompatActivity() {
    lateinit var rec: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rec = findViewById(R.id.rv_questionListView_id)
        rec.layoutManager = LinearLayoutManager(this)
        val adapter = QuestionListAdapter()
        adapter.setQuest(Repository.getQuestion() as List<QuestionModel>)
        rec.adapter = adapter
    }
}