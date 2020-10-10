package com.oop.Lab2;

public class Queue {
    private Node front;		// front points to front element in the queue (if any)
    private Node last;		// rear points to last element in the queue
    private int Size;
    private int capacity;
    private class Node {
        int data;
        Node next;
        public int print()
        {
            return data;
        }
    }

    public Queue()
    {
        front = null;
        last = null;
        Size = 0;
        capacity =0;
    }

    public Queue(int size)
    {
        front = null;
        last = null;
        Size = 0;
        capacity = size;
    }

    public boolean isEmpty()
    {
        return (Size == 0);
    }


    public void pop()
    {
        int data = front.data;
        front = front.next;
        if (isEmpty())
        {
            last = null;
        }
        Size--;
        System.out.println("Element " + data+ " removed from the queue");
    }


    public void push(int data)
    {
        if (capacity != 0)
            if (Size == capacity)
            {
                System.out.println("Queue is full");
                return;
            }
        Node oldRear = last;
        last = new Node();
        last.data = data;
        last.next = null;
        if (isEmpty())
        {
            front = last;
        }
        else  {
            oldRear.next = last;
        }
        Size++;
        System.out.println("Element " + data+ " added to the queue");
    }

    public void isFull()
    {
        if (capacity == 0) System.out.println("Queue can't be full");
        else
        if (Size+1 == capacity)
        {
            System.out.println("Queue is full");
            return;
        }
        else System.out.println("Queue isn't full");
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(3);
        Queue q2 = new Queue();
            System.out.println("Queue 1:");
            q1.push(1);
            q1.push(20);
            q1.push(-13);
            q1.pop();
            System.out.println(q1.Size + " " + q1.capacity);
            System.out.println("Checking is queue is empty...");
            if (q1.isEmpty()) System.out.println("Queue is empty!");
                else System.out.println("Queue isn't empty!");
            System.out.println("Checking is queue is full...");
            q1.isFull();
        System.out.println();
            System.out.println("Queue 2:");
            q2.push(223);
            q2.push(-3);
            q2.push(18);
            q2.pop();
            System.out.println("Checking is queue is empty...");
            if (q2.isEmpty()) System.out.println("Queue is empty!");
                else System.out.println("Queue isn't empty!");
            System.out.println("Checking is queue is full...");
            q2.isFull();

    }
}
