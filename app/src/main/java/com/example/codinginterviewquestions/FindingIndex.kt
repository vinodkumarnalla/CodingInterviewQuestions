package com.example.codinginterviewquestions

/*Find Low & High Index of a key from a given array*/
class FindingIndex {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20)
            findLowestHighestIndex(arr, 20)
        }

        private fun findLowestHighestIndex(data: IntArray, key: Int) {
            var lowIndex: Int = data.size-1
            var highestIndex:Int = 0
            for(i in data.indices-1){
                if(data[i] == key){
                    if(lowIndex >i){
                        lowIndex = i
                    }
                    if(highestIndex<i){
                        highestIndex = i
                    }
                }
            }
            println("$lowIndex $highestIndex")
        }

    }
}