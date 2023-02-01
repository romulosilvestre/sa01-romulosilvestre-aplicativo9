package br.com.senaitagua.sa1.app9;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Dúvida programação estuturada e lógica booleana
		
		int mes=12;
		int opcao=5;
		
	    switch(opcao) {
	       case 1:
	    	   //estrutura de seleção simples
			    if(mes==1)
				    System.out.println("Janeiro");
			        break;
	       case 2:
	    	   //estrutura de seleção composta
	    	   if(mes==1)
				    System.out.println("Janeiro");
			    else
			     	System.out.print("Outro mês");
			    break;
	       case 3:
	    	   //estrutura de seleção composta(encadeado)
	    	   if(mes==1) {
				    System.out.println("Janeiro");
	    	   }else if(mes==2) {
			     	System.out.print("Fevereiro");
	    	   }else {
			    	System.out.println("Outro mês");
	    	   }
			    break;
	       case 4:
	    	   if(mes==12) {
	    		   for(int i=1;i<=12;i++) {
	    			   System.out.println("Feliz Natal-mes:"+i);
	    		   }
	    	   }else {
	    		   System.out.println("Não é natal!");
	    	   }
	    	   break;
	       case 5:
	    	   if(mes==12) {
	    		   System.out.println("Seja bem vindo ao Banco SS");
	    		   int senha=123;
	    		   int cont=1;
	    		   while(cont<=3) {
	    			   System.out.println("Desafio para bloquear o cartão");
	    			   cont=cont+1;
	    		   }
	    		   if(senha ==123) {
	    			   System.out.println("pode sacar");
	    		   }else {
	    			   System.out.println("senha inválida");
	    		   }
	    	   }
			default:
				System.out.println("Não tem essa opção não");
	    	     
	    }
		
	}

}
