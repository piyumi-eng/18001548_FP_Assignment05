package questions

class Account(idNo:String,Acc_No:Int,bal:Double){
	var nic=idNo
	var accNo=Acc_No
	var balance=bal
}

object q04 {
  def main(args:Array[String]){

		var account1=new Account("BOC37377",727277,75000)
		var account2=new Account("BOC37378",474777,100000)
		var account3=new Account("BOC57379",393999,450000)
		var account4=new Account("BOC39380",929929,-1500)
		var account5=new Account("BOC35381",282888,-20000)
		var account6=new Account("BOC37386",101002,0)
		
		val bank:List[Account]=List(account1,account2,account3,account4,account5,account6)
		
		print("Overdraft Account Numbers   : ")
		var OverDraftlist=overDraft(bank)
		OverDraftlist.foreach(x=>print(x.accNo+"   "))

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