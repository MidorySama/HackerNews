package com.dipand.hackernews.platform.di.module

import com.dipand.hackernews.api.CoreHomeApi
import com.dipand.hackernews.repositories.NewsHitsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class MainActivityModule {
    @Provides
    fun newHistsRepositoryProvider(apiService: CoreHomeApi) = NewsHitsRepository(apiService)
}