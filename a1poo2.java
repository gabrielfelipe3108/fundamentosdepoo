public class a1poo2 {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo();
        carro1.nome = "GOL";
        carro1.resistencia = 2500;
        carro1.impacto = 300;

        Veiculo carro2 = new Veiculo();
        carro2.nome = "Onix";
        carro2.resistencia = 2200;
        carro2.impacto = 350;

        carro1.resistencia -= carro2.impacto;
        carro2.resistencia -= carro1.impacto;

        System.out.println(carro1.ficha());
        System.out.println(carro2.ficha());
        System.out.println();

        System.out.println(carro1.estaOperante());
        System.out.println(carro2.estaOperante());
        System.out.println();

    }
}

class Veiculo {
    String nome;
    int resistencia;
    int impacto;

    String ficha() {
        return nome + " (resistência após colisão: " + resistencia + ")";
    }

    boolean estaOperante() {
        return resistencia > 0;
    }
}
