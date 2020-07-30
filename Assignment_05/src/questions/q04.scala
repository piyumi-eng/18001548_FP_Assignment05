package questions

class Account(IdNo:String,AccNo:Int,bal:Double){
	var NIC=IdNo
	var accountNo=AccNo
	var balance=bal
}

object q04 {
  def main(args:Array[String]){

		var account1=new Account("NDB56632",1234567,10000)
		var account2=new Account("NDB67590",2345678,200000)
		var account3=new Account("NDB12345",3456789,450000)
		var account4=new Account("NDB23456",1357924,-1500)
		var account5=new Account("NDB34567",2468135,-20000)
		var account6=new Account("NDB45678",9070503,0)
		
		val bank:List[Account]=List(account1,account2,account3,account4,account5,account6)
		
		print("Overdraft Account Numbers   : ")
		var OverDraftlist=overDraft(bank)
		OverDraftlist.foreach(x=>print(x.accountNo+"   "))

		var TotalBalance=bal(bank)
		print("\nTotal Account Balance       : "+TotalBalance.balance)

		print("\nAccount Balances + Interest : ")
		var InterestList=interest(bank);
		InterestList.foreach(x=>print(x+"  "))

	}

	val overDraft=(list:List[Account])=>list.filter(x=>x.balance<=0)
	val bal=(list:List[Account])=>list.reduce((x,y)=>new Account("BOC0000",1000,x.balance+y.balance))
	val interest=(list:List[Account])=>list.map(x=>(if(x.balance>0) x.balance*1.05d else x.balance*1.01d))
}