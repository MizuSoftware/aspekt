package wtf.mizu.aspekt.api.matcher

import wtf.mizu.aspekt.api.declaration.Declaration

/**
 * @author xtrm
 * @since 0.1.0
 */
interface TargetMatcher {
    fun <T: Declaration> withName(name: String, type: Class<T>): T
}

inline fun <reified T: Declaration> TargetMatcher.withName(name: String): T =
    withName(name, T::class.java)
