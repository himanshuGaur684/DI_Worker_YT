package com.example.workerdi

import androidx.work.WorkerParameters
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@InstallIn(SingletonComponent::class)
@Module
object HiltModules {
    @Provides
    fun provideRepository(): MainRepository = MainRepository()
}