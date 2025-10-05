package com.example.mynit32132b3.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(val name: String, val price: Double): Parcelable