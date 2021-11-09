
public class BankAccountRunner {
	
	public static void main(String[] args) {
		bankname bankname = new Bankname();
		System.out.println(Bankname.getBankName());
		
		bankname.setbanktype("smallbank");
		
		System.out.println(bankname.getbankname);
	}

	}


}
