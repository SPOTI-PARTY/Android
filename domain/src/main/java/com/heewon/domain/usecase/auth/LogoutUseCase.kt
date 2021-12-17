package com.heewon.domain.usecase.auth

import com.heewon.domain.base.UseCase
import com.heewon.domain.repository.AuthRepository

class LogoutUseCase(
    private val authRepository: AuthRepository
) : UseCase<Unit, Unit>() {

    override suspend fun execute(param: Unit) =
        authRepository.logout()
}