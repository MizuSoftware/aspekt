package wtf.mizu.aspekt.api.callsite

import wtf.mizu.aspekt.api.Aspect
import wtf.mizu.aspekt.api.declaration.ClassDeclaration
import wtf.mizu.aspekt.api.declaration.MethodDeclaration

/**
 * A call site is a location where an [Aspect] is implemented.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface CallSite {
    val targetClass: ClassDeclaration
    val targetMethod: MethodDeclaration
}
