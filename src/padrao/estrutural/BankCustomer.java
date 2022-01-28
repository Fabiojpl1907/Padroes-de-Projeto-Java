package padrao.estrutural;

import java.io.BufferedReader;
import java.io.InputStreamReader;


// passo 3
// **Classe adaptadora:**
// Esta classe é uma classe empacotadora que implementa
// a interface de destino desejada e modifica a
// solicitação específica disponível da classe Adaptada.
// obtem de Bankdetails as informações espeficicas necessárias
// a utilização especifica informada pela interface ( cartão de credito)

public class BankCustomer extends BankDetails implements CreditCard {

	
	public void giveBankDetails(){
	
	try{
		
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter the account holder name :");
	
	String customername=br.readLine();
	
	System.out.print("\n");
	
    System.out.print("Enter the account number:");
	
	long accno=Long.parseLong(br.readLine());

	System.out.print("\n");
	
    System.out.print("Enter the bank name :");
	
	String bankname=br.readLine();
	
	  setAccHolderName(customername);
	  setAccNumber(accno);
	  setBankName(bankname);
	}catch(Exception e){
		e.printStackTrace();
	}
	
	}
	@Override
	public String getCreditCard() {
		
		
		long accno=getAccNumber();
		String accholdername=getAccHolderName();
		String bname=getBankName();
		
	    return ("The Account number "+accno+" of "+accholdername+" in "+bname+ " bank is valid and authenticated for issuing the credit card. ");
	   
	  }
	
}
