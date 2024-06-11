## Introdução

  Um projeto de sistema de aluguél de carros de luxo.
  
  Usuários que fazem a reserva com pelo menos uma semana de antecedencia recebem desconto.
  
  Usuários que decidem alugar um carro de última hora devem pagar um preço um pouco maior.

  ```
  Feature: Sistema para alugar Carros
    Um cliente deve poder alugar um carro para atender suas necessidades de viagem com eficiência

  Scenario: Reserva antecipada de carro de luxo com desconto
    Given o cliente quer alugar um carro de luxo
    And o cliente realiza a reserva com pelo menos uma semana de antecedência
    Then o sistema oferece um desconto especial em relação ao valor total da locação

  Scenario: Reserva de carro de luxo de última hora
    Given o cliente quer alugar um carro de luxo
    And o cliente não realiza reserva prévia
    Then o sistema não deve oferecer desconto e o custo será mais elevado devido à demanda urgente
  ```
![Captura de tela 2024-06-11 105432](https://github.com/GabrielVDantas/AF_BDD_GabrielVDantas_224033/assets/133148307/a14eb25d-ad4f-4172-8591-95784c37d990)
