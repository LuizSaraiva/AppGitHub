package com.example.githubrepositories.domain

import com.example.githubrepositories.core.UseCase
import com.example.githubrepositories.data.model.Repo
import com.example.githubrepositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository) :
    UseCase<String, List<Repo>>() {
    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}