#language: pt
#Author: marcelomessias@marcelomessias.com.br


@Executa
Funcionalidade: Validar Status Code
  Como usuario quero validar status code via api

Contexto: Acessar Api
Dado que eu acesse api get para consultar

Cenario: Validar Status Code  
    
    Entao valido o status code de retorno
  
  Cenario: Validar body response lista email
  Entao valido o email "janet.weaver@reqres.in"