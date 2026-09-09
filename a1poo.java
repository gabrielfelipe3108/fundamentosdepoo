//o dominio: personagem
//as duas classes: personagem e batalha
// seus atributos: nome e vida
//a validacao pretendidas e: verificar se o personagem esta vivo
//

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

//o trecho que deu mais trabalho foi na parte do return da ficha, ja que a gramatica do java e nova para mim 
//os criterios que nao atingi foi fazer as duas verificacoes, fiz so uma, pois ja tinha declarado a vida dos personagens pelo codigo
//eu utilizei ia, para me ajudar na parte da gramatica na parte do return com a vida depois do dano 
//ela atrapalhou na parte da correção do código, pois havia muitos termos novos em java que ainda nao sei, ai preferi manter o meu codigo realizado em sala mesmo
// utilizei mais os slides das aulas passadas para ter como base
