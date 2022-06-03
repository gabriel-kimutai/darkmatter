package com.github.gabumras.darkmatter.android

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.github.gabumras.darkmatter.DarkMatter

/** Launches the Android application. */
class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialize(DarkMatter(), AndroidApplicationConfiguration().apply {
            // Configure your application here.
        })
    }
}
