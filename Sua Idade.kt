fun main() {
  println("Qual é sua idade?:")
  val idade = readLine()!!
  println("Sua idade é:" +idade)

  val num = idade.toInt()
  
  if (num >= 18) {
    println("Voce é maior de idade")
  }else{
    println("Voce e menor de idade")
  }
}