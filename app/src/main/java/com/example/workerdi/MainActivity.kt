package com.example.workerdi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequest
import androidx.work.WorkManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WorkManager.getInstance(this).beginUniqueWork(
            "unique_work", ExistingWorkPolicy.REPLACE,
            OneTimeWorkRequest.from(MainWorker::class.java)
        ).enqueue()

    }

}