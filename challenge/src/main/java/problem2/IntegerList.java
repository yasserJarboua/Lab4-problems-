package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int current;
    int size;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size=size;
        this.current=size-1;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] tmp=new int [this.size*2];
        for(int i=0;i<this.size;i++){
            tmp[i]=this.list[i];
        }
        this.list=tmp;
        this.size=this.size*2;
    }

    public void addElement(int newVal){
        if (current+1==size){
            this.increaseSize();
        }
        list[current+1]=newVal;
        current++;
    }

    public void removeFirst(int newVal){
        boolean found=false;
        for(int i=0;i<this.current+1;i++){
            if(this.list[i]==newVal){
                found=true;
            }
            if(found && i!=(this.current)){
                this.list[i]=this.list[(i+1)];
            }else if(found){
                this.list[i]=0;
                this.current--;
            }
        }
    }
    public void removeAll(int newVal){
        int cur=0;
        for(int i=0;i<this.current+1;i++){
            if(this.list[i]!=newVal){
                this.list[cur]=this.list[i];
                cur++;
            }
        }
        for(int j=cur;j<this.current+1;j++){
            this.list[j]=0;
        }
    }
    }