package prac04_22001816

object Q2 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    var num = scala.io.StdIn.readInt()

    if(num<0){
      println(s"$num is a negative number.")
    }
    else if(num==0){
      println(s"$num is a zero.")
    }
    else if(num % 2 == 0){
      println(s"$num is an even number.")
    }
    else {
      println(s"$num is an odd number.")
    }
  }
}
