class Account(n:Int, b:Double){
  val accNum:Int = n
  var balance:Double = b
  override def toString= "["+accNum+":"+balance+"]"
}

object q_4{

  def main(args: Array[String]) {

    val a:Account=new Account(10012,-500.00);
    val b:Account=new Account(10023,1200.00);
    var bank:List[Account]=List(a,b);


    val overdraft = bank.filter(x=>x.balance<0)
    println("Negative Accounts : "+overdraft);



    var total = bank.map(x=>x.balance).reduce((x,y) => x+y)
    println("Total Balance = " +total)

    bank.map(x=> if(x.balance>0) x.balance=x.balance*1.05 else x.balance=x.balance*1.1)
    println("With Interest :"+bank);}
}
