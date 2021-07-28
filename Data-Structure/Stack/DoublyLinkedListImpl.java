package sa.edu.yuc;
import java.util.Iterator;
public class DoublyLinkedListImpl<T extends Comparable<T>> implements DoublyLinkedList<T> {
        private Node head=null;
        private Node tail=null;
        private int size ;
        
            public class Node{
                private Node next;
                private Node prev;
                private T data;

        public Node(T data) {
            this.data = data;
        }
                
            }
        
    @Override
    public boolean isEmpty() {
        if (head==null) {
            return true;
        }
            return false;
    }

    @Override
    public boolean insertFirst(T item) {
        Node nod = new Node(item);
            nod.next=head;
            head.prev=nod;
            nod.prev=null;
            head=nod;
            size++;
            return true;
            
    }

    @Override
    public boolean insertLast(T item) {
        Node nod = new Node(item);
            nod.prev=tail;
            tail.next=nod;
            nod.next=null;
            tail=nod;
            size++;
            return true;
            
    }

    @Override
    public T removeFirst() {
        T b=head.data;
        Node nod=head;
        head.next=nod;
        nod.prev=null;
        size--;
        return b;
        
    }

    @Override
    public T removeLast() {
       T b = tail.data;
       Node temp=tail;
       tail=temp.prev;
       tail.next=null;
       size--;
       return b;
       
   
    }

    @Override
    public boolean insertAtPosition(int position, T item) {
         Node nod = new Node(item);
        Node  temp=head;
        if (size>position) {
            for (int i = 2; i < position; i++) 
                temp=temp.next;
           
        }
        nod.prev=temp;
        nod.next=temp.next;
        temp.next=nod;
        temp.next.prev=nod;
        size++;
        return true;
    }

    @Override
    public T removeAtPosition(int position) {
         Node  temp=head;
        if (size>position) {
            for (int i = 2; i < position; i++) 
                temp=temp.next;
        }
        T b=temp.data;
        temp.next=temp.next.next;
        temp.prev=null;
        return b;
    }

    @Override
    public T search(T item) {
        Node temp=head;
        while(temp!=null){
            if (temp.data==item) 
                return temp.data;
                temp=temp.next;
    }
            return null;
                
            
    }

    @Override
    public T getFirst() {
        return head.data;
    }

    @Override
    public int getPosition(T item) {
        int pos=1;
        Node temp=head;
        
        while (temp!=null){
            if (temp.data == item) 
                return pos;
                pos++;
                temp=temp.next;
            }
            return -1;
      
    }

    @Override
    public T removeValue(T item) {
        Node current=head;
        Node temp=null;
        
        while (current !=null && current.data != item)
            if (current.data == item) {
                temp=current;
                current= current.next;
                
                
            }
        temp.next=current.next;
        return current.data;
    }
    
    
    public String toString(){
        String temp="";
        Node current = head;
        while (current != null)
            temp+= current.data+"\n";
        current=current.next;
        return temp;
    }
}