package com.example.codinginterviewquestions

class IntegerProblems {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
           println(reverseInteger(234))
        }

        private fun reverseInteger(value: Int): Int {
            var value = value
            var reverse = 0
            while (value != 0){
                reverse*=10
                reverse+= value % 10
                value /= 10
            }
            return reverse
        }
    }

}