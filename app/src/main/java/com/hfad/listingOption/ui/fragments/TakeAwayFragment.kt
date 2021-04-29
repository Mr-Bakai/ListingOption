package com.hfad.listingOption.ui.fragments
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.listingOption.R
import com.hfad.listingOption.databinding.FragmentTakeAwayBinding
import com.hfad.listingOption.ui.fragments.home.adapters.AdapterMainFood
import com.hfad.listingOption.ui.fragments.home.adapters.Food

class TakeAwayFragment : Fragment() {

    private var _binding: FragmentTakeAwayBinding? = null
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTakeAwayBinding.inflate(inflater,container,false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var listFood: ArrayList<Food> = arrayListOf(
            Food(
                R.drawable.true_burger,
                "Burger Craze",
                "   Open",
                " 4.6",
                "(601)",
                "American",
                "  Burgers",
                "Delivery:  Free",
                "   Minimum $10",
                " 10 - 15min",
                "  1,5 km away",
                true,
                "Spend 25\$, save \$5"),
            Food(
                R.drawable.pizzza,
                "Vegetarian Pizza",
                "   Open",
                " 4.6",
                "(601)",
                "Italian",
                "  Pizza",
                "Delivery:  Free",
                "   Minimum $10",
                " 10 - 15min",
                "  0,8 km away",
                false,
                "Spend 25\$, save \$5")
        )


        binding?.recyclerViewVertical?.apply {
            val adapter: AdapterMainFood = AdapterMainFood(listFood)
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
    }
}