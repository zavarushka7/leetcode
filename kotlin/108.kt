 /* Дан массив a a из n n целых чисел. Напишите программу, которая выведет сумму различных чисел в массиве.*/
 fun main(){
   val n = readln().toInt()
   var sum = 0
   var arr = readln().split(" ").map{ it.toLong() }

   var arrSet = arr.toSet()
   print(arrSet.sum())
}
