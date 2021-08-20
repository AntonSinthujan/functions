object q3 extends App {
 var q = new Account("Account1",100,200.0)
 var w = new Account("Account2",101,500.0)
 println(q.balance)
 println(w.balance)
 q.transfer(w, 100.0)
 println(q.balance)
 println(w.balance)
 
 
}


class Account(id:String,n: Int, b: Double) {
val nic:String=id
val acnumber: Int = n
var balance: Double = b
override def toString = nic+ ":" +acnumber + ":" + balance

def withdraw(a:Double) = this.balance=this.balance-a

def deposit(a:Double) =  this.balance=this.balance+a

def transfer(a:Account,c:Double)={
  this.balance=this.balance-c
  a.balance=a.balance+c
}
}


