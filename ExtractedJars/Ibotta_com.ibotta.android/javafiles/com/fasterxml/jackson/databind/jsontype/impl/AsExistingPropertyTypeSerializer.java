// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsPropertyTypeSerializer, AsArrayTypeSerializer

public class AsExistingPropertyTypeSerializer extends AsPropertyTypeSerializer
{

	public AsExistingPropertyTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
	{
		super(typeidresolver, beanproperty, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #8   <Method void AsPropertyTypeSerializer(TypeIdResolver, BeanProperty, String)>
	//    5    7:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #14  <Method AsExistingPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public volatile AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((AsArrayTypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #14  <Method AsExistingPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsExistingPropertyTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsExistingPropertyTypeSerializer(_idResolver, beanproperty, _typePropertyName);
	//    6   10:new             #2   <Class AsExistingPropertyTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #27  <Field String _typePropertyName>
	//   13   23:invokespecial   #28  <Method void AsExistingPropertyTypeSerializer(TypeIdResolver, BeanProperty, String)>
	//   14   26:areturn         
	}

	public volatile AsPropertyTypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((AsPropertyTypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #14  <Method AsExistingPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXISTING_PROPERTY;
	//    0    0:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXISTING_PROPERTY>
	//    1    3:areturn         
	}
}
