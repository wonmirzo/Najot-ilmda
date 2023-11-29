package com.wonapplications.najotilmda.ui.home

import android.os.Bundle
import android.view.View
import com.wonapplications.najotilmda.R
import com.wonapplications.najotilmda.databinding.FragmentHomeBinding
import com.wonapplications.najotilmda.ui.BaseFragment
import viewBinding

class HomeFragment : BaseFragment(R.layout.fragment_home) {
    private val binding by viewBinding { FragmentHomeBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            //
        }
    }
}