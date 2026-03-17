// Class WorkerThread kế thừa Thread
class WorkerThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy...");
    }
}

// Class WorkerRunnable triển khai Runnable
class WorkerRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable đang chạy...");
    }
}

// Class Main để test
public class ThreadDemo {
    public static void main(String[] args) {
        // Khởi chạy WorkerThread
        WorkerThread thread1 = new WorkerThread();
        thread1.start();
        
        // Khởi chạy WorkerRunnable
        WorkerRunnable runnable = new WorkerRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}