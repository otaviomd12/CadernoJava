import kotlin.math. 
 fun main(){

   println("Calculo das raizes de uma equação do segundo grau")
   println("ax²+bx+c=0")
   println("Digite o coeficiente de a: ")
   var num1=readLine()!!
   println("Digite o coeficiente de b: ")
   var num2=readLine()!!
   println("Digite o coeficiente de c: ")
   var num3=readLine()!!
  
   println("Você digitou a:"+num1+",b:"+num2+",c:"+num3)
  
   var a=num1.toDouble()
   var b=num2.toDouble()
   var c=num3.toDouble()

   println("numeros do tipo Double-> a:"+a+",b:"+b+",c:"+c)

   var delta=b*b-(4*a*c)
   println("O delta é:"+delta)
  
   var raizdelta=sqrt(delta)
   println("A raiz de delta é:"+raizdelta)
  
   var x1=(-b+raizdelta)/(2*a)
   println("x1:"+x1)
   
   var x2=(-b-raizdelta)/(2*a)
   println("x2:"+x2)

 }