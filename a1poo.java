//o dominio: personagem
//as duas classes: personagem e batalha
// seus atributos: nome e vida
//as duas validacoes pretendidas sao: vida nao pode ser menor ou igual a zero e verificar se o personagem esta vivo

public class a1poo {
public static void main(String[] args) {

Personagem clashRoyale1 = new Personagem();
clashRoyale1.nome = "Valquiria";
clashRoyale1.vida = 2771;
clashRoyale1.dano = 257;

Personagem clashRoyale2 = new Personagem(); 
clashRoyale2.nome = "Ronin";
clashRoyale2.vida = 1619;
clashRoyale2.dano = 259;

clashRoyale1.vida -= clashRoyale2.dano; 
clashRoyale2.vida -= clashRoyale1. dano;

System.out.println(clashRoyale1.ficha());
System.out.println(clashRoyale2.ficha());
System.out.println();


System.out.println(clashRoyale1.estaVivo());
System.out.println(clashRoyale2.estaVivo());
System.out.println();

    }
}

class Personagem{
    String nome; 
    int vida; 
    int dano;

String ficha(){
return nome + "(vida depois do dano: "+vida+")";
    }

boolean estaVivo(){
    return vida > 0;
    }
}