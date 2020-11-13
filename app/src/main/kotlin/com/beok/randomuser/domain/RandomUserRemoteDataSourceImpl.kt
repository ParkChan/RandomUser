package com.beok.randomuser.domain

import com.beok.randomuser.data.RandomUserResponse
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RandomUserRemoteDataSourceImpl @Inject constructor(
    private val randomUserService: RandomUserService
) : RandomUserRemoteDataSource {

    override suspend fun fetchUsers(results: Int): RandomUserResponse =
        withContext(ioDispatcher) {
            randomUserService.fetch(results)
        }
}
