package com.example.testbakai

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hfad.listingOption.ui.fragments.TakeAwayFragment

class FragmentAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int  = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TakeAwayFragment ()
            1 -> GroceryFragment ()
            2 -> ConvinienceFragment ()
            3 -> PharmacyFragment ()
            else -> Fragment()
        }
    }
}