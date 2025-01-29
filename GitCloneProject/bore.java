class bore
{
public static void main(String[] args)
{

int a=5,c=0;
for(int i=1;i<=a;i++)
{
  if(a%i==0)
  c++;
}
System.out.println(c);
if(c==2)
System.out.println("prime ");
else
System.out.println("not prime");
}
}