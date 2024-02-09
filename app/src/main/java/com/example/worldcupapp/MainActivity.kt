package com.example.worldcupapp



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- Adapter View: ListView
        var listView = findViewById<ListView>(R.id.listview1)

        // 2- Adapter
        var adapter = MyAdapter(this,generateData())

        listView?.adapter = adapter
        adapter?.notifyDataSetChanged()

    }

    // 3- Data Source
    fun generateData(): ArrayList<CountryModel>{
        var countriesList = ArrayList<CountryModel>()

        var country1 : CountryModel = CountryModel(
            "India",
            "2",
            R.drawable.india
        )
        var country2 : CountryModel = CountryModel(
            "Australia",
            "6",
            R.drawable.australia
        )

        var country3 : CountryModel = CountryModel(
            "New Zealand",
            "0",
            R.drawable.newzealand
        )

        var country4 : CountryModel = CountryModel(
            "South Africa",
            "0",
            R.drawable.southafrica
        )
        var country5 : CountryModel = CountryModel(
            "England",
            "1",
            R.drawable.england
        )
        var country6 : CountryModel = CountryModel(
            "West Indies",
            "2",
            R.drawable.jamaica
        )

        var country7 : CountryModel = CountryModel(
            "Pakistan",
            "1",
            R.drawable.pakistan
        )
        var country8 : CountryModel = CountryModel(
            "Srilanka",
            "1",
            R.drawable.srilanka
        )
        var country9 : CountryModel = CountryModel(
            "Bangladesh",
            "0",
            R.drawable.bangladesh
        )
        var country10 : CountryModel = CountryModel(
            "Zimbabwe",
            "0",
            R.drawable.zimbabwe
        )
        var country11 : CountryModel = CountryModel(
            "Afganistan",
            "0",
            R.drawable.afghanistan
        )
        var country12 : CountryModel = CountryModel(
            "UAE",
            "0",
            R.drawable.unitedarabemirates
        )

        countriesList.add(country1)
        countriesList.add(country2)
        countriesList.add(country3)
        countriesList.add(country4)
        countriesList.add(country5)
        countriesList.add(country6)
        countriesList.add(country7)
        countriesList.add(country8)
        countriesList.add(country9)
        countriesList.add(country10)
        countriesList.add(country11)
        countriesList.add(country12)

        return countriesList

    }
}