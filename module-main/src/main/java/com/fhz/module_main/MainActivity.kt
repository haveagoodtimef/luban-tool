package com.fhz.module_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.fhz.library_base.path.MAIN_ACTIVITY
import com.fhz.module_main.adapter.PictureAdatper
import com.fhz.module_main.databinding.ActivityMainBinding
import com.fhz.module_main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

/**
 * 主要页面的布局,使用arouter进行组件之间的跳转
 */
@Route(path = MAIN_ACTIVITY)
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var pictureAdatper: PictureAdatper
    val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.pictureTitle.text = "图片工具"

        pictureAdatper = PictureAdatper()
        //网络请求.
//        pictureAdatper.submitList(?)

        binding.pictureRecycleView.adapter = pictureAdatper
        binding.pictureRecycleView.layoutManager = GridLayoutManager(this,4)

        lifecycleScope.launch{
            //Lifecycle.Event.ON_RESUME
            val banners = viewModel.getBanners()
            println(banners.data.list.size)
        }

    }
}