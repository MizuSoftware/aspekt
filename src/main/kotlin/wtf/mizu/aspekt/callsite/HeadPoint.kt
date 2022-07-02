package wtf.mizu.aspekt.callsite

import wtf.mizu.aspekt.api.Aspect
import wtf.mizu.aspekt.api.callsite.CallPoint
import wtf.mizu.aspekt.api.callsite.CallSite

class HeadPoint: CallPoint {
    override fun applyAt(callSite: CallSite, aspect: Aspect): Boolean {
//        callSite.targetMethod.asm.instructions.insert()
        TODO()
    }
}
