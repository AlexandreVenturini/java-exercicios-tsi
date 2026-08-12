# Exercícios de Java — Fundamentos da Linguagem

Repositório com a resolução da lista de exercícios da disciplina **Tópicos Especiais II — Programação Avançada (Java + Spring Boot)**, do curso Superior em Tecnologia em Sistemas para Internet (TSI) — IFES, sob orientação do Prof. Matheus Jagi.

A lista aborda a sintaxe e os fundamentos da linguagem Java: tipos de dados, operadores, estruturas condicionais e de repetição, arrays, métodos, `switch expression` e tratamento básico de exceções — organizada em três blocos de dificuldade crescente.

## Como rodar

Todos os exercícios foram feitos em Java puro (sem bibliotecas externas), no IntelliJ IDEA.

- **Pelo IntelliJ**: abra a pasta do exercício desejado (`File > Open`) e execute a classe `Main` (▶ no gutter ou `Shift + F10`).
- **Pela linha de comando**:
  ```bash
  cd Exercicio01/src
  javac Main.java
  java Main
  ```

## Nível Básico (1–5)

| # | Exercício | Conceitos praticados |
|---|---|---|
| 01 | Meu Primeiro Programa | Variáveis (`String`, `int`), concatenação de String |
| 02 | Área e Perímetro do Retângulo | Variáveis `double`, operadores aritméticos, formatação de saída |
| 03 | Par ou Ímpar | Operador `%`, `if`/`else` |
| 04 | Conversor de Temperatura | Fórmulas matemáticas, cuidado com tipos (`int` vs `double`) |
| 05 | Tabuada com for | Laço `for`, método `static void` reutilizável (desafio opcional) |

## Nível Intermediário (6–10)

| # | Exercício | Conceitos praticados |
|---|---|---|
| 06 | Classificador de Faixa Etária | `if/else if`, `switch expression` com pattern matching (`when`, Java 21) |
| 07 | Média Ponderada e Conceito | Cálculo de média ponderada, `if/else if` encadeado |
| 08 | Validador de Login | Laço `while`, comparação de `String` com `.equals()`, arrays |
| 09 | Contador de Vogais | `toCharArray()`, `for-each`, `Character.toLowerCase()` |
| 10 | Menu com switch Expression | `switch expression` com `yield`, operações aritméticas |

## Nível Avançado (11–15)

| # | Exercício | Conceitos praticados |
|---|---|---|
| 11 | FizzBuzz Estendido | Múltiplos `if` independentes, concatenação condicional de String |
| 12 | Verificador de Número Primo | Laço `for` com `break`, otimização com `Math.sqrt()` |
| 13 | Simulador de Caixa Eletrônico | Divisão inteira e módulo em laço, arrays |
| 14 | Triângulo de Asteriscos | Laços `for` aninhados, versões invertida e pirâmide (desafios opcionais) |
| 15 | Mini Sistema de Controle de Estoque | Arrays, `while` + `switch expression`, `for-each`, integração dos conceitos anteriores |

## Extra

| Exercício | Conceitos praticados |
|---|---|
| Boletim de Notas | Matriz (`double[][]`), método com retorno (`return`), `try`/`catch` |

## Critérios de avaliação (conforme enunciado da disciplina)

- **Corretude**: o programa resolve o problema para diferentes entradas, incluindo casos de borda.
- **Legibilidade**: nomes de variáveis claros, formatação e indentação corretas.
- **Uso adequado das estruturas**: preferência por `switch expression` e `for-each` onde fizer sentido.
- **Boas práticas**: comparação de `String` sempre com `.equals()`, ausência de laços infinitos, tratamento de casos inválidos.
