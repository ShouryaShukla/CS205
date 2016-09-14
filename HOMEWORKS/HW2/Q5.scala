object Q5 {
  
  def pivotSort(Lsd:List[Int], n: Int): List[Int]={
     
    if(Lsd == Nil)
      Lsd:+n
    else if(Lsd.head<=n)
      Lsd.head::pivotSort(Lsd.tail, n)
    else {
       
      pivotSort(Lsd.tail, n):+Lsd.head
      
    }
  
}
  def main(args: Array[String]): Unit = {
    var lst = List(6,8,2,5,0,8)
    println(pivotSort(lst,7))
  }
}