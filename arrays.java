import java.util.Arrays;
class array
{
public static void main(String args[])
{
int a[]={51,56,85,43,23,65};

System.out.println("Traversing element ");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}


System.out.println("Traversing element in reverse ");
for(int j=a.length-1; j>0; j--)
{
System.out.println(a[j]);
}

System.out.println("Sorting array ");
Arrays.sort(a);
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}

System.out.println("Minimum element ");
 int min=a[0];
for(int i=0;i<a.length;i++)
{

if(min>a[i])
{
min=a[i];
}
}
System.out.println(min);

System.out.println("using for each loop");
char c[]=new char[4];
c[0]='a';
c[1]='m';
c[2]='a';
c[3]='n';
for(char ch:c)
{
System.out.println(ch);
}

}
}