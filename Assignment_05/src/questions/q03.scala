package questions

object q03 {
  def main(args:Array[String]){
    class Account(IdNo:String,n:Int,b:Double){
      val NIC:String=IdNo 
      val accNo: Int = n 
      var  balance: Double = b
      
     override def toString =   "["+NIC+":"+accNo +":"+ balance+"]"
     
     def transfer(x:Account,y:Double)={
        this.balance=this.balance-y
        x.balance=x.balance+y
       }
    }
    val accountA=new Account("975662345V",123456789,50000)
    val accountB=new Account("994567324V",234567890,75000)
    val accountC=new Account("983456234V",135792468,100000)
    val accountD=new Account("974509736V",246813579,200000)

     
    println("..........Before Transfer............\n")
    println("Balance of accountA:"+accountA.balance)
    println("Balance of accountB:"+accountB.balance)
    
    val p=accountA.transfer(accountB,50000)
    
    println("\n..........After Transfer............\n")
    println("New Balance of accountA:"+accountA.balance)
    println("New Balance of accountB:"+accountB.balance)
  }
}