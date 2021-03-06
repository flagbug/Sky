package com.example.sky.dagger.network

import com.example.sky.search.SearchPresenter
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(
        OkHttpModule::class,
        GsonConverterFactoryModule::class,
        LoggingInterceptorModule::class,
        RestApiModule::class,
        AppModule::class,
        RetrofitModule::class))
interface NetComponent {
    fun inject(searchPresenter: SearchPresenter)
}
