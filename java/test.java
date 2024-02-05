class prgm
{
int a;
void display()
{
System.out.println(a);
}
}

class test
{
public static void main(String args[])
{

prgm obj1 = new prgm();
obj1.a = 10;
prgm obj2 = new prgm();
obj2.a = 20;
obj1.display();
obj2.display();
}
}

