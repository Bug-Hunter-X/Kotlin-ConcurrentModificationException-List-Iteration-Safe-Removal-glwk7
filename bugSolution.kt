fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    //Correct way to remove items while iterating
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 3, 5]
} 