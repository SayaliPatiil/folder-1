public class Systemexit
{
    
    public static void foo() {
      try {
        int num1 = 10/5;
      }
      catch (Throwable e) {
          e.printStackTrace();
          int c;
      }
    }

    public static void main( String args[] ) {
      foo();
    
}
}
