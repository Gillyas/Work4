package com.example.work4
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.work4.databinding.ItemBinding


class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    lateinit var binding: ItemBinding

    //В этом методе мы передаем данные из PagerItem в нашу верстку item.xml
    fun onBind(item: PagerItem) {
        //корневой элемент item.xml
        binding.container.setBackgroundColor(item.color)
        //Текстовое поле
        binding.textView.text = item.text
    }
}