package com.heewon.domain.base

abstract class UseCase<In, Out> {
    abstract suspend fun execute(param: In): Out
}