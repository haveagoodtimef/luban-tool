package com.fhz.luban

import android.app.Application
import com.didichuxing.doraemonkit.DoKit
import dagger.hilt.android.HiltAndroidApp

/**
 * 时间:2023/11/2
 * @author Mr.Feng
 * 简述: 启动app
 */
@HiltAndroidApp
class LuBanApp : Application() {

    override fun onCreate() {
        super.onCreate()

        DoKit.Builder(this)
            .productId("bc5572f4d8f739a59ba5188010b6a1da")
            .build()

    }
}