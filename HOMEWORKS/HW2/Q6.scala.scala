object Q6{
      def quickSort(X: List[Int]): List[Int] = X match {
         case Nil => Nil
         case head :: tail => {
             val (low, high) = tail.partition(_ < head)
             quickSort(low) ::: head :: quickSort(high)
    }
}

     def main(args:Array[String]):Unit={
       val Lst=List(4,6,1,3,9,0,5)
       println(quickSort(Lst))}
}