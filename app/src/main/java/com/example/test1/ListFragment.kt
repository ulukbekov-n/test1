package com.example.test1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.test1.databinding.ListFragmentBinding

class ListFragment:Fragment() {
    private lateinit var binding:ListFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ListFragmentBinding.inflate(inflater,container,false)
        val Item:RecyclerView = binding.rec1
        Item.setOnClickListener{
            findNavController().navigate(R.id.action_listFragment_to_detailedFragment)
        }
        return binding.root
    }
}