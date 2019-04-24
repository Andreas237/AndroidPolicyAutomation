// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.*;
import java.io.Serializable;
import java.lang.reflect.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.type:
//			TypeBindings, SimpleType, TypeParser, CollectionType, 
//			MapType, ReferenceType, TypeModifier, ArrayType, 
//			ClassStack, ResolvedRecursiveType, CollectionLikeType, MapLikeType

public final class TypeFactory
	implements Serializable
{

	private TypeFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
		_typeCache = new LRUMap(16, 100);
	//    2    4:aload_0         
	//    3    5:new             #123 <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:bipush          100
	//    7   13:invokespecial   #126 <Method void LRUMap(int, int)>
	//    8   16:putfield        #128 <Field LRUMap _typeCache>
		_parser = new TypeParser(this);
	//    9   19:aload_0         
	//   10   20:new             #130 <Class TypeParser>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #133 <Method void TypeParser(TypeFactory)>
	//   14   28:putfield        #135 <Field TypeParser _parser>
		_modifiers = null;
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:putfield        #137 <Field TypeModifier[] _modifiers>
		_classLoader = null;
	//   18   36:aload_0         
	//   19   37:aconst_null     
	//   20   38:putfield        #139 <Field ClassLoader _classLoader>
	//   21   41:return          
	}

	protected TypeFactory(TypeParser typeparser, TypeModifier atypemodifier[])
	{
		this(typeparser, atypemodifier, ((ClassLoader) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #143 <Method void TypeFactory(TypeParser, TypeModifier[], ClassLoader)>
	//    5    7:return          
	}

	protected TypeFactory(TypeParser typeparser, TypeModifier atypemodifier[], ClassLoader classloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void Object()>
		_typeCache = new LRUMap(16, 100);
	//    2    4:aload_0         
	//    3    5:new             #123 <Class LRUMap>
	//    4    8:dup             
	//    5    9:bipush          16
	//    6   11:bipush          100
	//    7   13:invokespecial   #126 <Method void LRUMap(int, int)>
	//    8   16:putfield        #128 <Field LRUMap _typeCache>
		_parser = typeparser.withFactory(this);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #147 <Method TypeParser TypeParser.withFactory(TypeFactory)>
	//   13   25:putfield        #135 <Field TypeParser _parser>
		_modifiers = atypemodifier;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #137 <Field TypeModifier[] _modifiers>
		_classLoader = classloader;
	//   17   33:aload_0         
	//   18   34:aload_3         
	//   19   35:putfield        #139 <Field ClassLoader _classLoader>
	//   20   38:return          
	}

	private JavaType _collectionType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		Object obj = ((Object) (typebindings.getTypeParameters()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #153 <Method List TypeBindings.getTypeParameters()>
	//    2    4:astore          5
		if(((List) (obj)).isEmpty())
	//*   3    6:aload           5
	//*   4    8:invokeinterface #159 <Method boolean List.isEmpty()>
	//*   5   13:ifeq            33
			obj = ((Object) (_unknownType()));
	//    6   16:aload_0         
	//    7   17:invokevirtual   #163 <Method JavaType _unknownType()>
	//    8   20:astore          5
		else
	//*   9   22:aload_1         
	//*  10   23:aload_2         
	//*  11   24:aload_3         
	//*  12   25:aload           4
	//*  13   27:aload           5
	//*  14   29:invokestatic    #169 <Method CollectionType CollectionType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType)>
	//*  15   32:areturn         
		if(((List) (obj)).size() == 1)
	//*  16   33:aload           5
	//*  17   35:invokeinterface #173 <Method int List.size()>
	//*  18   40:iconst_1        
	//*  19   41:icmpne          60
			obj = ((Object) ((JavaType)((List) (obj)).get(0)));
	//   20   44:aload           5
	//   21   46:iconst_0        
	//   22   47:invokeinterface #177 <Method Object List.get(int)>
	//   23   52:checkcast       #48  <Class JavaType>
	//   24   55:astore          5
		else
	//*  25   57:goto            22
			throw new IllegalArgumentException((new StringBuilder()).append("Strange Collection type ").append(class1.getName()).append(": can not determine type parameters").toString());
	//   26   60:new             #179 <Class IllegalArgumentException>
	//   27   63:dup             
	//   28   64:new             #181 <Class StringBuilder>
	//   29   67:dup             
	//   30   68:invokespecial   #182 <Method void StringBuilder()>
	//   31   71:ldc1            #184 <String "Strange Collection type ">
	//   32   73:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:aload_1         
	//   34   77:invokevirtual   #192 <Method String Class.getName()>
	//   35   80:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   36   83:ldc1            #194 <String ": can not determine type parameters">
	//   37   85:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   38   88:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   39   91:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   40   94:athrow          
		return ((JavaType) (CollectionType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)))));
	}

	private JavaType _mapType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		if(class1 != java/util/Properties) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ldc1            #205 <Class Properties>
	//    2    3:if_acmpne       28
_L1:
		Object obj;
		Object obj1;
		obj1 = ((Object) (CORE_TYPE_STRING));
	//    3    6:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//    4    9:astore          6
		obj = obj1;
	//    5   11:aload           6
	//    6   13:astore          5
_L4:
		return ((JavaType) (MapType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)), ((JavaType) (obj1)))));
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:aload           5
	//   12   22:aload           6
	//   13   24:invokestatic    #210 <Method MapType MapType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType)>
	//   14   27:areturn         
_L2:
		obj1 = ((Object) (typebindings.getTypeParameters()));
	//   15   28:aload_2         
	//   16   29:invokevirtual   #153 <Method List TypeBindings.getTypeParameters()>
	//   17   32:astore          6
		switch(((List) (obj1)).size())
	//*  18   34:aload           6
	//*  19   36:invokeinterface #173 <Method int List.size()>
		{
	//*  20   41:tableswitch     0 2: default 68
	//	               0 103
	//	               1 68
	//	               2 116
		case 1: // '\001'
		default:
			throw new IllegalArgumentException((new StringBuilder()).append("Strange Map type ").append(class1.getName()).append(": can not determine type parameters").toString());
	//   21   68:new             #179 <Class IllegalArgumentException>
	//   22   71:dup             
	//   23   72:new             #181 <Class StringBuilder>
	//   24   75:dup             
	//   25   76:invokespecial   #182 <Method void StringBuilder()>
	//   26   79:ldc1            #212 <String "Strange Map type ">
	//   27   81:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   28   84:aload_1         
	//   29   85:invokevirtual   #192 <Method String Class.getName()>
	//   30   88:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   31   91:ldc1            #194 <String ": can not determine type parameters">
	//   32   93:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   33   96:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   34   99:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   35  102:athrow          

		case 0: // '\0'
			obj1 = ((Object) (_unknownType()));
	//   36  103:aload_0         
	//   37  104:invokevirtual   #163 <Method JavaType _unknownType()>
	//   38  107:astore          6
			obj = obj1;
	//   39  109:aload           6
	//   40  111:astore          5
			break;

	//*  41  113:goto            15
		case 2: // '\002'
			obj = ((Object) ((JavaType)((List) (obj1)).get(0)));
	//   42  116:aload           6
	//   43  118:iconst_0        
	//   44  119:invokeinterface #177 <Method Object List.get(int)>
	//   45  124:checkcast       #48  <Class JavaType>
	//   46  127:astore          5
			obj1 = ((Object) ((JavaType)((List) (obj1)).get(1)));
	//   47  129:aload           6
	//   48  131:iconst_1        
	//   49  132:invokeinterface #177 <Method Object List.get(int)>
	//   50  137:checkcast       #48  <Class JavaType>
	//   51  140:astore          6
			break;
		}
		if(true) goto _L4; else goto _L3
_L3:
	//*  52  142:goto            15
	}

	private JavaType _referenceType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		Object obj = ((Object) (typebindings.getTypeParameters()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #153 <Method List TypeBindings.getTypeParameters()>
	//    2    4:astore          5
		if(((List) (obj)).isEmpty())
	//*   3    6:aload           5
	//*   4    8:invokeinterface #159 <Method boolean List.isEmpty()>
	//*   5   13:ifeq            33
			obj = ((Object) (_unknownType()));
	//    6   16:aload_0         
	//    7   17:invokevirtual   #163 <Method JavaType _unknownType()>
	//    8   20:astore          5
		else
	//*   9   22:aload_1         
	//*  10   23:aload_2         
	//*  11   24:aload_3         
	//*  12   25:aload           4
	//*  13   27:aload           5
	//*  14   29:invokestatic    #218 <Method ReferenceType ReferenceType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType)>
	//*  15   32:areturn         
		if(((List) (obj)).size() == 1)
	//*  16   33:aload           5
	//*  17   35:invokeinterface #173 <Method int List.size()>
	//*  18   40:iconst_1        
	//*  19   41:icmpne          60
			obj = ((Object) ((JavaType)((List) (obj)).get(0)));
	//   20   44:aload           5
	//   21   46:iconst_0        
	//   22   47:invokeinterface #177 <Method Object List.get(int)>
	//   23   52:checkcast       #48  <Class JavaType>
	//   24   55:astore          5
		else
	//*  25   57:goto            22
			throw new IllegalArgumentException((new StringBuilder()).append("Strange Reference type ").append(class1.getName()).append(": can not determine type parameters").toString());
	//   26   60:new             #179 <Class IllegalArgumentException>
	//   27   63:dup             
	//   28   64:new             #181 <Class StringBuilder>
	//   29   67:dup             
	//   30   68:invokespecial   #182 <Method void StringBuilder()>
	//   31   71:ldc1            #220 <String "Strange Reference type ">
	//   32   73:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   33   76:aload_1         
	//   34   77:invokevirtual   #192 <Method String Class.getName()>
	//   35   80:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   36   83:ldc1            #194 <String ": can not determine type parameters">
	//   37   85:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//   38   88:invokevirtual   #197 <Method String StringBuilder.toString()>
	//   39   91:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   40   94:athrow          
		return ((JavaType) (ReferenceType.construct(class1, typebindings, javatype, ajavatype, ((JavaType) (obj)))));
	}

	public static TypeFactory defaultInstance()
	{
		return instance;
	//    0    0:getstatic       #55  <Field TypeFactory instance>
	//    1    3:areturn         
	}

	public static Class rawClass(Type type)
	{
		if(type instanceof Class)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #75  <Class Class>
	//*   2    4:ifeq            12
			return (Class)type;
	//    3    7:aload_0         
	//    4    8:checkcast       #75  <Class Class>
	//    5   11:areturn         
		else
			return defaultInstance().constructType(type).getRawClass();
	//    6   12:invokestatic    #226 <Method TypeFactory defaultInstance()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #230 <Method JavaType constructType(Type)>
	//    9   19:invokevirtual   #234 <Method Class JavaType.getRawClass()>
	//   10   22:areturn         
	}

	public static JavaType unknownType()
	{
		return defaultInstance()._unknownType();
	//    0    0:invokestatic    #226 <Method TypeFactory defaultInstance()>
	//    1    3:invokevirtual   #163 <Method JavaType _unknownType()>
	//    2    6:areturn         
	}

	protected JavaType _constructSimple(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		if(typebindings.isEmpty())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #238 <Method boolean TypeBindings.isEmpty()>
	//*   2    4:ifeq            22
		{
			JavaType javatype1 = _findWellKnownSimple(class1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #242 <Method JavaType _findWellKnownSimple(Class)>
	//    6   12:astore          5
			if(javatype1 != null)
	//*   7   14:aload           5
	//*   8   16:ifnull          22
				return javatype1;
	//    9   19:aload           5
	//   10   21:areturn         
		}
		return _newSimpleType(class1, typebindings, javatype, ajavatype);
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:aload_2         
	//   14   25:aload_3         
	//   15   26:aload           4
	//   16   28:invokevirtual   #245 <Method JavaType _newSimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//   17   31:areturn         
	}

	protected Class _findPrimitive(String s)
	{
		if("int".equals(((Object) (s))))
	//*   0    0:ldc1            #249 <String "int">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            13
			return Integer.TYPE;
	//    4    9:getstatic       #91  <Field Class Integer.TYPE>
	//    5   12:areturn         
		if("long".equals(((Object) (s))))
	//*   6   13:ldc1            #255 <String "long">
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*   9   19:ifeq            26
			return Long.TYPE;
	//   10   22:getstatic       #96  <Field Class Long.TYPE>
	//   11   25:areturn         
		if("float".equals(((Object) (s))))
	//*  12   26:ldc2            #257 <String "float">
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  15   33:ifeq            40
			return Float.TYPE;
	//   16   36:getstatic       #260 <Field Class Float.TYPE>
	//   17   39:areturn         
		if("double".equals(((Object) (s))))
	//*  18   40:ldc2            #262 <String "double">
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  21   47:ifeq            54
			return Double.TYPE;
	//   22   50:getstatic       #265 <Field Class Double.TYPE>
	//   23   53:areturn         
		if("boolean".equals(((Object) (s))))
	//*  24   54:ldc2            #267 <String "boolean">
	//*  25   57:aload_1         
	//*  26   58:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  27   61:ifeq            68
			return Boolean.TYPE;
	//   28   64:getstatic       #86  <Field Class Boolean.TYPE>
	//   29   67:areturn         
		if("byte".equals(((Object) (s))))
	//*  30   68:ldc2            #269 <String "byte">
	//*  31   71:aload_1         
	//*  32   72:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  33   75:ifeq            82
			return Byte.TYPE;
	//   34   78:getstatic       #272 <Field Class Byte.TYPE>
	//   35   81:areturn         
		if("char".equals(((Object) (s))))
	//*  36   82:ldc2            #274 <String "char">
	//*  37   85:aload_1         
	//*  38   86:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  39   89:ifeq            96
			return Character.TYPE;
	//   40   92:getstatic       #277 <Field Class Character.TYPE>
	//   41   95:areturn         
		if("short".equals(((Object) (s))))
	//*  42   96:ldc2            #279 <String "short">
	//*  43   99:aload_1         
	//*  44  100:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  45  103:ifeq            110
			return Short.TYPE;
	//   46  106:getstatic       #282 <Field Class Short.TYPE>
	//   47  109:areturn         
		if("void".equals(((Object) (s))))
	//*  48  110:ldc2            #284 <String "void">
	//*  49  113:aload_1         
	//*  50  114:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  51  117:ifeq            124
			return Void.TYPE;
	//   52  120:getstatic       #287 <Field Class Void.TYPE>
	//   53  123:areturn         
		else
			return null;
	//   54  124:aconst_null     
	//   55  125:areturn         
	}

	protected JavaType _findWellKnownSimple(Class class1)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #291 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            40
		{
			if(class1 == CLS_BOOL)
	//*   3    7:aload_1         
	//*   4    8:getstatic       #88  <Field Class CLS_BOOL>
	//*   5   11:if_acmpne       18
				return ((JavaType) (CORE_TYPE_BOOL));
	//    6   14:getstatic       #105 <Field SimpleType CORE_TYPE_BOOL>
	//    7   17:areturn         
			if(class1 == CLS_INT)
	//*   8   18:aload_1         
	//*   9   19:getstatic       #93  <Field Class CLS_INT>
	//*  10   22:if_acmpne       29
				return ((JavaType) (CORE_TYPE_INT));
	//   11   25:getstatic       #107 <Field SimpleType CORE_TYPE_INT>
	//   12   28:areturn         
			if(class1 == CLS_LONG)
	//*  13   29:aload_1         
	//*  14   30:getstatic       #98  <Field Class CLS_LONG>
	//*  15   33:if_acmpne       62
				return ((JavaType) (CORE_TYPE_LONG));
	//   16   36:getstatic       #109 <Field SimpleType CORE_TYPE_LONG>
	//   17   39:areturn         
		} else
		{
			if(class1 == CLS_STRING)
	//*  18   40:aload_1         
	//*  19   41:getstatic       #67  <Field Class CLS_STRING>
	//*  20   44:if_acmpne       51
				return ((JavaType) (CORE_TYPE_STRING));
	//   21   47:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//   22   50:areturn         
			if(class1 == CLS_OBJECT)
	//*  23   51:aload_1         
	//*  24   52:getstatic       #69  <Field Class CLS_OBJECT>
	//*  25   55:if_acmpne       62
				return ((JavaType) (CORE_TYPE_OBJECT));
	//   26   58:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//   27   61:areturn         
		}
		return null;
	//   28   62:aconst_null     
	//   29   63:areturn         
	}

	protected JavaType _fromAny(ClassStack classstack, Type type, TypeBindings typebindings)
	{
		if(type instanceof Class)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #75  <Class Class>
	//*   2    4:ifeq            133
			classstack = ((ClassStack) (_fromClass(classstack, (Class)type, EMPTY_BINDINGS)));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:checkcast       #75  <Class Class>
	//    7   13:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    8   16:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    9   19:astore_1        
		else
	//*  10   20:aload_1         
	//*  11   21:astore          6
	//*  12   23:aload_0         
	//*  13   24:getfield        #137 <Field TypeModifier[] _modifiers>
	//*  14   27:ifnull          287
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #301 <Method TypeBindings JavaType.getBindings()>
	//*  17   34:astore          6
	//*  18   36:aload           6
	//*  19   38:astore_3        
	//*  20   39:aload           6
	//*  21   41:ifnonnull       48
	//*  22   44:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//*  23   47:astore_3        
	//*  24   48:aload_0         
	//*  25   49:getfield        #137 <Field TypeModifier[] _modifiers>
	//*  26   52:astore          7
	//*  27   54:aload           7
	//*  28   56:arraylength     
	//*  29   57:istore          5
	//*  30   59:iconst_0        
	//*  31   60:istore          4
	//*  32   62:aload_1         
	//*  33   63:astore          6
	//*  34   65:iload           4
	//*  35   67:iload           5
	//*  36   69:icmpge          287
	//*  37   72:aload           7
	//*  38   74:iload           4
	//*  39   76:aaload          
	//*  40   77:astore          8
	//*  41   79:aload           8
	//*  42   81:aload_1         
	//*  43   82:aload_2         
	//*  44   83:aload_3         
	//*  45   84:aload_0         
	//*  46   85:invokevirtual   #307 <Method JavaType TypeModifier.modifyType(JavaType, Type, TypeBindings, TypeFactory)>
	//*  47   88:astore          6
	//*  48   90:aload           6
	//*  49   92:ifnonnull       275
	//*  50   95:new             #309 <Class IllegalStateException>
	//*  51   98:dup             
	//*  52   99:ldc2            #311 <String "TypeModifier %s (of type %s) return null for type %s">
	//*  53  102:iconst_3        
	//*  54  103:anewarray       Object[]
	//*  55  106:dup             
	//*  56  107:iconst_0        
	//*  57  108:aload           8
	//*  58  110:aastore         
	//*  59  111:dup             
	//*  60  112:iconst_1        
	//*  61  113:aload           8
	//*  62  115:invokevirtual   #314 <Method Class Object.getClass()>
	//*  63  118:invokevirtual   #192 <Method String Class.getName()>
	//*  64  121:aastore         
	//*  65  122:dup             
	//*  66  123:iconst_2        
	//*  67  124:aload_1         
	//*  68  125:aastore         
	//*  69  126:invokestatic    #318 <Method String String.format(String, Object[])>
	//*  70  129:invokespecial   #319 <Method void IllegalStateException(String)>
	//*  71  132:athrow          
		if(type instanceof ParameterizedType)
	//*  72  133:aload_2         
	//*  73  134:instanceof      #321 <Class ParameterizedType>
	//*  74  137:ifeq            154
		{
			classstack = ((ClassStack) (_fromParamType(classstack, (ParameterizedType)type, typebindings)));
	//   75  140:aload_0         
	//   76  141:aload_1         
	//   77  142:aload_2         
	//   78  143:checkcast       #321 <Class ParameterizedType>
	//   79  146:aload_3         
	//   80  147:invokevirtual   #325 <Method JavaType _fromParamType(ClassStack, ParameterizedType, TypeBindings)>
	//   81  150:astore_1        
		} else
	//*  82  151:goto            20
		{
			if(type instanceof JavaType)
	//*  83  154:aload_2         
	//*  84  155:instanceof      #48  <Class JavaType>
	//*  85  158:ifeq            166
				return (JavaType)type;
	//   86  161:aload_2         
	//   87  162:checkcast       #48  <Class JavaType>
	//   88  165:areturn         
			if(type instanceof GenericArrayType)
	//*  89  166:aload_2         
	//*  90  167:instanceof      #327 <Class GenericArrayType>
	//*  91  170:ifeq            187
				classstack = ((ClassStack) (_fromArrayType(classstack, (GenericArrayType)type, typebindings)));
	//   92  173:aload_0         
	//   93  174:aload_1         
	//   94  175:aload_2         
	//   95  176:checkcast       #327 <Class GenericArrayType>
	//   96  179:aload_3         
	//   97  180:invokevirtual   #331 <Method JavaType _fromArrayType(ClassStack, GenericArrayType, TypeBindings)>
	//   98  183:astore_1        
			else
	//*  99  184:goto            20
			if(type instanceof TypeVariable)
	//* 100  187:aload_2         
	//* 101  188:instanceof      #333 <Class TypeVariable>
	//* 102  191:ifeq            208
				classstack = ((ClassStack) (_fromVariable(classstack, (TypeVariable)type, typebindings)));
	//  103  194:aload_0         
	//  104  195:aload_1         
	//  105  196:aload_2         
	//  106  197:checkcast       #333 <Class TypeVariable>
	//  107  200:aload_3         
	//  108  201:invokevirtual   #337 <Method JavaType _fromVariable(ClassStack, TypeVariable, TypeBindings)>
	//  109  204:astore_1        
			else
	//* 110  205:goto            20
			if(type instanceof WildcardType)
	//* 111  208:aload_2         
	//* 112  209:instanceof      #339 <Class WildcardType>
	//* 113  212:ifeq            229
			{
				classstack = ((ClassStack) (_fromWildcard(classstack, (WildcardType)type, typebindings)));
	//  114  215:aload_0         
	//  115  216:aload_1         
	//  116  217:aload_2         
	//  117  218:checkcast       #339 <Class WildcardType>
	//  118  221:aload_3         
	//  119  222:invokevirtual   #343 <Method JavaType _fromWildcard(ClassStack, WildcardType, TypeBindings)>
	//  120  225:astore_1        
			} else
	//* 121  226:goto            20
			{
				typebindings = ((TypeBindings) ((new StringBuilder()).append("Unrecognized Type: ")));
	//  122  229:new             #181 <Class StringBuilder>
	//  123  232:dup             
	//  124  233:invokespecial   #182 <Method void StringBuilder()>
	//  125  236:ldc2            #345 <String "Unrecognized Type: ">
	//  126  239:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//  127  242:astore_3        
				if(type == null)
	//* 128  243:aload_2         
	//* 129  244:ifnonnull       267
					classstack = "[null]";
	//  130  247:ldc2            #347 <String "[null]">
	//  131  250:astore_1        
				else
	//* 132  251:new             #179 <Class IllegalArgumentException>
	//* 133  254:dup             
	//* 134  255:aload_3         
	//* 135  256:aload_1         
	//* 136  257:invokevirtual   #188 <Method StringBuilder StringBuilder.append(String)>
	//* 137  260:invokevirtual   #197 <Method String StringBuilder.toString()>
	//* 138  263:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//* 139  266:athrow          
					classstack = ((ClassStack) (((Object) (type)).toString()));
	//  140  267:aload_2         
	//  141  268:invokevirtual   #348 <Method String Object.toString()>
	//  142  271:astore_1        
				throw new IllegalArgumentException(((StringBuilder) (typebindings)).append(((String) (classstack))).toString());
			}
		}
		do
		{
			Object obj = ((Object) (classstack));
			if(_modifiers != null)
			{
				obj = ((Object) (((JavaType) (classstack)).getBindings()));
				typebindings = ((TypeBindings) (obj));
				if(obj == null)
					typebindings = EMPTY_BINDINGS;
				TypeModifier atypemodifier[] = _modifiers;
				int j = atypemodifier.length;
				int i = 0;
				do
				{
					obj = ((Object) (classstack));
					if(i >= j)
						break;
					TypeModifier typemodifier = atypemodifier[i];
					obj = ((Object) (typemodifier.modifyType(((JavaType) (classstack)), type, typebindings, this)));
					if(obj == null)
						throw new IllegalStateException(String.format("TypeModifier %s (of type %s) return null for type %s", new Object[] {
							typemodifier, ((Object) (typemodifier)).getClass().getName(), classstack
						}));
	//* 143  272:goto            251
					classstack = ((ClassStack) (obj));
	//  144  275:aload           6
	//  145  277:astore_1        
					i++;
	//  146  278:iload           4
	//  147  280:iconst_1        
	//  148  281:iadd            
	//  149  282:istore          4
				} while(true);
	//  150  284:goto            62
			}
			return ((JavaType) (obj));
	//  151  287:aload           6
	//  152  289:areturn         
		} while(true);
	}

	protected JavaType _fromArrayType(ClassStack classstack, GenericArrayType genericarraytype, TypeBindings typebindings)
	{
		return ((JavaType) (ArrayType.construct(_fromAny(classstack, genericarraytype.getGenericComponentType(), typebindings), typebindings)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #352 <Method Type GenericArrayType.getGenericComponentType()>
	//    4    8:aload_3         
	//    5    9:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    6   12:aload_3         
	//    7   13:invokestatic    #359 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//    8   16:areturn         
	}

	protected JavaType _fromClass(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		Object obj;
		ClassStack classstack1;
		obj = ((Object) (_findWellKnownSimple(class1)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #242 <Method JavaType _findWellKnownSimple(Class)>
	//    3    5:astore          5
		if(obj != null)
	//*   4    7:aload           5
	//*   5    9:ifnull          15
			return ((JavaType) (obj));
	//    6   12:aload           5
	//    7   14:areturn         
		boolean flag;
		if(typebindings == null || typebindings.isEmpty())
	//*   8   15:aload_3         
	//*   9   16:ifnull          26
	//*  10   19:aload_3         
	//*  11   20:invokevirtual   #238 <Method boolean TypeBindings.isEmpty()>
	//*  12   23:ifeq            59
			flag = true;
	//   13   26:iconst_1        
	//   14   27:istore          4
		else
	//*  15   29:iload           4
	//*  16   31:ifeq            65
	//*  17   34:aload_0         
	//*  18   35:getfield        #128 <Field LRUMap _typeCache>
	//*  19   38:aload_2         
	//*  20   39:invokevirtual   #362 <Method Object LRUMap.get(Object)>
	//*  21   42:checkcast       #48  <Class JavaType>
	//*  22   45:astore          6
	//*  23   47:aload           6
	//*  24   49:astore          5
	//*  25   51:aload           6
	//*  26   53:ifnull          65
	//*  27   56:aload           6
	//*  28   58:areturn         
			flag = false;
	//   29   59:iconst_0        
	//   30   60:istore          4
		if(flag)
		{
			JavaType javatype = (JavaType)_typeCache.get(((Object) (class1)));
			obj = ((Object) (javatype));
			if(javatype != null)
				return javatype;
		}
	//*  31   62:goto            29
		if(classstack == null)
	//*  32   65:aload_1         
	//*  33   66:ifnonnull       125
		{
			classstack1 = new ClassStack(class1);
	//   34   69:new             #364 <Class ClassStack>
	//   35   72:dup             
	//   36   73:aload_2         
	//   37   74:invokespecial   #365 <Method void ClassStack(Class)>
	//   38   77:astore          6
		} else
	//*  39   79:aload_2         
	//*  40   80:invokevirtual   #368 <Method boolean Class.isArray()>
	//*  41   83:ifeq            167
	//*  42   86:aload_0         
	//*  43   87:aload           6
	//*  44   89:aload_2         
	//*  45   90:invokevirtual   #371 <Method Class Class.getComponentType()>
	//*  46   93:aload_3         
	//*  47   94:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//*  48   97:aload_3         
	//*  49   98:invokestatic    #359 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//*  50  101:astore_1        
	//*  51  102:aload           6
	//*  52  104:aload_1         
	//*  53  105:invokevirtual   #375 <Method void ClassStack.resolveSelfReferences(JavaType)>
	//*  54  108:iload           4
	//*  55  110:ifeq            123
	//*  56  113:aload_0         
	//*  57  114:getfield        #128 <Field LRUMap _typeCache>
	//*  58  117:aload_2         
	//*  59  118:aload_1         
	//*  60  119:invokevirtual   #379 <Method Object LRUMap.putIfAbsent(Object, Object)>
	//*  61  122:pop             
	//*  62  123:aload_1         
	//*  63  124:areturn         
		{
			classstack1 = classstack.find(class1);
	//   64  125:aload_1         
	//   65  126:aload_2         
	//   66  127:invokevirtual   #383 <Method ClassStack ClassStack.find(Class)>
	//   67  130:astore          6
			if(classstack1 != null)
	//*  68  132:aload           6
	//*  69  134:ifnull          157
			{
				classstack = ((ClassStack) (new ResolvedRecursiveType(class1, EMPTY_BINDINGS)));
	//   70  137:new             #385 <Class ResolvedRecursiveType>
	//   71  140:dup             
	//   72  141:aload_2         
	//   73  142:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   74  145:invokespecial   #388 <Method void ResolvedRecursiveType(Class, TypeBindings)>
	//   75  148:astore_1        
				classstack1.addSelfReference(((ResolvedRecursiveType) (classstack)));
	//   76  149:aload           6
	//   77  151:aload_1         
	//   78  152:invokevirtual   #392 <Method void ClassStack.addSelfReference(ResolvedRecursiveType)>
				return ((JavaType) (classstack));
	//   79  155:aload_1         
	//   80  156:areturn         
			}
			classstack1 = classstack.child(class1);
	//   81  157:aload_1         
	//   82  158:aload_2         
	//   83  159:invokevirtual   #395 <Method ClassStack ClassStack.child(Class)>
	//   84  162:astore          6
		}
		if(!class1.isArray()) goto _L2; else goto _L1
_L1:
		classstack = ((ClassStack) (ArrayType.construct(_fromAny(classstack1, ((Type) (class1.getComponentType())), typebindings), typebindings)));
_L4:
		classstack1.resolveSelfReferences(((JavaType) (classstack)));
		if(flag)
			_typeCache.putIfAbsent(((Object) (class1)), ((Object) (classstack)));
		return ((JavaType) (classstack));
	//*  85  164:goto            79
_L2:
		JavaType javatype1;
		JavaType ajavatype[];
		if(class1.isInterface())
	//*  86  167:aload_2         
	//*  87  168:invokevirtual   #398 <Method boolean Class.isInterface()>
	//*  88  171:ifeq            276
		{
			javatype1 = null;
	//   89  174:aconst_null     
	//   90  175:astore          7
			ajavatype = _resolveSuperInterfaces(classstack1, class1, typebindings);
	//   91  177:aload_0         
	//   92  178:aload           6
	//   93  180:aload_2         
	//   94  181:aload_3         
	//   95  182:invokevirtual   #402 <Method JavaType[] _resolveSuperInterfaces(ClassStack, Class, TypeBindings)>
	//   96  185:astore          8
		} else
	//*  97  187:aload_2         
	//*  98  188:ldc1            #205 <Class Properties>
	//*  99  190:if_acmpne       299
	//* 100  193:aload_2         
	//* 101  194:aload_3         
	//* 102  195:aload           7
	//* 103  197:aload           8
	//* 104  199:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//* 105  202:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//* 106  205:invokestatic    #210 <Method MapType MapType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType, JavaType)>
	//* 107  208:astore          5
	//* 108  210:aload           5
	//* 109  212:astore_1        
	//* 110  213:aload           5
	//* 111  215:ifnonnull       102
	//* 112  218:aload_0         
	//* 113  219:aload           6
	//* 114  221:aload_2         
	//* 115  222:aload_3         
	//* 116  223:aload           7
	//* 117  225:aload           8
	//* 118  227:invokevirtual   #406 <Method JavaType _fromWellKnownClass(ClassStack, Class, TypeBindings, JavaType, JavaType[])>
	//* 119  230:astore          5
	//* 120  232:aload           5
	//* 121  234:astore_1        
	//* 122  235:aload           5
	//* 123  237:ifnonnull       102
	//* 124  240:aload_0         
	//* 125  241:aload           6
	//* 126  243:aload_2         
	//* 127  244:aload_3         
	//* 128  245:aload           7
	//* 129  247:aload           8
	//* 130  249:invokevirtual   #409 <Method JavaType _fromWellKnownInterface(ClassStack, Class, TypeBindings, JavaType, JavaType[])>
	//* 131  252:astore          5
	//* 132  254:aload           5
	//* 133  256:astore_1        
	//* 134  257:aload           5
	//* 135  259:ifnonnull       102
	//* 136  262:aload_0         
	//* 137  263:aload_2         
	//* 138  264:aload_3         
	//* 139  265:aload           7
	//* 140  267:aload           8
	//* 141  269:invokevirtual   #245 <Method JavaType _newSimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//* 142  272:astore_1        
	//* 143  273:goto            102
		{
			javatype1 = _resolveSuperClass(classstack1, class1, typebindings);
	//  144  276:aload_0         
	//  145  277:aload           6
	//  146  279:aload_2         
	//  147  280:aload_3         
	//  148  281:invokevirtual   #412 <Method JavaType _resolveSuperClass(ClassStack, Class, TypeBindings)>
	//  149  284:astore          7
			ajavatype = _resolveSuperInterfaces(classstack1, class1, typebindings);
	//  150  286:aload_0         
	//  151  287:aload           6
	//  152  289:aload_2         
	//  153  290:aload_3         
	//  154  291:invokevirtual   #402 <Method JavaType[] _resolveSuperInterfaces(ClassStack, Class, TypeBindings)>
	//  155  294:astore          8
		}
		if(class1 != java/util/Properties)
			break; /* Loop/switch isn't completed */
		obj = ((Object) (MapType.construct(class1, typebindings, javatype1, ajavatype, ((JavaType) (CORE_TYPE_STRING)), ((JavaType) (CORE_TYPE_STRING)))));
_L6:
		classstack = ((ClassStack) (obj));
		if(obj == null)
		{
			obj = ((Object) (_fromWellKnownClass(classstack1, class1, typebindings, javatype1, ajavatype)));
			classstack = ((ClassStack) (obj));
			if(obj == null)
			{
				obj = ((Object) (_fromWellKnownInterface(classstack1, class1, typebindings, javatype1, ajavatype)));
				classstack = ((ClassStack) (obj));
				if(obj == null)
					classstack = ((ClassStack) (_newSimpleType(class1, typebindings, javatype1, ajavatype)));
			}
		}
		if(true) goto _L4; else goto _L3
	//* 156  296:goto            187
_L3:
		if(javatype1 == null) goto _L6; else goto _L5
	//  157  299:aload           7
	//  158  301:ifnull          210
_L5:
		obj = ((Object) (javatype1.refine(class1, typebindings, javatype1, ajavatype)));
	//  159  304:aload           7
	//  160  306:aload_2         
	//  161  307:aload_3         
	//  162  308:aload           7
	//  163  310:aload           8
	//  164  312:invokevirtual   #415 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//  165  315:astore          5
		  goto _L6
	//* 166  317:goto            210
	}

	protected JavaType _fromParamType(ClassStack classstack, ParameterizedType parameterizedtype, TypeBindings typebindings)
	{
		Class class1 = (Class)parameterizedtype.getRawType();
	//    0    0:aload_2         
	//    1    1:invokeinterface #419 <Method Type ParameterizedType.getRawType()>
	//    2    6:checkcast       #75  <Class Class>
	//    3    9:astore          6
		if(class1 == CLS_ENUM)
	//*   4   11:aload           6
	//*   5   13:getstatic       #81  <Field Class CLS_ENUM>
	//*   6   16:if_acmpne       23
			return ((JavaType) (CORE_TYPE_ENUM));
	//    7   19:getstatic       #117 <Field SimpleType CORE_TYPE_ENUM>
	//    8   22:areturn         
		if(class1 == CLS_COMPARABLE)
	//*   9   23:aload           6
	//*  10   25:getstatic       #73  <Field Class CLS_COMPARABLE>
	//*  11   28:if_acmpne       35
			return ((JavaType) (CORE_TYPE_COMPARABLE));
	//   12   31:getstatic       #115 <Field SimpleType CORE_TYPE_COMPARABLE>
	//   13   34:areturn         
		if(class1 == CLS_CLASS)
	//*  14   35:aload           6
	//*  15   37:getstatic       #77  <Field Class CLS_CLASS>
	//*  16   40:if_acmpne       47
			return ((JavaType) (CORE_TYPE_CLASS));
	//   17   43:getstatic       #119 <Field SimpleType CORE_TYPE_CLASS>
	//   18   46:areturn         
		parameterizedtype = ((ParameterizedType) (parameterizedtype.getActualTypeArguments()));
	//   19   47:aload_2         
	//   20   48:invokeinterface #423 <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   21   53:astore_2        
		int i;
		if(parameterizedtype == null)
	//*  22   54:aload_2         
	//*  23   55:ifnonnull       79
			i = 0;
	//   24   58:iconst_0        
	//   25   59:istore          4
		else
	//*  26   61:iload           4
	//*  27   63:ifne            86
	//*  28   66:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//*  29   69:astore_2        
	//*  30   70:aload_0         
	//*  31   71:aload_1         
	//*  32   72:aload           6
	//*  33   74:aload_2         
	//*  34   75:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//*  35   78:areturn         
			i = parameterizedtype.length;
	//   36   79:aload_2         
	//   37   80:arraylength     
	//   38   81:istore          4
		if(i == 0)
		{
			parameterizedtype = ((ParameterizedType) (EMPTY_BINDINGS));
		} else
	//*  39   83:goto            61
		{
			JavaType ajavatype[] = new JavaType[i];
	//   40   86:iload           4
	//   41   88:anewarray       JavaType[]
	//   42   91:astore          7
			for(int j = 0; j < i; j++)
	//*  43   93:iconst_0        
	//*  44   94:istore          5
	//*  45   96:iload           5
	//*  46   98:iload           4
	//*  47  100:icmpge          127
				ajavatype[j] = _fromAny(classstack, ((Type) (parameterizedtype[j])), typebindings);
	//   48  103:aload           7
	//   49  105:iload           5
	//   50  107:aload_0         
	//   51  108:aload_1         
	//   52  109:aload_2         
	//   53  110:iload           5
	//   54  112:aaload          
	//   55  113:aload_3         
	//   56  114:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   57  117:aastore         

	//   58  118:iload           5
	//   59  120:iconst_1        
	//   60  121:iadd            
	//   61  122:istore          5
	//*  62  124:goto            96
			parameterizedtype = ((ParameterizedType) (TypeBindings.create(class1, ajavatype)));
	//   63  127:aload           6
	//   64  129:aload           7
	//   65  131:invokestatic    #427 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//   66  134:astore_2        
		}
		return _fromClass(classstack, class1, ((TypeBindings) (parameterizedtype)));
	//*  67  135:goto            70
	}

	protected JavaType _fromVariable(ClassStack classstack, TypeVariable typevariable, TypeBindings typebindings)
	{
		String s = typevariable.getName();
	//    0    0:aload_2         
	//    1    1:invokeinterface #428 <Method String TypeVariable.getName()>
	//    2    6:astore          4
		JavaType javatype = typebindings.findBoundType(s);
	//    3    8:aload_3         
	//    4    9:aload           4
	//    5   11:invokevirtual   #432 <Method JavaType TypeBindings.findBoundType(String)>
	//    6   14:astore          5
		if(javatype != null)
	//*   7   16:aload           5
	//*   8   18:ifnull          24
			return javatype;
	//    9   21:aload           5
	//   10   23:areturn         
		if(typebindings.hasUnbound(s))
	//*  11   24:aload_3         
	//*  12   25:aload           4
	//*  13   27:invokevirtual   #436 <Method boolean TypeBindings.hasUnbound(String)>
	//*  14   30:ifeq            37
		{
			return ((JavaType) (CORE_TYPE_OBJECT));
	//   15   33:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//   16   36:areturn         
		} else
		{
			typebindings = typebindings.withUnboundVariable(s);
	//   17   37:aload_3         
	//   18   38:aload           4
	//   19   40:invokevirtual   #440 <Method TypeBindings TypeBindings.withUnboundVariable(String)>
	//   20   43:astore_3        
			return _fromAny(classstack, typevariable.getBounds()[0], typebindings);
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:aload_2         
	//   24   47:invokeinterface #443 <Method Type[] TypeVariable.getBounds()>
	//   25   52:iconst_0        
	//   26   53:aaload          
	//   27   54:aload_3         
	//   28   55:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   29   58:areturn         
		}
	}

	protected JavaType _fromWellKnownClass(ClassStack classstack, Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		if(class1 == java/util/Map)
	//*   0    0:aload_2         
	//*   1    1:ldc2            #446 <Class Map>
	//*   2    4:if_acmpne       18
			return _mapType(class1, typebindings, javatype, ajavatype);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:aload           5
	//    8   14:invokespecial   #448 <Method JavaType _mapType(Class, TypeBindings, JavaType, JavaType[])>
	//    9   17:areturn         
		if(class1 == java/util/Collection)
	//*  10   18:aload_2         
	//*  11   19:ldc2            #450 <Class Collection>
	//*  12   22:if_acmpne       36
			return _collectionType(class1, typebindings, javatype, ajavatype);
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:aload           4
	//   17   30:aload           5
	//   18   32:invokespecial   #452 <Method JavaType _collectionType(Class, TypeBindings, JavaType, JavaType[])>
	//   19   35:areturn         
		if(class1 == java/util/concurrent/atomic/AtomicReference)
	//*  20   36:aload_2         
	//*  21   37:ldc2            #454 <Class AtomicReference>
	//*  22   40:if_acmpne       54
			return _referenceType(class1, typebindings, javatype, ajavatype);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:aload_3         
	//   26   46:aload           4
	//   27   48:aload           5
	//   28   50:invokespecial   #456 <Method JavaType _referenceType(Class, TypeBindings, JavaType, JavaType[])>
	//   29   53:areturn         
		else
			return null;
	//   30   54:aconst_null     
	//   31   55:areturn         
	}

	protected JavaType _fromWellKnownInterface(ClassStack classstack, Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		int j = ajavatype.length;
	//    0    0:aload           5
	//    1    2:arraylength     
	//    2    3:istore          7
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore          6
	//*   5    8:iload           6
	//*   6   10:iload           7
	//*   7   12:icmpge          45
		{
			classstack = ((ClassStack) (ajavatype[i].refine(class1, typebindings, javatype, ajavatype)));
	//    8   15:aload           5
	//    9   17:iload           6
	//   10   19:aaload          
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:aload           4
	//   14   24:aload           5
	//   15   26:invokevirtual   #415 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//   16   29:astore_1        
			if(classstack != null)
	//*  17   30:aload_1         
	//*  18   31:ifnull          36
				return ((JavaType) (classstack));
	//   19   34:aload_1         
	//   20   35:areturn         
		}

	//   21   36:iload           6
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore          6
	//*  25   42:goto            8
		return null;
	//   26   45:aconst_null     
	//   27   46:areturn         
	}

	protected JavaType _fromWildcard(ClassStack classstack, WildcardType wildcardtype, TypeBindings typebindings)
	{
		return _fromAny(classstack, wildcardtype.getUpperBounds()[0], typebindings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #460 <Method Type[] WildcardType.getUpperBounds()>
	//    4    8:iconst_0        
	//    5    9:aaload          
	//    6   10:aload_3         
	//    7   11:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    8   14:areturn         
	}

	protected JavaType _newSimpleType(Class class1, TypeBindings typebindings, JavaType javatype, JavaType ajavatype[])
	{
		return ((JavaType) (new SimpleType(class1, typebindings, javatype, ajavatype)));
	//    0    0:new             #100 <Class SimpleType>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #463 <Method void SimpleType(Class, TypeBindings, JavaType, JavaType[])>
	//    7   12:areturn         
	}

	protected JavaType _resolveSuperClass(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		class1 = ((Class) (ClassUtil.getGenericSuperclass(class1)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #469 <Method Type ClassUtil.getGenericSuperclass(Class)>
	//    2    4:astore_2        
		if(class1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return _fromAny(classstack, ((Type) (class1)), typebindings);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:aload_3         
	//   11   15:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   12   18:areturn         
	}

	protected JavaType[] _resolveSuperInterfaces(ClassStack classstack, Class class1, TypeBindings typebindings)
	{
		Type atype[] = ClassUtil.getGenericInterfaces(class1);
	//    0    0:aload_2         
	//    1    1:invokestatic    #473 <Method Type[] ClassUtil.getGenericInterfaces(Class)>
	//    2    4:astore          7
		if(atype != null && atype.length != 0) goto _L2; else goto _L1
	//    3    6:aload           7
	//    4    8:ifnull          17
	//    5   11:aload           7
	//    6   13:arraylength     
	//    7   14:ifne            23
_L1:
		class1 = ((Class) (NO_TYPES));
	//    8   17:getstatic       #50  <Field JavaType[] NO_TYPES>
	//    9   20:astore_2        
_L4:
		return ((JavaType []) (class1));
	//   10   21:aload_2         
	//   11   22:areturn         
_L2:
		int j = atype.length;
	//   12   23:aload           7
	//   13   25:arraylength     
	//   14   26:istore          5
		JavaType ajavatype[] = new JavaType[j];
	//   15   28:iload           5
	//   16   30:anewarray       JavaType[]
	//   17   33:astore          6
		int i = 0;
	//   18   35:iconst_0        
	//   19   36:istore          4
		do
		{
			class1 = ((Class) (ajavatype));
	//   20   38:aload           6
	//   21   40:astore_2        
			if(i >= j)
				continue;
	//   22   41:iload           4
	//   23   43:iload           5
	//   24   45:icmpge          21
			ajavatype[i] = _fromAny(classstack, atype[i], typebindings);
	//   25   48:aload           6
	//   26   50:iload           4
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:aload           7
	//   30   56:iload           4
	//   31   58:aaload          
	//   32   59:aload_3         
	//   33   60:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//   34   63:aastore         
			i++;
	//   35   64:iload           4
	//   36   66:iconst_1        
	//   37   67:iadd            
	//   38   68:istore          4
		} while(true);
	//   39   70:goto            38
		if(true) goto _L4; else goto _L3
_L3:
	}

	protected JavaType _unknownType()
	{
		return ((JavaType) (CORE_TYPE_OBJECT));
	//    0    0:getstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
	//    1    3:areturn         
	}

	protected Class classForName(String s)
		throws ClassNotFoundException
	{
		return Class.forName(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #480 <Method Class Class.forName(String)>
	//    2    4:areturn         
	}

	protected Class classForName(String s, boolean flag, ClassLoader classloader)
		throws ClassNotFoundException
	{
		return Class.forName(s, true, classloader);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_3         
	//    3    3:invokestatic    #484 <Method Class Class.forName(String, boolean, ClassLoader)>
	//    4    6:areturn         
	}

	public void clearCache()
	{
		_typeCache.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field LRUMap _typeCache>
	//    2    4:invokevirtual   #489 <Method void LRUMap.clear()>
	//    3    7:return          
	}

	public ArrayType constructArrayType(JavaType javatype)
	{
		return ArrayType.construct(javatype, ((TypeBindings) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #359 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//    3    5:areturn         
	}

	public ArrayType constructArrayType(Class class1)
	{
		return ArrayType.construct(_fromAny(((ClassStack) (null)), ((Type) (class1)), ((TypeBindings) (null))), ((TypeBindings) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    5    7:aconst_null     
	//    6    8:invokestatic    #359 <Method ArrayType ArrayType.construct(JavaType, TypeBindings)>
	//    7   11:areturn         
	}

	public CollectionLikeType constructCollectionLikeType(Class class1, JavaType javatype)
	{
		class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, TypeBindings.createIfNeeded(class1, javatype))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokestatic    #499 <Method TypeBindings TypeBindings.createIfNeeded(Class, JavaType)>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:astore_1        
		if(class1 instanceof CollectionLikeType)
	//*   8   12:aload_1         
	//*   9   13:instanceof      #501 <Class CollectionLikeType>
	//*  10   16:ifeq            24
			return (CollectionLikeType)class1;
	//   11   19:aload_1         
	//   12   20:checkcast       #501 <Class CollectionLikeType>
	//   13   23:areturn         
		else
			return CollectionLikeType.upgradeFrom(((JavaType) (class1)), javatype);
	//   14   24:aload_1         
	//   15   25:aload_2         
	//   16   26:invokestatic    #505 <Method CollectionLikeType CollectionLikeType.upgradeFrom(JavaType, JavaType)>
	//   17   29:areturn         
	}

	public CollectionLikeType constructCollectionLikeType(Class class1, Class class2)
	{
		return constructCollectionLikeType(class1, _fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:invokevirtual   #509 <Method CollectionLikeType constructCollectionLikeType(Class, JavaType)>
	//    8   14:areturn         
	}

	public CollectionType constructCollectionType(Class class1, JavaType javatype)
	{
		return (CollectionType)_fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, javatype));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokestatic    #514 <Method TypeBindings TypeBindings.create(Class, JavaType)>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:checkcast       #165 <Class CollectionType>
	//    8   14:areturn         
	}

	public CollectionType constructCollectionType(Class class1, Class class2)
	{
		return constructCollectionType(class1, _fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:invokevirtual   #518 <Method CollectionType constructCollectionType(Class, JavaType)>
	//    8   14:areturn         
	}

	public JavaType constructFromCanonical(String s)
		throws IllegalArgumentException
	{
		return _parser.parse(s);
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field TypeParser _parser>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #523 <Method JavaType TypeParser.parse(String)>
	//    4    8:areturn         
	}

	public JavaType constructGeneralizedType(JavaType javatype, Class class1)
	{
		Class class2 = javatype.getRawClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #234 <Method Class JavaType.getRawClass()>
	//    2    4:astore_3        
		if(class2 == class1)
	//*   3    5:aload_3         
	//*   4    6:aload_2         
	//*   5    7:if_acmpne       12
			return javatype;
	//    6   10:aload_1         
	//    7   11:areturn         
		JavaType javatype1 = javatype.findSuperType(class1);
	//    8   12:aload_1         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #528 <Method JavaType JavaType.findSuperType(Class)>
	//   11   17:astore          4
		if(javatype1 == null)
	//*  12   19:aload           4
	//*  13   21:ifnonnull       90
		{
			if(!class1.isAssignableFrom(class2))
	//*  14   24:aload_2         
	//*  15   25:aload_3         
	//*  16   26:invokevirtual   #532 <Method boolean Class.isAssignableFrom(Class)>
	//*  17   29:ifne            61
				throw new IllegalArgumentException(String.format("Class %s not a super-type of %s", new Object[] {
					class1.getName(), javatype
				}));
	//   18   32:new             #179 <Class IllegalArgumentException>
	//   19   35:dup             
	//   20   36:ldc2            #534 <String "Class %s not a super-type of %s">
	//   21   39:iconst_2        
	//   22   40:anewarray       Object[]
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:aload_2         
	//   26   46:invokevirtual   #192 <Method String Class.getName()>
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_1        
	//   30   52:aload_1         
	//   31   53:aastore         
	//   32   54:invokestatic    #318 <Method String String.format(String, Object[])>
	//   33   57:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   34   60:athrow          
			else
				throw new IllegalArgumentException(String.format("Internal error: class %s not included as super-type for %s", new Object[] {
					class1.getName(), javatype
				}));
	//   35   61:new             #179 <Class IllegalArgumentException>
	//   36   64:dup             
	//   37   65:ldc2            #536 <String "Internal error: class %s not included as super-type for %s">
	//   38   68:iconst_2        
	//   39   69:anewarray       Object[]
	//   40   72:dup             
	//   41   73:iconst_0        
	//   42   74:aload_2         
	//   43   75:invokevirtual   #192 <Method String Class.getName()>
	//   44   78:aastore         
	//   45   79:dup             
	//   46   80:iconst_1        
	//   47   81:aload_1         
	//   48   82:aastore         
	//   49   83:invokestatic    #318 <Method String String.format(String, Object[])>
	//   50   86:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   51   89:athrow          
		} else
		{
			return javatype1;
	//   52   90:aload           4
	//   53   92:areturn         
		}
	}

	public MapLikeType constructMapLikeType(Class class1, JavaType javatype, JavaType javatype1)
	{
		class1 = ((Class) (_fromClass(((ClassStack) (null)), class1, TypeBindings.createIfNeeded(class1, new JavaType[] {
			javatype, javatype1
		}))));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:iconst_2        
	//    5    5:anewarray       JavaType[]
	//    6    8:dup             
	//    7    9:iconst_0        
	//    8   10:aload_2         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_1        
	//   12   14:aload_3         
	//   13   15:aastore         
	//   14   16:invokestatic    #541 <Method TypeBindings TypeBindings.createIfNeeded(Class, JavaType[])>
	//   15   19:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   16   22:astore_1        
		if(class1 instanceof MapLikeType)
	//*  17   23:aload_1         
	//*  18   24:instanceof      #543 <Class MapLikeType>
	//*  19   27:ifeq            35
			return (MapLikeType)class1;
	//   20   30:aload_1         
	//   21   31:checkcast       #543 <Class MapLikeType>
	//   22   34:areturn         
		else
			return MapLikeType.upgradeFrom(((JavaType) (class1)), javatype, javatype1);
	//   23   35:aload_1         
	//   24   36:aload_2         
	//   25   37:aload_3         
	//   26   38:invokestatic    #546 <Method MapLikeType MapLikeType.upgradeFrom(JavaType, JavaType, JavaType)>
	//   27   41:areturn         
	}

	public MapLikeType constructMapLikeType(Class class1, Class class2, Class class3)
	{
		return constructMapLikeType(class1, _fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS), _fromClass(((ClassStack) (null)), class3, EMPTY_BINDINGS));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:aload_3         
	//   10   14:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   11   17:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   12   20:invokevirtual   #550 <Method MapLikeType constructMapLikeType(Class, JavaType, JavaType)>
	//   13   23:areturn         
	}

	public MapType constructMapType(Class class1, JavaType javatype, JavaType javatype1)
	{
		return (MapType)_fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, new JavaType[] {
			javatype, javatype1
		}));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:iconst_2        
	//    5    5:anewarray       JavaType[]
	//    6    8:dup             
	//    7    9:iconst_0        
	//    8   10:aload_2         
	//    9   11:aastore         
	//   10   12:dup             
	//   11   13:iconst_1        
	//   12   14:aload_3         
	//   13   15:aastore         
	//   14   16:invokestatic    #427 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//   15   19:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   16   22:checkcast       #207 <Class MapType>
	//   17   25:areturn         
	}

	public MapType constructMapType(Class class1, Class class2, Class class3)
	{
		if(class1 == java/util/Properties)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #205 <Class Properties>
	//*   2    3:if_acmpne       20
		{
			class3 = ((Class) (CORE_TYPE_STRING));
	//    3    6:getstatic       #111 <Field SimpleType CORE_TYPE_STRING>
	//    4    9:astore_3        
			class2 = class3;
	//    5   10:aload_3         
	//    6   11:astore_2        
		} else
	//*   7   12:aload_0         
	//*   8   13:aload_1         
	//*   9   14:aload_2         
	//*  10   15:aload_3         
	//*  11   16:invokevirtual   #557 <Method MapType constructMapType(Class, JavaType, JavaType)>
	//*  12   19:areturn         
		{
			class2 = ((Class) (_fromClass(((ClassStack) (null)), class2, EMPTY_BINDINGS)));
	//   13   20:aload_0         
	//   14   21:aconst_null     
	//   15   22:aload_2         
	//   16   23:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   17   26:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   18   29:astore_2        
			class3 = ((Class) (_fromClass(((ClassStack) (null)), class3, EMPTY_BINDINGS)));
	//   19   30:aload_0         
	//   20   31:aconst_null     
	//   21   32:aload_3         
	//   22   33:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//   23   36:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   24   39:astore_3        
		}
		return constructMapType(class1, ((JavaType) (class2)), ((JavaType) (class3)));
	//*  25   40:goto            12
	}

	public transient JavaType constructParametricType(Class class1, JavaType ajavatype[])
	{
		return _fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, ajavatype));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokestatic    #427 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:areturn         
	}

	public transient JavaType constructParametricType(Class class1, Class aclass[])
	{
		int j = aclass.length;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:istore          4
		JavaType ajavatype[] = new JavaType[j];
	//    3    4:iload           4
	//    4    6:anewarray       JavaType[]
	//    5    9:astore          5
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          39
			ajavatype[i] = _fromClass(((ClassStack) (null)), aclass[i], ((TypeBindings) (null)));
	//   11   19:aload           5
	//   12   21:iload_3         
	//   13   22:aload_0         
	//   14   23:aconst_null     
	//   15   24:aload_2         
	//   16   25:iload_3         
	//   17   26:aaload          
	//   18   27:aconst_null     
	//   19   28:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   20   31:aastore         

	//   21   32:iload_3         
	//   22   33:iconst_1        
	//   23   34:iadd            
	//   24   35:istore_3        
	//*  25   36:goto            13
		return constructParametricType(class1, ajavatype);
	//   26   39:aload_0         
	//   27   40:aload_1         
	//   28   41:aload           5
	//   29   43:invokevirtual   #564 <Method JavaType constructParametricType(Class, JavaType[])>
	//   30   46:areturn         
	}

	public transient JavaType constructParametrizedType(Class class1, Class class2, JavaType ajavatype[])
	{
		return constructParametricType(class1, ajavatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #564 <Method JavaType constructParametricType(Class, JavaType[])>
	//    4    6:areturn         
	}

	public transient JavaType constructParametrizedType(Class class1, Class class2, Class aclass[])
	{
		return constructParametricType(class1, aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #571 <Method JavaType constructParametricType(Class, Class[])>
	//    4    6:areturn         
	}

	public CollectionLikeType constructRawCollectionLikeType(Class class1)
	{
		return constructCollectionLikeType(class1, unknownType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #576 <Method JavaType unknownType()>
	//    3    5:invokevirtual   #509 <Method CollectionLikeType constructCollectionLikeType(Class, JavaType)>
	//    4    8:areturn         
	}

	public CollectionType constructRawCollectionType(Class class1)
	{
		return constructCollectionType(class1, unknownType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #576 <Method JavaType unknownType()>
	//    3    5:invokevirtual   #518 <Method CollectionType constructCollectionType(Class, JavaType)>
	//    4    8:areturn         
	}

	public MapLikeType constructRawMapLikeType(Class class1)
	{
		return constructMapLikeType(class1, unknownType(), unknownType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #576 <Method JavaType unknownType()>
	//    3    5:invokestatic    #576 <Method JavaType unknownType()>
	//    4    8:invokevirtual   #550 <Method MapLikeType constructMapLikeType(Class, JavaType, JavaType)>
	//    5   11:areturn         
	}

	public MapType constructRawMapType(Class class1)
	{
		return constructMapType(class1, unknownType(), unknownType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #576 <Method JavaType unknownType()>
	//    3    5:invokestatic    #576 <Method JavaType unknownType()>
	//    4    8:invokevirtual   #557 <Method MapType constructMapType(Class, JavaType, JavaType)>
	//    5   11:areturn         
	}

	public JavaType constructReferenceType(Class class1, JavaType javatype)
	{
		return ((JavaType) (ReferenceType.construct(class1, ((TypeBindings) (null)), ((JavaType) (null)), ((JavaType []) (null)), javatype)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:aload_2         
	//    5    5:invokestatic    #218 <Method ReferenceType ReferenceType.construct(Class, TypeBindings, JavaType, JavaType[], JavaType)>
	//    6    8:areturn         
	}

	public JavaType constructSimpleType(Class class1, Class class2, JavaType ajavatype[])
	{
		return constructSimpleType(class1, ajavatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #593 <Method JavaType constructSimpleType(Class, JavaType[])>
	//    4    6:areturn         
	}

	public JavaType constructSimpleType(Class class1, JavaType ajavatype[])
	{
		return _fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, ajavatype));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_1         
	//    4    4:aload_2         
	//    5    5:invokestatic    #427 <Method TypeBindings TypeBindings.create(Class, JavaType[])>
	//    6    8:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//    7   11:areturn         
	}

	public JavaType constructSpecializedType(JavaType javatype, Class class1)
	{
		Class class2 = javatype.getRawClass();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #234 <Method Class JavaType.getRawClass()>
	//    2    4:astore_3        
		if(class2 != class1) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:if_acmpne       12
_L1:
		return javatype;
	//    6   10:aload_1         
	//    7   11:areturn         
_L2:
		if(class2 == java/lang/Object)
	//*   8   12:aload_3         
	//*   9   13:ldc1            #4   <Class Object>
	//*  10   15:if_acmpne       30
		{
			javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.emptyBindings());
	//   11   18:aload_0         
	//   12   19:aconst_null     
	//   13   20:aload_2         
	//   14   21:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//   15   24:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   16   27:astore_1        
		} else
	//*  17   28:aload_1         
	//*  18   29:areturn         
		{
			if(!class2.isAssignableFrom(class1))
	//*  19   30:aload_3         
	//*  20   31:aload_2         
	//*  21   32:invokevirtual   #532 <Method boolean Class.isAssignableFrom(Class)>
	//*  22   35:ifne            67
				throw new IllegalArgumentException(String.format("Class %s not subtype of %s", new Object[] {
					class1.getName(), javatype
				}));
	//   23   38:new             #179 <Class IllegalArgumentException>
	//   24   41:dup             
	//   25   42:ldc2            #597 <String "Class %s not subtype of %s">
	//   26   45:iconst_2        
	//   27   46:anewarray       Object[]
	//   28   49:dup             
	//   29   50:iconst_0        
	//   30   51:aload_2         
	//   31   52:invokevirtual   #192 <Method String Class.getName()>
	//   32   55:aastore         
	//   33   56:dup             
	//   34   57:iconst_1        
	//   35   58:aload_1         
	//   36   59:aastore         
	//   37   60:invokestatic    #318 <Method String String.format(String, Object[])>
	//   38   63:invokespecial   #200 <Method void IllegalArgumentException(String)>
	//   39   66:athrow          
			if(javatype.getBindings().isEmpty())
	//*  40   67:aload_1         
	//*  41   68:invokevirtual   #301 <Method TypeBindings JavaType.getBindings()>
	//*  42   71:invokevirtual   #238 <Method boolean TypeBindings.isEmpty()>
	//*  43   74:ifeq            90
			{
				javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.emptyBindings());
	//   44   77:aload_0         
	//   45   78:aconst_null     
	//   46   79:aload_2         
	//   47   80:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//   48   83:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   49   86:astore_1        
			} else
	//*  50   87:goto            28
			{
				if(!javatype.isContainerType())
					break; /* Loop/switch isn't completed */
	//   51   90:aload_1         
	//   52   91:invokevirtual   #600 <Method boolean JavaType.isContainerType()>
	//   53   94:ifeq            214
				if(javatype.isMapLikeType())
	//*  54   97:aload_1         
	//*  55   98:invokevirtual   #603 <Method boolean JavaType.isMapLikeType()>
	//*  56  101:ifeq            154
				{
					if(class1 != java/util/HashMap && class1 != java/util/LinkedHashMap && class1 != java/util/EnumMap && class1 != java/util/TreeMap)
						break; /* Loop/switch isn't completed */
	//   57  104:aload_2         
	//   58  105:ldc2            #605 <Class HashMap>
	//   59  108:if_acmpeq       132
	//   60  111:aload_2         
	//   61  112:ldc2            #607 <Class LinkedHashMap>
	//   62  115:if_acmpeq       132
	//   63  118:aload_2         
	//   64  119:ldc2            #609 <Class EnumMap>
	//   65  122:if_acmpeq       132
	//   66  125:aload_2         
	//   67  126:ldc2            #611 <Class TreeMap>
	//   68  129:if_acmpne       214
					javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, javatype.getKeyType(), javatype.getContentType()));
	//   69  132:aload_0         
	//   70  133:aconst_null     
	//   71  134:aload_2         
	//   72  135:aload_2         
	//   73  136:aload_1         
	//   74  137:invokevirtual   #614 <Method JavaType JavaType.getKeyType()>
	//   75  140:aload_1         
	//   76  141:invokevirtual   #617 <Method JavaType JavaType.getContentType()>
	//   77  144:invokestatic    #620 <Method TypeBindings TypeBindings.create(Class, JavaType, JavaType)>
	//   78  147:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//   79  150:astore_1        
				} else
	//*  80  151:goto            28
				{
					if(!javatype.isCollectionLikeType())
						break; /* Loop/switch isn't completed */
	//   81  154:aload_1         
	//   82  155:invokevirtual   #623 <Method boolean JavaType.isCollectionLikeType()>
	//   83  158:ifeq            214
					if(class1 != java/util/ArrayList && class1 != java/util/LinkedList && class1 != java/util/HashSet && class1 != java/util/TreeSet)
						continue; /* Loop/switch isn't completed */
	//   84  161:aload_2         
	//   85  162:ldc2            #625 <Class ArrayList>
	//   86  165:if_acmpeq       189
	//   87  168:aload_2         
	//   88  169:ldc2            #627 <Class LinkedList>
	//   89  172:if_acmpeq       189
	//   90  175:aload_2         
	//   91  176:ldc2            #629 <Class HashSet>
	//   92  179:if_acmpeq       189
	//   93  182:aload_2         
	//   94  183:ldc2            #631 <Class TreeSet>
	//   95  186:if_acmpne       207
					javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.create(class1, javatype.getContentType()));
	//   96  189:aload_0         
	//   97  190:aconst_null     
	//   98  191:aload_2         
	//   99  192:aload_2         
	//  100  193:aload_1         
	//  101  194:invokevirtual   #617 <Method JavaType JavaType.getContentType()>
	//  102  197:invokestatic    #514 <Method TypeBindings TypeBindings.create(Class, JavaType)>
	//  103  200:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//  104  203:astore_1        
				}
			}
		}
_L4:
		return javatype;
	//* 105  204:goto            28
		if(class2 == java/util/EnumSet) goto _L1; else goto _L3
	//  106  207:aload_3         
	//  107  208:ldc2            #633 <Class EnumSet>
	//  108  211:if_acmpeq       10
_L3:
		if(class1.getTypeParameters().length == 0)
	//* 109  214:aload_2         
	//* 110  215:invokevirtual   #636 <Method TypeVariable[] Class.getTypeParameters()>
	//* 111  218:arraylength     
	//* 112  219:ifne            235
		{
			javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.emptyBindings());
	//  113  222:aload_0         
	//  114  223:aconst_null     
	//  115  224:aload_2         
	//  116  225:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//  117  228:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//  118  231:astore_1        
		} else
	//* 119  232:goto            28
		{
			JavaType javatype1;
			if(javatype.isInterface())
	//* 120  235:aload_1         
	//* 121  236:invokevirtual   #637 <Method boolean JavaType.isInterface()>
	//* 122  239:ifeq            279
				javatype1 = javatype.refine(class1, TypeBindings.emptyBindings(), ((JavaType) (null)), new JavaType[] {
					javatype
				});
	//  123  242:aload_1         
	//  124  243:aload_2         
	//  125  244:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//  126  247:aconst_null     
	//  127  248:iconst_1        
	//  128  249:anewarray       JavaType[]
	//  129  252:dup             
	//  130  253:iconst_0        
	//  131  254:aload_1         
	//  132  255:aastore         
	//  133  256:invokevirtual   #415 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//  134  259:astore_3        
			else
	//* 135  260:aload_3         
	//* 136  261:astore_1        
	//* 137  262:aload_3         
	//* 138  263:ifnonnull       28
	//* 139  266:aload_0         
	//* 140  267:aconst_null     
	//* 141  268:aload_2         
	//* 142  269:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//* 143  272:invokevirtual   #298 <Method JavaType _fromClass(ClassStack, Class, TypeBindings)>
	//* 144  275:astore_1        
	//* 145  276:goto            28
				javatype1 = javatype.refine(class1, TypeBindings.emptyBindings(), javatype, NO_TYPES);
	//  146  279:aload_1         
	//  147  280:aload_2         
	//  148  281:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//  149  284:aload_1         
	//  150  285:getstatic       #50  <Field JavaType[] NO_TYPES>
	//  151  288:invokevirtual   #415 <Method JavaType JavaType.refine(Class, TypeBindings, JavaType, JavaType[])>
	//  152  291:astore_3        
			javatype = javatype1;
			if(javatype1 == null)
				javatype = _fromClass(((ClassStack) (null)), class1, TypeBindings.emptyBindings());
		}
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	//* 153  292:goto            260
	}

	public JavaType constructType(TypeReference typereference)
	{
		return _fromAny(((ClassStack) (null)), typereference.getType(), EMPTY_BINDINGS);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #643 <Method Type TypeReference.getType()>
	//    4    6:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    5    9:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    6   12:areturn         
	}

	public JavaType constructType(Type type)
	{
		return _fromAny(((ClassStack) (null)), type, EMPTY_BINDINGS);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    4    6:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    5    9:areturn         
	}

	public JavaType constructType(Type type, JavaType javatype)
	{
		if(javatype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			javatype = ((JavaType) (TypeBindings.emptyBindings()));
	//    2    4:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//    3    7:astore_2        
		else
	//*   4    8:aload_0         
	//*   5    9:aconst_null     
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//*   9   15:areturn         
			javatype = ((JavaType) (javatype.getBindings()));
	//   10   16:aload_2         
	//   11   17:invokevirtual   #301 <Method TypeBindings JavaType.getBindings()>
	//   12   20:astore_2        
		return _fromAny(((ClassStack) (null)), type, ((TypeBindings) (javatype)));
	//*  13   21:goto            8
	}

	public JavaType constructType(Type type, TypeBindings typebindings)
	{
		return _fromAny(((ClassStack) (null)), type, typebindings);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//    5    7:areturn         
	}

	public JavaType constructType(Type type, Class class1)
	{
		if(class1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			class1 = ((Class) (TypeBindings.emptyBindings()));
	//    2    4:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//    3    7:astore_2        
		else
	//*   4    8:aload_0         
	//*   5    9:aconst_null     
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #354 <Method JavaType _fromAny(ClassStack, Type, TypeBindings)>
	//*   9   15:areturn         
			class1 = ((Class) (constructType(((Type) (class1))).getBindings()));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #230 <Method JavaType constructType(Type)>
	//   13   21:invokevirtual   #301 <Method TypeBindings JavaType.getBindings()>
	//   14   24:astore_2        
		return _fromAny(((ClassStack) (null)), type, ((TypeBindings) (class1)));
	//*  15   25:goto            8
	}

	public Class findClass(String s)
		throws ClassNotFoundException
	{
		Object obj;
		ClassLoader classloader;
		if(s.indexOf('.') < 0)
	//*   0    0:aload_1         
	//*   1    1:bipush          46
	//*   2    3:invokevirtual   #655 <Method int String.indexOf(int)>
	//*   3    6:ifge            21
		{
			Class class1 = _findPrimitive(s);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #657 <Method Class _findPrimitive(String)>
	//    7   14:astore_2        
			if(class1 != null)
	//*   8   15:aload_2         
	//*   9   16:ifnull          21
				return class1;
	//   10   19:aload_2         
	//   11   20:areturn         
		}
		obj = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
		ClassLoader classloader1 = getClassLoader();
	//   14   23:aload_0         
	//   15   24:invokevirtual   #661 <Method ClassLoader getClassLoader()>
	//   16   27:astore          4
		classloader = classloader1;
	//   17   29:aload           4
	//   18   31:astore_3        
		if(classloader1 == null)
	//*  19   32:aload           4
	//*  20   34:ifnonnull       44
			classloader = Thread.currentThread().getContextClassLoader();
	//   21   37:invokestatic    #667 <Method Thread Thread.currentThread()>
	//   22   40:invokevirtual   #670 <Method ClassLoader Thread.getContextClassLoader()>
	//   23   43:astore_3        
		if(classloader == null)
			break MISSING_BLOCK_LABEL_64;
	//   24   44:aload_3         
	//   25   45:ifnull          64
		obj = ((Object) (classForName(s, true, classloader)));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:iconst_1        
	//   29   51:aload_3         
	//   30   52:invokevirtual   #672 <Method Class classForName(String, boolean, ClassLoader)>
	//   31   55:astore_2        
		return ((Class) (obj));
	//   32   56:aload_2         
	//   33   57:areturn         
		obj;
	//   34   58:astore_2        
		obj = ((Object) (ClassUtil.getRootCause(((Throwable) (obj)))));
	//   35   59:aload_2         
	//   36   60:invokestatic    #676 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   37   63:astore_2        
		try
		{
			s = ((String) (classForName(s)));
	//   38   64:aload_0         
	//   39   65:aload_1         
	//   40   66:invokevirtual   #678 <Method Class classForName(String)>
	//   41   69:astore_1        
		}
	//*  42   70:aload_1         
	//*  43   71:areturn         
		catch(Exception exception)
	//*  44   72:astore_3        
		{
			s = ((String) (obj));
	//   45   73:aload_2         
	//   46   74:astore_1        
			if(obj == null)
	//*  47   75:aload_2         
	//*  48   76:ifnonnull       84
				s = ((String) (ClassUtil.getRootCause(((Throwable) (exception)))));
	//   49   79:aload_3         
	//   50   80:invokestatic    #676 <Method Throwable ClassUtil.getRootCause(Throwable)>
	//   51   83:astore_1        
			if(s instanceof RuntimeException)
	//*  52   84:aload_1         
	//*  53   85:instanceof      #680 <Class RuntimeException>
	//*  54   88:ifeq            96
				throw (RuntimeException)s;
	//   55   91:aload_1         
	//   56   92:checkcast       #680 <Class RuntimeException>
	//   57   95:athrow          
			else
				throw new ClassNotFoundException(((Throwable) (s)).getMessage(), ((Throwable) (s)));
	//   58   96:new             #477 <Class ClassNotFoundException>
	//   59   99:dup             
	//   60  100:aload_1         
	//   61  101:invokevirtual   #685 <Method String Throwable.getMessage()>
	//   62  104:aload_1         
	//   63  105:invokespecial   #688 <Method void ClassNotFoundException(String, Throwable)>
	//   64  108:athrow          
		}
		return ((Class) (s));
	}

	public JavaType[] findTypeParameters(JavaType javatype, Class class1)
	{
		javatype = javatype.findSuperType(class1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #528 <Method JavaType JavaType.findSuperType(Class)>
	//    3    5:astore_1        
		if(javatype == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       14
			return NO_TYPES;
	//    6   10:getstatic       #50  <Field JavaType[] NO_TYPES>
	//    7   13:areturn         
		else
			return javatype.getBindings().typeParameterArray();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #301 <Method TypeBindings JavaType.getBindings()>
	//   10   18:invokevirtual   #694 <Method JavaType[] TypeBindings.typeParameterArray()>
	//   11   21:areturn         
	}

	public JavaType[] findTypeParameters(Class class1, Class class2)
	{
		return findTypeParameters(constructType(((Type) (class1))), class2);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #230 <Method JavaType constructType(Type)>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #698 <Method JavaType[] findTypeParameters(JavaType, Class)>
	//    6   10:areturn         
	}

	public JavaType[] findTypeParameters(Class class1, Class class2, TypeBindings typebindings)
	{
		return findTypeParameters(constructType(((Type) (class1)), typebindings), class2);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #702 <Method JavaType constructType(Type, TypeBindings)>
	//    5    7:aload_2         
	//    6    8:invokevirtual   #698 <Method JavaType[] findTypeParameters(JavaType, Class)>
	//    7   11:areturn         
	}

	public ClassLoader getClassLoader()
	{
		return _classLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field ClassLoader _classLoader>
	//    2    4:areturn         
	}

	public JavaType moreSpecificType(JavaType javatype, JavaType javatype1)
	{
		JavaType javatype2;
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
		{
			javatype2 = javatype1;
	//    2    4:aload_2         
	//    3    5:astore_3        
		} else
	//*   4    6:aload_3         
	//*   5    7:areturn         
		{
			javatype2 = javatype;
	//    6    8:aload_1         
	//    7    9:astore_3        
			if(javatype1 != null)
	//*   8   10:aload_2         
	//*   9   11:ifnull          6
			{
				Class class1 = javatype.getRawClass();
	//   10   14:aload_1         
	//   11   15:invokevirtual   #234 <Method Class JavaType.getRawClass()>
	//   12   18:astore          4
				Class class2 = javatype1.getRawClass();
	//   13   20:aload_2         
	//   14   21:invokevirtual   #234 <Method Class JavaType.getRawClass()>
	//   15   24:astore          5
				javatype2 = javatype;
	//   16   26:aload_1         
	//   17   27:astore_3        
				if(class1 != class2)
	//*  18   28:aload           4
	//*  19   30:aload           5
	//*  20   32:if_acmpeq       6
				{
					javatype2 = javatype;
	//   21   35:aload_1         
	//   22   36:astore_3        
					if(class1.isAssignableFrom(class2))
	//*  23   37:aload           4
	//*  24   39:aload           5
	//*  25   41:invokevirtual   #532 <Method boolean Class.isAssignableFrom(Class)>
	//*  26   44:ifeq            6
						return javatype1;
	//   27   47:aload_2         
	//   28   48:areturn         
				}
			}
		}
		return javatype2;
	}

	public JavaType uncheckedSimpleType(Class class1)
	{
		return _constructSimple(class1, EMPTY_BINDINGS, ((JavaType) (null)), ((JavaType []) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #708 <Method JavaType _constructSimple(Class, TypeBindings, JavaType, JavaType[])>
	//    6   10:areturn         
	}

	public TypeFactory withClassLoader(ClassLoader classloader)
	{
		return new TypeFactory(_parser, _modifiers, classloader);
	//    0    0:new             #2   <Class TypeFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #135 <Field TypeParser _parser>
	//    4    8:aload_0         
	//    5    9:getfield        #137 <Field TypeModifier[] _modifiers>
	//    6   12:aload_1         
	//    7   13:invokespecial   #143 <Method void TypeFactory(TypeParser, TypeModifier[], ClassLoader)>
	//    8   16:areturn         
	}

	public TypeFactory withModifier(TypeModifier typemodifier)
	{
		if(typemodifier == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       24
			return new TypeFactory(_parser, _modifiers, _classLoader);
	//    2    4:new             #2   <Class TypeFactory>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #135 <Field TypeParser _parser>
	//    6   12:aload_0         
	//    7   13:getfield        #137 <Field TypeModifier[] _modifiers>
	//    8   16:aload_0         
	//    9   17:getfield        #139 <Field ClassLoader _classLoader>
	//   10   20:invokespecial   #143 <Method void TypeFactory(TypeParser, TypeModifier[], ClassLoader)>
	//   11   23:areturn         
		if(_modifiers == null)
	//*  12   24:aload_0         
	//*  13   25:getfield        #137 <Field TypeModifier[] _modifiers>
	//*  14   28:ifnonnull       59
		{
			TypeParser typeparser = _parser;
	//   15   31:aload_0         
	//   16   32:getfield        #135 <Field TypeParser _parser>
	//   17   35:astore_2        
			ClassLoader classloader = _classLoader;
	//   18   36:aload_0         
	//   19   37:getfield        #139 <Field ClassLoader _classLoader>
	//   20   40:astore_3        
			return new TypeFactory(typeparser, new TypeModifier[] {
				typemodifier
			}, classloader);
	//   21   41:new             #2   <Class TypeFactory>
	//   22   44:dup             
	//   23   45:aload_2         
	//   24   46:iconst_1        
	//   25   47:anewarray       TypeModifier[]
	//   26   50:dup             
	//   27   51:iconst_0        
	//   28   52:aload_1         
	//   29   53:aastore         
	//   30   54:aload_3         
	//   31   55:invokespecial   #143 <Method void TypeFactory(TypeParser, TypeModifier[], ClassLoader)>
	//   32   58:areturn         
		} else
		{
			return new TypeFactory(_parser, (TypeModifier[])ArrayBuilders.insertInListNoDup(((Object []) (_modifiers)), ((Object) (typemodifier))), _classLoader);
	//   33   59:new             #2   <Class TypeFactory>
	//   34   62:dup             
	//   35   63:aload_0         
	//   36   64:getfield        #135 <Field TypeParser _parser>
	//   37   67:aload_0         
	//   38   68:getfield        #137 <Field TypeModifier[] _modifiers>
	//   39   71:aload_1         
	//   40   72:invokestatic    #718 <Method Object[] ArrayBuilders.insertInListNoDup(Object[], Object)>
	//   41   75:checkcast       #719 <Class TypeModifier[]>
	//   42   78:aload_0         
	//   43   79:getfield        #139 <Field ClassLoader _classLoader>
	//   44   82:invokespecial   #143 <Method void TypeFactory(TypeParser, TypeModifier[], ClassLoader)>
	//   45   85:areturn         
		}
	}

	private static final Class CLS_BOOL;
	private static final Class CLS_CLASS;
	private static final Class CLS_COMPARABLE;
	private static final Class CLS_ENUM;
	private static final Class CLS_INT;
	private static final Class CLS_LONG;
	private static final Class CLS_OBJECT;
	private static final Class CLS_STRING;
	protected static final SimpleType CORE_TYPE_BOOL;
	protected static final SimpleType CORE_TYPE_CLASS;
	protected static final SimpleType CORE_TYPE_COMPARABLE;
	protected static final SimpleType CORE_TYPE_ENUM;
	protected static final SimpleType CORE_TYPE_INT;
	protected static final SimpleType CORE_TYPE_LONG;
	protected static final SimpleType CORE_TYPE_OBJECT;
	protected static final SimpleType CORE_TYPE_STRING;
	protected static final TypeBindings EMPTY_BINDINGS = TypeBindings.emptyBindings();
	private static final JavaType NO_TYPES[] = new JavaType[0];
	protected static final TypeFactory instance = new TypeFactory();
	private static final long serialVersionUID = 1L;
	protected final ClassLoader _classLoader;
	protected final TypeModifier _modifiers[];
	protected final TypeParser _parser;
	protected final LRUMap _typeCache;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       JavaType[]
	//    2    4:putstatic       #50  <Field JavaType[] NO_TYPES>
	//    3    7:new             #2   <Class TypeFactory>
	//    4   10:dup             
	//    5   11:invokespecial   #53  <Method void TypeFactory()>
	//    6   14:putstatic       #55  <Field TypeFactory instance>
	//    7   17:invokestatic    #61  <Method TypeBindings TypeBindings.emptyBindings()>
	//    8   20:putstatic       #63  <Field TypeBindings EMPTY_BINDINGS>
		CLS_STRING = java/lang/String;
	//    9   23:ldc1            #65  <Class String>
	//   10   25:putstatic       #67  <Field Class CLS_STRING>
		CLS_OBJECT = java/lang/Object;
	//   11   28:ldc1            #4   <Class Object>
	//   12   30:putstatic       #69  <Field Class CLS_OBJECT>
		CLS_COMPARABLE = java/lang/Comparable;
	//   13   33:ldc1            #71  <Class Comparable>
	//   14   35:putstatic       #73  <Field Class CLS_COMPARABLE>
		CLS_CLASS = java/lang/Class;
	//   15   38:ldc1            #75  <Class Class>
	//   16   40:putstatic       #77  <Field Class CLS_CLASS>
		CLS_ENUM = java/lang/Enum;
	//   17   43:ldc1            #79  <Class Enum>
	//   18   45:putstatic       #81  <Field Class CLS_ENUM>
		CLS_BOOL = Boolean.TYPE;
	//   19   48:getstatic       #86  <Field Class Boolean.TYPE>
	//   20   51:putstatic       #88  <Field Class CLS_BOOL>
		CLS_INT = Integer.TYPE;
	//   21   54:getstatic       #91  <Field Class Integer.TYPE>
	//   22   57:putstatic       #93  <Field Class CLS_INT>
		CLS_LONG = Long.TYPE;
	//   23   60:getstatic       #96  <Field Class Long.TYPE>
	//   24   63:putstatic       #98  <Field Class CLS_LONG>
		CORE_TYPE_BOOL = new SimpleType(CLS_BOOL);
	//   25   66:new             #100 <Class SimpleType>
	//   26   69:dup             
	//   27   70:getstatic       #88  <Field Class CLS_BOOL>
	//   28   73:invokespecial   #103 <Method void SimpleType(Class)>
	//   29   76:putstatic       #105 <Field SimpleType CORE_TYPE_BOOL>
		CORE_TYPE_INT = new SimpleType(CLS_INT);
	//   30   79:new             #100 <Class SimpleType>
	//   31   82:dup             
	//   32   83:getstatic       #93  <Field Class CLS_INT>
	//   33   86:invokespecial   #103 <Method void SimpleType(Class)>
	//   34   89:putstatic       #107 <Field SimpleType CORE_TYPE_INT>
		CORE_TYPE_LONG = new SimpleType(CLS_LONG);
	//   35   92:new             #100 <Class SimpleType>
	//   36   95:dup             
	//   37   96:getstatic       #98  <Field Class CLS_LONG>
	//   38   99:invokespecial   #103 <Method void SimpleType(Class)>
	//   39  102:putstatic       #109 <Field SimpleType CORE_TYPE_LONG>
		CORE_TYPE_STRING = new SimpleType(CLS_STRING);
	//   40  105:new             #100 <Class SimpleType>
	//   41  108:dup             
	//   42  109:getstatic       #67  <Field Class CLS_STRING>
	//   43  112:invokespecial   #103 <Method void SimpleType(Class)>
	//   44  115:putstatic       #111 <Field SimpleType CORE_TYPE_STRING>
		CORE_TYPE_OBJECT = new SimpleType(CLS_OBJECT);
	//   45  118:new             #100 <Class SimpleType>
	//   46  121:dup             
	//   47  122:getstatic       #69  <Field Class CLS_OBJECT>
	//   48  125:invokespecial   #103 <Method void SimpleType(Class)>
	//   49  128:putstatic       #113 <Field SimpleType CORE_TYPE_OBJECT>
		CORE_TYPE_COMPARABLE = new SimpleType(CLS_COMPARABLE);
	//   50  131:new             #100 <Class SimpleType>
	//   51  134:dup             
	//   52  135:getstatic       #73  <Field Class CLS_COMPARABLE>
	//   53  138:invokespecial   #103 <Method void SimpleType(Class)>
	//   54  141:putstatic       #115 <Field SimpleType CORE_TYPE_COMPARABLE>
		CORE_TYPE_ENUM = new SimpleType(CLS_ENUM);
	//   55  144:new             #100 <Class SimpleType>
	//   56  147:dup             
	//   57  148:getstatic       #81  <Field Class CLS_ENUM>
	//   58  151:invokespecial   #103 <Method void SimpleType(Class)>
	//   59  154:putstatic       #117 <Field SimpleType CORE_TYPE_ENUM>
		CORE_TYPE_CLASS = new SimpleType(CLS_CLASS);
	//   60  157:new             #100 <Class SimpleType>
	//   61  160:dup             
	//   62  161:getstatic       #77  <Field Class CLS_CLASS>
	//   63  164:invokespecial   #103 <Method void SimpleType(Class)>
	//   64  167:putstatic       #119 <Field SimpleType CORE_TYPE_CLASS>
	//*  65  170:return          
	}
}
