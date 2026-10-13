class Matrix(val arr: Array<IntArray>,
             val row: Int, val col: Int) {

    operator fun plus(other: Matrix): Matrix
    { val result = Array(row)
    { IntArray(col) }

        for (i in 0 until row)
        { for (j in 0 until col) {
            result[i][j] = arr[i][j] + other.arr[i][j]
        }
        }

        return Matrix(result, row, col)
    }

    operator fun minus(other: Matrix): Matrix
    { val result = Array(row)
    { IntArray(col) }

        for (i in 0 until row)
        { for (j in 0 until col)
        {
            result[i][j] = arr[i][j] - other.arr[i][j]
        }
        }
        return Matrix(result, row, col)
    }

    operator fun times(other: Matrix): Matrix
    {
        val result = Array(row)
        {
            IntArray(other.col)
        }

        for (i in 0 until row)
        {
            for (j in 0 until other.col)
            { for (k in 0 until col)
            {
                result[i][j] += arr[i][k] * other.arr[k][j]
            }
            }
        }
        return Matrix(result, row, other.col)
    }

    override fun toString():
            String { var s = ""
        for (i in 0 until row)
        { for (j in 0 until col)
        {
            s += "${arr[i][j]} "
        }
            s += "\n"
        }
        return s
    }
}

fun main(){
    val firstMatrix = Matrix(arrayOf(intArrayOf(3,-2,5),
        intArrayOf(3,0,4)),2,3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2,3),
        intArrayOf(-9,0),
        intArrayOf(0,4)),3,2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6,3), intArrayOf(9,0), intArrayOf(4,5)),3,2)

    println("***********Addition*************")
    println("Matrix:1 ")
    println(secondMatrix1)
    println("Matrix:2 ")
    println(secondMatrix)
    val addMatrix =secondMatrix1 + secondMatrix
    println("Addition Matrix: ")
    println(addMatrix)

    println("***********Subtraction*************")
    println("Matrix:1 ")
    println(secondMatrix1)
    println("Matrix:2 ")
    println(secondMatrix)
    val subMatrix =secondMatrix1 - secondMatrix
    println("Subtracted Matrix: ")
    println(subMatrix)

    println("***********Multiplication*************")
    println("Matrix:1 ")
    println(firstMatrix)
    println("Matrix:2 ")
    println(secondMatrix)
    val mulMatrix =firstMatrix * secondMatrix
    println("Multiplied Matrix: ")
    println(mulMatrix)
}
