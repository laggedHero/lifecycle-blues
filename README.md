# lifecycle-blues

./gradlew :app:assembleDebug

adb install app/build/outputs/apk/debug/app-debug.apk

adb shell am start -n net.laggedhero.lifecycleblues/net.laggedhero.another.AnotherActivity -c android.intent.category.LAUNCHER -a android.intent.action.MAIN

boom?

