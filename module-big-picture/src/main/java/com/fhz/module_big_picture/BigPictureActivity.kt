package com.fhz.module_big_picture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.fhz.library_base.path.BIG_PICTURE_ACTIVITY

/**
 * 大图加载
 */
@Route(path = BIG_PICTURE_ACTIVITY)
class BigPictureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_big_picture)




    }




}