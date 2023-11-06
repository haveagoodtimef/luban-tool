package com.fhz.library_http.utils.entity

/**
 * 时间:2023/11/4
 * @author Mr.Feng
 * 简述: TODO
 */
data class BannerPage(
    val endRow: Int,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val isFirstPage: Boolean,
    val isLastPage: Boolean,
    val list: List<BannerX>,
    val navigateFirstPage: Int,
    val navigateLastPage: Int,
    val navigatePages: Int,
    val navigatepageNums: List<Int>,
    val nextPage: Int,
    val pageNum: Int,
    val pageSize: Int,
    val pages: Int,
    val prePage: Int,
    val size: Int,
    val startRow: Int,
    val total: Int
)

data class BannerX(
    val id: Int,
    val imagepath: String,
    val imgorder: Int,
    val title: String,
    val type: Int,
    val url: Any
)