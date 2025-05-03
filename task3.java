import java.util.*;

class MemberInfo{
  private String name;
  private int gradYear;
  private boolean hasGoodStanding;
  public MemberInfo(String name,int gradYear,boolean hasGoodStanding){
    this.name = name;
    this.gradYear=gradYear;
    this.hasGoodStanding = hasGoodStanding;
  }
  public int getGradYear(){
    return gradYear;
  }
  
  public boolean inGoodStanding(){
    return hasGoodStanding;
  }
}
public class ClubMembers{
  private ArrayList<MemberInfo> memberList;
  public void addMembers(String[] names, int gradYear){
    for(String x : names){
      memberList.add(new MemberInfo(x,gradYear,true));
    }
  }
  public ArrayList<MemberInfo> removeMembers(int year){
  ArrayList<MemberInfo> arr = new ArrayList<MemberInfo>();
  for(int i =memberList.size()-1; i >= 0;i++){
    if(memberList.get(i).getGradYear()<= year){
    if (memberList.get(i).inGoodStanding()) arr.add(memberList.get(i));
    memberList.remove(i);
    }
  }
  return arr;
  }
}
