package mchehab.com.listview_1

/**
 * Created by muhammadchehab on 10/23/17.
 */
data class Person(var firstName: String, var lastName: String, var age: Int){
    override fun toString(): String = "$firstName $lastName is $age years old"
}