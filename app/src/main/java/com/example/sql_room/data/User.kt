package com.example.sql_room.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    var nome: String,
    var sobrenome: String,
    var idade: Int
    ){
}