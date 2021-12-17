package com.heewon.domain.usecase.auth

import com.heewon.domain.base.UseCase
import com.heewon.domain.param.SignInParam
import com.heewon.domain.repository.AuthRepository

class SignInUseCase(
    private val authRepository: AuthRepository
) : UseCase<SignInParam, Unit>() {

    override suspend fun execute(param: SignInParam) =
        authRepository.signIn(param)
}