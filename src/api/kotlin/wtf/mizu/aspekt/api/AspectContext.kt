package wtf.mizu.aspekt.api

import kotlin.reflect.KProperty

/**
 * Context given to an [Aspect]'s payload.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface AspectContext {
    /**
     * The code context's locals, includes parameters
     * (and self reference when applicable).
     */
    val locals: List<Any?>

    /**
     *
     */
    val methods: Holder<MethodInterface>
}

interface Holder<T> {
    operator fun getValue(context: Any?, property: KProperty<*>): T?
}

interface MethodInterface {
    val name: String
    val returnType: Class<*>
    val parameterTypes: Array<Class<*>>

    operator fun invoke(context: AspectContext, vararg args: Any?): Any?
}
