# simter-exception changelog

## 2.0.0 - 2020-11-19

- Upgrade to simter-dependencies-2.0.0

## 1.1.0 - 2019-07-02

No code changed, just polishing maven config.

- Change parent to simter-dependencies-1.2.0

## 1.0.0 - 2019-01-08

- initial with follow exceptions:
    - [SimterException] - Common base exception
    - [NonUniqueException] : [SimterException]
    - [NotFoundException] : [SimterException]
    - [SecurityException] : [SimterException] - Security base exception
    - [UnauthenticatedException] : [SecurityException]
    - [PermissionDeniedException] : [SecurityException]
    - [ForbiddenException] : [SecurityException]


[SimterException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/SimterException.java
[NonUniqueException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/NonUniqueException.java
[NotFoundException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/NotFoundException.java
[SecurityException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/SecurityException.java
[UnauthenticatedException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/UnauthenticatedException.java
[PermissionDeniedException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/PermissionDeniedException.java
[ForbiddenException]: https://github.com/simter/simter-exception/blob/master/src/main/java/tech/simter/exception/ForbiddenException.java