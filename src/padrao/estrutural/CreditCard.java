package padrao.estrutural;

// passo 1
// **interface de destino :**
// que será usada pelos clientes que
// querem utilizar o cartao de credito sem se preocupar
// com as necessárias interações com os bancos

public interface CreditCard 

{
	public void giveBankDetails();
	public String getCreditCard();
	
}
