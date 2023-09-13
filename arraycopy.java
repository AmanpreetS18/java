class copy
{
public static void main(String[] args)
{
char source[]={'a','b','c','d','e','f','g','h','i'};
char destination[]=new char[9];
System.arraycopy(source,0,destination,2,6);
System.out.println(String.valueOf(destination));
}
}