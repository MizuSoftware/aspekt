# aspekt [![Build][badge-github-ci]][project-gradle-ci] [![Maven Central][badge-mvnc]][project-mvnc]

aspect-oriented [kotlin][kotlin] bytecode modification framework for the [JVM][jvm].

# importing

you can import [aspekt][project-url] from [maven central][mvnc] just by adding it to your dependencies:

## gradle

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    implementation("wtf.mizu:aspekt:0.1.0")
}
```

## maven

```xml
<dependency>
    <groupId>wtf.mizu</groupId>
    <artifactId>aspekt</artifactId>
    <version>0.1.0</version>
</dependency>
```

# troubleshooting

if you ever encounter any problem **related to this project**, you can [open an issue][new-issue] describing what the
problem is. please, be as precise as you can, so that we can help you asap. we are most likely to close the issue if it
is not related to our work.

# contributing

you can contribute by [forking the repository][fork], making your changes and [creating a new pull request][new-pr]
describing what you changed, why and how.

# licensing

this project is under the [ISC license][project-license].


<!-- Links -->

[jvm]: https://adoptium.net "adoptium website"

[kotlin]: https://kotlinlang.org "kotlin website"

[rust]: https://rust-lang.org "rust website"

[mvnc]: https://repo1.maven.org/maven2/ "maven central website"

<!-- Project Links -->

[project-url]: https://github.com/MizuSoftware/aspekt "project github repository"

[fork]: https://github.com/MizuSoftware/aspekt/fork "fork this repository"

[new-pr]: https://github.com/MizuSoftware/aspekt/pulls/new "create a new pull request"

[new-issue]: https://github.com/MizuSoftware/aspekt/issues/new "create a new issue"

[project-mvnc]: https://maven-badges.herokuapp.com/maven-central/wtf.mizu/aspekt "maven central repository"

[project-gradle-ci]: https://github.com/MizuSoftware/aspekt/actions/workflows/build.yml "gradle ci workflow"

[project-license]: https://github.com/MizuSoftware/aspekt/blob/main/LICENSE "LICENSE source file"

<!-- Badges -->

[badge-mvnc]: https://maven-badges.herokuapp.com/maven-central/wtf.mizu/aspekt/badge.svg "maven central badge"

[badge-github-ci]: https://github.com/MizuSoftware/aspekt/actions/workflows/build.yml/badge.svg?branch=main "github actions badge"
