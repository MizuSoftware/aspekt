package wtf.mizu.aspekt.callsite.opcode

import wtf.mizu.aspekt.api.Aspect
import wtf.mizu.aspekt.api.callsite.CallPoint
import wtf.mizu.aspekt.api.callsite.CallSite

/**
 *
 */
class OpcodeBasedPoint(
    val pattern: OpcodePattern,
) : CallPoint {
    override fun applyAt(callSite: CallSite, aspect: Aspect): Boolean {
        TODO("Not yet implemented")
    }
}
