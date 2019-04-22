// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;

public abstract class TypeIdResolverBase
	implements TypeIdResolver
{

	protected TypeIdResolverBase(JavaType javatype, TypeFactory typefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		_baseType = javatype;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field JavaType _baseType>
		_typeFactory = typefactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field TypeFactory _typeFactory>
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
	//    3    3:getfield        #17  <Field JavaType _baseType>
	//    4    6:invokevirtual   #29  <Method Class JavaType.getRawClass()>
	//    5    9:invokevirtual   #33  <Method String idFromValueAndType(Object, Class)>
	//    6   12:areturn         
	}

	public void init(JavaType javatype)
	{
	//    0    0:return          
	}

	public JavaType typeFromId(DatabindContext databindcontext, String s)
		throws IOException
	{
		databindcontext = ((DatabindContext) (new StringBuilder()));
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (databindcontext)).append("Sub-class ");
	//    4    8:aload_1         
	//    5    9:ldc1            #44  <String "Sub-class ">
	//    6   11:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (databindcontext)).append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #51  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #56  <Method String Class.getName()>
	//   12   23:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		((StringBuilder) (databindcontext)).append(" MUST implement ");
	//   14   27:aload_1         
	//   15   28:ldc1            #58  <String " MUST implement ">
	//   16   30:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		((StringBuilder) (databindcontext)).append("`typeFromId(DatabindContext,String)");
	//   18   34:aload_1         
	//   19   35:ldc1            #60  <String "`typeFromId(DatabindContext,String)">
	//   20   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		throw new IllegalStateException(((StringBuilder) (databindcontext)).toString());
	//   22   41:new             #62  <Class IllegalStateException>
	//   23   44:dup             
	//   24   45:aload_1         
	//   25   46:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   26   49:invokespecial   #68  <Method void IllegalStateException(String)>
	//   27   52:athrow          
	}

	protected final JavaType _baseType;
	protected final TypeFactory _typeFactory;
}
