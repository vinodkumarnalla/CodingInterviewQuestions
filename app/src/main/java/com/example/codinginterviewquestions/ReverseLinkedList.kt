package com.example.codinginterviewquestions


class ReverseLinkedList {
    data class Node(var data:Int, var nextNode: Node?=null)
    var headNode: Node?=null
    fun reverse(node:Node?): Node? {
        var prevNode:Node ?=null
        var nextNode:Node ?=null
        var currentNode: Node? = node
        while (currentNode!=null){
             nextNode = currentNode.nextNode
             currentNode.nextNode = prevNode
             prevNode = currentNode
             currentNode = nextNode
        }
        return prevNode;

    }
    fun printList(node: Node?) {
        var node = node
        while (node != null) {
            print(node.data.toString() + " ")
            node = node.nextNode
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val linkedList = ReverseLinkedList()
            linkedList.headNode = Node(1)
            linkedList.headNode?.nextNode = Node(2)
            linkedList.headNode?.nextNode?.nextNode = Node(3)

            linkedList.printList(linkedList.headNode)
            linkedList.headNode = linkedList.reverse(linkedList.headNode)
            println("")
            linkedList.printList(linkedList.headNode)
        }
    }
}