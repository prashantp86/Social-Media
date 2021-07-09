package com.android.socialmedia.model

class Post (
    val text:String="",
    val creator:User= User(),
    val timeAt: Long= 0,
    val likedBy: ArrayList<String>?= ArrayList()
        )