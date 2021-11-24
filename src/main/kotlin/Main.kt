
  fun main(args: Array<String>) {

      // Create a list of three country
      val countries = listOf<String>("Saudi Arabia", "Kuwait", "Oman")

      //Create Empty arrayList
      val emptyArrays = arrayListOf<String>()

      //Create for loop to ask user enter capital of three country
      //After that will add each capital to the arraylist
      for (time in 0..2) {

          print("Enter your capital of each country in the list  ${countries[time]} : ")
          emptyArrays.add(readLine()!!.toString())

      }

      // Create for loop to print all countries and their capitals
      for (time in 0..2) {

          println("The capital country of ${countries[time]} is : ${emptyArrays[time]} ")

      }
  }