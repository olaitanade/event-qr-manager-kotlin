package com.adetayoolaitan.eventqrmanager.presentation.event.create

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.adetayoolaitan.eventqrmanager.R
import com.adetayoolaitan.eventqrmanager.databinding.FragmentCreateEventBinding
import dagger.hilt.android.AndroidEntryPoint
import com.adetayoolaitan.domain.model.Event
import com.adetayoolaitan.eventqrmanager.other.IdGenerator

@AndroidEntryPoint
class CreateEventFragment : Fragment(R.layout.fragment_create_event) {
    private lateinit var args: CreateEventFragmentArgs
    private val createEventViewModel by viewModels<CreateEventViewModel>()
    private var _binding: FragmentCreateEventBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        args = CreateEventFragmentArgs.fromBundle(requireArguments())
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCreateEventBinding.bind(view)

        binding.btnCreateEvent.setOnClickListener({
            val eventTitle = binding.editEventTitle.text.toString();
            val eventDescription = binding.editEventDescription.text.toString();
            val eventTicketNo =  binding.editEventTicketNo.text.toString();
            if(eventTitle.trim().isEmpty() || eventTicketNo.trim().isEmpty()){
                Toast.makeText(context,"All fields are required",Toast.LENGTH_LONG).show()
            }else{
                createEventViewModel.addNewEvent(Event(IdGenerator.generateUUID(),eventTitle,eventDescription,eventTicketNo.toInt()))
                Toast.makeText(context,"Succesfully Created!",Toast.LENGTH_LONG).show()
            }
        })
    }
}