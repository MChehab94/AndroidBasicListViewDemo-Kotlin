package mchehab.com.listview_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val listPerson = createList()
        val listStrings = createDummyListOfStrings()

        val arrayAdapterPerson = ArrayAdapter<Person>(this, android.R.layout.simple_list_item_1,
                listPerson)
        val arrayAdapterStrings = ArrayAdapter<String>(this, android.R.layout
                .simple_list_item_1, listStrings)
//        set the arrayAdapter that you want
        listView.adapter = arrayAdapterPerson
    }

    /**
     * Helper method to create a dummy list of Strings
     */
    private fun createDummyListOfStrings(): MutableList<String>{
        val list = mutableListOf<String>()
        for (i in 1..100){
            list.add("string # $i")
        }
        return list
    }

    /**
     * Helper method to create a list of persons
     */
    private fun createList(): MutableList<Person>{
        val list = mutableListOf<Person>()
        list.add(Person("John", "Smith", 31))
        list.add(Person("Aaron", "Wilson", 15))
        list.add(Person("Delisa", "Lecrocy", 18))
        list.add(Person("Melania", "Pita", 10))
        list.add(Person("Georgetta", "Bigler", 20))
        list.add(Person("Celsa", "Ries", 35))
        list.add(Person("Riley", "Lepore", 19))
        list.add(Person("Martin", "Cash", 11))
        list.add(Person("Thomas", "Bittle", 16))
        list.add(Person("Christopher", "Lacross", 16))
        list.add(Person("Bennet", "Rodas", 17))

        return list
    }
}