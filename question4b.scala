

object question4b {
  def NoOfAttend(x:Int)=120 +(15-x)/5*20
  def revenue(x:Int)=NoOfAttend(x)*x
  def cost(x:Int)=500 + NoOfAttend(x)*3
  def profit(x:Int)=revenue(x) - cost(x)
   def main(args: Array[String]): Unit ={
    println("5  ->" + profit(5))
    println("10 ->" + profit(10))
    println("15 ->" + profit(15))
    println("20 ->" + profit(20))
    println("25 ->" + profit(25))
    println("30 ->" + profit(30))
    println("35 ->" + profit(35))
    println("40 ->" + profit(40))
  }
} 