package com.android.socialmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.socialmedia.dao.PostDao
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {
    private lateinit var postDao:PostDao
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        postDao = PostDao()

        postButton.setOnClickListener {
            val input = postText.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                finish()
            }
        }

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {

    }
}