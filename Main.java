
public class Main {

	public static void main(String[] args) {
	
		Cliente carlos  = new Cliente();
		carlos.setNome("Carlos");
		carlos.setCpf("999.588.668-88");
		
		Cliente ronaldo  = new Cliente();
		ronaldo.setNome("Ronaldo");
		ronaldo.setCpf("855.599.664-44");
		
		
		
		Conta cc = new ContaCorrente(carlos);
		Conta poupanca = new ContaPoupanca(ronaldo);
		
		cc.depositar(300);
	    cc.tranferir(200, poupanca);
	    
	    
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
