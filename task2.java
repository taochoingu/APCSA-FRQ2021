import java.util.*;
class SingleTable { 
    private int seats;
    private double viewQuality;
    private int height;
    
    public SingleTable(int s, double vq, int h) {
        seats = s;
        viewQuality = vq;
        height = h;
    } 
    
    public int getNumSeats() {
        return seats;
    }
    
    public int getHeight() {
        return height;
    }
    
    public double getViewQuality() {
        return viewQuality;
    }
    
    public void setViewQuality(double value) {
        viewQuality = value;
    }
}

public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;
    public CombinedTable(SingleTable t1,SingleTable t2){
      table1=t1;
      table2=t2;
    }
    public boolean canSeat(int n){
      return n <= table1.getNumSeats()+table2.getNumSeats()-2;
    }
    public double getDesirability(){
      if (table1.getHeight() == table2.getHeight()) return (table1.getViewQuality()+table2.getViewQuality())/2.0;
      return (table1.getViewQuality()+table2.getViewQuality())/2.0 - 10;
    }
    public static void main(String[] args){
      SingleTable t1 = new SingleTable(4,60.0,74);
      SingleTable t2 = new SingleTable(8,70.0,74);
      SingleTable t3 = new SingleTable(12,75.0,76);
      CombinedTable c1 = new CombinedTable(t1,t2);
      CombinedTable c2 = new CombinedTable(t2,t3);
      System.out.println(c1.canSeat(9));
      System.out.println(c1.canSeat(11));
      System.out.println(c1.getDesirability());
      System.out.println(c2.canSeat(18));
      System.out.println(c2.getDesirability());
      t2.setViewQuality(80.0);
      System.out.println(c2.getDesirability());
    }
  }
