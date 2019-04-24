// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			PropertySerializerMap

private static final class PropertySerializerMap$Empty extends PropertySerializerMap
{

	public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
	{
		return ((PropertySerializerMap) (new (((PropertySerializerMap) (this)), class1, jsonserializer)));
	//    0    0:new             #24  <Class PropertySerializerMap$Single>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #27  <Method void PropertySerializerMap$Single(PropertySerializerMap, Class, JsonSerializer)>
	//    6   10:areturn         
	}

	public JsonSerializer serializerFor(Class class1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public static final PropertySerializerMap$Empty FOR_PROPERTIES = new PropertySerializerMap$Empty(false);
	public static final PropertySerializerMap$Empty FOR_ROOT_VALUES = new PropertySerializerMap$Empty(true);

	static 
	{
	//    0    0:new             #2   <Class PropertySerializerMap$Empty>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #14  <Method void PropertySerializerMap$Empty(boolean)>
	//    4    8:putstatic       #16  <Field PropertySerializerMap$Empty FOR_PROPERTIES>
	//    5   11:new             #2   <Class PropertySerializerMap$Empty>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #14  <Method void PropertySerializerMap$Empty(boolean)>
	//    9   19:putstatic       #18  <Field PropertySerializerMap$Empty FOR_ROOT_VALUES>
	//*  10   22:return          
	}

	protected PropertySerializerMap$Empty(boolean flag)
	{
		super(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #20  <Method void PropertySerializerMap(boolean)>
	//    3    5:return          
	}
}
