## chapter 01-4. Annotation DI Example

Also We can use annotation (@) supported in spring framework.

Here is the example using spring annotation.

```
[ Bean Tag Attribute]

singleton :
prototype :
request : 
session :
global-session :  

```

singleton : 스프링 컨테이너에 의해 singleton (static) 빈객체 생성 
prototype : 빈을 생성할 때마다(ex.getBean) 객체를 생성 
request : HTTP 요청 마다 빈 객체를 생성
session : HTTP 세션 마다 빈 객체를 생성 
global-session : 글로벌 HTTP 세션에 대해 빈 객체를 생성  

