package com.example.testbakai
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.hfad.listingOption.databinding.FragmentTakeAwayBinding
import com.hfad.listingOption.ui.fragments.home.adapters.AdapterMainFood


class TakeAwayFragment : Fragment() {

    private var _binding: FragmentTakeAwayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentTakeAwayBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewVertical.apply {
            val adapter: AdapterMainFood = AdapterMainFood()
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
    }
}