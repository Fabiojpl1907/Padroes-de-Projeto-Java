package padrao.comportamental;

//  Passo 1
//  interface Connection/State que fornecerá a conexão com a classe Controller/Context
// apresentados os estados possiveis
// Abrir / Fechar / registrar / atualizar
  
public interface Connection {  
  
       public void open();  
       public void close();  
       public void log();  
       public void update();  
}