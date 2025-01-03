package com.y9vad9.bsapi.annotations

@MustBeDocumented
@RequiresOptIn(
    message = "This declaration works only within special conditions, please refer to the documentation.",
    level = RequiresOptIn.Level.WARNING,
)
public annotation class ContextualBSApi