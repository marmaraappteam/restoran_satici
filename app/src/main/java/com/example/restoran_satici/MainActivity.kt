package com.example.restoran_satici


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tempFragment:Fragment

   // private lateinit var ulkelerliste:ArrayList<ulkeler>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        tempFragment=hakkinda()
        supportFragmentManager.beginTransaction().add(R.id.fragment_tutucu,hakkinda()).commit()
        var control=2
        bottom_navigation.setOnNavigationItemSelectedListener {menuItem->
            if (menuItem.itemId==R.id.bottom_discover)
            {
                Toast.makeText(applicationContext,"birinci",Toast.LENGTH_SHORT).show()
                tempFragment=hakkinda()
                control=1
            }
            if (menuItem.itemId==R.id.bottom_browse)
            {
                if (control==1 || control==3){
                    Toast.makeText(applicationContext,"ikinci",Toast.LENGTH_SHORT).show()
                    tempFragment=urun_ekle()
                    control=2
                }


            }
            if (menuItem.itemId==R.id.bottom_more)
            {
                control=3
                Toast.makeText(applicationContext,"ucuncu",Toast.LENGTH_SHORT).show()
                tempFragment=satistaki_urunler()
            }

            supportFragmentManager.beginTransaction().replace(R.id.fragment_tutucu,tempFragment).commit()

            true

        }
    }

}