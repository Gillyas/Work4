package com.example.work4

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.work4.databinding.ItemBinding

class ViewPagerAdapter : RecyclerView.Adapter<PagerViewHolder>() {
    //Здесь хранится список наших объектов с цветом и текстом
    private val items = mutableListOf<PagerItem>()

    //Этот метод мы возвращает количество элементов в items, иногда полезно
    override fun getItemCount(): Int = items.size

    //В это методе создается VIewHolder и к нему привязывается наш item.xml
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder =
        PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    //В это методы передаются данные из items в layout
    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    //Этот метод наполняет список items, нужен нам чтобы делать это извне
    fun setItems(list: List<PagerItem>) {
        items.clear()
        items.addAll(list)
    }
}