package com.example.githubrepositories

import android.app.Application
import com.example.githubrepositories.data.di.DataModule
import com.example.githubrepositories.domain.di.DomainModule
import com.example.githubrepositories.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}