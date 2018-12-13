## chapter 01-4. Annotation DI Example

Also We can use annotation (@) supported in spring framework.

Here is the example using spring annotation.

```
[ConfigApp.java]

@Configuration
public class ConfigApp {

	@Bean
	public Message myMessage(String text) {
		return new Message(text);
	}
....	
```
