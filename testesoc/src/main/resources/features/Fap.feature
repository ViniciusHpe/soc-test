Feature: teste da funcionalidade fap do SOC
  Scenario: Validar estimativa de FAP
    Given o navegador é aberto
    And o usuário está na tela inicial do SOC
    And o usuário aceita os cookies
    When o usuário clica na opção FAP
    And preenche o formulário
    And clica em estimar FAP
    Then é exibido o relatório FAP