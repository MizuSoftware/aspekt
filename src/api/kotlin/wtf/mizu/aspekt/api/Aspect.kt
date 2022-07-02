package wtf.mizu.aspekt.api

/**
 * Base interface for Aspects.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface Aspect {
    /**
     * The aspect's payload.
     */
    val payload: AspectContext.() -> Unit
}
