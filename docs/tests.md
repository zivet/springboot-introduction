# Tests
```
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {SpringBootUnitTestApplication.class})
@TestPropertiySource(locations="classpath:test.properties")
public class MyTest {

   @Test
   public void testDemo() {
       Assert.assertEquals(...);
   }
}
```

``` @RunWith``` say: *integrate spring with junit*, was replaced with ```@ExtendWith(SpringExtension.class)```
```@SpringBootTest``` say: *this class is a spring boot test. Enable spring boot features for this test.*

**To use ```static assertEquals(...)```** import:
* org.junit.Assert; or
* org.juniy.jupiter.api.Assertions;

org.springframework.util.Assert; *(does not include the assertEquals method)*

Types:
* Unit Test; no Spring injection, do not read Spring @annotations.
class name: ```MyClassTest```.
* Injection Test; with Spring injection. class name: ```MyClassInjectionTest```.
    ```
    @ExtendWith(SpringExtension.class)
    @SpringBootTest
    ```
* Mock Test; with mocks. class name: ```MyClassMockTest```.
* Integration Test; uses Spring to instantiate classes and beans. class name: ```MyClassIT```
