// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;

public class SimpleKeyDeserializers
	implements KeyDeserializers, Serializable
{

	public SimpleKeyDeserializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		_classMappings = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field HashMap _classMappings>
	//    5    9:return          
	}

	public SimpleKeyDeserializers addDeserializer(Class class1, KeyDeserializer keydeserializer)
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       18
			_classMappings = new HashMap();
	//    3    7:aload_0         
	//    4    8:new             #26  <Class HashMap>
	//    5   11:dup             
	//    6   12:invokespecial   #27  <Method void HashMap()>
	//    7   15:putfield        #21  <Field HashMap _classMappings>
		_classMappings.put(((Object) (new ClassKey(class1))), ((Object) (keydeserializer)));
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field HashMap _classMappings>
	//   10   22:new             #29  <Class ClassKey>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokespecial   #32  <Method void ClassKey(Class)>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #36  <Method Object HashMap.put(Object, Object)>
	//   16   34:pop             
		return this;
	//   17   35:aload_0         
	//   18   36:areturn         
	}

	public KeyDeserializer findKeyDeserializer(JavaType javatype, DeserializationConfig deserializationconfig, BeanDescription beandescription)
	{
		if(_classMappings == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field HashMap _classMappings>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return (KeyDeserializer)_classMappings.get(((Object) (new ClassKey(javatype.getRawClass()))));
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field HashMap _classMappings>
	//    7   13:new             #29  <Class ClassKey>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #46  <Method Class JavaType.getRawClass()>
	//   11   21:invokespecial   #32  <Method void ClassKey(Class)>
	//   12   24:invokevirtual   #50  <Method Object HashMap.get(Object)>
	//   13   27:checkcast       #52  <Class KeyDeserializer>
	//   14   30:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected HashMap _classMappings;
}
