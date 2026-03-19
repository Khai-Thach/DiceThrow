package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class DieViewModel: ViewModel() {

    var dieSides: Int = 6
    private val dieRoll = MutableLiveData<Int>()

    fun setSides(sides: Int) {
        dieRoll.value = sides
    }

    fun rollDie() {
        dieRoll.value = (Random.nextInt(dieSides) + 1)
    }
    fun getDieRoll(): LiveData<Int> {
        return dieRoll
    }
}