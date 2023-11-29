package com.wonapplications.najotilmda.ui.auth

import android.os.Bundle
import android.view.View
import com.wonapplications.najotilmda.R
import com.wonapplications.najotilmda.databinding.FragmentIntroBinding
import com.wonapplications.najotilmda.ui.BaseFragment
import viewBinding

class IntroFragment : BaseFragment(R.layout.fragment_intro) {
    private val binding by viewBinding { FragmentIntroBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
//            loginBtn.setOnClickListener {
//                findNavController().navigate(R.id.action_introFragment_to_logInFragment)
//            }
//
//            skipBtn.setOnClickListener {
//                callActivityMain()
//            }
        }
    }
}