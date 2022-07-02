package wtf.mizu.aspekt.api.declaration

/**
 * @author xtrm
 * @since 0.1.0
 */
class ClassDeclaration(val typeName: String): Declaration(typeName) {
    constructor(type: Class<*>) :
        this(type.name.replace('.', '/'))
}
