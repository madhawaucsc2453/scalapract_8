class AccDet(n: Int, b: Double) {

  val accnum:Int=n;
  var balance:Double=b;

  def transfer(acc:AccDet,amount:Double)={
    this.balance=this.balance-amount;
    acc.balance=acc.balance+amount;
  }

}


object q_3{
  def main(args: Array[String]) {

    val cust1:AccDet=new AccDet(10012,10000.00);
    val cust2:AccDet=new AccDet(10023,12000.00);

    cust1.transfer(cust2,2000.00);

    println("Balance of customer 1 after transfered :"+cust1.balance);
    println("Balance of customer 2 after transfered :"+cust2.balance);



  }
}