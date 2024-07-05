package com.example.b1611

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.b1611.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val list = mutableListOf<OurData>()
        list.add(OurData(R.drawable.banghoa, "Bang hhoa", "bang hoa ma thu"))
        list.add(OurData(R.drawable.hoanhon, "hoan hon", "hoan hon"))
        list.add(OurData(R.drawable.rong, "rong", "rong thieng"))
        list.add(OurData(R.drawable.thanlan, "than lan", "than lan hoan hon"))

        val adapter = RvAdapter(list)
        binding.RVDemo.adapter = adapter
        binding.RVDemo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


//        binding.RVDemo.layoutManager =GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
    }
}