#language: pt
# encoding: UTF-8

@dropdown
Funcionalidade: Testar Actions

  Cenario: verificar dropDown da aba
    Quando mover o mouse para aba PIM
    E mover o mouse para a menu configuration
    E mover o mouse para o menu custom field

  Cenario: Verificar dropDown da aba com validação
    Quando acionar o submenu customField
    Então sistema apresenta a tela customField