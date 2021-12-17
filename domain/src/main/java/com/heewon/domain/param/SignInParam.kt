package com.heewon.domain.param

import com.heewon.domain.enum.AuthType

data class SignInParam(
    val code: String,
    val type: AuthType
)