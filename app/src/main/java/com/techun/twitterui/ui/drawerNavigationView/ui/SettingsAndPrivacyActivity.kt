package com.techun.twitterui.ui.drawerNavigationView.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techun.twitterui.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsAndPrivacyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings_and_privacy)
    }
}