class ab
{
static void printarray(int arr[])
{
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
public static void main(String args[])
{
printarray(new int[]{56,78,65,45,21,32}); //anonymous array
}
}