package questions

object q03 {
  def main(args:Array[String]){
    class Account(idNo:String,n:Int,b:Double){
      val nic:String=idNo 
      val accnumber: Int = n 
      var  balance: Double = b
      
     override def toString =   "["+nic+":"+accnumber +":"+ balance+"]"
     
     def transfer(x:Account,y:Double)={
        this.balance=this.balance-y
        x.balance=x.balance+y
       }
    }
    val accountA=new Account("9622727277V",191919101,200000)
    val accountB=new Account("986952276V",363636102,75000)
    val accountC=new Account("98116161616V",373777103,15000)
    val accountD=new Account("9716161616V",999777103,115000)

     
    println("..........Before Transfer............\n")
    println("Balance of accountA:"+accountA.balance)
    println("Balance of accountB:"+accountB.balance)
    
    val p=accountA.transfer(accountB,50000)
    
    println("\n..........After Transfer............\n")
    println("New Balance of accountA:"+accountA.balance)
    println("New Balance of accountB:"+accountB.balance)
  }
}