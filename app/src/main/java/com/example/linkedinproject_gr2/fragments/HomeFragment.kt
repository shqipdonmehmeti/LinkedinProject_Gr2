package com.example.linkedinproject_gr2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.linkedinproject_gr2.R
import com.example.linkedinproject_gr2.adapters.PostAdapter
import com.example.linkedinproject_gr2.databinding.FragmentHomeBinding
import com.example.linkedinproject_gr2.models.Post

class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfPost = listOf(
            Post(R.drawable.ic_post,"Title 1" , "Desc 1"),
            Post(R.drawable.ic_home,"Title 2" , "Desc 2"),
            Post(R.drawable.ic_job,"Title 3" , "Desc 3"),
            Post(R.drawable.ic_notifications,"Title 4" , "Desc 4"),
            Post(R.drawable.ic_people,"Title 5" , "Desc 5"),
            )
        val postAdapter = PostAdapter(requireContext(),listOfPost)
        binding.lvHome.adapter = postAdapter
    }
}