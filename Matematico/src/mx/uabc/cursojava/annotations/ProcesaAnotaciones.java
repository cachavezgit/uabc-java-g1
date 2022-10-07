package mx.uabc.cursojava.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ProcesaAnotaciones {
    public static void RevisarSiEsJsonSerializable(Object object) throws Exception{
        if (Objects.isNull(object))
            throw new Exception("El objeto es nulo");

        Class<?> clazz = object.getClass();
        if (!clazz.isAnnotationPresent(JsonSerializable.class)){
            throw new Exception("El objeto no es JSON Serializable");
        }
    }

    public static void InicializarObjeto(Object object) throws Exception{
        Class<?> clazz = object.getClass();
        for (Method method : clazz.getDeclaredMethods()){
            if (method.isAnnotationPresent(Init.class)){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    public static String getJsonString(Object object) throws Exception {
        Class<?> clazz = object.getClass();
        Map<String, String> jsonElementsMap = new HashMap<>();
        for (Field field:clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)) {
                jsonElementsMap.put(field.getName(), field.get(object).toString());
            }
        }
        String resultado= jsonElementsMap.entrySet().stream().map(
                e->"\""+e.getKey()+"\":\""+e.getValue()+"\"").collect(Collectors.joining(","));
        return "{"+resultado+"}";
    }

    public static void main(String[] args) throws Exception{
        Empleado e1 = new Empleado(1,"wilson", "perez", "rodriguez", 12345.34);
        EmpleadoNoSerializable e2 = new EmpleadoNoSerializable();

        RevisarSiEsJsonSerializable(e1);
        RevisarSiEsJsonSerializable(e2);

        InicializarObjeto(e1);
        System.out.println(e1.toString());

        System.out.println(getJsonString(e1));

    }
}
