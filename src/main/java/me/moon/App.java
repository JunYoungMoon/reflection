package me.moon;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {

        /*-클래스 정보 조회-

        case 1:
        Class<Book> bookClass = Book.class;
        Book book = new Book();

        case 2:
        Book book = new Book();
        Class<? extends Book> aClass = book.getClass();

        case 3:
        Class<?> aClass1 = Class.forName("me.moon.Book");

        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);

        System.out.println("\n");

        Field
        Arrays.stream(bookClass.getDeclaredFields()).forEach(field -> {
            try {
                int modifiers = field.getModifiers();

                System.out.println(field);
                System.out.println(Modifier.isPrivate(modifiers));
                System.out.println(Modifier.isStatic(modifiers));

                System.out.println("\n");

                field.setAccessible(true);
                System.out.printf("%s %s\n",field,field.get(book));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        System.out.println("\n");

        Methods
        Arrays.stream(bookClass.getMethods()).forEach(method->{
            int modifiers = method.getModifiers();

            System.out.println(method);
            System.out.println(Modifier.isPublic(modifiers));
            System.out.println(Modifier.isPrivate(modifiers));
            System.out.println(method.getReturnType());
            Arrays.stream(method.getParameters()).forEach(System.out::println);

        });

        System.out.println("\n");

        Constructor
        Arrays.stream(bookClass.getConstructors()).forEach(System.out::println);

        System.out.println("\n");

        Superclass
        System.out.println(MyBook.class.getSuperclass());

        System.out.println("\n");
        Interface
        Arrays.stream(MyBook.class.getInterfaces()).forEach(System.out::println);*/

        /*-애노테이션과 리플렉션-

        Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        //MyBook에만 있는 애노테이션만 가져오고 싶을때
        Arrays.stream(MyBook.class.getDeclaredAnnotations()).forEach(System.out::println);

        //필드중 애노테이션이 붙은 필드 찾기
        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
            Arrays.stream(field.getAnnotations()).forEach(System.out::println);
        });

        //애노테이션의 값을 직접 참조
        Arrays.stream(Book.class.getDeclaredFields()).forEach(field -> {
            Arrays.stream(field.getAnnotations()).forEach(annotation -> {
                if(annotation instanceof MyAnnotation){
                    MyAnnotation myAnnotation = (MyAnnotation) annotation;
                    System.out.println(myAnnotation.name());
                    System.out.println(myAnnotation.number());
                }
            });
        });*/

        /*-클래스 정보 수정 또는 실행-
        Class<?> bookClass = Class.forName("me.moon.Book2");

        try {
            Constructor<?> constructor = bookClass.getConstructor(String.class);
            Book2 book2 = (Book2) constructor.newInstance("myBook");
            System.out.println(book2);

            Field a = Book2.class.getDeclaredField("A");
            System.out.println(a.get(null));
            a.set(null,"AAAAA");
            System.out.println(a.get(null));

            Field b = Book2.class.getDeclaredField("B");
            b.setAccessible(true);
            System.out.println(b.get(book2));
            b.set(book2,"BBBBB");
            System.out.println(b.get(book2));

            Method c = Book2.class.getDeclaredMethod("c");
            c.setAccessible(true);
            c.invoke(book2);

            Method d = Book2.class.getDeclaredMethod("d",int.class,int.class);
            int invoke = (int)d.invoke(book2, 1, 2);
            System.out.println(invoke);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        */

    }
}
