package wtf.mizu.aspekt.api.callsite

import wtf.mizu.aspekt.api.declaration.ClassDeclaration
import wtf.mizu.aspekt.api.declaration.Declaration
import wtf.mizu.aspekt.api.declaration.MethodDeclaration
import wtf.mizu.aspekt.api.matcher.TargetMatcher
import kotlin.reflect.KProperty

typealias DeclarationLike = Any

@Suppress("UNCHECKED_CAST")
fun <T : Declaration> DeclarationLike.toActual(): T =
    this as T

/**
 * @author xtrm
 * @since 0.1.0
 */
abstract class CallSiteBuilder {
    abstract val match: TargetMatcher

    var clazz: DeclarationLike? by DeclarationHolder({ match }, ClassDeclaration::class.java)
    var method: DeclarationLike? by DeclarationHolder({ match }, MethodDeclaration::class.java)
    val point: CallPoint? = null

    /**
     * @return the built [CallSite].
     */
    abstract fun build(): CallSite
}

class DeclarationHolder<T : Declaration>(
    private val matcher: () -> TargetMatcher,
    private val clazz: Class<T>,
) {
    private var value: T? = null

    operator fun getValue(thisRef: Any, property: KProperty<*>): T? =
        value

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: T?) {
        this.value = value
    }

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: Any?): Nothing =
        throw RuntimeException("No")

    operator fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        this.value = matcher().withName(value, clazz)
    }
}
