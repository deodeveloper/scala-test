class Recipe(var calories: Int) {
  println(s"Created recipe with ${calories} calories")
  var cookTime: Int = _ //sets 0, default value of Int
}

object Recipe {
  //assume the client was only guessing the calories and
  //double just in case
  def apply(calories:Int) = new Recipe(calories * 2)
}


val r = Recipe(100) //apply method is called by default
println(r.calories) //outputs 200

trait Greetings {
  def sayHello: String
}

trait DefaultGreetings {
  def defaultHello = "Hello"
}
class GermanGreetings extends Greetings with DefaultGreetings
{
  override def sayHello: String = "Guten Tag"
}
val g = new GermanGreetings
g.sayHello //outputs Guten Tag
g.defaultHello //outputs Hello


val xs = List(10, 20, 30, 40, 40)
//map executes the given anonymous function for each element

val newList = xs.map(x => x/2)
println(newList)
println(xs)
println(xs++newList)
println(xs.foldRight(0){(x,y)=>x+y})

val numbers = scala.collection.parallel.ParSeq(1, 2, 3, 4, 5,
  6, 7)
val newNumbers = numbers.map {x =>
  //prints the name of current thread
  println(s"Current thread ${Thread.currentThread.getName}")
  x + 1
}

