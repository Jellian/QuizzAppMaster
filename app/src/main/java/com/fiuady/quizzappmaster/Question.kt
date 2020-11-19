package com.fiuady.quizzappmaster

data class Question(val question_number: Int, val questionText: Int, val topic: Int, val answer1: Int, val answer2: Int,
                    val answer3: Int, val answer4: Int,val answer: Int, var enabled: Boolean,  var cheated: Boolean,
                    var status: Int, var correct: Boolean, val resp1:Boolean,val resp2:Boolean,val resp3:Boolean,val resp4:Boolean, var respuesta:Int) {




}