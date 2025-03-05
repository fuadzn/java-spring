package java_spring_test.spring_test;

import java_spring_test.spring_test.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeaNameTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(BeaNameConfiguration.class);
    }

    @Test
    void testBeaName(){
        Foo foo = applicationContext.getBean(Foo.class);
        Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class);
        Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, fooFirst);
        Assertions.assertNotSame(fooFirst, fooSecond);
    }
}
