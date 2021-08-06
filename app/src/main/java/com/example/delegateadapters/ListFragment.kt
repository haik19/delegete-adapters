package com.example.delegateadapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.delegateadapters.databinding.ListFragmentLayoutBinding

class ListFragment : Fragment() {
    private lateinit var listDataDataBinding: ListFragmentLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return DataBindingUtil.inflate<ListFragmentLayoutBinding>(
            inflater,
            R.layout.list_fragment_layout,
            container,
            false
        ).apply {
            listDataDataBinding = this
        }.root
    }





}