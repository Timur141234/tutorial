package ru.Timur141234;

/**
 * Created by Timur141234 on 08.05.2018, Май, 2018
 */
public class ThreadDemo extends Thread {
    int i = 0;
    public void run() {
        try {
            do {
                System.out.println("Hello!");
                i++;
            }while (i < 10);
        }catch (Exception ex) {

        }
    }
}
class Main {
    public static void main(String args[]) {

        ThreadDemo threadDemo = new ThreadDemo();
       threadDemo.start();

    }

}

