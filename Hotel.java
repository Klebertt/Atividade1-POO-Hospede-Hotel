package hospedagem;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Hospede> hospedes = new ArrayList<>();

    void adicionarHospede(Hospede h) {
        hospedes.add(h);
    }

    void listarHospedes() {
        int quantidadeHospedes = hospedes.size();
        System.out.printf("O hotel atualmente possui %d hóspedes:\n", quantidadeHospedes);

        for (Hospede hospede : hospedes) {
            hospede.apresentar();
        }
    }

    public static void main(String[] args) {
        Hotel goldHotel = new Hotel();

        Hospede hospede1 = new Hospede();
        hospede1.setNome("Carlos");
        hospede1.setIdade(30);
        hospede1.setQuarto("101");
        hospede1.feedbackEstadia("Estou gostando do hotel, principalmente do café da manhã");
        goldHotel.adicionarHospede(hospede1);

        Hospede hospede2 = new Hospede();
        hospede2.setNome("Maria");
        hospede2.setIdade(25);
        hospede2.setQuarto("102");
        hospede2.feedbackEstadia("A vista do quarto é tranquila, me deixa em leve");
        goldHotel.adicionarHospede(hospede2);

        Hospede hospede3 = new Hospede();
        hospede3.setNome("João");
        hospede3.setIdade(40);
        hospede3.setQuarto("103");
        hospede3.feedbackEstadia("");
        goldHotel.adicionarHospede(hospede3);

        goldHotel.listarHospedes();
    }
}
