package Edureka;
public class Fibonacci 
{
public static void main(String[] args) 
{

//initializing the constants

int n = 111, t1 = 0, t2 = 1;
System.out.print("Upto " + n + ": ");

//while loop to calculate fibonacci series upto n numbers

// Here we are adding second commit.

while (t1 <= n)
{
System.out.print(t1 + " + ");
int sum = t1 + t2;
t1 = t2;
t2 = sum;
}

}
}