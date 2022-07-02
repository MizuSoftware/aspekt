package wtf.mizu.aspekt.tests

import wtf.mizu.aspekt.api.matcher.withName
import wtf.mizu.aspekt.dsl.aspect
import wtf.mizu.aspekt.dsl.injectAt
import wtf.mizu.aspekt.dsl.site
import kotlin.test.Test

internal class SyntaxTests {
    @Test
    fun `aspect with no parameters`() {
        val aspect = aspect {
            val test by methods
            println(test)
        }

        val callSite = site {
            clazz = match.withName("foo/bar/baz/Qux")

            // just syntactic sugar for match.withName
            method = "qux()V"
        }

        aspect injectAt callSite
    }
}
