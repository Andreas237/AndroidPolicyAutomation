// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
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

	protected String _idFrom(Object obj, Class class1, TypeFactory typefactory)
	{
		Class class2 = class1;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(((Class) (java/lang/Enum)).isAssignableFrom(class1))
	//*   2    3:ldc1            #13  <Class Enum>
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #19  <Method boolean Class.isAssignableFrom(Class)>
	//*   5    9:ifeq            28
		{
			class2 = class1;
	//    6   12:aload_2         
	//    7   13:astore          4
			if(!class1.isEnum())
	//*   8   15:aload_2         
	//*   9   16:invokevirtual   #23  <Method boolean Class.isEnum()>
	//*  10   19:ifne            28
				class2 = class1.getSuperclass();
	//   11   22:aload_2         
	//   12   23:invokevirtual   #27  <Method Class Class.getSuperclass()>
	//   13   26:astore          4
		}
		String s = class2.getName();
	//   14   28:aload           4
	//   15   30:invokevirtual   #31  <Method String Class.getName()>
	//   16   33:astore          5
		if(s.startsWith("java.util."))
	//*  17   35:aload           5
	//*  18   37:ldc1            #33  <String "java.util.">
	//*  19   39:invokevirtual   #39  <Method boolean String.startsWith(String)>
	//*  20   42:ifeq            98
		{
			if(obj instanceof EnumSet)
	//*  21   45:aload_1         
	//*  22   46:instanceof      #41  <Class EnumSet>
	//*  23   49:ifeq            69
				return typefactory.constructCollectionType(java/util/EnumSet, ClassUtil.findEnumType((EnumSet)obj)).toCanonical();
	//   24   52:aload_3         
	//   25   53:ldc1            #41  <Class EnumSet>
	//   26   55:aload_1         
	//   27   56:checkcast       #41  <Class EnumSet>
	//   28   59:invokestatic    #47  <Method Class ClassUtil.findEnumType(EnumSet)>
	//   29   62:invokevirtual   #53  <Method CollectionType TypeFactory.constructCollectionType(Class, Class)>
	//   30   65:invokevirtual   #58  <Method String CollectionType.toCanonical()>
	//   31   68:areturn         
			class1 = ((Class) (s));
	//   32   69:aload           5
	//   33   71:astore_2        
			if(obj instanceof EnumMap)
	//*  34   72:aload_1         
	//*  35   73:instanceof      #60  <Class EnumMap>
	//*  36   76:ifeq            149
				return typefactory.constructMapType(java/util/EnumMap, ClassUtil.findEnumType((EnumMap)obj), java/lang/Object).toCanonical();
	//   37   79:aload_3         
	//   38   80:ldc1            #60  <Class EnumMap>
	//   39   82:aload_1         
	//   40   83:checkcast       #60  <Class EnumMap>
	//   41   86:invokestatic    #63  <Method Class ClassUtil.findEnumType(EnumMap)>
	//   42   89:ldc1            #65  <Class Object>
	//   43   91:invokevirtual   #69  <Method MapType TypeFactory.constructMapType(Class, Class, Class)>
	//   44   94:invokevirtual   #72  <Method String MapType.toCanonical()>
	//   45   97:areturn         
		} else
		{
			class1 = ((Class) (s));
	//   46   98:aload           5
	//   47  100:astore_2        
			if(s.indexOf('$') >= 0)
	//*  48  101:aload           5
	//*  49  103:bipush          36
	//*  50  105:invokevirtual   #76  <Method int String.indexOf(int)>
	//*  51  108:iflt            149
			{
				class1 = ((Class) (s));
	//   52  111:aload           5
	//   53  113:astore_2        
				if(ClassUtil.getOuterClass(class2) != null)
	//*  54  114:aload           4
	//*  55  116:invokestatic    #80  <Method Class ClassUtil.getOuterClass(Class)>
	//*  56  119:ifnull          149
				{
					class1 = ((Class) (s));
	//   57  122:aload           5
	//   58  124:astore_2        
					if(ClassUtil.getOuterClass(_baseType.getRawClass()) == null)
	//*  59  125:aload_0         
	//*  60  126:getfield        #84  <Field JavaType _baseType>
	//*  61  129:invokevirtual   #89  <Method Class JavaType.getRawClass()>
	//*  62  132:invokestatic    #80  <Method Class ClassUtil.getOuterClass(Class)>
	//*  63  135:ifnonnull       149
						class1 = ((Class) (_baseType.getRawClass().getName()));
	//   64  138:aload_0         
	//   65  139:getfield        #84  <Field JavaType _baseType>
	//   66  142:invokevirtual   #89  <Method Class JavaType.getRawClass()>
	//   67  145:invokevirtual   #31  <Method String Class.getName()>
	//   68  148:astore_2        
				}
			}
		}
		return ((String) (class1));
	//   69  149:aload_2         
	//   70  150:areturn         
	}

	protected JavaType _typeFromId(String s, DatabindContext databindcontext)
		throws IOException
	{
		JavaType javatype = databindcontext.resolveSubType(_baseType, s);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #84  <Field JavaType _baseType>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #101 <Method JavaType DatabindContext.resolveSubType(JavaType, String)>
	//    5    9:astore_3        
		if(javatype == null && (databindcontext instanceof DeserializationContext))
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       37
	//*   8   14:aload_2         
	//*   9   15:instanceof      #103 <Class DeserializationContext>
	//*  10   18:ifeq            37
			return ((DeserializationContext)databindcontext).handleUnknownTypeId(_baseType, s, ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver) (this)), "no such class found");
	//   11   21:aload_2         
	//   12   22:checkcast       #103 <Class DeserializationContext>
	//   13   25:aload_0         
	//   14   26:getfield        #84  <Field JavaType _baseType>
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:ldc1            #105 <String "no such class found">
	//   18   33:invokevirtual   #109 <Method JavaType DeserializationContext.handleUnknownTypeId(JavaType, String, com.fasterxml.jackson.databind.jsontype.TypeIdResolver, String)>
	//   19   36:areturn         
		else
			return javatype;
	//   20   37:aload_3         
	//   21   38:areturn         
	}

	public String getDescForKnownTypeIds()
	{
		return "class name used as type id";
	//    0    0:ldc1            #113 <String "class name used as type id">
	//    1    2:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.Id getMechanism()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS;
	//    0    0:getstatic       #121 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
	//    1    3:areturn         
	}

	public String idFromValue(Object obj)
	{
		return _idFrom(obj, obj.getClass(), _typeFactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #126 <Method Class Object.getClass()>
	//    4    6:aload_0         
	//    5    7:getfield        #130 <Field TypeFactory _typeFactory>
	//    6   10:invokevirtual   #132 <Method String _idFrom(Object, Class, TypeFactory)>
	//    7   13:areturn         
	}

	public String idFromValueAndType(Object obj, Class class1)
	{
		return _idFrom(obj, class1, _typeFactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:getfield        #130 <Field TypeFactory _typeFactory>
	//    5    7:invokevirtual   #132 <Method String _idFrom(Object, Class, TypeFactory)>
	//    6   10:areturn         
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
		throws IOException
	{
		return _typeFromId(s, databindcontext);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #139 <Method JavaType _typeFromId(String, DatabindContext)>
	//    4    6:areturn         
	}
}
