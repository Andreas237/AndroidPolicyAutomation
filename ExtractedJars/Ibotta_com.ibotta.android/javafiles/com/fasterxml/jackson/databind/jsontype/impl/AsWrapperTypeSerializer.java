// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeSerializerBase

public class AsWrapperTypeSerializer extends TypeSerializerBase
{

	public AsWrapperTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void TypeSerializerBase(TypeIdResolver, BeanProperty)>
	//    4    6:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #14  <Method AsWrapperTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsWrapperTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsWrapperTypeSerializer(_idResolver, beanproperty);
	//    6   10:new             #2   <Class AsWrapperTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:invokespecial   #23  <Method void AsWrapperTypeSerializer(TypeIdResolver, BeanProperty)>
	//   12   22:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
	//    0    0:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//    1    3:areturn         
	}
}
