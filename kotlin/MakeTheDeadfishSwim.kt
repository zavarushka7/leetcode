/*
 Create a parser to interpret and execute the Deadfish language.

Deadfish operates on a single value in memory, which is initially set to 0.

It uses four single-character commands:

    i: Increment the value
    d: Decrement the value
    s: Square the value
    o: Output the value to a result array

All other instructions are no-ops and have no effect.
Examples

Program "iiisdoso" should return numbers [8, 64].
Program "iiisdosodddddiso" should return numbers [8, 64, 3600].

*/

package kata.deadfish

fun parse(data: String): List<Int> {
    var res = 0
    var list = mutableListOf<Int>()
    for (i in data){
        if (i == 'i'){
            res += 1
        } else if (i == 'd'){
            res -= 1
        } else if (i == 's'){
            res *= res
        } else if (i == 'o'){
            list.add(res)
        }
    }
    return list
}
