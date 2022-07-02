@file:Suppress("UNUSED_PARAMETER")

package wtf.mizu.aspekt.dsl

import wtf.mizu.aspekt.api.Aspect
import wtf.mizu.aspekt.api.AspectContext
import wtf.mizu.aspekt.api.callsite.CallSite
import wtf.mizu.aspekt.api.callsite.CallSiteBuilder

fun aspect(code: AspectContext.() -> Unit): Aspect =
    TODO()

fun site(desc: CallSiteBuilder.() -> Unit): CallSite =
    TODO()

infix fun Aspect.injectAt(callSite: CallSite) {
    TODO()
}
