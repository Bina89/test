package Enum;

public class Account {
	private String accountNo;	//口座番号
	private int zandaka;		//残高
	private String accountType;//預金種類

	public void setaccountNo(String no) {this.accountNo = no;}
	public void setzandaka(int zan) {this.zandaka = zan;}
	public void setaccountType(String type) {this.accountType = type;}

	public String getaccountNo() {return this.accountNo;}
	public int zandaka () {return this.zandaka;}
	public String accountType() {return this.accountType;}
}
