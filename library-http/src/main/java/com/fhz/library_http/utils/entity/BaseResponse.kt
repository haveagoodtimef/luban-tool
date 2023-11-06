package com.fhz.library_http.utils.entity

/**
 * 时间:2023/11/4
 * @author Mr.Feng
 * 简述: 基础相应类
 */
data class BaseResponse<T>(
    val code: Int,
    val `data`: T,
    val msg: String
)

