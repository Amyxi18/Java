/**
 * 
 */

/**
 * @author ����
 * @Date:2017/10/14
 * @Description:ģ�����ж��ڴ���
 */
public class TestThird {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 DepositAccount saver = new DepositAccount("1234567890","zhangSan",5000);     
		 DepositAccount.setInterest(0.023);  //����������
		 System.out.println("����:"+saver.getname());//��ѯ�û���  
	     System.out.println("�˺�:"+saver.getaccountnumber()); // ��ѯ�˺�  
		 System.out.println("����Ϣ�ǣ�" + saver.calYearInterest());
		 saver.queryBalance();        //��ѯ���     
		 saver.deposit(2000);         //����2000Ԫ     
	}
}

class DepositAccount{
	private String accountNum; //�˺�
	private String name; //����
	private double balance; //����Ϊʵ����Ա����
	static double interest; //�����ʣ����Ա����
	public static void setInterest(double n){ //����������
	interest = n;
	}
	public DepositAccount(String num,String na,double ba){//���������췽��
		accountNum=num;
	    name=na;
		balance=ba;
	}
	
	public String getname(){ //��ѯ��������  
        return name;  
    }  
      
    public String getaccountnumber(){ //��ѯ�˺�  
        return accountNum;  
    }  
      
    public double getbalance(){ //��ѯ���  
        return balance;  
    }  
	public double calYearInterest(){//��������Ϣ
		return balance*interest;
	}
	public void deposit(double cash){//���
		System.out.println("���˻�ԭ�����:"+balance);
		System.out.println("�����ڴ���:"+cash);
		balance+=cash;
		System.out.println("���ɹ������������:"+balance);
	}
	public void queryBalance(){//��ѯ���
		System.out.println("���������:"+balance);
	}
}

