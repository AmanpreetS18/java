abstract class person
{
abstract void detail();
}
class main{
public static void main(String args[]){
person p=new person()
{
void detail()
{
System.out.println("Name is aman");
}
};
p.detail();
}
}