package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*
        Nota sobre a função map
        • A função "map" (não confunda com a estrutura de dados Map) é uma
        função que aplica uma função a todos elementos de uma stream.
        • Conversões:
        • List para stream: .stream()
        • Stream para List: .collect(Collectors.toList())

        Stream é uma sequencia de dados
         */

        // .stream - obter uma sequencia de dados a partir da lista
        // função map, aplica uma função a cada elemento da stream gerando uma nova stream com os elementos transformados
        // Converter de novo p/ lista usando .collect(Collectors.toList()
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

        // imprimindo usando o forEach
        names.forEach(System.out::println);

    }
}
