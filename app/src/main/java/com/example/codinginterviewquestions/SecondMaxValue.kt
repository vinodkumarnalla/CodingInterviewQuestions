package com.example.codinginterviewquestions

import java.util.*

class SecondMaxValue {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(2, 3, 10, 6, 4, 8, 1)
            println(findSecondMaxV2(arr))
        }

        private fun findSecondMaxV2(arr: IntArray): Int{
            if(arr.size<2){
                return -1
            }
            var firstMax =Int.MIN_VALUE
            var secondMax = Int.MIN_VALUE
            for( i in arr.indices){
                if(arr[i]>firstMax){
                    secondMax = firstMax
                    firstMax = arr[i]
                }else if(arr[i] >secondMax && arr[i]!=firstMax){
                    secondMax = arr[i]
                }
            }
            return secondMax
        }

        private fun findSecondMax(arr: IntArray): Int {
          if(arr.size<2){
              return -1
          }
           Arrays.sort(arr)
           return arr[arr.size-2]
        }
    }
}