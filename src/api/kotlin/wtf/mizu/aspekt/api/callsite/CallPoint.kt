package wtf.mizu.aspekt.api.callsite

import wtf.mizu.aspekt.api.Aspect

/**
 * @author xtrm
 * @since 0.1.0
 */
interface CallPoint {
    /**
     * Handles application of an [Aspect] inside
     * a predefined [CallSite].
     *
     * @param callSite The predefined [CallSite].
     * @param aspect The [Aspect] to be applied.
     *
     * @return whether the [aspect] has been applied correctly.
     */
    fun applyAt(callSite: CallSite, aspect: Aspect): Boolean
}
