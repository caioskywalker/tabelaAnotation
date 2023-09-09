package Tabela;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        @tabelaAnotation(tabela = {"caio","joana"})
        List<String> nomeTabela = new ArrayList<>();
        nomeTabela.add("Caio");
        nomeTabela.add("Joana");
        System.out.println(nomeTabela);

    }
}
