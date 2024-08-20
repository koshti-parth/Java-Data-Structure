class Queue{
    Object arr[];
    int front = 0;
    int rearidx = -1;

    int DEFAULT_SIZE = 5;


    public Queue(){
        this.arr = new Object[DEFAULT_SIZE];
    }

    //Add element
    public void add(Object ele){
        rearidx++;

        if(rearidx == arr.length){
            System.out.println("Queue is Full.");
            return;
        }

        arr[rearidx] = ele;
    }

    //Remove element
    public Object remove(){

        if(rearidx == -1){
            System.out.println("Queue is Empty.");
            return -1;
        }

        Object removal = arr[front];

        //Shift Elements
        for(int i = 1;i < arr.length;i++){
            arr[i - 1] = arr[i];
        }
        rearidx--;

        return removal;
    }

    public boolean isEmpty(){
        return rearidx == -1;
    }

    public boolean isFull(){
        return rearidx == arr.length;
    }

    public void print(){

        System.out.print("[");
        for(Object ele:arr){
            System.out.print(ele + ",");
        }
        System.out.println("]");

    }



    public static void main(String args[]){
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();

        q.add(22);
        q.print();
    }
}