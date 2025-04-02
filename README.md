# Veiculo Locadora

## Descrição
Este projeto consiste em um sistema simples de locação de veículos, onde é possível calcular o custo total da locação com base no número de dias e aplicar descontos para locações de longa duração. O código está implementado em Java e inclui testes automatizados usando JUnit.

## Funcionalidades
- Cálculo do custo total da locação com base na tarifa diária.
- Aplicação de um desconto de 10% para locações de 7 dias ou mais.
- Validação de valores inválidos (dias negativos e valores de diária negativos).
- Testes automatizados para verificar o correto funcionamento do sistema.

## Estrutura do Projeto
O projeto é composto por duas classes principais:

1. **Veiculo.java**: Contém a lógica principal para calcular o custo da locação.
2. **VeiculoTest.java**: Contém testes unitários para verificar a correta implementação do sistema.

## Como Executar

### Requisitos
- Java 8 ou superior
- JUnit 5

### Executando o Programa
Para executar o programa, basta rodar a classe `Veiculo.java`, que contém um `main` com exemplos de cálculo de locação:

```sh
javac Veiculo.java
java Veiculo
```

### Executando os Testes
Os testes podem ser executados utilizando o IntelliJ IDEA ou qualquer outra IDE que suporte JUnit 5. Caso queira rodar pelo terminal, utilize:

```sh
javac -cp .:junit-5.8.1.jar VeiculoTest.java
java -cp .:junit-5.8.1.jar org.junit.runner.JUnitCore VeiculoTest
```

## Exemplo de Uso
```java
Veiculo carro = new Veiculo("Sedan", 100.0);
System.out.println("Custo para 5 dias: R$" + carro.calcularCusto(5));
System.out.println("Custo para 7 dias (com desconto): R$" + carro.calcularCusto(7));
```

## Testes Implementados
Os seguintes cenários de teste foram cobertos:
1. Cálculo do custo sem desconto.
2. Cálculo do custo com desconto (para 7 ou mais dias).
3. Cálculo do custo para 0 dias.
4. Locação com valor de diária negativa (deve gerar exceção).
5. Locação com número de dias negativo (deve gerar exceção).

## Melhorias Futuras
- Implementar um sistema de persistência para armazenar histórico de locações.
- Criar uma interface gráfica para facilitar a interação com o usuário.
- Adicionar diferentes tipos de veículos com tarifas diferenciadas.

## Licença
Este projeto é de uso livre para fins educacionais.

