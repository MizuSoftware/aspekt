package wtf.mizu.aspekt.api.declaration

import org.objectweb.asm.Type
import java.lang.reflect.Method

/**
 * @author xtrm
 * @since 0.1.0
 */
open class MethodDeclaration(
    val ownerClass: ClassDeclaration,
    val methodName: String,
    val methodDescriptor: String,
) : Declaration("$ownerClass.$methodName$methodDescriptor") {
    constructor(method: Method) : this(
        ClassDeclaration(method.declaringClass),
        method.name,
        Type.getMethodDescriptor(method),
    )
}
