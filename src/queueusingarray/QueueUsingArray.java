/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusingarray;

import java.util.Scanner;

/**
 *
 * @author AMIT
 */
public class QueueUsingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue queue = new Queue(size);
        queue.enqueue(5);
        queue.enqueue(10);
        queue.dequeue();
        queue.dequeue();
        int temp = queue.peek();
        System.out.println(temp);
        queue.enqueue(15);
        queue.enqueue(20);
        temp = queue.peek();
        System.out.println(temp);
        queue.display();
    }
    
}
