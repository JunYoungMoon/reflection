package me.moon;

import java.lang.annotation.*;

//런타임에 참조할 애노테이션은 Retention RUNTIME을 해줘야한다.
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
@Inherited //상속이 되는 애노테이션
public @interface MyAnnotation {

    //@MyAnnotation 만써도 가능
    String name() default  "Jun";
    int number() default 100;

    //@MyAnnotation(name = "jun", number = 100) 기본값을 줘야함
    //String name();
    //int number();

    //@MyAnnotation("jun") 값을 하나만 받을때 사용
    //String value() default "jun";
}
