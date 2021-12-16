package com.dipand.hackernews.platform.di.module

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.Reusable
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

const val DATABASE_HOME = "news-hits-preference-db"

@Module
@InstallIn(ActivityComponent::class)

class PersistenceModule{
    @Provides
    @Reusable

    fun provideNewsHitsDataBase(@ApplicationContext context: Context): NewsHitsDataBase{
        return Room.databaseBuilder( context ,
            NewsHitsDataBase::class.javq,
            DATABASE_HOME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Reusable
    fun provideNewsHitsModelDao(newHitsDataBase:NewsHitsDataBase):NewsHitsModelDao{
      return newsHitsDataBase.provideNewsHitsDataBase()
    }

}


