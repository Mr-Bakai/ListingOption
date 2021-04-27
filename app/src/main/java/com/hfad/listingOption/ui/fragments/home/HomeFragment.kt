package com.hfad.listingOption.ui.fragments.home
import android.annotation.SuppressLint
import android.view.MotionEvent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.testbakai.TabbedFragment
import com.hfad.listingOption.R
import com.hfad.listingOption.base.BaseFragment
import com.hfad.listingOption.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate,
    HomeViewModel::class.java
) {

    private lateinit var myAdapter: ArrayAdapter<String>

    override fun setupLiveData() {}

    @SuppressLint("ClickableViewAccessibility")
    override fun setupUI() {

        myAdapter = activity?.let {
            ArrayAdapter(
                it,
                R.layout.custom_spinner_item,
                resources.getStringArray(R.array.branches)
            )
        }!!

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner.adapter = myAdapter


        val fr: Fragment = TabbedFragment()
        val fm = activity?.supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm?.beginTransaction()!!
        fragmentTransaction.replace(binding.mainFrameLayout.id, fr)
        fragmentTransaction.commit()

        binding.editText.setOnTouchListener(View.OnTouchListener { v, event ->
            val DRAWABLE_RIGHT = 2
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= binding.editText.right - binding.editText.compoundDrawables[DRAWABLE_RIGHT].bounds.width()
                ) {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                    return@OnTouchListener true
                }
            }
            false
        })
    }
}

