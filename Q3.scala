package prac04_22001816
object Q3 {
  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def main(args: Array[String]): Unit = {
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2))
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => name.take(name.length - 1) + name.last.toUpper)

    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)
  }
}
