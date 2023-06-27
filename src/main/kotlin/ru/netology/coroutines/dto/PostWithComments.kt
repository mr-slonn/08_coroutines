package ru.netology.coroutines.dto

import kotlinx.coroutines.Deferred

data class PostWithComments(
    val post: Post,
    val author: Author,
    //val comments: List<Deferred<CommentWithAuthor>>,
    //val comments: List<CommentWithAuthor>,
    val comments: List<Comment>,
)
