package com.example.hakerranktest.problem_solving

class MinMaxSum {

    fun solve(arr: Array<Int>): Unit {
        var minSum = 0
        var maxSum = 0
        // Write your code here
        arr.sort()
        val size = arr.size
        for (i in 0 until size) {
            if (i < 4)
                minSum += arr[i]
            if (i > 0)
                maxSum += arr[i]
        }

        println(minSum)
        println(maxSum)
    }

}