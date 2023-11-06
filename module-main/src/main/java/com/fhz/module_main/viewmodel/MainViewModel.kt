package com.fhz.module_main.viewmodel

import androidx.lifecycle.ViewModel
import com.fhz.library_http.utils.entity.BannerPage
import com.fhz.library_http.utils.entity.BaseResponse
import com.fhz.module_main.repository.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * 时间:2023/11/3
 * @author Mr.Feng
 * 简述: 主页的viewmodel
 */
@HiltViewModel
class MainViewModel @Inject constructor (val mainRepository: MainRepository) : ViewModel() {


    suspend fun getBanners() : BaseResponse<BannerPage> {
        return mainRepository.getBanners()
    }

}