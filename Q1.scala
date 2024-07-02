def reverseString(str : String) : String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
}

@main def main1() : Unit = {
    print("Enter a string to reverse: ");
    val str = scala.io.StdIn.readLine();
    println("Reversed string: " + reverseString(str));
}