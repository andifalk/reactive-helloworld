# A Reactive Hello World Application

This is a small cloud-native reactive web application written in [Kotlin](https://kotlinlang.org/). This application just returns
a ```Hello World``` as JSON value.

_This demo application is mainly used as artifact for presentations 
(like showing CI-pipelines with concourse)._

#### _HelloWorld_ request without a parameter

Just browse to [localhost:9090](http://localhost:9090):

```
GET http://localhost:9090

HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
Content-Length: 21

{
  "msg": "Hello World"
}
```

#### _HelloWorld_ request with parameter

Just browse to [localhost:9090?msg=test](http://localhost:9090?msg=test):

```
GET http://localhost:9090?msg=test

HTTP/1.1 200 OK
Content-Type: application/json;charset=UTF-8
Content-Length: 20

{
  "msg": "Hello test"
}
```

#### Monitoring with Actuator

This application also includes the 
[actuator feature](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready) of spring boot.

* [List of all actuator endpoints: 'localhost:9090/actuator'](http://localhost:9090/actuator)
* [Health endpoint: 'localhost:9090/actuator/health'](http://localhost:9090/actuator/health)
* [Info endpoint: 'localhost:9090/actuator/info'](http://localhost:9090/actuator/info)
* [Http request metrics endpoint: 'localhost:9090/actuator/metrics/http.server.requests'](http://localhost:9090/actuator/metrics/http.server.requests)

#### JUnit 5 Test

This includes a Junit 5 based spring integration test as well covering all
cases (with/without request parameter).