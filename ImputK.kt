fun main(args: Array<String>) {
  println("Digite alguma coisa")
  var texto=readLine()!!
  println("Seja bem Vindo " +texto)


  println("Digite um numero inteiro: ")
  var num1=readLine()!!
  var numero1=num1.toInt()
  println("Ok, digite outro numero: ")
  var num2=readLine()!!
  var numero2=num2.toInt()
  var soma=numero1+numero2
  println("A soma e:" +soma)
}