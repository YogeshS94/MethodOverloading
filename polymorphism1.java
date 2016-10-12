class Methodoverloading
{
void print_msg(){
System.out.println("It does not have any value");
}
void print_msg(int a)
{
System.out.println("Integer Value" +a);
}
void print_msg(double d)
{
System.out.println("Double Value" +d);
}

}
class polymorphism1{
public static void main(String args[]){
Methodoverloading ob = new Methodoverloading();
int b=3;
ob.print_msg(b);
ob.print_msg(1.02);
}
}