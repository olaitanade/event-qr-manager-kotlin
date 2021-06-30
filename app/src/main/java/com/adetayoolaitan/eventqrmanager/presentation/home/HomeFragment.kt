package com.adetayoolaitan.eventqrmanager.presentation.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.adetayoolaitan.eventqrmanager.databinding.FragmentHomeBinding
import com.adetayoolaitan.eventqrmanager.presentation.event.EventActivity

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textQuote
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        val btnCreateEvent = binding.btnCreateEvent
        btnCreateEvent.setOnClickListener({
            val intent = Intent(context, EventActivity::class.java).apply {
                putExtra("type","create")
                putExtra("id",0)
            }
            startActivity(intent)
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}