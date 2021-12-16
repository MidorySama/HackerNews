package com.dipand.hackernews.platform.di.component

import com.dipand.hackernews.platform.di.module.LoggerModule
import com.dipand.hackernews.platform.di.module.MainActivityModule
import com.dipand.hackernews.platform.di.module.PersistenceModule
import com.dipand.hackernews.platform.di.module.RetrofitModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        MainActivityModule::class,
        RetrofitModule::class,
        LoggerModule::class,
        PersistenceModule::class
    ]
)

interface MainComponent {

}