
import scala.io._
object HomeW31 {
  class Queue(QQ:List[Any]) {
  var Q=QQ
  def equals(that: Queue): Boolean={
        (this.Q, that.Q) match{
            case (Nil, Nil) => true
            case (hd1::rest1, hd2::rest2) => (hd1.equals(hd2)) && (rest1.equals(rest2))
            case _ => false
        }
    }
    override def hashCode(): Int={
        var mult: Int=1
        this.Q.foreach{
            mult*=_.hashCode()
        }
        mult
    }
   def Enque(x:Any)={
    val y=List(x)
    Q = Q:::y
  }
  def Deque() = {
    if(Q==Nil)
      println("empty Queue")
    else
      Q = Q.tail
  }
  }

  def main(args: Array[String]):Unit={
    var obj=new Queue(Nil)
    var c=2
    while(c!=0){
      println("Press 1 to add to queue, 2 to delete from queue and 0 to exit")
    var d= scala.io.StdIn.readLine()
    if(d=="0")
      c=0
    else if(d=="1")
      c=1
    else if(d=="2")
      c=2
    else
        println("Wrong Input")
      if(c==1){
    println("Enter element to be added:")
    val add= scala.io.StdIn.readLine()
    obj.Enque(add)
    println(obj.Q)
      }
      else if(c==2){
        obj.Deque()
    println(obj.Q)
      }
      
    
  }
  }
}