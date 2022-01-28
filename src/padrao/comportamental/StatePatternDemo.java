package padrao.comportamental;

//Sistema de controle  de uma empresa dentro do contexto
// Contabilidade / Vendas / Gerenciamento,
// onde o comportamento do objeto se altera
// segundo o seu estado (abrir,fechar ,registrar transação, atualizar )

public class StatePatternDemo {
  
       Controller controller;

       StatePatternDemo(String con) {  
          controller = new Controller();
           // o seguinte gatilho deve ser feito pelo usuário
          if(con.equalsIgnoreCase("management"))  
             controller.setManagementConnection();  
          if(con.equalsIgnoreCase("sales"))  
             controller.setSalesConnection();  
          if(con.equalsIgnoreCase("accounting"))  
                 controller.setAccountingConnection();  
          controller.open();  
          controller.log();  
          controller.close();  
          controller.update();  
       }  
         
         
       public static void main(String args[]) {  
  
           new StatePatternDemo(args[0]);  
             
       }  
  
}