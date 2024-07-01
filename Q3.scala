def findAvg(num1: Double, num2: Double): Double = {
  return (num1 + num2) / 2;
}

@main def main3(): Unit = {
    println("Enter two numbers to find average");
    print("Enter first number: ")
    val num1 = scala.io.StdIn.readInt();
    print("Enter second number: ")
    val num2 = scala.io.StdIn.readInt();
    println(f"Average of $num1%d and $num2%d is: ${findAvg(num1, num2)}%1.2f");
}