package busRes;

public class Bus {
   private int busNo;
   private boolean Ac;
  private  int capacity;
    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.Ac=ac;
        this.capacity=cap;
    }
    public int getCapacity(){ //accessor method
        return capacity;
    }
    public void setCapacity(int cap){
        capacity= cap; //mutator

    }
    public void displayBusInfo(){
        System.out.println("busNo:"+busNo+  "Ac:"+Ac+   "capacity:"+capacity);
    }
  public int getBusNo(){ //accessors
        return busNo;
  }
    public boolean isAc() {
        return Ac;
    }

}

