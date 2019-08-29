/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueusingarray;

/**
 *
 * @author AMIT
 */

class Queue {
        //
    
           int size;
        int front=-1;
        int rear=-1;
        int arr[] = null;
        
        
        
    Queue(int s){
         size=s;
         arr = new int[size];
         
    }   
        
    void enqueue(int i) {
        if(front==(size-1)){
            System.out.println("Queue is full"); 
        }
        else{
        front++;
        arr[front]=i;
        }
    }

    void dequeue() {
        rear++;
        if(front==rear){
            front=-1; rear=-1;
        }
    }

    int peek() {
        if(front==rear){ System.out.println("Queue is empty"); return 0; }
        else { return arr[rear+1];}
    }

    void display() {
        if(front==rear){
            System.out.println("Queue is empty"); return ;
        }
        else{
        for(int i=rear+1;i<=front;i++)
            System.out.println(arr[i]);
        }
    }
    
}
