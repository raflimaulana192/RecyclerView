package com.raflimaulana.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raflimaulana.recyclerview.adapter.AdapterTeamBol
import com.raflimaulana.recyclerview.databinding.ActivityMainBinding
import com.raflimaulana.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois,"Penjaga Gawang","2.00 m","Bree (Belgia)","11 Mei 1992"))
        listPemain.add(Pemain("Karim Benzema",R.drawable.benzema,"Penyerang","1.85 m","Lyon (Perancis)","19 Desember 1987"))
        listPemain.add(Pemain("Marcelo Vieira da silva",R.drawable.marcello,"Belakang","1,74 m","Rio de janeiro (Brazil)","12 Mei 1988"))
        listPemain.add(Pemain("Sergio Ramos Garcia",R.drawable.ramos,"Belakang ","1,84 m","Camas (Sevilla)","30 Maret 1986"))
        listPemain.add(Pemain("zinedine Yazid zidane",R.drawable.zidan,"Pelatih","1,85 m","Marseille (Perancis)","23 Juni 1972"))

        binding.list.adapter = AdapterTeamBol(this,listPemain, object : AdapterTeamBol.OnClickListener {
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })

    }

}