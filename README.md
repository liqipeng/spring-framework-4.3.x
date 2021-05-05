# spring-framework-4.3.x
[![Build Status](https://www.travis-ci.org/liqipeng/spring-framework-4.3.x.svg?branch=main)](https://www.travis-ci.org/liqipeng/spring-framework-4.3.x)
[![codecov](https://codecov.io/gh/liqipeng/spring-framework-4.3.x/branch/main/graph/badge.svg?token=5FDS9ELV8L)](https://codecov.io/gh/liqipeng/spring-framework-4.3.x)

A version of the spring framework code could be built with Maven. This is just parts of the modules. Original from https://github.com/spring-projects/spring-framework/tree/4.3.x. Just for code learning only.

这是一个可以用maven构建的spring框架的源码。需要注意的是它只是包括了部分模块的代码，并不完整。基于spring framework官方原始代码的4.3.x分支进行调整而来。仅用于代码学习只用。

如果需要找到对应的原始代码，可以在4.3.x分支找到[commit(SHA-1:f5d689e764b9feebe4595a6f7832238be6cfb68c)](https://github.com/spring-projects/spring-framework/commit/f5d689e764b9feebe4595a6f7832238be6cfb68c)

----
Below is original README.md
----
## Spring Framework

The Spring Framework provides a comprehensive programming and configuration
model for modern Java-based enterprise applications -- on any kind of deployment
platform. A key element of Spring is infrastructural support at the application
level: Spring focuses on the "plumbing" of enterprise applications so that teams
can focus on application-level business logic, without unnecessary ties to
specific deployment environments.

The framework also serves as the foundation for [Spring Integration][], [Spring Batch][]
and the rest of the Spring [family of projects][]. Browse the repositories under
the [Spring organization][] on GitHub for a full list.

## Code of Conduct

This project adheres to the Contributor Covenant [code of conduct](CODE_OF_CONDUCT.adoc).
By participating, you  are expected to uphold this code. Please report unacceptable behavior to spring-code-of-conduct@pivotal.io.

## Downloading Artifacts

See [downloading Spring artifacts][] for Maven repository information. Unable to
use Maven or other transitive dependency management tools?
See [building a distribution with dependencies][].

## Documentation

See the current [Javadoc][] and [reference docs][].

## Getting Support

Check out the [spring][spring tags] tags on [Stack Overflow][]. [Commercial support][]
is available too.

## Issue Tracking

Report issues via the [Spring Framework JIRA][]. Understand our issue management
process by reading about [the lifecycle of an issue][]. Think you've found a
bug? Please consider submitting a reproduction project via the
[spring-framework-issues][] GitHub repository. The [readme][] there provides
simple step-by-step instructions.

## Building from Source

~~The Spring Framework uses a [Gradle][]-based build system. In the instructions~~
~~below, [`./gradlew`][] is invoked from the root of the source tree and serves as~~
~~a cross-platform, self-contained bootstrap mechanism for the build.~~

### Prerequisites

[Git][] and [JDK 8 update 20 or later][JDK8 build]

Be sure that your `JAVA_HOME` environment variable points to the `jdk1.8.0` folder
extracted from the JDK download.

### ~~Check out sources~~

~~`git clone git@github.com:spring-projects/spring-framework.git`~~

### ~~Import sources into your IDE~~

~~Run `./import-into-eclipse.sh` or read `import-into-idea.md` as appropriate.~~

> ~~**Note:** Per the prerequisites above, ensure that you have JDK 8 configured properly in your IDE.~~

### ~~Install all spring-\* jars into your local Maven cache~~

~~`./gradlew install`~~

### ~~Compile and test; build all jars, distribution zips, and docs~~

~~`./gradlew build`~~

~~... and discover more commands with `./gradlew tasks`. See also the [Gradle
build and release FAQ][].~~

## Contributing

[Pull requests][] are welcome; see the [contributor guidelines][] for details.

## Staying in Touch

Follow [@SpringCentral][] as well as [@SpringFramework][] and its [team members][]
on Twitter. In-depth articles can be found at [The Spring Blog][], and releases
are announced via our [news feed][].

## License

The Spring Framework is released under version 2.0 of the [Apache License][].

[Spring Integration]: https://github.com/spring-projects/spring-integration
[Spring Batch]: https://github.com/spring-projects/spring-batch
[family of projects]: http://spring.io/projects
[Spring organization]: https://github.com/spring-projects
[downloading Spring artifacts]: https://github.com/spring-projects/spring-framework/wiki/Downloading-Spring-artifacts
[building a distribution with dependencies]: https://github.com/spring-projects/spring-framework/wiki/Building-a-distribution-with-dependencies
[Javadoc]: http://docs.spring.io/spring-framework/docs/current/javadoc-api/
[reference docs]: http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/
[spring tags]: http://spring.io/questions
[Stack Overflow]: http://stackoverflow.com/faq
[Commercial support]: http://spring.io/services
[Spring Framework JIRA]: https://jira.spring.io/browse/SPR
[the lifecycle of an issue]: https://github.com/spring-projects/spring-framework/wiki/The-Lifecycle-of-an-Issue
[spring-framework-issues]: https://github.com/spring-projects/spring-framework-issues#readme
[readme]: https://github.com/spring-projects/spring-framework-issues#readme
[Gradle]: http://gradle.org
[`./gradlew`]: http://vimeo.com/34436402
[Git]: http://help.github.com/set-up-git-redirect
[JDK8 build]: http://www.oracle.com/technetwork/java/javase/downloads
[Gradle build and release FAQ]: https://github.com/spring-projects/spring-framework/wiki/Gradle-build-and-release-FAQ
[Pull requests]: http://help.github.com/send-pull-requests
[contributor guidelines]: https://github.com/spring-projects/spring-framework/blob/master/CONTRIBUTING.md
[@SpringFramework]: https://twitter.com/springframework
[@SpringCentral]: https://twitter.com/springcentral
[team members]: https://twitter.com/springframework/lists/team/members
[The Spring Blog]: http://spring.io/blog/
[news feed]: http://spring.io/blog/category/news
[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
