package wtf.mizu.aspekt.api.declaration

abstract class Declaration(
    val declarationString: String,
) {
    override fun toString(): String =
        "${javaClass.simpleName}($declarationString)"
}
