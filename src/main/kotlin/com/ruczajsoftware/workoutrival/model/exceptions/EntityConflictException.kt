package com.ruczajsoftware.workoutrival.model.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.CONFLICT)
class EntityConflictException(message: ExceptionMessages) : Exception(message.getMsg())
