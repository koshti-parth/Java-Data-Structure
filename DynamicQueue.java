public class DynamicQueue extends Queue{

    public DynamicQueue(){

    }

    public void grow(){
        DEFAULT_SIZE = DEFAULT_SIZE * 2;
        if(isFull()){
            Object temp[] = new Object[DEFAULT_SIZE];

            for (int i = 0; i < this.arr.length; i++) {
                temp[i] = arr[i];
            }

            this.arr = temp;
        }
    }


    @Override
    public void add(Object ele){
        rearidx++;

        if(rearidx == arr.length){
            grow();
        }

        arr[rearidx] = ele;
    }

    public static void main(String[] args) {
        DynamicQueue q  = new DynamicQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();

        q.add(879);
        q.print();
    }
}
