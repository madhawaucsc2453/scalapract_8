object q_1 {
def main(args:Array[String]){
  val x:rational =new rational(3,4);
  var r:rational=x.neg();
  println(r.numr+"/"+r.den)

}
}
class rational(x:Int,y:Int){
  var numr = x;
  var den = y;
  def neg()= new rational(-numr,den);
}