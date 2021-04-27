package com.hfad.listingOption.ui.fragments.home.adapters
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.listingOption.R
import com.hfad.listingOption.databinding.ItemFoodBinding

class AdapterMainFood: RecyclerView.Adapter<AdapterMainFood.ViewHolder>() {

    private val list : ArrayList<Int> = arrayListOf(R.drawable.true_burger, R.drawable.pizzza)
    private val listFood : ArrayList<String> = arrayListOf("Burger Craze", "Vegetarian Pizza")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int){
        holder.onBind(list[position], listFood[position])
    }

    override fun getItemCount() = list.size

    class ViewHolder(private var binding:ItemFoodBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(i: Int, s: String) {
            binding.imageView.setImageResource(i)
            binding.textTypeFood.text = s
        }
    }
}