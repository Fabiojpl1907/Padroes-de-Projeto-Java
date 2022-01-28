package padrao.estrutural;
// Passo 2
//**Classe Adaptada:**
// Esta é a classe que é usada pela classe Adaptadora
// para reutilizar a funcionalidade existente e
// modificá-la para uso desejado.


public class BankDetails 

{
	private String bankName;
	private String accHolderName;
	private long accNumber;
	
	public String getBankName() {

		return bankName;
	}
	public void setBankName(String bankName) {

		this.bankName = bankName;
	}
	public String getAccHolderName() {

		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {

		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {

		this.accNumber = accNumber;
	}
	
}
