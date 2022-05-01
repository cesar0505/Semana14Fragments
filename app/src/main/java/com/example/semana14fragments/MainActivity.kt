package com.example.semana14fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.navigation.calendar
import com.example.navigation.himno
import com.example.navigation.info
import com.example.navigation.notas
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    class fragmentadapter (fragment: FragmentActivity, private val items:List<String>):
        FragmentStateAdapter(fragment) {
        override fun getItemCount(): Int {
            return items.size

        }

        override fun createFragment(position: Int): Fragment {
            val primerfragmento= notas()
            val segundofragmento= calendar()
            val tercerfragmento= himno()
            val cuartofragmento= info()
            return when(position){
                0->primerfragmento
                1->segundofragmento
                2->tercerfragmento
                3->cuartofragmento
                else->primerfragmento
            }

        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list= listOf ("Notas UGB","Calendario UGB","Himno UGB","Info")

        //val icons

        vista.adapter=fragmentadapter(this,list)

        TabLayoutMediator(menu,vista){ tab, position->
            tab.text=list[position]


        }.attach()


    }
}