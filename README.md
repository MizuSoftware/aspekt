# ✏️ Aspekt [![Build][badge-github-ci]][project-gradle-ci] [![Maven Central][badge-mvnc]][project-mvnc]

A fluent [open-source][project-url] [Kotlin] aspect-oriented [Java][jvm] bytecode modification framework.


## Importing

You can import [aspekt][project-url] from [Maven Central][mvnc] by adding it to your dependencies block.

### Gradle

```kt
repositories {
    mavenCentral()
}

dependencies {
    implementation("wtf.mizu:aspekt:0.1.0")
}
```

### Maven

```xml
<dependency>
    <groupId>wtf.mizu</groupId>
    <artifactId>aspekt</artifactId>
    <version>0.1.0</version>
</dependency>
```


## Troubleshooting

If you encounter any kind of problem **related to this library**, you can [open an issue][new-issue] describing what's
up. We ask you to be as precise as you can, so that our developers can help you as fast as possible.

Non-project-related issues will most likely be closed without further ado.


## Contributing

You can contribute to this project by [forking it][fork], making your changes, and
[creating a new pull request][new-pr].

You have to be as precise as possible while doing it though, describing in the commits (or PR description) what you're
changing, why and how.


## Licensing

This project is licensed under [the ISC license][project-license].


<!-- Links -->

[jvm]: https://adoptium.net "Adoptium website"

[kotlin]: https://kotlinlang.org "Kotlin website"

[mvnc]: https://repo1.maven.org/maven2/ "Maven Central website"


<!-- Project Links -->

[project-url]: https://github.com/MizuSoftware/aspekt "Project homepage"

[fork]: https://github.com/MizuSoftware/aspekt/fork "Fork this repository"

[new-pr]: https://github.com/MizuSoftware/aspekt/pulls/new "Create a new pull request"

[new-issue]: https://github.com/MizuSoftware/aspekt/issues/new "Create a new issue"

[project-mvnc]: https://search.maven.org/search?g:wtf.mizu+AND+a:aspekt "Project Maven Central search"

[project-gradle-ci]: https://github.com/MizuSoftware/aspekt/actions/workflows/build.yml "Continuous integration"

[project-license]: https://github.com/MizuSoftware/aspekt/blob/main/LICENSE "LICENSE source file"


<!-- Badges -->

[badge-mvnc]: https://maven-badges.herokuapp.com/maven-central/wtf.mizu/aspekt/badge.svg "Maven Central badge"

[badge-github-ci]: https://github.com/MizuSoftware/aspekt/actions/workflows/build.yml/badge.svg?branch=main "Continous integration badge"
