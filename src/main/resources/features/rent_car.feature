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