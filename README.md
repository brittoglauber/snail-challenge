# Snail Matrix - Travessia em Espiral de Matrizes

Este projeto implementa um algoritmo em Java para percorrer uma matriz bidimensional em uma ordem em espiral, similar ao movimento de um caracol. A saída é uma lista de números que representam os elementos da matriz visitados nessa ordem espiral.
## Descrição

A classe SnailMatrix é responsável pela lógica principal da travessia em espiral. Ela divide a matriz em quadrantes e iterativamente percorre os elementos de cada quadrante na ordem correta. A classe SnailMatrixService (não incluída neste exemplo) contém métodos auxiliares para facilitar a navegação dentro de cada quadrante.
## Funcionalidades

- Travessia em Espiral: Percorre os elementos de uma matriz em uma ordem espiral, começando do canto superior esquerdo e movendo-se para a direita, para baixo, para a esquerda e para cima.
- Flexibilidade: Pode ser adaptado para matrizes de diferentes tamanhos e valores.

## Pré-requisitos

- **Java 11+**

## Como usar

Para utilizar o algoritmo Snail Matrix, você pode criar uma instância da classe SnailMatrix e chamar o método snail passando a matriz como parâmetro.

### Exemplo de uso:

```java
import org.example.snail.SnailMatrix;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SnailMatrix snail = new SnailMatrix();
        List<Integer> result = snail.snail(matrix);

        System.out.println(result); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
