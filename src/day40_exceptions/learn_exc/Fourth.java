package day40_exceptions.learn_exc;

public class Fourth {
    public static void main(String[] args) {
        try {


            System.out.println("Start");
            Thread.sleep(200);
            System.out.println("End");


        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

