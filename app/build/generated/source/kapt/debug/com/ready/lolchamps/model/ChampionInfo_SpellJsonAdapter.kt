// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN")

package com.ready.lolchamps.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.text.buildString

public class ChampionInfo_SpellJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ChampionInfo.Spell>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "name", "description",
      "image")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "id")

  private val imageAdapter: JsonAdapter<Image> = moshi.adapter(Image::class.java, emptySet(),
      "image")

  public override fun toString(): String = buildString(40) {
      append("GeneratedJsonAdapter(").append("ChampionInfo.Spell").append(')') }

  public override fun fromJson(reader: JsonReader): ChampionInfo.Spell {
    var id: String? = null
    var name: String? = null
    var description: String? = null
    var image: Image? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> id = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
        1 -> name = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("name", "name",
            reader)
        2 -> description = stringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("description", "description", reader)
        3 -> image = imageAdapter.fromJson(reader) ?: throw Util.unexpectedNull("image", "image",
            reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return ChampionInfo.Spell(
        id = id ?: throw Util.missingProperty("id", "id", reader),
        name = name ?: throw Util.missingProperty("name", "name", reader),
        description = description ?: throw Util.missingProperty("description", "description",
            reader),
        image = image ?: throw Util.missingProperty("image", "image", reader)
    )
  }

  public override fun toJson(writer: JsonWriter, value_: ChampionInfo.Spell?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    stringAdapter.toJson(writer, value_.id)
    writer.name("name")
    stringAdapter.toJson(writer, value_.name)
    writer.name("description")
    stringAdapter.toJson(writer, value_.description)
    writer.name("image")
    imageAdapter.toJson(writer, value_.image)
    writer.endObject()
  }
}
