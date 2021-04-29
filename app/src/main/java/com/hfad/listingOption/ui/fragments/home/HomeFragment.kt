package com.hfad.listingOption.ui.fragments.home
import android.annotation.SuppressLint
import android.graphics.Color
import android.view.MotionEvent
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.testbakai.TabbedFragment
import com.hfad.listingOption.R
import com.hfad.listingOption.base.BaseFragment
import com.hfad.listingOption.databinding.FragmentHomeBinding
import com.hfad.listingOption.databinding.NestedOneBinding
import com.skydoves.powerspinner.SpinnerAnimation
import com.skydoves.powerspinner.SpinnerGravity
import com.skydoves.powerspinner.createPowerSpinnerView


class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(
    FragmentHomeBinding::inflate,
    HomeViewModel::class.java
) {

    private lateinit var myAdapter: ArrayAdapter<String>
    private lateinit var ui: NestedOneBinding

    override fun setupLiveData() {}

    @SuppressLint("ClickableViewAccessibility")
    override fun setupUI() {

        ui = binding.nestedOne

        val fr: Fragment = TabbedFragment()
        val fm = activity?.supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm?.beginTransaction()!!
        fragmentTransaction.replace(ui.mainFrameLayout.id, fr)
        fragmentTransaction.commit()

        ui.editText.setOnTouchListener(View.OnTouchListener { v, event ->
            val DRAWABLE_RIGHT = 2
            if (event.action == MotionEvent.ACTION_UP) {
                if (event.rawX >= ui.editText.right - ui.editText.compoundDrawables[DRAWABLE_RIGHT].bounds.width()
                ) {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                    return@OnTouchListener true
                }
            }
            false
        })
    }
}