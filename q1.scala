object q1 extends App {
 var a = new Rational(1,2)
 println(a.neg(a))
}


class Rational(x: Int, y: Int){
  
def numer = x;
def denom = y;

override def toString = numer + "/" + denom

def neg(r: Rational) = new Rational(-r.numer, r.denom)
 

}

