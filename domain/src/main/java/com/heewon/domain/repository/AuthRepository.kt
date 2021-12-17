package com.heewon.domain.repository

import com.heewon.domain.entity.AuthLinkEntity
import com.heewon.domain.enum.AuthType
import com.heewon.domain.param.SignInParam
import kotlinx.coroutines.flow.Flow


interface AuthRepository {

    suspend fun fetchAuthLink(authType: AuthType): Flow<AuthLinkEntity>

    suspend fun signIn(signInParam: SignInParam)

    suspend fun logout()
}