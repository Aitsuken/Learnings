//package DataTypes;

import java.util.Scanner;

public class arrayQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(1000);
        Scanner sc = new Scanner(System.in);
        String action = "";
        boolean attack = true;
        while (attack) {
            action = sc.next();
            switch (action) {
                case "push":
                    int x = sc.nextInt();
                    queue.push(x);
                    break;
                case "pop":
                    queue.pop();
                    break;
                case "front":
                    queue.front();
                    break;
                case "size":
                    queue.size();
                    break;
                case "clear":
                    queue.clear();
                    break;
                case "exit":
                    attack = queue.exit();
                    break;
                default:
                    break;
            }
        }
    }


}

class Queue {
    private static int front, size, rear;
    private static int queue[];

    Queue(int x) {
        front = 0;
        rear = 0;
        size = x;
        queue = new int[x];

    }

    public void push(int n) {
        queue[rear] = n;
        rear++;
        System.out.println("ok");
        return;
    }

    public void pop() {
        if (rear == front) {
            System.out.println("error");
            return;
        }
        System.out.println(queue[front]);
        for (int i = 0; i < queue.length - 1; i++) {
            queue[i] = queue[i + 1];
        }
        queue[rear] = 0;
        rear--;
    }

    public void front() {
        if (front == rear) {
            System.out.println("error");
            return;
        }
        System.out.println(queue[0]);
    }

    public void size() {
        System.out.println(rear);
    }

    public void clear() {
        queue = new int[1000];
        front = 0;
        rear = 0;
        System.out.println("ok");
    }

    public boolean exit() {
        System.out.println("bye");
        return false;
    }


}
