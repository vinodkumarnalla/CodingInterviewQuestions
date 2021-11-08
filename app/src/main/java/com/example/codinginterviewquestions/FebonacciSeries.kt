package com.example.codinginterviewquestions

class FebonacciSeries {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print(getFebonacciSeries(10))
        }

        private fun getFebonacciSeries(n: Int): IntArray {
          var first =0
            var second =1
            var data = IntArray(n)
            data[0] = first
            data[1] = second
            for(i in 2 until n){
                data[i] = first+second
                first = second
                second = data[i]
            }
            return data
        }

    }
}