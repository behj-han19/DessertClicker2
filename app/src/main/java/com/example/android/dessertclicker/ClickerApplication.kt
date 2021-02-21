package com.example.android.dessertclicker

import android.app.Application
import timber.log.Timber

    // Application came from where look at link below
    // https://developer.android.com/codelabs/kotlin-android-training-lifecycles-logging/#3
class ClickerApplication: Application() {
    override fun onCreate(){
        super.onCreate()

        //Initialize the Timber library
        Timber.plant(Timber.DebugTree())
    }
}