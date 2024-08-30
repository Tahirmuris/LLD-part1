package designPattern.singletonDesign;

public class DbMain {

    public static void main(String[] args) {

        Task task1 = new Task();
        Task task2 = new Task();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

class Task implements  Runnable {


    @Override
    public void run() {
        DbConnector db1 = DbConnector.getInstance();
        System.out.println("Thread: " + Thread.currentThread().getName());
        System.out.println("Class name: " + db1.getClass().getName());
        System.out.println("Instance hash code: " + db1.hashCode());
    }
}
