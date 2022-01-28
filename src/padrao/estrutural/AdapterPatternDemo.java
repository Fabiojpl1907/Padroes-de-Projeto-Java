package padrao.estrutural;

//**Client:**
// Esta classe simula o objeto cliente
// utilizando seu cartão de crédito
// e necessitando de aprovação de uso
// cujo retorno é
// The Account number X of  nnnn  in bbbb bank is valid and authenticated for issuing the credit card.


public class AdapterPatternDemo {
	
	
	public static void main(String args[]) 
	{
		CreditCard targetInterface=new BankCustomer();
	    targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}

}
