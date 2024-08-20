class Stack<E>{
    int DEFAULT_SIZE = 5;

    int idx  = -1;
    int peek = -1;
    Object arr[];

    public Stack(){
         arr = new Object[DEFAULT_SIZE];
    }
    

    //Add element
    public void add(Object ele){
        idx++;

        if(idx == arr.length){
            System.out.println("Stack is Full..");
            return;
        }

        arr[idx] = ele;
        peek++;
    }

    //Remove element
    public Object remove(){
        if(idx == -1){
            System.out.println("Stack is Empty..");
            return -1;
        }

        Object removal = arr[peek];
        idx--;
        peek--;
        return removal;
    }

    //Peek element
    public Object peek(){
        if(idx == -1){
            System.out.println("Stack is Empty..");
            return -1;
        }
        return arr[peek];
    }

    public boolean isStackFull(){
        if(idx == arr.length){
            return true;
        }
        return false;
    }

    public void print(){

        System.out.print("[ ");
        for(Object ele:arr){
            System.out.print(ele + " ,");
        }
        System.out.println(" ]");

    }


    public static void main(String args[]){
        Stack s = new Stack();
        s.add(32);
        s.add(33);
        s.add(34);
        s.add(35);
        s.add(36);
        s.print();

        

    }
}