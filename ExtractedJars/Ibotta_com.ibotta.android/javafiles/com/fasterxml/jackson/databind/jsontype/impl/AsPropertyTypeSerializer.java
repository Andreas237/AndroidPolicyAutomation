// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsArrayTypeSerializer

public class AsPropertyTypeSerializer extends AsArrayTypeSerializer
{

	public AsPropertyTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void AsArrayTypeSerializer(TypeIdResolver, BeanProperty)>
		_typePropertyName = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #13  <Field String _typePropertyName>
	//    7   11:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AsPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public volatile AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((AsArrayTypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AsPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsPropertyTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsPropertyTypeSerializer(_idResolver, beanproperty, _typePropertyName);
	//    6   10:new             #2   <Class AsPropertyTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field String _typePropertyName>
	//   13   23:invokespecial   #30  <Method void AsPropertyTypeSerializer(TypeIdResolver, BeanProperty, String)>
	//   14   26:areturn         
	}

	public String getPropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
	//    0    0:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//    1    3:areturn         
	}

	protected final String _typePropertyName;
}
