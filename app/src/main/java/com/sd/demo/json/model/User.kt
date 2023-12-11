package com.sd.demo.json.model

data class DataUserModel(
    val id: String,

    val name: String = "default",

    val age: Int = 10,
)

class UserModel {
    val id: String = "ID"

    val name: String = "default"

    val age: Int = 10
}
