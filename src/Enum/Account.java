package Enum;

public class Account {
	private String accountNo;	//口座番号
	private int zandaka;		//残高
	private String accountType;//預金種類

	public Account(String no,String type) {
		this.accountNo = no;
		this.accountType = type;
	}

	public String toString() {return "口座番号: "+ accountNo + "\n残高: " + zandaka +  "\n預金種類: " + accountType;}

	public void setaccountNo(String no) {this.accountNo = no;}
	public void setzandaka(int zan) {this.zandaka = zan;}
	public void setaccountType(String type) {this.accountType = type;}

	public String getaccountNo() {return this.accountNo;}
	public int zandaka () {return this.zandaka;}
	public String accountType() {return this.accountType;}
}
