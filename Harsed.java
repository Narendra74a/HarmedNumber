public class MyClass {
    public static void main(String args[]) {
      
      int num=156,rem,sum=0;
      int n=num;
      while(n>0){
          rem=n%10;
          sum=rem;
          n=n/10;
      }
      if(n%sum==0){
          System.out.print("Harsed Number");
      }else{
          System.out.print("not");
      }
      
     
    }
}