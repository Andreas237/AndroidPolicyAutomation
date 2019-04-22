// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;

public class SimpleAbstractTypeResolver extends AbstractTypeResolver
	implements Serializable
{

	public SimpleAbstractTypeResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void AbstractTypeResolver()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashMap()>
	//    6   12:putfield        #22  <Field HashMap _mappings>
	//    7   15:return          
	}

	public SimpleAbstractTypeResolver addMapping(Class class1, Class class2)
	{
		if(class1 != class2)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpeq       144
		{
			if(class1.isAssignableFrom(class2))
	//*   3    5:aload_1         
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #31  <Method boolean Class.isAssignableFrom(Class)>
	//*   6   10:ifeq            85
			{
				if(Modifier.isAbstract(class1.getModifiers()))
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #35  <Method int Class.getModifiers()>
	//*   9   17:invokestatic    #41  <Method boolean Modifier.isAbstract(int)>
	//*  10   20:ifeq            42
				{
					_mappings.put(((Object) (new ClassKey(class1))), ((Object) (class2)));
	//   11   23:aload_0         
	//   12   24:getfield        #22  <Field HashMap _mappings>
	//   13   27:new             #43  <Class ClassKey>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #46  <Method void ClassKey(Class)>
	//   17   35:aload_2         
	//   18   36:invokevirtual   #50  <Method Object HashMap.put(Object, Object)>
	//   19   39:pop             
					return this;
	//   20   40:aload_0         
	//   21   41:areturn         
				} else
				{
					class2 = ((Class) (new StringBuilder()));
	//   22   42:new             #52  <Class StringBuilder>
	//   23   45:dup             
	//   24   46:invokespecial   #53  <Method void StringBuilder()>
	//   25   49:astore_2        
					((StringBuilder) (class2)).append("Cannot add mapping from class ");
	//   26   50:aload_2         
	//   27   51:ldc1            #55  <String "Cannot add mapping from class ">
	//   28   53:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
					((StringBuilder) (class2)).append(class1.getName());
	//   30   57:aload_2         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #63  <Method String Class.getName()>
	//   33   62:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
					((StringBuilder) (class2)).append(" since it is not abstract");
	//   35   66:aload_2         
	//   36   67:ldc1            #65  <String " since it is not abstract">
	//   37   69:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   38   72:pop             
					throw new IllegalArgumentException(((StringBuilder) (class2)).toString());
	//   39   73:new             #67  <Class IllegalArgumentException>
	//   40   76:dup             
	//   41   77:aload_2         
	//   42   78:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   43   81:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   44   84:athrow          
				}
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   45   85:new             #52  <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #53  <Method void StringBuilder()>
	//   48   92:astore_3        
				stringbuilder.append("Cannot add mapping from class ");
	//   49   93:aload_3         
	//   50   94:ldc1            #55  <String "Cannot add mapping from class ">
	//   51   96:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   52   99:pop             
				stringbuilder.append(class1.getName());
	//   53  100:aload_3         
	//   54  101:aload_1         
	//   55  102:invokevirtual   #63  <Method String Class.getName()>
	//   56  105:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   57  108:pop             
				stringbuilder.append(" to ");
	//   58  109:aload_3         
	//   59  110:ldc1            #75  <String " to ">
	//   60  112:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   61  115:pop             
				stringbuilder.append(class2.getName());
	//   62  116:aload_3         
	//   63  117:aload_2         
	//   64  118:invokevirtual   #63  <Method String Class.getName()>
	//   65  121:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   66  124:pop             
				stringbuilder.append(", as latter is not a subtype of former");
	//   67  125:aload_3         
	//   68  126:ldc1            #77  <String ", as latter is not a subtype of former">
	//   69  128:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   70  131:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   71  132:new             #67  <Class IllegalArgumentException>
	//   72  135:dup             
	//   73  136:aload_3         
	//   74  137:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   75  140:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   76  143:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Cannot add mapping from class to itself");
	//   77  144:new             #67  <Class IllegalArgumentException>
	//   78  147:dup             
	//   79  148:ldc1            #79  <String "Cannot add mapping from class to itself">
	//   80  150:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   81  153:athrow          
		}
	}

	public JavaType findTypeMapping(DeserializationConfig deserializationconfig, JavaType javatype)
	{
		Class class1 = javatype.getRawClass();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #89  <Method Class JavaType.getRawClass()>
	//    2    4:astore_3        
		class1 = (Class)_mappings.get(((Object) (new ClassKey(class1))));
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field HashMap _mappings>
	//    5    9:new             #43  <Class ClassKey>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokespecial   #46  <Method void ClassKey(Class)>
	//    9   17:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   20:checkcast       #27  <Class Class>
	//   11   23:astore_3        
		if(class1 == null)
	//*  12   24:aload_3         
	//*  13   25:ifnonnull       30
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		else
			return deserializationconfig.getTypeFactory().constructSpecializedType(javatype, class1);
	//   16   30:aload_1         
	//   17   31:invokevirtual   #99  <Method TypeFactory DeserializationConfig.getTypeFactory()>
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #105 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//   21   39:areturn         
	}

	public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, BeanDescription beandescription)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 0xfcbdac67L;
	protected final HashMap _mappings = new HashMap();
}
