Algoritmo "transformarbin�rioemdecimal"
// Descri��o   : Transformar c�digobin�rioemdecimal
// Autor(a)    : Diogo Dias
// Data atual  : 09/02/2018
Var
numb : caracter
posicao,d : inteiro


Inicio
escreval("Digite um n�mero binario :")
leia(numb)
 para posicao de compr(numb) ate 1 passo -1 faca
  se copia(numb,posicao,1)="1" entao
   d <- d + int(exp(2,compr(numb)-posicao))
  fimse
 fimpara
escreval("A representa��o decimal de ", numb, " � ", d)

Fimalgoritmo