package com.raian.navigationcomponentproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.raian.navigationcomponentproject.Adapter.ItemAdapter
import com.raian.navigationcomponentproject.Data.DataSource
import com.raian.navigationcomponentproject.databinding.FragmentProfileBinding
import kotlinx.android.synthetic.main.fragment_profile.*


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null

    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycler_view.setHasFixedSize(true)
        val dataset = DataSource().loadAffirmations()
        recycler_view.layoutManager = LinearLayoutManager(context)
        recycler_view.adapter  = ItemAdapter(requireContext(), dataset )
    }

}