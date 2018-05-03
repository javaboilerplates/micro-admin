# Boilerplate for Microservice Admin in Java
[![Build Status](https://travis-ci.org/javaboilerplates/micro-admin.svg?branch=master)](https://travis-ci.org/javaboilerplates/micro-admin)
[![codecov](https://codecov.io/gh/javaboilerplates/micro-admin/branch/master/graph/badge.svg)](https://codecov.io/gh/javaboilerplates/micro-admin)
[![](https://sonarcloud.io/api/project_badges/measure?project=net.aikaka.javaboilerplates%3Amicro-admin&metric=alert_status)](https://sonarcloud.io/dashboard?id=net.aikaka.javaboilerplates%3Amicro-admin)
[![](https://sonarcloud.io/api/project_badges/measure?project=net.aikaka.javaboilerplates%3Amicro-admin&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=net.aikaka.javaboilerplates%3Amicro-admin)
[![](https://images.microbadger.com/badges/image/javaboilerplates/micro-admin.svg)](https://microbadger.com/images/javaboilerplates/micro-admin)
[![JavaDoc](https://img.shields.io/badge/javadoc-API-blue.svg)](https://javaboilerplates-micro-admin.aikaka.net/apidocs/)
[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/javaboilerplates/micro-admin/blob/master/LICENSE)
## Features
- Show health status
- Show details, like
- JVM & memory metrics
- Counter & gauge metrics
- Datasource metrics
- Cache metrics
- Show build-info number
- Follow and download logfile
- View jvm system- & environment-properties
- Easy loglevel management (currently for Logback only)
- Interact with JMX-beans
- View thread dump
- View traces
- Download heapdump
- CI with Travis
- Docker Build

## Installation
Install dependencies

```
./mvnw clean install

```

## Running the tests

Run all tests

```
./mvnw test
```

## Run and build

Run serve at localhost:8002
```
./mvnw spring-boot:run
```

Build package
```
./mvnw package
```

## Docker support 

Build docker image

```
bash script/Dockerbuild.sh
```

Run docker container

```

docker run -d --name micro-admin -p 8002:8002 javaboilerplates/micro-admin
```
## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/micro-admin/tags). 

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details

