package com.example.work4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.work4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //Создаем адаптер
        val pagerAdapter = ViewPagerAdapter()

        //Привязываем созданный адаптер к нашему ViewPager, который у нас в разметке
        binding.viewPager2.adapter = pagerAdapter

        //Создаем список элементов, который передадим в адаптер
        val pagerItems = listOf<PagerItem>(
            PagerItem(ContextCompat.getColor(this, R.color.red), "Red"),
            PagerItem(ContextCompat.getColor(this, R.color.green), "Green"),
            PagerItem(ContextCompat.getColor(this, R.color.yellow), "Yellow")
        )

        //Передаем список в адаптер
        pagerAdapter.setItems(pagerItems)


    }
}
