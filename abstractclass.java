abstract class person{
abstract void appraisal();
static void salary(){
System.out.println("Salary is 500000");
}
person(){
System.out.println("Constructor call");
}
}
class main extends person{
public void appraisal(){
System.out.println("Bonus is 60000");
}
public static void main(String args[]){
person.salary();
p.appraisal();
person p=new main();
}
}