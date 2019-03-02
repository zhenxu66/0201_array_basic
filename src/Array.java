public class Array {
    private int[] data;
    private int size;

    /**
     * construc func to open space for Array
     * @param capacity
     */

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
        //this can be used to refer instance variable of current class.
        //this can be used to invoke or initiate current class constructor.
    }

    public int getCapacity(){
        return data.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index, int e){
        if(size == data.length){
            throw new IllegalArgumentException("add failed as array capacity is full");
        }

        if(index <0 || index > size){
            throw new IllegalArgumentException("index must satisfy >0 and smaller than size");
        }
        //move backwards, index size-1 is the last element, move until index
        for(i=size-1; i>=index; i--){
            data[i+1] = data[i];
        }

        data[index] = e;
    }

    public void addLast(int e){
        add(size,e);
    }

    public void addFirst(int e){
        add(0,e);
    }

    public int get(int index){
        return data[index];
    }

    public


}
