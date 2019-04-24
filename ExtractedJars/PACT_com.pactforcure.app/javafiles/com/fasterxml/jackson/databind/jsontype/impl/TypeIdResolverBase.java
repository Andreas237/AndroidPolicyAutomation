// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public abstract class TypeIdResolverBase
	implements TypeIdResolver
{

	protected TypeIdResolverBase()
	{
		this(((JavaType) (null)), ((TypeFactory) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void TypeIdResolverBase(JavaType, TypeFactory)>
	//    4    6:return          
	}

	protected TypeIdResolverBase(JavaType javatype, TypeFactory typefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		_baseType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field JavaType _baseType>
		_typeFactory = typefactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field TypeFactory _typeFactory>
	//    8   14:return          
	}

	public String getDescForKnownTypeIds()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String idFromBaseType()
	{
		return idFromValueAndType(((Object) (null)), _baseType.getRawClass());
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:getfield        #20  <Field JavaType _baseType>
	//    4    6:invokevirtual   #31  <Method Class JavaType.getRawClass()>
	//    5    9:invokevirtual   #35  <Method String idFromValueAndType(Object, Class)>
	//    6   12:areturn         
	}

	public void init(JavaType javatype)
	{
	//    0    0:return          
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
	{
		throw new IllegalStateException((new StringBuilder()).append("Sub-class ").append(((Object)this).getClass().getName()).append(" MUST implement ").append("`typeFromId(DatabindContext,String)").toString());
	//    0    0:new             #41  <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:new             #43  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #44  <Method void StringBuilder()>
	//    5   11:ldc1            #46  <String "Sub-class ">
	//    6   13:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #53  <Method Class Object.getClass()>
	//    9   20:invokevirtual   #58  <Method String Class.getName()>
	//   10   23:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #60  <String " MUST implement ">
	//   12   28:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc1            #62  <String "`typeFromId(DatabindContext,String)">
	//   14   33:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
	//   15   36:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   16   39:invokespecial   #68  <Method void IllegalStateException(String)>
	//   17   42:athrow          
	}

	public JavaType typeFromId(String s)
	{
		return typeFromId(((DatabindContext) (null)), s);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #72  <Method JavaType typeFromId(DatabindContext, String)>
	//    4    6:areturn         
	}

	protected final JavaType _baseType;
	protected final TypeFactory _typeFactory;
}
