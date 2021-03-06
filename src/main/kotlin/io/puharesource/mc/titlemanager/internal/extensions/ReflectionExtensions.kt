package io.puharesource.mc.titlemanager.internal.extensions

import java.lang.reflect.Field

internal inline fun Field.modify(body: Field.() -> Unit) {
    if (!isAccessible) {
        isAccessible = true
    }

    body()
}