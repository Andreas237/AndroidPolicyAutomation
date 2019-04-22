// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;

public class SimpleValueInstantiators extends com.fasterxml.jackson.databind.deser.ValueInstantiators.Base
	implements Serializable
{

	public SimpleValueInstantiators()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void com.fasterxml.jackson.databind.deser.ValueInstantiators$Base()>
		_classMappings = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #19  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void HashMap()>
	//    6   12:putfield        #22  <Field HashMap _classMappings>
	//    7   15:return          
	}

	public SimpleValueInstantiators addValueInstantiator(Class class1, ValueInstantiator valueinstantiator)
	{
		_classMappings.put(((Object) (new ClassKey(class1))), ((Object) (valueinstantiator)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field HashMap _classMappings>
	//    2    4:new             #27  <Class ClassKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #30  <Method void ClassKey(Class)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #34  <Method Object HashMap.put(Object, Object)>
	//    8   16:pop             
		return this;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public ValueInstantiator findValueInstantiator(DeserializationConfig deserializationconfig, BeanDescription beandescription, ValueInstantiator valueinstantiator)
	{
		beandescription = ((BeanDescription) ((ValueInstantiator)_classMappings.get(((Object) (new ClassKey(beandescription.getBeanClass()))))));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field HashMap _classMappings>
	//    2    4:new             #27  <Class ClassKey>
	//    3    7:dup             
	//    4    8:aload_2         
	//    5    9:invokevirtual   #44  <Method Class BeanDescription.getBeanClass()>
	//    6   12:invokespecial   #30  <Method void ClassKey(Class)>
	//    7   15:invokevirtual   #48  <Method Object HashMap.get(Object)>
	//    8   18:checkcast       #50  <Class ValueInstantiator>
	//    9   21:astore_2        
		deserializationconfig = ((DeserializationConfig) (beandescription));
	//   10   22:aload_2         
	//   11   23:astore_1        
		if(beandescription == null)
	//*  12   24:aload_2         
	//*  13   25:ifnonnull       30
			deserializationconfig = ((DeserializationConfig) (valueinstantiator));
	//   14   28:aload_3         
	//   15   29:astore_1        
		return ((ValueInstantiator) (deserializationconfig));
	//   16   30:aload_1         
	//   17   31:areturn         
	}

	private static final long serialVersionUID = 0xa51c90c6L;
	protected HashMap _classMappings;
}
