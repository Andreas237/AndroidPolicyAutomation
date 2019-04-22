// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			AsArrayTypeDeserializer

public class AsExternalTypeDeserializer extends AsArrayTypeDeserializer
{

	public AsExternalTypeDeserializer(JavaType javatype, TypeIdResolver typeidresolver, String s, boolean flag, JavaType javatype1)
	{
		super(javatype, typeidresolver, s, flag, javatype1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #12  <Method void AsArrayTypeDeserializer(JavaType, TypeIdResolver, String, boolean, JavaType)>
	//    7   11:return          
	}

	public AsExternalTypeDeserializer(AsExternalTypeDeserializer asexternaltypedeserializer, BeanProperty beanproperty)
	{
		super(((AsArrayTypeDeserializer) (asexternaltypedeserializer)), beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void AsArrayTypeDeserializer(AsArrayTypeDeserializer, BeanProperty)>
	//    4    6:return          
	}

	protected boolean _usesExternalId()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public TypeDeserializer forProperty(BeanProperty beanproperty)
	{
		if(beanproperty == _property)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #25  <Field BeanProperty _property>
	//*   3    5:if_acmpne       10
			return ((TypeDeserializer) (this));
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return ((TypeDeserializer) (new AsExternalTypeDeserializer(this, beanproperty)));
	//    6   10:new             #2   <Class AsExternalTypeDeserializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #27  <Method void AsExternalTypeDeserializer(AsExternalTypeDeserializer, BeanProperty)>
	//   11   19:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
	//    0    0:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
