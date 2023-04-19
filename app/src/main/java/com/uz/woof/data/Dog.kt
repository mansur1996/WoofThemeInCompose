package com.uz.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.uz.woof.R

data class Dog(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dog(R.drawable.koda, R.string.dog_name_1, 2, R.string.dog_description_1),
    Dog(R.drawable.lola, R.string.dog_name_2, 22, R.string.dog_description_2),
    Dog(R.drawable.frankie, R.string.dog_name_3, 23, R.string.dog_description_3),
    Dog(R.drawable.nox, R.string.dog_name_4, 12, R.string.dog_description_4),
    Dog(R.drawable.faye, R.string.dog_name_5, 32, R.string.dog_description_5),
    Dog(R.drawable.bella, R.string.dog_name_6, 52, R.string.dog_description_6),
    Dog(R.drawable.moana, R.string.dog_name_7, 26, R.string.dog_description_7),
    Dog(R.drawable.tzeitel, R.string.dog_name_8, 82, R.string.dog_description_8),
    Dog(R.drawable.leroy, R.string.dog_name_9, 92, R.string.dog_description_9),
)
