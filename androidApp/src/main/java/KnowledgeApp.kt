package com.example.knowledge.android

import android.app.Application
import assemble

class KnowledgeApp: Application() {

    override fun onCreate() {
        super.onCreate()
        assemble()
    }
}