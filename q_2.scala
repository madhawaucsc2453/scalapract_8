object q_2 {
def main(args: Array[String]): Unit ={
  val x:rat=new rat(4,5);
  val y:rat=new rat(2,3);
  val z:rat=new rat(4,7);
  var k:rat =x.sub(y);
  var res:rat=k.sub(z);
  println(res.numr+"/"+res.den)
}
}
class rat(x:Int,y:Int) {
  var numr=x;
  var den=y;


  def sub(r:rat)={
    new rat(numr*r.den - r.numr*den,den * r.den);
  }

}