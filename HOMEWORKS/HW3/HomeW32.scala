

object HomeW32 {
  def split(lst:List[Int],lst1:List[Int],lst2:List[Int]): (List[Int],List[Int])=
  {
    var lstt=lst
    var lstt1=lst1
    var lstt2=lst2
    while(true){
     if(lstt==Nil)
        return(lstt1,lstt2)
      else if(lstt ==lstt.head::Nil)
        return(lstt1, lstt.head::lstt2)
      else if(lstt==lstt.head::lstt.tail)
      {
        var lstn=lstt.tail.init
        var lst1n=lstt1:::List(lstt.head)
        var lst2n=lstt.tail.last::lstt2
        lstt=lstn
        lstt1=lst1n
        lstt2=lst2n
        
      }
      
    }
    return(lstt1,lstt2)
  }

def main(args: Array[String]):Unit ={
  var l1=List()
  var l2=List()
  var l=List(3,6,8,5,2,7,4)
  
  val lt=split(l, l1, l2)
  print(lt)
}
}