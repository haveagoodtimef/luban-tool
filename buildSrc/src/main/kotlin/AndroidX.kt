object AndroidX {
    val corKktx  = "androidx.core:core-ktx:1.9.0"
    val appcompat = "androidx.appcompat:appcompat:1.6.1"
    val material =  "com.google.android.material:material:1.8.0"
    val junit = "junit:junit:4.13.2"
    val TestImplementation = "androidx.test.ext:junit:1.1.5"
    val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    val compileSdk = 33
    val minSdk = 26
    val targetSdk = 33
    val versionCode = 1
    val versionName = "1.0"
}

object LuBanDependencies{
    val arouter = "com.alibaba:arouter-api:1.5.2"
    val arouterCompiler = "com.alibaba:arouter-compiler:1.5.2"
    val baseRecyclerViewAdapterHelper =  "io.github.cymchad:BaseRecyclerViewAdapterHelper:4.0.1"
    val circleimageview =  "de.hdodenhof:circleimageview:3.1.0"

    /**
     * 网络请求
     */
    val retrofit =  "com.squareup.retrofit2:retrofit:2.9.0"
    val converterGson =  "com.squareup.retrofit2:converter-gson:2.9.0"
    val loggingInterceptor =  "com.squareup.okhttp3:logging-interceptor:4.9.0"
    val gson = "com.google.code.gson:gson:2.9.0"

    /**
     * 协程
     */
    val coroutines =  "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9"

    //viewModel中的协程作用域
    val viewmodelKtx =  "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0-rc03"
    //by viewmodels()
    val fragmentKtx =  "androidx.fragment:fragment-ktx:1.5.5"
    //依赖注入
    val hilt =  "com.google.dagger:hilt-android:2.44"
    val hiltCompilerKapt =  "com.google.dagger:hilt-compiler:2.44"
    //数据库orm框架
//    val room =  "androidx.room:room-runtime:2.5.0"
//    val roomCompilerKapt =  "androidx.room:room-compiler:2.5.0"
    //工具类
    val utilcodex =  "com.blankj:utilcodex:1.31.1"


}
