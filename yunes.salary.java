public class NewClass1 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());

  public String sayHelloFromNewClass(){
    import java.util.Scanner;
    public class daramad {
      public static void main(String[]
      args) {
        Scanner scanner = new
        Scanner(System.in);
        double[] hoqooq = new
        double[10];
        //دریافت حقوق ده کارمند
        for (int i = 0; i <
        hoqooq.length; i++){
          System.out.print("لطفا حقوق کارمند "+(i + 1)+"را وارد کنید:");
          hoqooq[i]=
          scanner.nextDouble();
        } 
        //حقوق بعد از محاسبه بیمه و حق اولاد
        System.out.println("\nحقوق بعد از محاسبات:");
        for (int i = 0; i<
        hoqooq.length; i++) {
          double hoqooq =
          hoqooq[i];
          if (hoqooq > 5800000){
            //کسر حق بیمه
            double
            bime = hoqooq * 0.05;
            hoqooq -=
            bime;
            //اضافه حق اولاد
            zanbache = hoqooq * 0.07;
            hoqooq +=
            zanbache;
          } 
          System.out.printf("حقوق کارمند %d: %2f\n", (i+1),salary);
        }
                     scanner.close();      }
    }
  }

}