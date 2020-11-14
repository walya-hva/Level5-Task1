package nl.hva.mad.level5_task1.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "NoteTable")
data class Note(

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "lastUpdated")
    var lastUpdated: Date,

    @ColumnInfo(name = "text")
    var text: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null
)