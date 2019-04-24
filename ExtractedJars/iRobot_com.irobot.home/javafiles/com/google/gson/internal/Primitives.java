// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.*;

public final class Primitives
{

	private Primitives()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	private static void add(Map map, Map map1, Class class1, Class class2)
	{
		map.put(((Object) (class1)), ((Object) (class2)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokeinterface #69  <Method Object Map.put(Object, Object)>
	//    4    8:pop             
		map1.put(((Object) (class2)), ((Object) (class1)));
	//    5    9:aload_1         
	//    6   10:aload_3         
	//    7   11:aload_2         
	//    8   12:invokeinterface #69  <Method Object Map.put(Object, Object)>
	//    9   17:pop             
	//   10   18:return          
	}

	public static boolean isPrimitive(Type type)
	{
		return PRIMITIVE_TO_WRAPPER_TYPE.containsKey(((Object) (type)));
	//    0    0:getstatic       #58  <Field Map PRIMITIVE_TO_WRAPPER_TYPE>
	//    1    3:aload_0         
	//    2    4:invokeinterface #77  <Method boolean Map.containsKey(Object)>
	//    3    9:ireturn         
	}

	public static boolean isWrapperType(Type type)
	{
		return WRAPPER_TO_PRIMITIVE_TYPE.containsKey(.Gson.Preconditions.checkNotNull(((Object) (type))));
	//    0    0:getstatic       #60  <Field Map WRAPPER_TO_PRIMITIVE_TYPE>
	//    1    3:aload_0         
	//    2    4:invokestatic    #84  <Method Object $Gson$Preconditions.checkNotNull(Object)>
	//    3    7:invokeinterface #77  <Method boolean Map.containsKey(Object)>
	//    4   12:ireturn         
	}

	public static Class unwrap(Class class1)
	{
		Class class2 = (Class)WRAPPER_TO_PRIMITIVE_TYPE.get(.Gson.Preconditions.checkNotNull(((Object) (class1))));
	//    0    0:getstatic       #60  <Field Map WRAPPER_TO_PRIMITIVE_TYPE>
	//    1    3:aload_0         
	//    2    4:invokestatic    #84  <Method Object $Gson$Preconditions.checkNotNull(Object)>
	//    3    7:invokeinterface #89  <Method Object Map.get(Object)>
	//    4   12:checkcast       #91  <Class Class>
	//    5   15:astore_1        
		if(class2 == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       22
			return class1;
	//    8   20:aload_0         
	//    9   21:areturn         
		else
			return class2;
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public static Class wrap(Class class1)
	{
		Class class2 = (Class)PRIMITIVE_TO_WRAPPER_TYPE.get(.Gson.Preconditions.checkNotNull(((Object) (class1))));
	//    0    0:getstatic       #58  <Field Map PRIMITIVE_TO_WRAPPER_TYPE>
	//    1    3:aload_0         
	//    2    4:invokestatic    #84  <Method Object $Gson$Preconditions.checkNotNull(Object)>
	//    3    7:invokeinterface #89  <Method Object Map.get(Object)>
	//    4   12:checkcast       #91  <Class Class>
	//    5   15:astore_1        
		if(class2 == null)
	//*   6   16:aload_1         
	//*   7   17:ifnonnull       22
			return class1;
	//    8   20:aload_0         
	//    9   21:areturn         
		else
			return class2;
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	private static final Map PRIMITIVE_TO_WRAPPER_TYPE;
	private static final Map WRAPPER_TO_PRIMITIVE_TYPE;

	static 
	{
		HashMap hashmap = new HashMap(16);
	//    0    0:new             #12  <Class HashMap>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #16  <Method void HashMap(int)>
	//    4    9:astore_0        
		HashMap hashmap1 = new HashMap(16);
	//    5   10:new             #12  <Class HashMap>
	//    6   13:dup             
	//    7   14:bipush          16
	//    8   16:invokespecial   #16  <Method void HashMap(int)>
	//    9   19:astore_1        
		add(((Map) (hashmap)), ((Map) (hashmap1)), Boolean.TYPE, java/lang/Boolean);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getstatic       #22  <Field Class Boolean.TYPE>
	//   13   25:ldc1            #18  <Class Boolean>
	//   14   27:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Byte.TYPE, java/lang/Byte);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:getstatic       #29  <Field Class Byte.TYPE>
	//   18   35:ldc1            #28  <Class Byte>
	//   19   37:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Character.TYPE, java/lang/Character);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getstatic       #32  <Field Class Character.TYPE>
	//   23   45:ldc1            #31  <Class Character>
	//   24   47:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Double.TYPE, java/lang/Double);
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:getstatic       #35  <Field Class Double.TYPE>
	//   28   55:ldc1            #34  <Class Double>
	//   29   57:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Float.TYPE, java/lang/Float);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:getstatic       #38  <Field Class Float.TYPE>
	//   33   65:ldc1            #37  <Class Float>
	//   34   67:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Integer.TYPE, java/lang/Integer);
	//   35   70:aload_0         
	//   36   71:aload_1         
	//   37   72:getstatic       #41  <Field Class Integer.TYPE>
	//   38   75:ldc1            #40  <Class Integer>
	//   39   77:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Long.TYPE, java/lang/Long);
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:getstatic       #44  <Field Class Long.TYPE>
	//   43   85:ldc1            #43  <Class Long>
	//   44   87:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Short.TYPE, java/lang/Short);
	//   45   90:aload_0         
	//   46   91:aload_1         
	//   47   92:getstatic       #47  <Field Class Short.TYPE>
	//   48   95:ldc1            #46  <Class Short>
	//   49   97:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		add(((Map) (hashmap)), ((Map) (hashmap1)), Void.TYPE, java/lang/Void);
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:getstatic       #50  <Field Class Void.TYPE>
	//   53  105:ldc1            #49  <Class Void>
	//   54  107:invokestatic    #26  <Method void add(Map, Map, Class, Class)>
		PRIMITIVE_TO_WRAPPER_TYPE = Collections.unmodifiableMap(((Map) (hashmap)));
	//   55  110:aload_0         
	//   56  111:invokestatic    #56  <Method Map Collections.unmodifiableMap(Map)>
	//   57  114:putstatic       #58  <Field Map PRIMITIVE_TO_WRAPPER_TYPE>
		WRAPPER_TO_PRIMITIVE_TYPE = Collections.unmodifiableMap(((Map) (hashmap1)));
	//   58  117:aload_1         
	//   59  118:invokestatic    #56  <Method Map Collections.unmodifiableMap(Map)>
	//   60  121:putstatic       #60  <Field Map WRAPPER_TO_PRIMITIVE_TYPE>
	//*  61  124:return          
	}
}
