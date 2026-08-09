class DynamicArray {
    int[] arr;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.arr = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (this.size==this.capacity){
            resize();
        }
        this.arr[this.size] = n;
        this.size+=1;
    }

    public int popback() {
        this.size -= 1;
        return this.arr[this.size];
    }

    private void resize() {
        this.capacity *= 2;
        int[] newArr = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newArr[i] = this.arr[i];
        }
        this.arr = newArr;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
