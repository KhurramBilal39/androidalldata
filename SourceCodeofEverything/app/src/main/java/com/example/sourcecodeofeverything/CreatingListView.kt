package com.example.sourcecodeofeverything


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast

class CreatingListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creating_list_view)
        val arrID:ArrayList<String> = ArrayList()
        val arrNames:ArrayList<String>  = ArrayList()
        val arrLanguage:ArrayList<String> = ArrayList()
        val listView = findViewById<ListView>(R.id.makelistView)
        val spinner:Spinner = findViewById(R.id.spinner)
        val autoText:AutoCompleteTextView = findViewById(R.id.acTxtView)

        arrNames.add("Khurram")
        arrNames.add("Hassan")
        arrNames.add("Usman")
        arrNames.add("Farhan")
        arrNames.add("Khurram")
        arrNames.add("Hassan")
        arrNames.add("Usman")
        arrNames.add("Khurram")
        arrNames.add("Hassan")
        arrNames.add("Usman")
        arrNames.add("Farhan")
        arrNames.add("Khurram")
        arrNames.add("Hassan")
        arrNames.add("Usman")
        arrNames.add("Hassan")
        arrNames.add("Usman")
        arrNames.add("Farhan")
        arrNames.add("Khurram")
        arrNames.add("Hassan")
        arrNames.add("Usman")


        val adapter: ArrayAdapter<String> = ArrayAdapter<String>(this@CreatingListView,android.R.layout.simple_list_item_1,arrNames)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener {
                parent, view, position, id ->
            when (position) {
                0 -> {

                    Toast.makeText(this@CreatingListView,"Hello Khurram",Toast.LENGTH_SHORT).show()
                }
                1 -> {
                    Toast.makeText(this@CreatingListView,"Hello Hassan",Toast.LENGTH_SHORT).show()
                }
                2 -> {
                    Toast.makeText(this@CreatingListView,"Hello Usman",Toast.LENGTH_SHORT).show()
                }
                3 -> {
                    Toast.makeText(this@CreatingListView,"Hello Farhan",Toast.LENGTH_SHORT).show()
                }
            }

        }

        arrID.add("Khurram Card")
        arrID.add("Hassan Card")
        arrID.add("Usman Card")
        arrID.add("Farhan Card")
        arrID.add("Salman Card")
        arrID.add("Khurram Card")
        arrID.add("Hassan Card")
        arrID.add("Usman Card")
        arrID.add("Farhan Card")
        arrID.add("Salman Card")
        arrID.add("Khurram Card")
        arrID.add("Hassan Card")
        arrID.add("Usman Card")
        arrID.add("Farhan Card")
        arrID.add("Salman Card")
        arrID.add("Khurram Card")
        arrID.add("Hassan Card")
        arrID.add("Usman Card")
        arrID.add("Farhan Card")
        arrID.add("Salman Card")
        arrID.add("Khurram Card")
        arrID.add("Hassan Card")
        arrID.add("Usman Card")
        arrID.add("Farhan Card")
        arrID.add("Salman Card")


        val spinnerAdapter:ArrayAdapter<String> = ArrayAdapter(this@CreatingListView,android.R.layout.simple_spinner_dropdown_item,arrID)
        spinner.setAdapter(spinnerAdapter)




        //AutoComplete

        arrLanguage.add("English")
        arrLanguage.add("Urdu")
        arrLanguage.add("Sindhi")
        arrLanguage.add("French")
        arrLanguage.add("English")
        arrLanguage.add("Urdu")
        arrLanguage.add("Sindhi")
        arrLanguage.add("French")
        arrLanguage.add("English")
        arrLanguage.add("Urdu")
        arrLanguage.add("Sindhi")
        arrLanguage.add("French")


        val autoComplete:ArrayAdapter<String> = ArrayAdapter(this@CreatingListView,android.R.layout.simple_list_item_1,arrLanguage)
        autoText.setAdapter(autoComplete)
        autoText.threshold = 2
        }
}

