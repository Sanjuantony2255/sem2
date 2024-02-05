class test1
{
int a;
void display()
{
System.out.println();
}
}

class prgm
{
public static void main(String args[])
{

test obj1 = new test1();
obj1.a = 10;
test obj2 = new test1();
obj2.a = 20;
obj1.display();
obj2.display();
}
}

