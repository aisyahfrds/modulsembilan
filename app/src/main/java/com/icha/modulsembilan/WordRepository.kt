package com.icha.modulsembilan

import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>>wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word) I
    wordDao. insert(word)

}
}