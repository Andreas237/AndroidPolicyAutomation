// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.util.EnumMap;
import java.util.EnumSet;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeIdResolverBase

public class ClassNameIdResolver extends TypeIdResolverBase
{

	public ClassNameIdResolver(JavaType javatype, TypeFactory typefactory)
	{
		super(javatype, typefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void TypeIdResolverBase(JavaType, TypeFactory)>
	//    4    6:return          
	}

	protected final String _idFrom(Object obj, Class class1)
	{
		Object obj1;
		obj1 = ((Object) (class1));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(((Class) (java/lang/Enum)).isAssignableFrom(class1))
	//*   2    2:ldc1            #13  <Class Enum>
	//*   3    4:aload_2         
	//*   4    5:invokevirtual   #19  <Method boolean Class.isAssignableFrom(Class)>
	//*   5    8:ifeq            25
		{
			obj1 = ((Object) (class1));
	//    6   11:aload_2         
	//    7   12:astore_3        
			if(!class1.isEnum())
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #23  <Method boolean Class.isEnum()>
	//*  10   17:ifne            25
				obj1 = ((Object) (class1.getSuperclass()));
	//   11   20:aload_2         
	//   12   21:invokevirtual   #27  <Method Class Class.getSuperclass()>
	//   13   24:astore_3        
		}
		class1 = ((Class) (((Class) (obj1)).getName()));
	//   14   25:aload_3         
	//   15   26:invokevirtual   #31  <Method String Class.getName()>
	//   16   29:astore_2        
		if(!((String) (class1)).startsWith("java.util")) goto _L2; else goto _L1
	//   17   30:aload_2         
	//   18   31:ldc1            #33  <String "java.util">
	//   19   33:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//   20   36:ifeq            140
_L1:
		if(!(obj instanceof EnumSet)) goto _L4; else goto _L3
	//   21   39:aload_1         
	//   22   40:instanceof      #41  <Class EnumSet>
	//   23   43:ifeq            69
_L3:
		obj = ((Object) (ClassUtil.findEnumType((EnumSet)obj)));
	//   24   46:aload_1         
	//   25   47:checkcast       #41  <Class EnumSet>
	//   26   50:invokestatic    #47  <Method Class ClassUtil.findEnumType(EnumSet)>
	//   27   53:astore_1        
		obj = ((Object) (TypeFactory.defaultInstance().constructCollectionType(java/util/EnumSet, ((Class) (obj))).toCanonical()));
	//   28   54:invokestatic    #53  <Method TypeFactory TypeFactory.defaultInstance()>
	//   29   57:ldc1            #41  <Class EnumSet>
	//   30   59:aload_1         
	//   31   60:invokevirtual   #57  <Method CollectionType TypeFactory.constructCollectionType(Class, Class)>
	//   32   63:invokevirtual   #62  <Method String CollectionType.toCanonical()>
	//   33   66:astore_1        
_L6:
		return ((String) (obj));
	//   34   67:aload_1         
	//   35   68:areturn         
_L4:
		if(obj instanceof EnumMap)
	//*  36   69:aload_1         
	//*  37   70:instanceof      #64  <Class EnumMap>
	//*  38   73:ifeq            99
		{
			obj = ((Object) (ClassUtil.findEnumType((EnumMap)obj)));
	//   39   76:aload_1         
	//   40   77:checkcast       #64  <Class EnumMap>
	//   41   80:invokestatic    #67  <Method Class ClassUtil.findEnumType(EnumMap)>
	//   42   83:astore_1        
			return TypeFactory.defaultInstance().constructMapType(java/util/EnumMap, ((Class) (obj)), java/lang/Object).toCanonical();
	//   43   84:invokestatic    #53  <Method TypeFactory TypeFactory.defaultInstance()>
	//   44   87:ldc1            #64  <Class EnumMap>
	//   45   89:aload_1         
	//   46   90:ldc1            #69  <Class Object>
	//   47   92:invokevirtual   #73  <Method MapType TypeFactory.constructMapType(Class, Class, Class)>
	//   48   95:invokevirtual   #76  <Method String MapType.toCanonical()>
	//   49   98:areturn         
		}
		obj1 = ((Object) (((String) (class1)).substring(9)));
	//   50   99:aload_2         
	//   51  100:bipush          9
	//   52  102:invokevirtual   #80  <Method String String.substring(int)>
	//   53  105:astore_3        
		if(((String) (obj1)).startsWith(".Arrays$"))
			break; /* Loop/switch isn't completed */
	//   54  106:aload_3         
	//   55  107:ldc1            #82  <String ".Arrays$">
	//   56  109:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//   57  112:ifne            126
		obj = ((Object) (class1));
	//   58  115:aload_2         
	//   59  116:astore_1        
		if(!((String) (obj1)).startsWith(".Collections$")) goto _L6; else goto _L5
	//   60  117:aload_3         
	//   61  118:ldc1            #84  <String ".Collections$">
	//   62  120:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//   63  123:ifeq            67
_L5:
		obj = ((Object) (class1));
	//   64  126:aload_2         
	//   65  127:astore_1        
		if(((String) (class1)).indexOf("List") >= 0)
	//*  66  128:aload_2         
	//*  67  129:ldc1            #86  <String "List">
	//*  68  131:invokevirtual   #90  <Method int String.indexOf(String)>
	//*  69  134:iflt            67
			return "java.util.ArrayList";
	//   70  137:ldc1            #92  <String "java.util.ArrayList">
	//   71  139:areturn         
		continue; /* Loop/switch isn't completed */
_L2:
		obj = ((Object) (class1));
	//   72  140:aload_2         
	//   73  141:astore_1        
		if(((String) (class1)).indexOf('$') >= 0)
	//*  74  142:aload_2         
	//*  75  143:bipush          36
	//*  76  145:invokevirtual   #95  <Method int String.indexOf(int)>
	//*  77  148:iflt            67
		{
			obj = ((Object) (class1));
	//   78  151:aload_2         
	//   79  152:astore_1        
			if(ClassUtil.getOuterClass(((Class) (obj1))) != null)
	//*  80  153:aload_3         
	//*  81  154:invokestatic    #99  <Method Class ClassUtil.getOuterClass(Class)>
	//*  82  157:ifnull          67
			{
				obj = ((Object) (class1));
	//   83  160:aload_2         
	//   84  161:astore_1        
				if(ClassUtil.getOuterClass(_baseType.getRawClass()) == null)
	//*  85  162:aload_0         
	//*  86  163:getfield        #103 <Field JavaType _baseType>
	//*  87  166:invokevirtual   #108 <Method Class JavaType.getRawClass()>
	//*  88  169:invokestatic    #99  <Method Class ClassUtil.getOuterClass(Class)>
	//*  89  172:ifnonnull       67
					return _baseType.getRawClass().getName();
	//   90  175:aload_0         
	//   91  176:getfield        #103 <Field JavaType _baseType>
	//   92  179:invokevirtual   #108 <Method Class JavaType.getRawClass()>
	//   93  182:invokevirtual   #31  <Method String Class.getName()>
	//   94  185:areturn         
			}
		}
		if(true) goto _L6; else goto _L7
_L7:
	}

	protected JavaType _typeFromId(String s, TypeFactory typefactory)
	{
		if(s.indexOf('<') > 0)
	//*   0    0:aload_1         
	//*   1    1:bipush          60
	//*   2    3:invokevirtual   #95  <Method int String.indexOf(int)>
	//*   3    6:ifle            15
			return typefactory.constructFromCanonical(s);
	//    4    9:aload_2         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #120 <Method JavaType TypeFactory.constructFromCanonical(String)>
	//    7   14:areturn         
		try
		{
			Class class1 = typefactory.findClass(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #124 <Method Class TypeFactory.findClass(String)>
	//   11   20:astore_3        
			typefactory = ((TypeFactory) (typefactory.constructSpecializedType(_baseType, class1)));
	//   12   21:aload_2         
	//   13   22:aload_0         
	//   14   23:getfield        #103 <Field JavaType _baseType>
	//   15   26:aload_3         
	//   16   27:invokevirtual   #128 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   17   30:astore_2        
		}
	//*  18   31:aload_2         
	//*  19   32:areturn         
		// Misplaced declaration of an exception variable
		catch(TypeFactory typefactory)
	//*  20   33:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid type id '").append(s).append("' (for id type 'Id.class'): no such class found").toString());
	//   21   34:new             #130 <Class IllegalArgumentException>
	//   22   37:dup             
	//   23   38:new             #132 <Class StringBuilder>
	//   24   41:dup             
	//   25   42:invokespecial   #135 <Method void StringBuilder()>
	//   26   45:ldc1            #137 <String "Invalid type id '">
	//   27   47:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   28   50:aload_1         
	//   29   51:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   30   54:ldc1            #143 <String "' (for id type 'Id.class'): no such class found">
	//   31   56:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   32   59:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   33   62:invokespecial   #149 <Method void IllegalArgumentException(String)>
	//   34   65:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(TypeFactory typefactory)
	//*  35   66:astore_2        
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Invalid type id '").append(s).append("' (for id type 'Id.class'): ").append(((Exception) (typefactory)).getMessage()).toString(), ((Throwable) (typefactory)));
	//   36   67:new             #130 <Class IllegalArgumentException>
	//   37   70:dup             
	//   38   71:new             #132 <Class StringBuilder>
	//   39   74:dup             
	//   40   75:invokespecial   #135 <Method void StringBuilder()>
	//   41   78:ldc1            #137 <String "Invalid type id '">
	//   42   80:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   43   83:aload_1         
	//   44   84:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   45   87:ldc1            #151 <String "' (for id type 'Id.class'): ">
	//   46   89:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   47   92:aload_2         
	//   48   93:invokevirtual   #154 <Method String Exception.getMessage()>
	//   49   96:invokevirtual   #141 <Method StringBuilder StringBuilder.append(String)>
	//   50   99:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   51  102:aload_2         
	//   52  103:invokespecial   #157 <Method void IllegalArgumentException(String, Throwable)>
	//   53  106:athrow          
		}
		return ((JavaType) (typefactory));
	}

	public String getDescForKnownTypeIds()
	{
		return "class name used as type id";
	//    0    0:ldc1            #160 <String "class name used as type id">
	//    1    2:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS;
	//    0    0:getstatic       #168 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
	//    1    3:areturn         
	}

	public String idFromValue(Object obj)
	{
		return _idFrom(obj, obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #173 <Method Class Object.getClass()>
	//    4    6:invokevirtual   #175 <Method String _idFrom(Object, Class)>
	//    5    9:areturn         
	}

	public String idFromValueAndType(Object obj, Class class1)
	{
		return _idFrom(obj, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #175 <Method String _idFrom(Object, Class)>
	//    4    6:areturn         
	}

	public void registerSubtype(Class class1, String s)
	{
	//    0    0:return          
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
	{
		return _typeFromId(s, databindcontext.getTypeFactory());
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #186 <Method TypeFactory DatabindContext.getTypeFactory()>
	//    4    6:invokevirtual   #188 <Method JavaType _typeFromId(String, TypeFactory)>
	//    5    9:areturn         
	}

	public JavaType typeFromId(String s)
	{
		return _typeFromId(s, _typeFactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #193 <Field TypeFactory _typeFactory>
	//    4    6:invokevirtual   #188 <Method JavaType _typeFromId(String, TypeFactory)>
	//    5    9:areturn         
	}
}
