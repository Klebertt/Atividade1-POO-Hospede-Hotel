package hospedagem;

public class Hospede {
    String nome;
    int idade;
    String quarto;
    String feedbackEstadia;

    Hospede() {
        this.quarto = "Nenhum";
    }

    void setNome(String nomeHospede) {
        if (nomeHospede.equals("")) {
            this.nome = "Hospede sem nome";
        } else {
            this.nome = nomeHospede;
        }
    }

    void setIdade(int idadeHospede) {
        this.idade = idadeHospede;
    }

    void setQuarto(String quartoHospede) {
        this.quarto = quartoHospede;
    }
    
    void feedbackEstadia(String feedback) {
    	if (feedback == "" ) {
    	  	this.feedbackEstadia = "Não tenho nenhum feedback a oferecer";	
    	} else {
    		this.feedbackEstadia = feedback;
    	}
    }

    void apresentar() {
        System.out.printf("Olá, sou o hóspede %s!\n", this.nome);
        System.out.printf("Tenho %d anos e estou no quarto %s\n", this.idade, this.quarto);
        System.out.println(this.feedbackEstadia);
        System.out.println();
    }

    public static void main(String[] args) {
        Hospede hospede1 = new Hospede();
        hospede1.setNome("Carlos");
        hospede1.setIdade(30);
        hospede1.setQuarto("101");
        hospede1.feedbackEstadia("");
        hospede1.apresentar();
    }
}
