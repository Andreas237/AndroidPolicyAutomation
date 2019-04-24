// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.reflect;

import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

public class TypeToken
{

	protected TypeToken()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		type = getSuperclassTypeParameter(((Object)this).getClass());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #20  <Method Class Object.getClass()>
	//    5    9:invokestatic    #24  <Method Type getSuperclassTypeParameter(Class)>
	//    6   12:putfield        #26  <Field Type type>
		rawType = com.google.gson.internal..Gson.Types.getRawType(type);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #26  <Field Type type>
	//   10   20:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   11   23:putfield        #34  <Field Class rawType>
		hashCode = ((Object) (type)).hashCode();
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #26  <Field Type type>
	//   15   31:invokevirtual   #37  <Method int Object.hashCode()>
	//   16   34:putfield        #39  <Field int hashCode>
	//   17   37:return          
	}

	TypeToken(Type type1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		type = com.google.gson.internal..Gson.Types.canonicalize((Type)com.google.gson.internal..Gson.Preconditions.checkNotNull(((Object) (type1))));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Object com.google.gson.internal.$Gson$Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #49  <Class Type>
	//    6   12:invokestatic    #53  <Method Type com.google.gson.internal.$Gson$Types.canonicalize(Type)>
	//    7   15:putfield        #26  <Field Type type>
		rawType = com.google.gson.internal..Gson.Types.getRawType(type);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field Type type>
	//   11   23:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   12   26:putfield        #34  <Field Class rawType>
		hashCode = ((Object) (type)).hashCode();
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #26  <Field Type type>
	//   16   34:invokevirtual   #37  <Method int Object.hashCode()>
	//   17   37:putfield        #39  <Field int hashCode>
	//   18   40:return          
	}

	private static transient AssertionError buildUnexpectedTypeError(Type type1, Class aclass[])
	{
		StringBuilder stringbuilder = new StringBuilder("Unexpected type. Expected one of: ");
	//    0    0:new             #57  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #59  <String "Unexpected type. Expected one of: ">
	//    3    6:invokespecial   #62  <Method void StringBuilder(String)>
	//    4    9:astore          4
		int j = aclass.length;
	//    5   11:aload_1         
	//    6   12:arraylength     
	//    7   13:istore_3        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:iload_3         
	//*  12   18:icmpge          48
		{
			stringbuilder.append(aclass[i].getName());
	//   13   21:aload           4
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokevirtual   #68  <Method String Class.getName()>
	//   18   29:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
			stringbuilder.append(", ");
	//   20   33:aload           4
	//   21   35:ldc1            #74  <String ", ">
	//   22   37:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		}

	//   24   41:iload_2         
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore_2        
	//*  28   45:goto            16
		stringbuilder.append("but got: ");
	//   29   48:aload           4
	//   30   50:ldc1            #76  <String "but got: ">
	//   31   52:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   32   55:pop             
		stringbuilder.append(((Object) (type1)).getClass().getName());
	//   33   56:aload           4
	//   34   58:aload_0         
	//   35   59:invokevirtual   #20  <Method Class Object.getClass()>
	//   36   62:invokevirtual   #68  <Method String Class.getName()>
	//   37   65:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   38   68:pop             
		stringbuilder.append(", for type token: ");
	//   39   69:aload           4
	//   40   71:ldc1            #78  <String ", for type token: ">
	//   41   73:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   42   76:pop             
		stringbuilder.append(((Object) (type1)).toString());
	//   43   77:aload           4
	//   44   79:aload_0         
	//   45   80:invokevirtual   #81  <Method String Object.toString()>
	//   46   83:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
		stringbuilder.append('.');
	//   48   87:aload           4
	//   49   89:bipush          46
	//   50   91:invokevirtual   #84  <Method StringBuilder StringBuilder.append(char)>
	//   51   94:pop             
		return new AssertionError(((Object) (stringbuilder.toString())));
	//   52   95:new             #86  <Class AssertionError>
	//   53   98:dup             
	//   54   99:aload           4
	//   55  101:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   56  104:invokespecial   #90  <Method void AssertionError(Object)>
	//   57  107:areturn         
	}

	public static TypeToken get(Class class1)
	{
		return new TypeToken(((Type) (class1)));
	//    0    0:new             #2   <Class TypeToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #96  <Method void TypeToken(Type)>
	//    4    8:areturn         
	}

	public static TypeToken get(Type type1)
	{
		return new TypeToken(type1);
	//    0    0:new             #2   <Class TypeToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #96  <Method void TypeToken(Type)>
	//    4    8:areturn         
	}

	static Type getSuperclassTypeParameter(Class class1)
	{
		class1 = ((Class) (class1.getGenericSuperclass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #103 <Method Type Class.getGenericSuperclass()>
	//    2    4:astore_0        
		if(class1 instanceof Class)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #64  <Class Class>
	//*   5    9:ifeq            22
			throw new RuntimeException("Missing type parameter.");
	//    6   12:new             #105 <Class RuntimeException>
	//    7   15:dup             
	//    8   16:ldc1            #107 <String "Missing type parameter.">
	//    9   18:invokespecial   #108 <Method void RuntimeException(String)>
	//   10   21:athrow          
		else
			return com.google.gson.internal..Gson.Types.canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
	//   11   22:aload_0         
	//   12   23:checkcast       #110 <Class ParameterizedType>
	//   13   26:invokeinterface #114 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   14   31:iconst_0        
	//   15   32:aaload          
	//   16   33:invokestatic    #53  <Method Type com.google.gson.internal.$Gson$Types.canonicalize(Type)>
	//   17   36:areturn         
	}

	private static boolean isAssignableFrom(Type type1, GenericArrayType genericarraytype)
	{
		Type type2 = genericarraytype.getGenericComponentType();
	//    0    0:aload_1         
	//    1    1:invokeinterface #122 <Method Type GenericArrayType.getGenericComponentType()>
	//    2    6:astore_2        
		if(type2 instanceof ParameterizedType)
	//*   3    7:aload_2         
	//*   4    8:instanceof      #110 <Class ParameterizedType>
	//*   5   11:ifeq            81
		{
			if(type1 instanceof GenericArrayType)
	//*   6   14:aload_0         
	//*   7   15:instanceof      #119 <Class GenericArrayType>
	//*   8   18:ifeq            34
			{
				genericarraytype = ((GenericArrayType) (((GenericArrayType)type1).getGenericComponentType()));
	//    9   21:aload_0         
	//   10   22:checkcast       #119 <Class GenericArrayType>
	//   11   25:invokeinterface #122 <Method Type GenericArrayType.getGenericComponentType()>
	//   12   30:astore_1        
			} else
	//*  13   31:goto            65
			{
				genericarraytype = ((GenericArrayType) (type1));
	//   14   34:aload_0         
	//   15   35:astore_1        
				if(type1 instanceof Class)
	//*  16   36:aload_0         
	//*  17   37:instanceof      #64  <Class Class>
	//*  18   40:ifeq            65
				{
					type1 = ((Type) ((Class)type1));
	//   19   43:aload_0         
	//   20   44:checkcast       #64  <Class Class>
	//   21   47:astore_0        
					do
					{
						genericarraytype = ((GenericArrayType) (type1));
	//   22   48:aload_0         
	//   23   49:astore_1        
						if(!((Class) (type1)).isArray())
							break;
	//   24   50:aload_0         
	//   25   51:invokevirtual   #126 <Method boolean Class.isArray()>
	//   26   54:ifeq            65
						type1 = ((Type) (((Class) (type1)).getComponentType()));
	//   27   57:aload_0         
	//   28   58:invokevirtual   #129 <Method Class Class.getComponentType()>
	//   29   61:astore_0        
					} while(true);
	//   30   62:goto            48
				}
			}
			return isAssignableFrom(((Type) (genericarraytype)), (ParameterizedType)type2, ((Map) (new HashMap())));
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:checkcast       #110 <Class ParameterizedType>
	//   34   70:new             #131 <Class HashMap>
	//   35   73:dup             
	//   36   74:invokespecial   #132 <Method void HashMap()>
	//   37   77:invokestatic    #135 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//   38   80:ireturn         
		} else
		{
			return true;
	//   39   81:iconst_1        
	//   40   82:ireturn         
		}
	}

	private static boolean isAssignableFrom(Type type1, ParameterizedType parameterizedtype, Map map)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		if(type1 == null)
	//*   2    3:aload_0         
	//*   3    4:ifnonnull       9
			return false;
	//    4    7:iconst_0        
	//    5    8:ireturn         
		if(((Object) (parameterizedtype)).equals(((Object) (type1))))
	//*   6    9:aload_1         
	//*   7   10:aload_0         
	//*   8   11:invokevirtual   #139 <Method boolean Object.equals(Object)>
	//*   9   14:ifeq            19
			return true;
	//   10   17:iconst_1        
	//   11   18:ireturn         
		Class class1 = com.google.gson.internal..Gson.Types.getRawType(type1);
	//   12   19:aload_0         
	//   13   20:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   14   23:astore          7
		ParameterizedType parameterizedtype1 = null;
	//   15   25:aconst_null     
	//   16   26:astore          6
		if(type1 instanceof ParameterizedType)
	//*  17   28:aload_0         
	//*  18   29:instanceof      #110 <Class ParameterizedType>
	//*  19   32:ifeq            41
			parameterizedtype1 = (ParameterizedType)type1;
	//   20   35:aload_0         
	//   21   36:checkcast       #110 <Class ParameterizedType>
	//   22   39:astore          6
		if(parameterizedtype1 != null)
	//*  23   41:aload           6
	//*  24   43:ifnull          145
		{
			Type atype[] = parameterizedtype1.getActualTypeArguments();
	//   25   46:aload           6
	//   26   48:invokeinterface #114 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   27   53:astore          8
			TypeVariable atypevariable[] = class1.getTypeParameters();
	//   28   55:aload           7
	//   29   57:invokevirtual   #143 <Method TypeVariable[] Class.getTypeParameters()>
	//   30   60:astore          9
			for(int i = 0; i < atype.length; i++)
	//*  31   62:iconst_0        
	//*  32   63:istore_3        
	//*  33   64:iload_3         
	//*  34   65:aload           8
	//*  35   67:arraylength     
	//*  36   68:icmpge          133
			{
				type1 = atype[i];
	//   37   71:aload           8
	//   38   73:iload_3         
	//   39   74:aaload          
	//   40   75:astore_0        
				TypeVariable typevariable = atypevariable[i];
	//   41   76:aload           9
	//   42   78:iload_3         
	//   43   79:aaload          
	//   44   80:astore          10
				for(; type1 instanceof TypeVariable; type1 = (Type)map.get(((Object) (((TypeVariable)type1).getName()))));
	//   45   82:aload_0         
	//   46   83:instanceof      #145 <Class TypeVariable>
	//   47   86:ifeq            111
	//   48   89:aload_2         
	//   49   90:aload_0         
	//   50   91:checkcast       #145 <Class TypeVariable>
	//   51   94:invokeinterface #146 <Method String TypeVariable.getName()>
	//   52   99:invokeinterface #150 <Method Object Map.get(Object)>
	//   53  104:checkcast       #49  <Class Type>
	//   54  107:astore_0        
	//*  55  108:goto            82
				map.put(((Object) (typevariable.getName())), ((Object) (type1)));
	//   56  111:aload_2         
	//   57  112:aload           10
	//   58  114:invokeinterface #146 <Method String TypeVariable.getName()>
	//   59  119:aload_0         
	//   60  120:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//   61  125:pop             
			}

	//   62  126:iload_3         
	//   63  127:iconst_1        
	//   64  128:iadd            
	//   65  129:istore_3        
	//*  66  130:goto            64
			if(typeEquals(parameterizedtype1, parameterizedtype, map))
	//*  67  133:aload           6
	//*  68  135:aload_1         
	//*  69  136:aload_2         
	//*  70  137:invokestatic    #158 <Method boolean typeEquals(ParameterizedType, ParameterizedType, Map)>
	//*  71  140:ifeq            145
				return true;
	//   72  143:iconst_1        
	//   73  144:ireturn         
		}
		type1 = ((Type) (class1.getGenericInterfaces()));
	//   74  145:aload           7
	//   75  147:invokevirtual   #161 <Method Type[] Class.getGenericInterfaces()>
	//   76  150:astore_0        
		int k = type1.length;
	//   77  151:aload_0         
	//   78  152:arraylength     
	//   79  153:istore          5
		for(int j = ((int) (flag)); j < k; j++)
	//*  80  155:iload           4
	//*  81  157:istore_3        
	//*  82  158:iload_3         
	//*  83  159:iload           5
	//*  84  161:icmpge          191
			if(isAssignableFrom(((Type) (type1[j])), parameterizedtype, ((Map) (new HashMap(map)))))
	//*  85  164:aload_0         
	//*  86  165:iload_3         
	//*  87  166:aaload          
	//*  88  167:aload_1         
	//*  89  168:new             #131 <Class HashMap>
	//*  90  171:dup             
	//*  91  172:aload_2         
	//*  92  173:invokespecial   #164 <Method void HashMap(Map)>
	//*  93  176:invokestatic    #135 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//*  94  179:ifeq            184
				return true;
	//   95  182:iconst_1        
	//   96  183:ireturn         

	//   97  184:iload_3         
	//   98  185:iconst_1        
	//   99  186:iadd            
	//  100  187:istore_3        
	//* 101  188:goto            158
		return isAssignableFrom(class1.getGenericSuperclass(), parameterizedtype, ((Map) (new HashMap(map))));
	//  102  191:aload           7
	//  103  193:invokevirtual   #103 <Method Type Class.getGenericSuperclass()>
	//  104  196:aload_1         
	//  105  197:new             #131 <Class HashMap>
	//  106  200:dup             
	//  107  201:aload_2         
	//  108  202:invokespecial   #164 <Method void HashMap(Map)>
	//  109  205:invokestatic    #135 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//  110  208:ireturn         
	}

	private static boolean matches(Type type1, Type type2, Map map)
	{
		return ((Object) (type2)).equals(((Object) (type1))) || (type1 instanceof TypeVariable) && ((Object) (type2)).equals(map.get(((Object) (((TypeVariable)type1).getName()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #139 <Method boolean Object.equals(Object)>
	//    3    5:ifne            42
	//    4    8:aload_0         
	//    5    9:instanceof      #145 <Class TypeVariable>
	//    6   12:ifeq            40
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:checkcast       #145 <Class TypeVariable>
	//   11   21:invokeinterface #146 <Method String TypeVariable.getName()>
	//   12   26:invokeinterface #150 <Method Object Map.get(Object)>
	//   13   31:invokevirtual   #139 <Method boolean Object.equals(Object)>
	//   14   34:ifeq            40
	//   15   37:goto            42
	//   16   40:iconst_0        
	//   17   41:ireturn         
	//   18   42:iconst_1        
	//   19   43:ireturn         
	}

	private static boolean typeEquals(ParameterizedType parameterizedtype, ParameterizedType parameterizedtype1, Map map)
	{
		if(((Object) (parameterizedtype.getRawType())).equals(((Object) (parameterizedtype1.getRawType()))))
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #170 <Method Type ParameterizedType.getRawType()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #170 <Method Type ParameterizedType.getRawType()>
	//*   4   12:invokevirtual   #139 <Method boolean Object.equals(Object)>
	//*   5   15:ifeq            64
		{
			parameterizedtype = ((ParameterizedType) (parameterizedtype.getActualTypeArguments()));
	//    6   18:aload_0         
	//    7   19:invokeinterface #114 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//    8   24:astore_0        
			parameterizedtype1 = ((ParameterizedType) (parameterizedtype1.getActualTypeArguments()));
	//    9   25:aload_1         
	//   10   26:invokeinterface #114 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   11   31:astore_1        
			for(int i = 0; i < parameterizedtype.length; i++)
	//*  12   32:iconst_0        
	//*  13   33:istore_3        
	//*  14   34:iload_3         
	//*  15   35:aload_0         
	//*  16   36:arraylength     
	//*  17   37:icmpge          62
				if(!matches(((Type) (parameterizedtype[i])), ((Type) (parameterizedtype1[i])), map))
	//*  18   40:aload_0         
	//*  19   41:iload_3         
	//*  20   42:aaload          
	//*  21   43:aload_1         
	//*  22   44:iload_3         
	//*  23   45:aaload          
	//*  24   46:aload_2         
	//*  25   47:invokestatic    #172 <Method boolean matches(Type, Type, Map)>
	//*  26   50:ifne            55
					return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         

	//   29   55:iload_3         
	//   30   56:iconst_1        
	//   31   57:iadd            
	//   32   58:istore_3        
	//*  33   59:goto            34
			return true;
	//   34   62:iconst_1        
	//   35   63:ireturn         
		} else
		{
			return false;
	//   36   64:iconst_0        
	//   37   65:ireturn         
		}
	}

	public final boolean equals(Object obj)
	{
		return (obj instanceof TypeToken) && com.google.gson.internal..Gson.Types.equals(type, ((TypeToken)obj).type);
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class TypeToken>
	//    2    4:ifeq            26
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Type type>
	//    5   11:aload_1         
	//    6   12:checkcast       #2   <Class TypeToken>
	//    7   15:getfield        #26  <Field Type type>
	//    8   18:invokestatic    #176 <Method boolean com.google.gson.internal.$Gson$Types.equals(Type, Type)>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public final Class getRawType()
	{
		return rawType;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Class rawType>
	//    2    4:areturn         
	}

	public final Type getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Type type>
	//    2    4:areturn         
	}

	public final int hashCode()
	{
		return hashCode;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int hashCode>
	//    2    4:ireturn         
	}

	public boolean isAssignableFrom(TypeToken typetoken)
	{
		return isAssignableFrom(typetoken.getType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #182 <Method Type getType()>
	//    3    5:invokevirtual   #185 <Method boolean isAssignableFrom(Type)>
	//    4    8:ireturn         
	}

	public boolean isAssignableFrom(Class class1)
	{
		return isAssignableFrom(((Type) (class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #185 <Method boolean isAssignableFrom(Type)>
	//    3    5:ireturn         
	}

	public boolean isAssignableFrom(Type type1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		if(type1 == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		if(((Object) (type)).equals(((Object) (type1))))
	//*   6    8:aload_0         
	//*   7    9:getfield        #26  <Field Type type>
	//*   8   12:aload_1         
	//*   9   13:invokevirtual   #139 <Method boolean Object.equals(Object)>
	//*  10   16:ifeq            21
			return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
		if(type instanceof Class)
	//*  13   21:aload_0         
	//*  14   22:getfield        #26  <Field Type type>
	//*  15   25:instanceof      #64  <Class Class>
	//*  16   28:ifeq            43
			return rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1));
	//   17   31:aload_0         
	//   18   32:getfield        #34  <Field Class rawType>
	//   19   35:aload_1         
	//   20   36:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   21   39:invokevirtual   #191 <Method boolean Class.isAssignableFrom(Class)>
	//   22   42:ireturn         
		if(type instanceof ParameterizedType)
	//*  23   43:aload_0         
	//*  24   44:getfield        #26  <Field Type type>
	//*  25   47:instanceof      #110 <Class ParameterizedType>
	//*  26   50:ifeq            72
			return isAssignableFrom(type1, (ParameterizedType)type, ((Map) (new HashMap())));
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #26  <Field Type type>
	//   30   58:checkcast       #110 <Class ParameterizedType>
	//   31   61:new             #131 <Class HashMap>
	//   32   64:dup             
	//   33   65:invokespecial   #132 <Method void HashMap()>
	//   34   68:invokestatic    #135 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//   35   71:ireturn         
		if(type instanceof GenericArrayType)
	//*  36   72:aload_0         
	//*  37   73:getfield        #26  <Field Type type>
	//*  38   76:instanceof      #119 <Class GenericArrayType>
	//*  39   79:ifeq            118
		{
			boolean flag = flag1;
	//   40   82:iload_3         
	//   41   83:istore_2        
			if(rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1)))
	//*  42   84:aload_0         
	//*  43   85:getfield        #34  <Field Class rawType>
	//*  44   88:aload_1         
	//*  45   89:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//*  46   92:invokevirtual   #191 <Method boolean Class.isAssignableFrom(Class)>
	//*  47   95:ifeq            116
			{
				flag = flag1;
	//   48   98:iload_3         
	//   49   99:istore_2        
				if(isAssignableFrom(type1, (GenericArrayType)type))
	//*  50  100:aload_1         
	//*  51  101:aload_0         
	//*  52  102:getfield        #26  <Field Type type>
	//*  53  105:checkcast       #119 <Class GenericArrayType>
	//*  54  108:invokestatic    #193 <Method boolean isAssignableFrom(Type, GenericArrayType)>
	//*  55  111:ifeq            116
					flag = true;
	//   56  114:iconst_1        
	//   57  115:istore_2        
			}
			return flag;
	//   58  116:iload_2         
	//   59  117:ireturn         
		} else
		{
			throw buildUnexpectedTypeError(type, new Class[] {
				java/lang/Class, java/lang/reflect/ParameterizedType, java/lang/reflect/GenericArrayType
			});
	//   60  118:aload_0         
	//   61  119:getfield        #26  <Field Type type>
	//   62  122:iconst_3        
	//   63  123:anewarray       Class[]
	//   64  126:dup             
	//   65  127:iconst_0        
	//   66  128:ldc1            #64  <Class Class>
	//   67  130:aastore         
	//   68  131:dup             
	//   69  132:iconst_1        
	//   70  133:ldc1            #110 <Class ParameterizedType>
	//   71  135:aastore         
	//   72  136:dup             
	//   73  137:iconst_2        
	//   74  138:ldc1            #119 <Class GenericArrayType>
	//   75  140:aastore         
	//   76  141:invokestatic    #195 <Method AssertionError buildUnexpectedTypeError(Type, Class[])>
	//   77  144:athrow          
		}
	}

	public final String toString()
	{
		return com.google.gson.internal..Gson.Types.typeToString(type);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Type type>
	//    2    4:invokestatic    #199 <Method String com.google.gson.internal.$Gson$Types.typeToString(Type)>
	//    3    7:areturn         
	}

	final int hashCode;
	final Class rawType;
	final Type type;
}
