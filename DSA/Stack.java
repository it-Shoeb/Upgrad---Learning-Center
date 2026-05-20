package DSA;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Stack {
    public static void main(String[] args) {

        // // Stack are classes
        // java.util.Stack<Integer> stack = new java.util.Stack<>();
        // // stack we can consider this as array that why array methods are we using
        // here
        // stack.push(12);
        // stack.push(1);
        // stack.push(2);
        // stack.push(3);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // System.out.println(stack);

        // Queue are Interfaces are tells what to do? not how to do//
        // here we are using LinkedList because Queue is not a class mean don't have am
        // object
        // storing as a array
        java.util.Queue<Integer> queue = new LinkedList<>();

        /**
         * Inserts the specified element into this queue if it is possible to do so
         * immediately without violating capacity restrictions, returning
         * {@code true} upon success and throwing an {@code IllegalStateException}
         * if no space is currently available.
         *
         * @param e the element to add
         * @return {@code true} (as specified by {@link Collection#add})
         * @throws IllegalStateException    if the element cannot be added at this
         *                                  time due to capacity restrictions
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null and
         *                                  this queue does not permit null elements
         * @throws IllegalArgumentException if some property of this element
         *                                  prevents it from being added to this queue
         */
        // boolean add(E e);

        /**
         * Inserts the specified element into this queue if it is possible to do
         * so immediately without violating capacity restrictions.
         * When using a capacity-restricted queue, this method is generally
         * preferable to {@link #add}, which can fail to insert an element only
         * by throwing an exception.
         *
         * @param e the element to add
         * @return {@code true} if the element was added to this queue, else
         *         {@code false}
         * @throws ClassCastException       if the class of the specified element
         *                                  prevents it from being added to this queue
         * @throws NullPointerException     if the specified element is null and
         *                                  this queue does not permit null elements
         * @throws IllegalArgumentException if some property of this element
         *                                  prevents it from being added to this queue
         */
        // boolean offer(E e);

        /**
         * Retrieves and removes the head of this queue. This method differs
         * from {@link #poll() poll()} only in that it throws an exception if
         * this queue is empty.
         *
         * @return the head of this queue
         * @throws NoSuchElementException if this queue is empty
         */
        // E remove();

        /**
         * Retrieves and removes the head of this queue,
         * or returns {@code null} if this queue is empty.
         *
         * @return the head of this queue, or {@code null} if this queue is empty
         */
        // E poll();

        /**
         * Retrieves, but does not remove, the head of this queue. This method
         * differs from {@link #peek peek} only in that it throws an exception
         * if this queue is empty.
         *
         * @return the head of this queue
         * @throws NoSuchElementException if this queue is empty
         */
        // E element();

        /**
         * Retrieves, but does not remove, the head of this queue,
         * or returns {@code null} if this queue is empty.
         *
         * @return the head of this queue, or {@code null} if this queue is empty
         */
        // E peek();

        // add // adding elements into the queue
        queue.add(12);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        // offer // failed inserting elements it throwing an exception
        queue.offer(3);
        
        // remove // return/Retrieves and removes the head of this queue it throws an exception if this queue is empty.
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        // poll // // return/Retrieves and removes the head of this queue // queue is empty throuw error
        System.out.println(queue.poll());

        System.out.println(queue.peek()); // head print // queue is empty return null
        System.out.println(queue.element()); // head print // queue is empty throuw error

    }
}
