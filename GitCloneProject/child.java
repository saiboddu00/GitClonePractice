class child
{
 public static void main(String[] args)
 {
   child1 c=new child1();
   c.ab();
   int d=c.sum();
   System.out.println(d);

  }
}
 class child1
  {
   void ab()
   {
    System.out.println("hello guna bhai");
   }
    int sum()
     {
       int a=2;
       int b=4;
       return a+b;
     }
}