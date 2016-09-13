

object Q7 {
  import scala.io.StdIn.{readLine, readInt}
import scala.math._


object Q7 {
  var result: BigInt = 1
  def fastPower(n: BigInt, x: BigInt): BigInt = {
    var a = n
    var b = x
    if(a%2!=0){
       result = result * b
     }
    if(a==1)
      return result
     b = b * b
     a = a/2
     
    fastPower(a,b)
    
    
  }
  def main(args: Array[String]): Unit = {
    println(fastPower(10,2))
  }
}
}