public class DLL{

    //Node Structure
    public class Node{
        int val;
        Node next;
        Node prev;

        public Node(){

        }

        public Node(int val){
             this.val = val;   
        }

        
    }

    //2 Pointers of Doubly Linked List
    Node head;
    Node tail;


    //Add element from front
    public void addFirst(int val){
        Node newnode = new Node(val);

        if(head== null){
            head = newnode;
            tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    } 

    //Remove element from front
    public void removeFirst(){

        if(head== null){
            return;
        }

        head = head.next;
        head.prev = null;
    } 

    //Add Element from back
    public void addLast(int val){
        Node newnode = new Node(val);

        if(head== null){
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = tail.next;
    } 

    //Remove element from last
    public void removelast(){

        if(head== null){
            return;
        }

        tail = tail.prev;
        tail.next = null;
    } 

    public void print(){
        if(head== null){
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
    }
    



}