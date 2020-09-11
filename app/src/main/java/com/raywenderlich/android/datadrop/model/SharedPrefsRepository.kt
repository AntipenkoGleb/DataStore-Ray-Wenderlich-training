package com.raywenderlich.android.datadrop.model

import android.content.Context
import com.raywenderlich.android.datadrop.app.DataDropApplication

object SharedPrefsRepository : DropRepository {

    private const val SHARED_PREFS_REPOSITORY = "SHARED_PREFS_REPOSITORY"

    fun sharedPrefs() = DataDropApplication.getAppContext().getSharedPreferences(SHARED_PREFS_REPOSITORY, Context.MODE_PRIVATE)

    override fun addDrop(drop: Drop) {

    }

    override fun getDrops(): List<Drop> {
        return emptyList()
    }

    override fun clearDrop(drop: Drop) {

    }

    override fun clearAllDrops() {

    }
}