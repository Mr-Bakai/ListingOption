package com.example.testbakai
import androidx.viewpager2.widget.ViewPager2
import com.example.base.TabbedViewModel
import com.google.android.material.tabs.TabLayoutMediator
import com.hfad.listingOption.R
import com.hfad.listingOption.base.BaseFragment
import com.hfad.listingOption.databinding.FragmentTabedBinding

class TabbedFragment: BaseFragment<FragmentTabedBinding, TabbedViewModel>(
    FragmentTabedBinding::inflate,
    TabbedViewModel::class.java
)  {

    private lateinit var viewPager: ViewPager2

    override fun setupLiveData(){}

    override fun setupUI() {
        viewPager = binding.viewPager
        viewPager.adapter = FragmentAdapter(this)

        TabLayoutMediator(binding.tabLayout, viewPager) { tab, position ->
            when (position) {
                0 ->  tab.setCustomView( R.layout.take_away_view )
                1 ->  tab.setCustomView(R.layout.grocery_view)
                2 ->  tab.setCustomView(R.layout.convenience_view)
                3 ->  tab.setCustomView(R.layout.pharmacy_view)
            }
        }.attach()
    }
    // Updated one
}