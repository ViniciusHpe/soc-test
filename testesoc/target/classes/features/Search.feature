Feature: teste de pesquisa do SOC
  Scenario: Validar pesquisa por covid
    Given o navegador está aberto
    And o usuário está na tela inicial
    And o usuário clica em aceitar cookies
    When o usuário realiza a busca
    Then são exibidos itens relacionados ao covid