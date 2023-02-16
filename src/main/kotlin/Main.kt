import java.util.jar.Attributes.Name

fun main(){
    school()
   greetings("Gubo",20 )
    place("")
    nameCheck("Gubo")
    nameCheck("Ann")
}

   fun  school(){
    val college="AkiraChix"
    println(college[0])
    println(college[2])
    println(college[3])

    }
    fun greetings(myName: String,age:Int):String{
    val details=("Hi,my name is $myName and i am $age years old.")
        return (details)

    }

      fun place(city:String):Int{
      val city= "Nairobi"
      return(city.length)

}
     fun nameCheck(name:String){
         if (name=="Gubo")
             println("that's me")
                else{
            println ("I don't know who that is")
         }
}





