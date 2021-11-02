package com.example.codinginterviewquestions

/*Finding Max Profit*/
class MaxSellPrice {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            getMaxProfit()
            val data = intArrayOf(1, 8, 1, 1, 7, 6, 1, 1)
            findMaximumProfit(data)
        }

        private fun getMaxProfit() {
            val data = arrayOf(1, 8, 1, 1, 7, 6, 1, 1)
            var maxProfit = 0
            for (i in data.indices-1) {
                for (j in i+1 until data.size) {
                    if(data[j]-data[i]>maxProfit){
                        maxProfit = data[j]-data[i]
                    }
                }
            }
            println("Max Profit->$maxProfit")
        }

        fun findMaximumProfit(stockPrices: IntArray): Int {
            var minimumPrice = Int.MAX_VALUE
            var maxProfit = 0

            for (i in stockPrices.indices) {
                maxProfit = Math.max(maxProfit, stockPrices[i] - minimumPrice)
                minimumPrice = Math.min(minimumPrice, stockPrices[i])
            }
            System.out.println(maxProfit)
            return maxProfit
        }
    }



}
