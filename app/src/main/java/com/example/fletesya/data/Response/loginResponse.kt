package com.example.fletesya.data.Response
import com.example.fletesya.data.Model.User

class loginResponse (
    val message: String,
    val error: Boolean,
    val accessToken: String,
    val refreshToken: String,
    val user: User
    )
