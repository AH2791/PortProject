public class PriorityQueue {
    Product [] array;  //array to store elements.
    int addPointer;//points to position, where new elemented is to be added.


    public PriorityQueue(int size){
        array=new Product[size];
        addPointer=0;
    }

    //function to swap two elements.
    private void swap(int index1,int index2){
        Product temp=array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }
    //this function compares element at the given index with its parent and swaps them, till max-heap property is not satisfied.//
    private void siftUp(int indexofnumtoSift){
        Product P1 = array[(indexofnumtoSift-1)/2];
        Product P2 = array[indexofnumtoSift];
        while(indexofnumtoSift>0){
            if(P1.ProductName.compareToIgnoreCase(P2.ProductName)<0){
                swap((indexofnumtoSift-1)/2,indexofnumtoSift);
                indexofnumtoSift=(indexofnumtoSift-1)/2;
                continue;
            }
            else{
                break;
            }
        }
    }
    //this function compares the element at the given index with its childrens and swaps them, until the max-heap property is not satisfied.This function could only use index parameter if we store numofelements as instance 			//variable.//
    private void siftDown(int indexofnumtoSift,int indexuptosiftDown){
        Product P1 = array[indexofnumtoSift];
        Product P2 = array[indexofnumtoSift*2+1];
        while(indexofnumtoSift<=(indexuptosiftDown-1)/2){
            int maxIndex=indexofnumtoSift;
            if(indexofnumtoSift*2+1<=indexuptosiftDown && P1.Receiver.compareToIgnoreCase(P2.Receiver)<0){
                maxIndex=indexofnumtoSift*2+1;
            }
            if(indexofnumtoSift*2+2<=indexuptosiftDown && array[maxIndex].Receiver.compareToIgnoreCase(array[indexofnumtoSift*2+2].Receiver)<0){
                maxIndex=indexofnumtoSift*2+2;
            }
            if(maxIndex!=indexofnumtoSift){
                swap(indexofnumtoSift,maxIndex);
                indexofnumtoSift=maxIndex;
                continue;
            }
            else{
                break;
            }
        }
    }
    //this function insert the element at the end and sift it up until max-heap property is not satisfied.//
    public void insert(Product product) throws Exception{
        System.out.println("Inserting data : " + product);
        if(addPointer>array.length-1){
            throw new Exception("Cannot insert,Size overflow error!");
        }
        array[addPointer] = product;
        siftUp(addPointer);
        addPointer++;
    }

    //this function extracts the max element.In this we first swap the first element with last and then siftdown the first element upto the secondlast element because last is the max element.//
    public Product extractMax() throws Exception{
        System.out.println("Extract Max Operation.");
        if(addPointer==0){
            throw new Exception("PriorityQueue is empty");
        }
        Product numtoExtract=array[0];
        swap(0,addPointer-1);
        addPointer--;
        siftDown(0,addPointer-1);
        return numtoExtract;
    }

    //this function returns the max element.//
    public Product getMax() throws Exception{
        if(addPointer==0){
            throw new Exception("PriorityQueue is empty.");
        }
        return array[0];
    }

    //this function changes the priority and sift the element up or down according to newValue of element.//
    public void changePriority(int indexofElement, Product newp){
        System.out.println("Change Priority Operation. Index = " + indexofElement + " New Value = " + newp);
        if(array[indexofElement].Receiver.compareToIgnoreCase(newp.Receiver)>0){
            array[indexofElement]=newp;
            siftDown(indexofElement,addPointer-1);
        }
        else{
            array[indexofElement]=newp;
            siftUp(indexofElement);
        }
    }

    //this function removes the element at the given index.//
    public void remove(int index){
        System.out.println("Remove element at index : " + index);
        array[index]=Object;
        siftUp(index);
        try{
            extractMax();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public void display(){
        System.out.print("\nPriorityQueue : ");
        if(addPointer==0){
            System.out.println("Empty Queue.");
            return;
        }
        for(int i=0;i<addPointer;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
}