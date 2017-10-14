/**
 * 
 */

/**
 * @author 刘茜
 * @Date:2017/10/14
 * @Description:模拟银行定期存款功能
 */
public class TestThird {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 DepositAccount saver = new DepositAccount("1234567890","zhangSan",5000);     
		 DepositAccount.setInterest(0.023);  //设置年利率
		 System.out.println("姓名:"+saver.getname());//查询用户名  
	     System.out.println("账号:"+saver.getaccountnumber()); // 查询账号  
		 System.out.println("年利息是：" + saver.calYearInterest());
		 saver.queryBalance();        //查询余额     
		 saver.deposit(2000);         //存入2000元     
	}
}

class DepositAccount{
	private String accountNum; //账号
	private String name; //姓名
	private double balance; //余额，均为实例成员变量
	static double interest; //年利率，类成员变量
	public static void setInterest(double n){ //设置年利率
	interest = n;
	}
	public DepositAccount(String num,String na,double ba){//开户，构造方法
		accountNum=num;
	    name=na;
		balance=ba;
	}
	
	public String getname(){ //查询储户姓名  
        return name;  
    }  
      
    public String getaccountnumber(){ //查询账号  
        return accountNum;  
    }  
      
    public double getbalance(){ //查询余额  
        return balance;  
    }  
	public double calYearInterest(){//计算年利息
		return balance*interest;
	}
	public void deposit(double cash){//存款
		System.out.println("您账户原有余额:"+balance);
		System.out.println("您现在存入:"+cash);
		balance+=cash;
		System.out.println("存款成功，您的余额是:"+balance);
	}
	public void queryBalance(){//查询余额
		System.out.println("您的余额是:"+balance);
	}
}

