class capital_small
{
   public static void main(String[] args)
   {
	 char c='@';

	 if(c>=65 && c<=90)           //if(c>='A' && c<='Z')
	 {
	   System.out.println("letter is capital ");
 	 }
         else if(c>=97 && c<=122)     //else if(c>='a' && c<='z')
         {
	   System.out.println("letetr is small");
         }
         else if(c>=48 && c<=57)      //else if(c>='0' && c<='9')
	 {
 	   System.out.println("Character is Number");
	 }
         else
          {
           System.out.println("special character");
           } 
   }
}
