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
		if(class1 == class2)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       15
			throw new IllegalArgumentException("Can not add mapping from class to itself");
	//    3    5:new             #27  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:ldc1            #29  <String "Can not add mapping from class to itself">
	//    6   11:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//    7   14:athrow          
		if(!class1.isAssignableFrom(class2))
	//*   8   15:aload_1         
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #38  <Method boolean Class.isAssignableFrom(Class)>
	//*  11   20:ifne            70
			throw new IllegalArgumentException((new StringBuilder()).append("Can not add mapping from class ").append(class1.getName()).append(" to ").append(class2.getName()).append(", as latter is not a subtype of former").toString());
	//   12   23:new             #27  <Class IllegalArgumentException>
	//   13   26:dup             
	//   14   27:new             #40  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #41  <Method void StringBuilder()>
	//   17   34:ldc1            #43  <String "Can not add mapping from class ">
	//   18   36:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #51  <Method String Class.getName()>
	//   21   43:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:ldc1            #53  <String " to ">
	//   23   48:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:aload_2         
	//   25   52:invokevirtual   #51  <Method String Class.getName()>
	//   26   55:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   27   58:ldc1            #55  <String ", as latter is not a subtype of former">
	//   28   60:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   31   69:athrow          
		if(!Modifier.isAbstract(class1.getModifiers()))
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #62  <Method int Class.getModifiers()>
	//*  34   74:invokestatic    #68  <Method boolean Modifier.isAbstract(int)>
	//*  35   77:ifne            115
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Can not add mapping from class ").append(class1.getName()).append(" since it is not abstract").toString());
	//   36   80:new             #27  <Class IllegalArgumentException>
	//   37   83:dup             
	//   38   84:new             #40  <Class StringBuilder>
	//   39   87:dup             
	//   40   88:invokespecial   #41  <Method void StringBuilder()>
	//   41   91:ldc1            #43  <String "Can not add mapping from class ">
	//   42   93:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   43   96:aload_1         
	//   44   97:invokevirtual   #51  <Method String Class.getName()>
	//   45  100:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   46  103:ldc1            #70  <String " since it is not abstract">
	//   47  105:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   48  108:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   49  111:invokespecial   #32  <Method void IllegalArgumentException(String)>
	//   50  114:athrow          
		} else
		{
			_mappings.put(((Object) (new ClassKey(class1))), ((Object) (class2)));
	//   51  115:aload_0         
	//   52  116:getfield        #22  <Field HashMap _mappings>
	//   53  119:new             #72  <Class ClassKey>
	//   54  122:dup             
	//   55  123:aload_1         
	//   56  124:invokespecial   #75  <Method void ClassKey(Class)>
	//   57  127:aload_2         
	//   58  128:invokevirtual   #79  <Method Object HashMap.put(Object, Object)>
	//   59  131:pop             
			return this;
	//   60  132:aload_0         
	//   61  133:areturn         
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
	//    5    9:new             #72  <Class ClassKey>
	//    6   12:dup             
	//    7   13:aload_3         
	//    8   14:invokespecial   #75  <Method void ClassKey(Class)>
	//    9   17:invokevirtual   #93  <Method Object HashMap.get(Object)>
	//   10   20:checkcast       #34  <Class Class>
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

	public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	private static final long serialVersionUID = 0xfcbdac67L;
	protected final HashMap _mappings = new HashMap();
}
