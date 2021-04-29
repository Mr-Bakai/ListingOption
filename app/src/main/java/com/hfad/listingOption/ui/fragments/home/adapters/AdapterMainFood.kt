package com.hfad.listingOption.ui.fragments.home.adapters
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hfad.listingOption.R
import com.hfad.listingOption.databinding.ItemFoodBinding


class AdapterMainFood(
    private val listFood: ArrayList<Food>
) : RecyclerView.Adapter<AdapterMainFood.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(listFood[position])
    }

    override fun getItemCount() = listFood.size

    class ViewHolder(private var binding: ItemFoodBinding) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(food: Food) {
            binding.textTypeFood.text = food.foodName
            binding.textOpenClose.text = food.statusOpenClose
            binding.textReview.text = food.review
            binding.textReviewAmount.text = food.reviewAmount
            binding.textCountry.text = food.country
            binding.textFoodKind.text = food.foodKind
            binding.textDeliveryCost.text = food.deliveryCost
            binding.textMinMax.text = food.minMax
            binding.btnTimeDelivery.text = food.deliveryTime
            binding.textDistance.text = food.distance
            binding.imageView.setImageResource(food.image)

            if (food.isOffered) binding.containerOffer.visibility = View.VISIBLE; binding.textOffer.text = food.offerText

        }
    }
}

data class Food(
    var image: Int,
    var foodName: String,
    var statusOpenClose: String,
    var review: String,
    var reviewAmount: String,
    var country: String,
    var foodKind: String,
    var deliveryCost: String,
    var minMax: String,
    var deliveryTime: String,
    var distance: String,
    var isOffered: Boolean,
    var offerText: String
)