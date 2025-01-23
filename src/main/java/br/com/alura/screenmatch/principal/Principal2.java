package br.com.alura.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Jacque","Iasmin","Paulo","Rodrigo","Nico");

        nomes.stream()
                .sorted()
                .limit(3)
//  Acima é para limitar a quantidade de items que serão impressos. Se
//  retirarmos aquela linha fica normalmente com todos os itens da lista
                .forEach(System.out::println);
    }
}
