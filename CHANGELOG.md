# simter-exception changelog

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