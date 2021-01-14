package light.com.java_kit.demo.reflect;

import light.com.java_kit.demo.oop.Man;
import light.com.java_kit.demo.oop.Person;

import java.lang.reflect.*;
import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
       Person a = new Person("aaaa", 22, 22);
       Class cl = a.getClass();
       Field f = cl.getField("extra");
       Object v = f.get(a);
       System.out.println(v);

       Field[] fields = cl.getDeclaredFields();
       AccessibleObject.setAccessible(fields, true);
       for (Field fd : fields) {
           System.out.println(fd.getName());
           System.out.println(fd.get(a));
       }
    }

    public static void reflectClass() {
        String name;
        /*
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("enter class name");
            name = in.next();
        }
         */
        Scanner in = new Scanner(System.in);
        System.out.println("enter class name");
        name = in.next();


        try {
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (supercl != null && supercl != Object.class) {
                System.out.print(" extentds " + supercl.getName());
            }
            System.out.print("\n{\n");
            printConstructors(cl);
            System.out.println();
            printFields(cl);
            System.out.println();
            printMethods(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getConstructors();

        for (Constructor c : constructors) {
            String name = cl.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");

            }
            System.out.print(name + "(");

            Class[] paramTypes = c.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.println(");");

        }
    }

    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();

        for (Method m : methods) {
            Class retType = m.getReturnType();
            String name = m.getName();
            System.out.print("  ");

            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + name + "(");

            Class[] paramTypes = m.getParameterTypes();
            for (int j = 0; j < paramTypes.length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[j].getName());
            }
            System.out.print(");");
            System.out.println();
        }
    }

    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();

        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + name + ";");
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
