package nl.hva.mad.level5_task1.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import nl.hva.mad.level5_task1.database.NoteRepository

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository =  NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()

}
