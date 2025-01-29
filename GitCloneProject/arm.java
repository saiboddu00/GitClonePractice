class arm
{
public static void main(String[] args)
{

int a=1634,temp,rem,power=0;
temp=a;
while(temp!=0)
{
 rem=temp%10;
power+=(int)Math.pow(rem,4);
temp/=10;
}
if(power==a)
{
System.out.println(a +" is armstrong number"); 
}
else
{
System.out.println(a +" is not armstrong number"); 
}

}
}


