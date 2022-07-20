

object question4a {
   def normal(x:Int):Int=x*250
   def ot(y:Int):Int=y*80
   def tax(x:Int,y:Int):Double=( normal(x)+ ot(y))*0.12
   def takehome(x:Int, y:Int):Double=normal(x) + ot(y) - tax(x,y) 
   def main(args: Array[String]): Unit ={
     println(normal(40))
     println(ot(30))
     println(tax(40,30))
     println(takehome(40,30))
     
   }
}