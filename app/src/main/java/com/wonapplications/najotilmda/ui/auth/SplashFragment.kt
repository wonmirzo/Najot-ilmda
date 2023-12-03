package com.wonapplications.najotilmda.ui.auth

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.navigation.fragment.findNavController
import com.wonapplications.najotilmda.R
import com.wonapplications.najotilmda.databinding.FragmentSplashBinding
import com.wonapplications.najotilmda.ui.BaseFragment
import viewBinding

class SplashFragment : BaseFragment(R.layout.fragment_splash) {
    private val binding by viewBinding { FragmentSplashBinding.bind(it) }

    private var timer: CountDownTimer? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {
        timer()
    }

    private fun timer() {
        timer = object : CountDownTimer(1000, 1000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
            }
        }
        timer!!.start()
    }
}