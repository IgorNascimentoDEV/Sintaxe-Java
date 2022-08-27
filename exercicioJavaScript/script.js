//Tipos de variaveis
var nome = "Igor"; //String
var idade = 21; //int
var altura = 1.75; //float
var estuda = true; //boolean

//Vetor  de Objetos 

var obj = [
    {nome:"igor", curso:"ADS", idade:21},
    {nome:"Leandro", curso:"ADS", idade:31}
]


/*A função .length serve para contar quantos caracteres te determinado termo levando em conta 
numeros, espaços e letras EX..*/

var termo = "Developer";

alert(termo.length); //esse exemplo retona no alert a quantidades de caracteres da variavel termo


/*A função responsavel por deixar as letras em  maiúsculas e minúsculas */

//Maiúscula
alert(termo.toUpperCase());

//Minúsculas
alert(termo.toLocaleLowerCase());


//eventos