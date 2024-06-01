package net.laggedhero.lifecycleblues

import android.app.Application
import leakcanary.LeakCanary

class LifecycleBluesApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        LeakCanary.config = LeakCanary.config.copy(dumpHeap = true)
        LeakCanary.showLeakDisplayActivityLauncherIcon(true)
    }
}
