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