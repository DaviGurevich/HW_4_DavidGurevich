package oop;

public class ExceptionPractice {

    public static void main(String[] args) throws InterruptedException {

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        try {
            System.out.println(9 / 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getClass());
        } finally {
            System.out.println("finally");
        }
    }
}

