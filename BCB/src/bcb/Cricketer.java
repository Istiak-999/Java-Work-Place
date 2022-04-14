
package bcb;

public class Cricketer {
    String name;
    int age;
    double totalPrizeMoney;
    final double matchFee=3000;
    double bonusAmount;
    double tpWithBonus;
    
  public void setValue(String n, int a){
    name=n;
    age=a;
    totalPrizeMoney=0.0;
    bonusAmount=0.0;
  }
public double calPrizeMoney(int noOfMatch){
   totalPrizeMoney=matchFee*noOfMatch;
   return totalPrizeMoney;
 } 
// i is for number of match 
public void calBonusAmount(int noOfMatch){
    if(noOfMatch>10){
      bonusAmount = noOfMatch*1000;
     }
 }
public void totalPrizeWithBonus(){
  tpWithBonus= totalPrizeMoney +bonusAmount;
}

public void displayInfo(){
    System.out.println("name = " + name);
    System.out.println("age = " + age);
    System.out.println("totalPrizeMoney = " + totalPrizeMoney);
    System.out.println("bonusAmount = " + bonusAmount);
    System.out.println("tpWithBonus = " + tpWithBonus);
}

}
