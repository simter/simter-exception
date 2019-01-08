# simter-exception

Common exceptions use by simter. Include:

- [SimterException] - Common base exception
- [NonUniqueException] : [SimterException]
- [NotFoundException] : [SimterException]
- [SecurityException] : [SimterException] - Security base exception
- [UnauthenticatedException] : [SecurityException]
- [PermissionDeniedException] : [SecurityException]
- [ForbiddenException] : [SecurityException]

> All Exception is a subtype of [SimterException].

## Installation

```xml
<dependency>
  <groupId>tech.simter</groupId>
  <artifactId>simter-exception</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Build

```bash
mvn clean package
```


[SimterException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/SimterException.java
[NonUniqueException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/NonUniqueException.java
[NotFoundException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/NotFoundException.java
[SecurityException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/SecurityException.java
[UnauthenticatedException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/UnauthenticatedException.java
[PermissionDeniedException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/PermissionDeniedException.java
[ForbiddenException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/ForbiddenException.java