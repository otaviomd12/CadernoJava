class Carro{
  var marca=""
  var modelo=""
  var ano=0
   }

class Car(var marca: String, var modelo: String, var ano: Int){
 
  fun ligar(){
      println("Wrooom")
    }
}

fun main() {

  var corola=Carro()

  corola.marca="Toyota"
  corola.modelo="Corola"
  corola.ano= 0

  println(corola.marca)
  println(corola.modelo)
  println(corola.ano)

  val c1 = Car("F1000", "Ford", 1980)
  println(c1.marca)

  val fusca=Car("Fusca","Vw",1975)
  println(fusca.modelo)
}