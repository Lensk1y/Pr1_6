fun main(args: Array<String>) {
    print("input 1 number: "); var n1 = readln().toInt();
    print("input 2 number: "); var n2 = readln().toInt();
    if((n1 + n2) % 2 != 0) { println("$n1 + $n2 = " + (n1+n2).toString()); } else
        if((n1 - n2) % 2 != 0) { println("$n1 - $n2 = " + (n1-n2).toString()); } else
            if((n1 * n2) % 2 != 0) { println("$n1 * $n2 = " + (n1*n2).toString()); } else
                if((n1 / n2) % 2 != 0) { println("$n1 / $n2 = " + (n1/n2).toString()); } else
                    println("can't make odd number");
}