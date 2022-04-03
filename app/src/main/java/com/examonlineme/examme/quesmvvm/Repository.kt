package com.examonlineme.examme.quesmvvm

import com.examonlineme.examme.QuestionModel

object Repository {
    private val quesList = ArrayList<QuestionModel>()
    fun getQuestion(): ArrayList<QuestionModel> {
        if (quesList.isEmpty()) {
            addQuestion()
        }
        return quesList
    }

    private fun addQuestion() {
        quesList.add(
            QuestionModel(
                "What is the capital of Bangladesh ?",
                "Dhaka",
                "Khulna",
                "Chittagong",
                "Barishal",
                "Dhaka"
            )
        )
        quesList.add(
            QuestionModel(
                "What is name of national poet of bangladesh ?",
                "Ravindranath Tagure",
                "Kazi Nazrul Islam",
                "Jasim Uddin",
                "Micheal Modhusudhan Datta",
                "Kazi Nazrul Islam"
            )
        )
    }
}