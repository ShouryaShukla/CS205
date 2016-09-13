

object Q3 {
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
object HW2 {
  def sortInsert (args: List[Int], x:Int): List[Int]=
  {
      var lt=args
      var n=x
      if (lt.isEmpty==true)
      {
        lt:+n
      }
        
      else if(n<lt.head)
      {
        n::lt
      }
      else
      {
        lt.head::sortInsert(lt.tail: List[Int], x) 
      }
  }
  def main(args: Array[String]):Unit ={
    val b= scala.io.StdIn.readInt()
    val c=sortInsert(List(1,2,4,5),b)
    println(c)
  }   
}  
}
