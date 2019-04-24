// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;


// Referenced classes of package com.fasterxml.jackson.databind:
//			BeanDescription, DeserializationConfig, JavaType

public abstract class AbstractTypeResolver
{

	public AbstractTypeResolver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public JavaType findTypeMapping(DeserializationConfig deserializationconfig, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, BeanDescription beandescription)
	{
		return resolveAbstractType(deserializationconfig, beandescription.getType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #19  <Method JavaType BeanDescription.getType()>
	//    4    6:invokevirtual   #21  <Method JavaType resolveAbstractType(DeserializationConfig, JavaType)>
	//    5    9:areturn         
	}

	public JavaType resolveAbstractType(DeserializationConfig deserializationconfig, JavaType javatype)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}
}
