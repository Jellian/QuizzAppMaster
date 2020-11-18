package com.fiuady.quizzappmaster

data class Question(val question_number: Int, val questionText: String, val topic: Int, val answer1: String, val answer2: String,
                    val answer3: String, val answer4: String,val answer: String, var enabled: Boolean,  var cheated: Boolean,
                    val answered: Boolean, var correct: Boolean, val resp1:Boolean,val resp2:Boolean,val resp3:Boolean,val resp4:Boolean) {




}