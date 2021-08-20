object q2 extends App {
    var a = new Rational(3,4)
    var b = new Rational(5,8)
    var c = new Rational(2,7)
    println(a-b-c)
    
}


class Rational(x: Int, y:Int) {

  // Useful to show 1/4 instead of 2/8
  private def gcd(a: Int, b: Int): Int =
	if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g 
  def denom = y / g 


  def + (that: Rational) =
	new Rational(
	  this.numer * that.denom + that.numer * this.denom,
	  this.denom * that.denom)

  def unary_- : Rational =
	new Rational(-this.numer, this.denom)

  def - (that: Rational) = this + -that

  override def toString =
	this.numer + "/" + this.denom
}