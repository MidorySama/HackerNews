package com.dipand.hackernews.activities

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dipand.hackernews.R
import com.dipand.hackernews.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_HackerNews)
        super.onCreate(savedInstanceState)
        this.supportActionBar?.let { it.hide() }
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        starLottieAnimation()
    }

    private fun starLottieAnimation() {
        binding.AnimationStartLottie.addAnimatorListener(object : Animator.AnimatorListener{
            override fun onAnimationStart(p0: Animator?) {

            }

            override fun onAnimationEnd(p0: Animator?) {
                startActivity()
            }

            override fun onAnimationCancel(p0: Animator?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationRepeat(p0: Animator?) {
                TODO("Not yet implemented")
            }

        })
        binding.AnimationStartLottie.playAnimation()
    }

    fun startActivity()
    {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}