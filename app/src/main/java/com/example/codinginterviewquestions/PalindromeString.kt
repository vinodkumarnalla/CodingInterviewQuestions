package com.example.codinginterviewquestions

import java.util.*
import kotlin.collections.HashSet


class PalindromeString {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(checkPalindrome(""))
        }

        private fun checkPalindrome(input: String): Boolean {
            if(input == null || input.isEmpty()){
                return false
            }
            val stringBuffer = StringBuffer(input)
            return stringBuffer.reverse().toString() == input
        }
    }
}

class RemoveDuplicates{
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(removeDuplicates("aabbcc"))
        }

        private fun removeDuplicates(input: String): String {
            if(input !=null && input.isNotEmpty()){
                val dataSet = HashSet<Char>()
                for(i in input.indices){
                    dataSet.add(input[i])
                }
                val stringBuffer = StringBuffer()
                dataSet.forEach(){
                    stringBuffer.append(it)
                }
                return stringBuffer.toString()
            }
            return ""
        }
    }
}