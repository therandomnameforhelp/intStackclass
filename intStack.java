/*
Name:Final Project
Developer:
Date:11/11/2016
*/

public class intStack {

   private int[] elements;
   private int size; 
   
   public static final int stackCap = 10;
   
   public intStack() {
      this(stackCap);
      }
      
   public intStack(int capacity) {
      elements = new int[capacity];
      }

   public boolean empty() {
      return size == 0;
      }
      
   public int getSize() {
      return size;
      }
      
   public int peek() {
      return elements[size - 1];
      }
      
   public int pop() {
      return elements[--size];
      }  
      
   public static int push(int value) {
      return value;
      }
   public static void displayStack(String[] args) {
      intStack stack = new intStack();
      System.out.println("The Stack of integers is: ");
      for (int i=0; i<10;i++){
      stack.push(i);
      }
      while (!stack.empty()) {
      System.out.print(stack.pop() + " "); 
      }
   } 
      
}
      
