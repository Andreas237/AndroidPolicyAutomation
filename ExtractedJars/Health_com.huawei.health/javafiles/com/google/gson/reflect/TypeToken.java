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
	//*  12   18:icmpge          45
			stringbuilder.append(aclass[i].getName()).append(", ");
	//   13   21:aload           4
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokevirtual   #68  <Method String Class.getName()>
	//   18   29:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   19   32:ldc1            #74  <String ", ">
	//   20   34:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             

	//   22   38:iload_2         
	//   23   39:iconst_1        
	//   24   40:iadd            
	//   25   41:istore_2        
	//*  26   42:goto            16
		stringbuilder.append("but got: ").append(((Object) (type1)).getClass().getName()).append(", for type token: ").append(((Object) (type1)).toString()).append('.');
	//   27   45:aload           4
	//   28   47:ldc1            #76  <String "but got: ">
	//   29   49:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   30   52:aload_0         
	//   31   53:invokevirtual   #20  <Method Class Object.getClass()>
	//   32   56:invokevirtual   #68  <Method String Class.getName()>
	//   33   59:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:ldc1            #78  <String ", for type token: ">
	//   35   64:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   36   67:aload_0         
	//   37   68:invokevirtual   #81  <Method String Object.toString()>
	//   38   71:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:bipush          46
	//   40   76:invokevirtual   #84  <Method StringBuilder StringBuilder.append(char)>
	//   41   79:pop             
		return new AssertionError(((Object) (stringbuilder.toString())));
	//   42   80:new             #86  <Class AssertionError>
	//   43   83:dup             
	//   44   84:aload           4
	//   45   86:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   46   89:invokespecial   #90  <Method void AssertionError(Object)>
	//   47   92:areturn         
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

	public static TypeToken getArray(Type type1)
	{
		return new TypeToken(((Type) (com.google.gson.internal..Gson.Types.arrayOf(type1))));
	//    0    0:new             #2   <Class TypeToken>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #104 <Method GenericArrayType com.google.gson.internal.$Gson$Types.arrayOf(Type)>
	//    4    8:invokespecial   #96  <Method void TypeToken(Type)>
	//    5   11:areturn         
	}

	public static transient TypeToken getParameterized(Type type1, Type atype[])
	{
		return new TypeToken(((Type) (com.google.gson.internal..Gson.Types.newParameterizedTypeWithOwner(((Type) (null)), type1, atype))));
	//    0    0:new             #2   <Class TypeToken>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokestatic    #110 <Method ParameterizedType com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(Type, Type, Type[])>
	//    6   10:invokespecial   #96  <Method void TypeToken(Type)>
	//    7   13:areturn         
	}

	static Type getSuperclassTypeParameter(Class class1)
	{
		class1 = ((Class) (class1.getGenericSuperclass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Type Class.getGenericSuperclass()>
	//    2    4:astore_0        
		if(class1 instanceof Class)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #64  <Class Class>
	//*   5    9:ifeq            22
			throw new RuntimeException("Missing type parameter.");
	//    6   12:new             #117 <Class RuntimeException>
	//    7   15:dup             
	//    8   16:ldc1            #119 <String "Missing type parameter.">
	//    9   18:invokespecial   #120 <Method void RuntimeException(String)>
	//   10   21:athrow          
		else
			return com.google.gson.internal..Gson.Types.canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
	//   11   22:aload_0         
	//   12   23:checkcast       #122 <Class ParameterizedType>
	//   13   26:invokeinterface #126 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   14   31:iconst_0        
	//   15   32:aaload          
	//   16   33:invokestatic    #53  <Method Type com.google.gson.internal.$Gson$Types.canonicalize(Type)>
	//   17   36:areturn         
	}

	private static boolean isAssignableFrom(Type type1, GenericArrayType genericarraytype)
	{
		Type type2 = genericarraytype.getGenericComponentType();
	//    0    0:aload_1         
	//    1    1:invokeinterface #134 <Method Type GenericArrayType.getGenericComponentType()>
	//    2    6:astore_2        
		if(type2 instanceof ParameterizedType)
	//*   3    7:aload_2         
	//*   4    8:instanceof      #122 <Class ParameterizedType>
	//*   5   11:ifeq            81
		{
			genericarraytype = ((GenericArrayType) (type1));
	//    6   14:aload_0         
	//    7   15:astore_1        
			if(type1 instanceof GenericArrayType)
	//*   8   16:aload_0         
	//*   9   17:instanceof      #131 <Class GenericArrayType>
	//*  10   20:ifeq            36
				genericarraytype = ((GenericArrayType) (((GenericArrayType)type1).getGenericComponentType()));
	//   11   23:aload_0         
	//   12   24:checkcast       #131 <Class GenericArrayType>
	//   13   27:invokeinterface #134 <Method Type GenericArrayType.getGenericComponentType()>
	//   14   32:astore_1        
			else
	//*  15   33:goto            65
			if(type1 instanceof Class)
	//*  16   36:aload_0         
	//*  17   37:instanceof      #64  <Class Class>
	//*  18   40:ifeq            65
			{
				for(type1 = ((Type) ((Class)type1)); ((Class) (type1)).isArray(); type1 = ((Type) (((Class) (type1)).getComponentType())));
	//   19   43:aload_0         
	//   20   44:checkcast       #64  <Class Class>
	//   21   47:astore_0        
	//   22   48:aload_0         
	//   23   49:invokevirtual   #138 <Method boolean Class.isArray()>
	//   24   52:ifeq            63
	//   25   55:aload_0         
	//   26   56:invokevirtual   #141 <Method Class Class.getComponentType()>
	//   27   59:astore_0        
	//*  28   60:goto            48
				genericarraytype = ((GenericArrayType) (type1));
	//   29   63:aload_0         
	//   30   64:astore_1        
			}
			return isAssignableFrom(((Type) (genericarraytype)), (ParameterizedType)type2, ((Map) (new HashMap())));
	//   31   65:aload_1         
	//   32   66:aload_2         
	//   33   67:checkcast       #122 <Class ParameterizedType>
	//   34   70:new             #143 <Class HashMap>
	//   35   73:dup             
	//   36   74:invokespecial   #144 <Method void HashMap()>
	//   37   77:invokestatic    #147 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
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
		if(type1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(((Object) (parameterizedtype)).equals(((Object) (type1))))
	//*   4    6:aload_1         
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #151 <Method boolean Object.equals(Object)>
	//*   7   11:ifeq            16
			return true;
	//    8   14:iconst_1        
	//    9   15:ireturn         
		Class class1 = com.google.gson.internal..Gson.Types.getRawType(type1);
	//   10   16:aload_0         
	//   11   17:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   12   20:astore          6
		ParameterizedType parameterizedtype1 = null;
	//   13   22:aconst_null     
	//   14   23:astore          5
		if(type1 instanceof ParameterizedType)
	//*  15   25:aload_0         
	//*  16   26:instanceof      #122 <Class ParameterizedType>
	//*  17   29:ifeq            38
			parameterizedtype1 = (ParameterizedType)type1;
	//   18   32:aload_0         
	//   19   33:checkcast       #122 <Class ParameterizedType>
	//   20   36:astore          5
		if(parameterizedtype1 != null)
	//*  21   38:aload           5
	//*  22   40:ifnull          142
		{
			Type atype[] = parameterizedtype1.getActualTypeArguments();
	//   23   43:aload           5
	//   24   45:invokeinterface #126 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   25   50:astore          7
			TypeVariable atypevariable[] = class1.getTypeParameters();
	//   26   52:aload           6
	//   27   54:invokevirtual   #155 <Method TypeVariable[] Class.getTypeParameters()>
	//   28   57:astore          8
			for(int i = 0; i < atype.length; i++)
	//*  29   59:iconst_0        
	//*  30   60:istore_3        
	//*  31   61:iload_3         
	//*  32   62:aload           7
	//*  33   64:arraylength     
	//*  34   65:icmpge          130
			{
				type1 = atype[i];
	//   35   68:aload           7
	//   36   70:iload_3         
	//   37   71:aaload          
	//   38   72:astore_0        
				TypeVariable typevariable = atypevariable[i];
	//   39   73:aload           8
	//   40   75:iload_3         
	//   41   76:aaload          
	//   42   77:astore          9
				for(; type1 instanceof TypeVariable; type1 = (Type)map.get(((Object) (((TypeVariable)type1).getName()))));
	//   43   79:aload_0         
	//   44   80:instanceof      #157 <Class TypeVariable>
	//   45   83:ifeq            108
	//   46   86:aload_2         
	//   47   87:aload_0         
	//   48   88:checkcast       #157 <Class TypeVariable>
	//   49   91:invokeinterface #158 <Method String TypeVariable.getName()>
	//   50   96:invokeinterface #162 <Method Object Map.get(Object)>
	//   51  101:checkcast       #49  <Class Type>
	//   52  104:astore_0        
	//*  53  105:goto            79
				map.put(((Object) (typevariable.getName())), ((Object) (type1)));
	//   54  108:aload_2         
	//   55  109:aload           9
	//   56  111:invokeinterface #158 <Method String TypeVariable.getName()>
	//   57  116:aload_0         
	//   58  117:invokeinterface #166 <Method Object Map.put(Object, Object)>
	//   59  122:pop             
			}

	//   60  123:iload_3         
	//   61  124:iconst_1        
	//   62  125:iadd            
	//   63  126:istore_3        
	//*  64  127:goto            61
			if(typeEquals(parameterizedtype1, parameterizedtype, map))
	//*  65  130:aload           5
	//*  66  132:aload_1         
	//*  67  133:aload_2         
	//*  68  134:invokestatic    #170 <Method boolean typeEquals(ParameterizedType, ParameterizedType, Map)>
	//*  69  137:ifeq            142
				return true;
	//   70  140:iconst_1        
	//   71  141:ireturn         
		}
		type1 = ((Type) (class1.getGenericInterfaces()));
	//   72  142:aload           6
	//   73  144:invokevirtual   #173 <Method Type[] Class.getGenericInterfaces()>
	//   74  147:astore_0        
		int k = type1.length;
	//   75  148:aload_0         
	//   76  149:arraylength     
	//   77  150:istore          4
		for(int j = 0; j < k; j++)
	//*  78  152:iconst_0        
	//*  79  153:istore_3        
	//*  80  154:iload_3         
	//*  81  155:iload           4
	//*  82  157:icmpge          187
			if(isAssignableFrom(((Type) (type1[j])), parameterizedtype, ((Map) (new HashMap(map)))))
	//*  83  160:aload_0         
	//*  84  161:iload_3         
	//*  85  162:aaload          
	//*  86  163:aload_1         
	//*  87  164:new             #143 <Class HashMap>
	//*  88  167:dup             
	//*  89  168:aload_2         
	//*  90  169:invokespecial   #176 <Method void HashMap(Map)>
	//*  91  172:invokestatic    #147 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//*  92  175:ifeq            180
				return true;
	//   93  178:iconst_1        
	//   94  179:ireturn         

	//   95  180:iload_3         
	//   96  181:iconst_1        
	//   97  182:iadd            
	//   98  183:istore_3        
	//*  99  184:goto            154
		return isAssignableFrom(class1.getGenericSuperclass(), parameterizedtype, ((Map) (new HashMap(map))));
	//  100  187:aload           6
	//  101  189:invokevirtual   #115 <Method Type Class.getGenericSuperclass()>
	//  102  192:aload_1         
	//  103  193:new             #143 <Class HashMap>
	//  104  196:dup             
	//  105  197:aload_2         
	//  106  198:invokespecial   #176 <Method void HashMap(Map)>
	//  107  201:invokestatic    #147 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//  108  204:ireturn         
	}

	private static boolean matches(Type type1, Type type2, Map map)
	{
		return ((Object) (type2)).equals(((Object) (type1))) || (type1 instanceof TypeVariable) && ((Object) (type2)).equals(map.get(((Object) (((TypeVariable)type1).getName()))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #151 <Method boolean Object.equals(Object)>
	//    3    5:ifne            37
	//    4    8:aload_0         
	//    5    9:instanceof      #157 <Class TypeVariable>
	//    6   12:ifeq            39
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:checkcast       #157 <Class TypeVariable>
	//   11   21:invokeinterface #158 <Method String TypeVariable.getName()>
	//   12   26:invokeinterface #162 <Method Object Map.get(Object)>
	//   13   31:invokevirtual   #151 <Method boolean Object.equals(Object)>
	//   14   34:ifeq            39
	//   15   37:iconst_1        
	//   16   38:ireturn         
	//   17   39:iconst_0        
	//   18   40:ireturn         
	}

	private static boolean typeEquals(ParameterizedType parameterizedtype, ParameterizedType parameterizedtype1, Map map)
	{
		if(((Object) (parameterizedtype.getRawType())).equals(((Object) (parameterizedtype1.getRawType()))))
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #182 <Method Type ParameterizedType.getRawType()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #182 <Method Type ParameterizedType.getRawType()>
	//*   4   12:invokevirtual   #151 <Method boolean Object.equals(Object)>
	//*   5   15:ifeq            64
		{
			parameterizedtype = ((ParameterizedType) (parameterizedtype.getActualTypeArguments()));
	//    6   18:aload_0         
	//    7   19:invokeinterface #126 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//    8   24:astore_0        
			parameterizedtype1 = ((ParameterizedType) (parameterizedtype1.getActualTypeArguments()));
	//    9   25:aload_1         
	//   10   26:invokeinterface #126 <Method Type[] ParameterizedType.getActualTypeArguments()>
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
	//*  25   47:invokestatic    #184 <Method boolean matches(Type, Type, Map)>
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
	//    8   18:invokestatic    #188 <Method boolean com.google.gson.internal.$Gson$Types.equals(Type, Type)>
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
	//    2    2:invokevirtual   #194 <Method Type getType()>
	//    3    5:invokevirtual   #197 <Method boolean isAssignableFrom(Type)>
	//    4    8:ireturn         
	}

	public boolean isAssignableFrom(Class class1)
	{
		return isAssignableFrom(((Type) (class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #197 <Method boolean isAssignableFrom(Type)>
	//    3    5:ireturn         
	}

	public boolean isAssignableFrom(Type type1)
	{
		if(type1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		if(((Object) (type)).equals(((Object) (type1))))
	//*   4    6:aload_0         
	//*   5    7:getfield        #26  <Field Type type>
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #151 <Method boolean Object.equals(Object)>
	//*   8   14:ifeq            19
			return true;
	//    9   17:iconst_1        
	//   10   18:ireturn         
		if(type instanceof Class)
	//*  11   19:aload_0         
	//*  12   20:getfield        #26  <Field Type type>
	//*  13   23:instanceof      #64  <Class Class>
	//*  14   26:ifeq            41
			return rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1));
	//   15   29:aload_0         
	//   16   30:getfield        #34  <Field Class rawType>
	//   17   33:aload_1         
	//   18   34:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   19   37:invokevirtual   #203 <Method boolean Class.isAssignableFrom(Class)>
	//   20   40:ireturn         
		if(type instanceof ParameterizedType)
	//*  21   41:aload_0         
	//*  22   42:getfield        #26  <Field Type type>
	//*  23   45:instanceof      #122 <Class ParameterizedType>
	//*  24   48:ifeq            70
			return isAssignableFrom(type1, (ParameterizedType)type, ((Map) (new HashMap())));
	//   25   51:aload_1         
	//   26   52:aload_0         
	//   27   53:getfield        #26  <Field Type type>
	//   28   56:checkcast       #122 <Class ParameterizedType>
	//   29   59:new             #143 <Class HashMap>
	//   30   62:dup             
	//   31   63:invokespecial   #144 <Method void HashMap()>
	//   32   66:invokestatic    #147 <Method boolean isAssignableFrom(Type, ParameterizedType, Map)>
	//   33   69:ireturn         
		if(type instanceof GenericArrayType)
	//*  34   70:aload_0         
	//*  35   71:getfield        #26  <Field Type type>
	//*  36   74:instanceof      #131 <Class GenericArrayType>
	//*  37   77:ifeq            112
			return rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1)) && isAssignableFrom(type1, (GenericArrayType)type);
	//   38   80:aload_0         
	//   39   81:getfield        #34  <Field Class rawType>
	//   40   84:aload_1         
	//   41   85:invokestatic    #32  <Method Class com.google.gson.internal.$Gson$Types.getRawType(Type)>
	//   42   88:invokevirtual   #203 <Method boolean Class.isAssignableFrom(Class)>
	//   43   91:ifeq            110
	//   44   94:aload_1         
	//   45   95:aload_0         
	//   46   96:getfield        #26  <Field Type type>
	//   47   99:checkcast       #131 <Class GenericArrayType>
	//   48  102:invokestatic    #205 <Method boolean isAssignableFrom(Type, GenericArrayType)>
	//   49  105:ifeq            110
	//   50  108:iconst_1        
	//   51  109:ireturn         
	//   52  110:iconst_0        
	//   53  111:ireturn         
		else
			throw buildUnexpectedTypeError(type, new Class[] {
				java/lang/Class, java/lang/reflect/ParameterizedType, java/lang/reflect/GenericArrayType
			});
	//   54  112:aload_0         
	//   55  113:getfield        #26  <Field Type type>
	//   56  116:iconst_3        
	//   57  117:anewarray       Class[]
	//   58  120:dup             
	//   59  121:iconst_0        
	//   60  122:ldc1            #64  <Class Class>
	//   61  124:aastore         
	//   62  125:dup             
	//   63  126:iconst_1        
	//   64  127:ldc1            #122 <Class ParameterizedType>
	//   65  129:aastore         
	//   66  130:dup             
	//   67  131:iconst_2        
	//   68  132:ldc1            #131 <Class GenericArrayType>
	//   69  134:aastore         
	//   70  135:invokestatic    #207 <Method AssertionError buildUnexpectedTypeError(Type, Class[])>
	//   71  138:athrow          
	}

	public final String toString()
	{
		return com.google.gson.internal..Gson.Types.typeToString(type);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Type type>
	//    2    4:invokestatic    #211 <Method String com.google.gson.internal.$Gson$Types.typeToString(Type)>
	//    3    7:areturn         
	}

	final int hashCode;
	final Class rawType;
	final Type type;
}
