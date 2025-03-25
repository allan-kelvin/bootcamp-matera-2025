# Projeto Java - Conceitos Essenciais

Este projeto tem como objetivo demonstrar conceitos fundamentais da programação orientada a objetos em Java, incluindo classes, interfaces, classes abstratas, classes anônimas, além da utilização da biblioteca Lombok para simplificar o código.

## 📌 Conceitos abordados

### 1️⃣ Classes

Classes são a base da programação orientada a objetos. Elas definem a estrutura e o comportamento dos objetos.

**Exemplo:**

```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
```

### 2️⃣ Interface

Interfaces são contratos que definem um conjunto de métodos que uma classe deve implementar.

**Exemplo:**

```java
public interface Veiculo {
    void acelerar();
    void frear();
}
```

### 3️⃣ Classes Abstratas

Classes abstratas servem como modelos para outras classes, podendo conter métodos abstratos (sem implementação) e concretos.

**Exemplo:**

```java
public abstract class Animal {
    public abstract void fazerSom();

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }
}
```

### 4️⃣ Classes Anônimas

Classes anônimas são classes sem nome que podem ser instanciadas diretamente.

**Exemplo:**

```java
public class ExemploClasseAnonima {
    public static void main(String[] args) {
        Animal cachorro = new Animal() {
            @Override
            public void fazerSom() {
                System.out.println("Latindo...");
            }
        };

        cachorro.fazerSom();
    }
}
```

### 5️⃣ Orientação a Objetos

A programação orientada a objetos (POO) é um paradigma baseado nos conceitos de:

- **Encapsulamento**: Protege os dados da classe.
- **Herança**: Permite que uma classe herde características de outra.
- **Polimorfismo**: Permite que um método tenha diferentes comportamentos.
- **Abstração**: Define apenas características essenciais dos objetos.

### 6️⃣ Lombok

O Lombok é uma biblioteca que reduz a verbosidade do código, gerando automaticamente métodos como `getters`, `setters`, `toString`, entre outros.

**Exemplo com Lombok:**

```java
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Usuario {
    private String nome;
    private int idade;
}
```

### 📂 Estrutura do Projeto

```
projeto-java/
│── src/
│   ├── main/java/com/exemplo/
│   │   ├── Pessoa.java
│   │   ├── Veiculo.java
│   │   ├── Animal.java
│   │   ├── ExemploClasseAnonima.java
│   │   ├── Usuario.java
│── pom.xml (caso use Maven)
│── README.md
```

### 🚀 Como Executar

1. Clone o repositório: `git clone https://github.com/seu-usuario/projeto-java.git`
2. Compile o projeto: `javac -d bin src/*.java`
3. Execute o programa: `java -cp bin com.exemplo.Main`

### 📜 Licença

Este projeto está sob a licença MIT.

não

