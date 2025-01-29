class Armstrong
{
     public static void main(String[] args)
     {
       //sum of power of count of a number == armstrong number
       //153  ,count=3 
          
       int a=153,c=0,sum=0,temp=a;
       while(a>0)  //153>0 T,  15>0 T  ,1>0 T  ,0>0 F
       {
       int rem=a%10; // 3 5
         a=a/10;  //15  1  0
         c++;    //c=1  2  3
       }
       System.out.println("c value is"+c);
       a=temp;
       while(a>0)
       {
         int rem=a%10;
         int power=(int)Math.pow(rem,c);
         sum=sum+power;
         a=a/10;
       }
       System.out.println("sum value is"+sum);
       if(sum==temp)
              System.out.println("Armstrong Number");
       else
              System.out.println("Not Armstrong Number");
      }
  }






// a=10)15(1
        // 10 27 125 1