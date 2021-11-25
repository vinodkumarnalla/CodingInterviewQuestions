package com.example.codinginterviewquestions

import java.util.*


class QueueUsingStack {
    val s1 = Stack<Int>()
    val s2 = Stack<Int>()

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val q = QueueUsingStack()
            q.enQueue(1)
            q.enQueue(2)
            q.enQueue(3)

            println(q.deQueue())
        }

    }

    private fun deQueue() : Int{
       if(s1.isEmpty()){
           return -1
       }
        val value = s1.peek()
        s1.pop()
        return value
    }

    private fun enQueue(i: Int) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop())
        }
        s1.push(i)
        while (!s2.isEmpty()) {
            s1.push(s2.pop())
        }
    }
}