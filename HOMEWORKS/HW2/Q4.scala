

object Q4 {
  import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

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
  
  def InsertionSort (args: List[Int]): List[Int]={
    var lst=args
    if (lst.isEmpty)
    {
    Nil 
      
    }
    else
    {
      sortInsert(InsertionSort(lst.tail), lst.head) 
    }
  }
  def main(args: Array[String]):Unit ={
    val b= scala.io.StdIn.readInt()
    val c=InsertionSort(List(1,2,5,4))
    println(c)
  }   
}
