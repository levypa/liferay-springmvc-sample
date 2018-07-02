## A sample Spring MVC portlet for Liferay 7 & DXP

Just a very basic portlet build with [Spring Portlet MVC](https://docs.spring.io/spring/docs/current/spring-framework-reference/html/portlet.html). The module can be build with both [Gradle](https://gradle.org/) or [Maven](https://maven.apache.org/).

The base for the portlet was generated using the [maven archetype](https://dev.liferay.com/develop/tutorials/-/knowledge_base/7-0/generating-new-projects-using-archetypes) as provided by [Liferay](https://www.liferay.com)

## Features

The following modifications or additions have been added on top of the generated code:
* Upgraded the Spring version to 4.3.10-RELEASE
* First name of the user is added in the hello message
* Unit tests
* [Travis CI](https://travis-ci.org/triberay/liferay-springmvc-sample) configuration for continuous integration (see [.travis.yml](https://github.com/triberay/liferay-springmvc-sample/blob/master/.travis.yml))
* Code analysis with [SonarCloud](https://sonarcloud.io/dashboard/index/com.triberay:triberay-springmvc-sample)
* Code coverage with [JaCoCo](http://www.eclemma.org/jacoco/) & [Codecov.io](https://codecov.io/) 

## Continuous Integration, Code Quality and Code Coverage

Because we value Test Driven Development, we have set up Continuous Integration from the start using the following services:

* <a href="https://travis-ci.org/triberay/liferay-springmvc-sample"><img src="https://travis-ci.org/triberay/liferay-springmvc-sample.svg?branch=master" alt="Travis CI" /></a>
    [Travis CI](https://travis-ci.org/triberay/liferay-springmvc-sample) for building the code and running the unit tests
* <a href="https://sonarcloud.io/dashboard/index/com.triberay:triberay-springmvc-sample"><img src="https://sonarcloud.io/api/project_badges/measure?project=com.triberay%3Atriberay-springmvc-sample&metric=alert_status" alt="Quality Gate" /></a>
    [SonarCloud](https://sonarcloud.io/dashboard/index/com.triberay:triberay-springmvc-sample) for testing the quality of the code 
* <a href="https://codecov.io/gh/triberay/liferay-springmvc-sample"><img src="https://codecov.io/gh/triberay/liferay-springmvc-sample/branch/master/graph/badge.svg" alt="Coverage" /></a> 
    [CodeCov](https://codecov.io/gh/triberay/liferay-springmvc-sample) for reporting how much of the code is covered by the unit tests
    