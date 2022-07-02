object Coordinates {
    const val NAME = "aspekt"
    const val DESC = "Aspect-oriented Kotlin bytecode modification framework."
    const val VENDOR = "Mizu Software"

    const val GIT_HOST = "github.com"
    const val REPO_ID = "mizusoftware/$NAME"

    const val GROUP = "wtf.mizu"
    const val VERSION = "0.1.0"
}

object Pom {
    val licenses = arrayOf(
        License("ISC License", "https://opensource.org/licenses/ISC")
    )
    val developers = arrayOf(
        Developer("xtrm", "xtrm <oss@xtrm.me>"),
        Developer("milse113", "milse <email@cock.li>")
    )
}

data class License(val name: String, val url: String, val distribution: String = "repo")
data class Developer(val id: String, val name: String = id)
