package com.heewon.domain.usecase.auth

import com.heewon.domain.base.UseCase
import com.heewon.domain.entity.AuthLinkEntity
import com.heewon.domain.enum.AuthType
import com.heewon.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow

class FetchAuthLinkUseCase(
    private val authRepository: AuthRepository
) : UseCase<AuthType, Flow<AuthLinkEntity>>() {

    override suspend fun execute(param: AuthType): Flow<AuthLinkEntity> =
        authRepository.fetchAuthLink(param)
}