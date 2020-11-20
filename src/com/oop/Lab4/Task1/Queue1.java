package com.oop.Lab4.Task1;

public class Queue1 {
    private Node1 front;		// front points to front element in the queue (if any)
    private Node1 last;		// rear points to last element in the queue
    public int Size;
    private int capacity;
    private class Node1 {
       char data1;
        Node1 next;
    }

    public Queue1()
    {
        front = null;
        last = null;
        Size = 0;
        capacity =0;
    }

    public boolean isEmpty()
    {
        return (Size == 0);
    }


    public void pop()
    {
        char data = front.data1;
        front= front.next;
        if (isEmpty())
        {
            last = null;
        }
        Size--;
    }


    public void push(char data)
    {
        Node1 oldRear = last;
        last = new Node1();
        last.data1 = data;
        last.next = null;
        if (isEmpty())
        {
            front = last;
        }
        else  {
            oldRear.next = last;
        }
        Size++;
    }
}
