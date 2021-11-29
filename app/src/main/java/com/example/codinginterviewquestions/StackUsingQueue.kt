package com.example.codinginterviewquestions

import java.util.*

class StackUsingQueue {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
           val stackUsingQueue = StackUsingQueue()
            stackUsingQueue.push(3)
            stackUsingQueue.push(1)
            stackUsingQueue.push(2)
            stackUsingQueue.push(3)
            System.out.println(stackUsingQueue.pop())
            System.out.println(stackUsingQueue.pop())
            System.out.println(stackUsingQueue.pop())
            System.out.println(stackUsingQueue.pop())
        }
    }
    var q1: Queue<Int> = LinkedList<Int>()
    var q2: Queue<Int> = LinkedList<Int>()

    fun push(value:Int){
        q1.offer(value)
    }

    fun isEmpty(): Boolean {
        return q1.isEmpty() && q2.isEmpty()
    }
    fun pop():Int{
        if(isEmpty()){
            return -1
        }
        while (q1.size>1){
            q2.offer(q1.remove())
        }
        val value = q1.remove()
        swapQueues()
        return value
    }

    private fun swapQueues() {
        var q3:Queue<Int> = LinkedList<Int>()
        q3 = q2
        q2 = q1
        q1 = q3
    }
}