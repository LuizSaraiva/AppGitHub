package com.example.githubrepositories.data.repositories

import android.os.RemoteException
import com.example.githubrepositories.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImp(private val service: GitHubService): RepoRepository {
    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        }catch (ex: HttpException){
            throw com.example.githubrepositories.core.RemoteException(ex.message() ?: "Nao foi possivel fazer a busca no momento")
        }
    }
}