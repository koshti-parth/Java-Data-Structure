public class DynamicStack extends Stack{

    public DynamicStack(){

    }

    public void grow(){
        DEFAULT_SIZE = DEFAULT_SIZE * 2;
        if(isStackFull()){
            Object temp[] = new Object[DEFAULT_SIZE];

            for (int i = 0; i < this.arr.length; i++) {
                temp[i] = arr[i];
            }

            this.arr = temp;
        }
    }

    @Override
    public void add(Object ele){
        idx++;

        if(idx == arr.length){
            grow();
        }

        arr[idx] = ele;
        peek++;
    }


    public static void main(String[] args) {
        DynamicStack s = new DynamicStack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.print();


    }
}

