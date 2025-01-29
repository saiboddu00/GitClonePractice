class arm1
{
  public static void main(String[] args)
  {
     
    for(int i=1;i<=1000;i++)
    {
      int a=i,c=0,temp=a,sum=0;
      while(a>0)
      {
        int rem=a%10;
        a=a/10;
        c++;
      }
     a=temp; 
     while(a>0)
     {
      int rem=a%10;  //1
      int power=(int)Math.pow(rem,c);
      a=a/10;
      sum=sum+power;
     }
      //System.out.println(sum);
      if(sum==temp)
     {
      System.out.println(temp+"   armstrong");
     }
     

   }

   }
}
