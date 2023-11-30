package com.wonapplications.najotilmda.ui.auth

import android.os.Bundle
import android.view.View
import com.wonapplications.najotilmda.R
import com.wonapplications.najotilmda.databinding.FragmentLoginBinding
import com.wonapplications.najotilmda.ui.BaseFragment
import viewBinding

class LoginFragment : BaseFragment(R.layout.fragment_login) {
    private val binding by viewBinding { FragmentLoginBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
//        setupObservers()
    }

    private fun setupUI() {
        binding.apply {
//            bnLogin.setOnClickListener {
//                viewModel.sendVerificationCode(etPhonenumber.text.toString(), requireActivity())
//            }
//
//            tvForgotPassword.setOnClickListener { findNavController().navigate(R.id.action_logInFragment_to_forgetPasswordFragment) }
//
//            tvRegistration.setOnClickListener { findNavController().navigate(R.id.action_logInFragment_to_registrationFragment) }
//
//            tvSkip.setOnClickListener { findNavController().popBackStack() }

        }
    }
}