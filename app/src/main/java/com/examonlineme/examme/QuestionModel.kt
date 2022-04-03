package com.examonlineme.examme

data class QuestionModel(
    val ques: String = "",
    val ans1: String = "",
    val ans2: String = "",
    val ans3: String = "",
    val ans4: String = "",
    val answer: String = "ans1",
    val selected: String = "nothing"
)
