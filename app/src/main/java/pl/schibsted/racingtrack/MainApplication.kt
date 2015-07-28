package pl.schibsted.racingtrack

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid

/**
 * Created by loop on 28/07/15.
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
    }
}