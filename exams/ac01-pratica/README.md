# Avaliação Continuada 01 - Prática 📎

## 📌 Orientações Gerais:
1. Utilize **apenas** tipos **wrapper** para criar variáveis.
2. Verifique se **não** há **erros de compilação** no projeto antes de enviar.
3. Respeite os nomes de atributos e métodos definidos no exercício.
4. Tome cuidado com os argumentos especificados no exercício. Não adicione argumentos não solicitados e mantenha a ordem definida no enunciado.

> Dica: copie e cole os nomes do enunciado para evitar erros de digitação

## 🚨 Orientações para a avaliação

1. **É permitido** utilizar o material de aula para consulta.
2. **Não é permitido** o uso de celular.
3. **Não é permitido** a comunicação com colegas.
4. **Não é permitido** pedir ajuda ao professor.

## 🎬 Cinema

Você é o desenvolvedor de um sistema feito em Java da rede de cinemas CineTech e foi solicitado a você a 
implementação de alguns métodos para ajudar na operação do cinema.

Para isso foi entregue uma documentação detalhada a respeito do funcionamento dessa rede de cinemas:

### 💺 Sala

O preço das salas são calculados da seguinte forma:

O preço base da sala é de R\$ 30,00.\
A sala 3D adiciona R\$ 5,00 a mais ao preço do ingresso.\
A sala IMAX adiciona R\$ 10,00 a mais ao preço do ingresso.

O cinema CineTech possui 4 salas:

* ### Sala 1: 
  * Sala comum
  * Capacidade: 50 lugares

* ### Sala 2:
  * Sala 3D
  * Capacidade: 37 lugares

* ### Sala 3: 
  * Sala IMAX
  * Capacidade: 90 lugares

* ### Sala 4: 
  * Sala 3D e IMAX
  * Capacidade: 80 lugares

Na compra do ingresso estudantes podem solicitar meia entrada e pagar metade do
valor do ingresso.

### 🛠️ Implementação

Com a documentação em mãos, você deve criar dentro da classe `Cinema` os seguintes métodos:

* `Boolean validarSala(Integer sala)`
  * Verifica se o número da sala é válido.
  * Retorna `true` se o número da sala for válido e `false` caso contrário.
  * Exemplo: se o número da sala for 3, o retorno é `true`.
  * Exemplo: se o número da sala for 5, o retorno é `false`.


* `Double calcularPrecoSala(Boolean sala3d, Boolean imax)`
  * Calcula o preço da sala de acordo com a tecnologia 3D e IMAX.
  * Exemplo: se a sala for 3D e IMAX, o preço da sala é R$ 45,00.
  * Exemplo: se a sala for IMAX, o preço da sala é R$ 40,00.


* `Double calcularValorIngresso(Integer sala, Boolean meiaEntrada)`
  * Calcula o valor do ingresso de acordo com a sala e se é meia entrada ou não.
  * Exemplo: se a sala for 3D e o ingresso for meia entrada, o valor do ingresso é R$ 17,50.
  * Exemplo: se a sala for IMAX e o ingresso for inteira, o valor do ingresso é R$ 40,00.


* `Integer contarQtdAcentosImpares(Integer sala)`
  * Retornar a quantidade de acentos impares da sala.
  * O primeiro acento é 1 e o último é a capacidade da sala.
  * Exemplo: se a sala for 1, a quantidade de acentos impares é 25.
  * Exemplo: se a sala for 2, a quantidade de acentos impares é 19.


### 🎯 Observações Finais:

1. O projeto contém testes automatizados para verificar a implementação dos métodos.
2. A classe `Cinema` já está criada e os métodos devem ser implementados dentro dela.
3. O projeto possui uma classe `Main` caso queira testar manualmente o funcionamento dos métodos.

### 📦 Entrega:

1. Faça o `commit` do código e após isso o `push` para o repositório do GitHub.
2. Abra o **GitHub** e **verifique** se o último `push` foi realizado com sucesso.

### Boa sorte! 🍀
