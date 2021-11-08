package com.example.codinginterviewquestions

class MissingNumber {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(1, 2, 4, 5,6, 3, 7, 8)
            println(findMissingNumber(arr))
        }

        private fun findMissingNumber(arr: IntArray): Int {
            val count = arr.size + 1
            val totalCount = (count * (count + 1)) / 2
            var sum = 0
            for (i in arr.indices) {
                sum += arr[i]
            }
            return totalCount - sum
        }
    }
    }