# Exception Handler

### 5 ways to handle exceptions
* All exception one response with one page. [Go](https://github.com/zivet/springboot-introduction/commit/2dd35b3c5e1337986281f538b3d7abbe9f068ddf)
* Handlers for each specific exception distributed in the controllers. [Go](https://github.com/zivet/springboot-introduction/commit/a37efdb69f6211c253ca500b1aa8bad20b2930f6)
* A Global set of exception handlers centralized into one class. You can render a template or send a JSON. [Go](https://github.com/zivet/springboot-introduction/commit/b6173326d39904ec1aa3aa10bbcb528a89a03c7b)
* Configuration @Bean ```org.springframework.web.servlet.handler.SimpleMappingExceptionResolver``` to map exception to view. [Go](https://github.com/zivet/springboot-introduction/commit/e20ca37ac0578fb229f8f6428fda8eb9c3e6e5aa)
* Implementation of ```org.springframework.web.servlet.HandlerExceptionResolver``` to assign exception to view applying reflection. [Go](https://github.com/zivet/springboot-introduction/commit/237d264d6e157297f2e04462b32997f97f2ae818)
