def filterStringsByLength(strings: List[String]): List[String] = {
  strings.filter(_.length > 5)
}

@main def main2(): Unit = {
  val strings = List("a", "ab", "abc", "abcd", "abcde", "abcdef")
  println(filterStringsByLength(strings))
}