package com.raywenderlich.android.datadrop.model

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonWriter
import java.io.IOException

class DropTypeAdapter : TypeAdapter<Drop>() {

    @Throws(IOException::class)
    override fun write(out: JsonWriter, drop: Drop) {
        out.beginObject()
        out.name("latitude").value(drop.latLng.latitude)
        out.name("longitude").value(drop.latLng.longitude)
        out.name("dropMessage").value(drop.dropMessage)
        out.name("id").value(drop.id)
        out.endObject()
    }

    override fun read(reader: JsonReader): Drop? {
        return null
    }
}