package com.example.workerdi

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.ListenableWorker
import androidx.work.Worker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import javax.inject.Inject

@HiltWorker
class MainWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted workerParameters: WorkerParameters,
    private val mainRepository: MainRepository
) :
    Worker(context, workerParameters) {
    override fun doWork(): Result {
        mainRepository.createLogs()
        return Result.success()
    }
}