fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.entries.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    //This will throw ConcurrentModificationException
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    for (item in list2) {
        if (item % 2 == 0) {
            list2.remove(item)
        }
    }
    println(list2) // Throws ConcurrentModificationException
}