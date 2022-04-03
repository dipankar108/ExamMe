package com.examonlineme.examme.quesmvvm

import com.examonlineme.examme.QuestionModel

class Repository {
    val quesList=ArrayList<QuestionModel>()
    fun addQuestion(){
        quesList.add(QuestionModel(""))
    }
}