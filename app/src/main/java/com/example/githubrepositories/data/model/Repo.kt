package com.example.githubrepositories.data.model

import com.google.gson.annotations.SerializedName

data class Repo(
    val id: Int,
    val name: String,
    val owner: Owner,
    @SerializedName("stargazers_count")
    val stargazersCount: Int,
    val language: String,
    @SerializedName("html_url")
    val htmlUrl: String,
    val description: String
)