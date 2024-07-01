def sumOfEven (list : List[Int]) : Int = {
    return list.filter(_ % 2 == 0).sum
}

@main def main4(): Unit = {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println(s"Sum of even number in ${list.mkString("[", ", ", "]")} is: ${sumOfEven(list)}");
}