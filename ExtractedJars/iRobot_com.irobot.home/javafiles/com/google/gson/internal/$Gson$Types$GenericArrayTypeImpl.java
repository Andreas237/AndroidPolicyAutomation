// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

private static final class $Gson$Types$GenericArrayTypeImpl
	implements Serializable, GenericArrayType
{

	public boolean equals(Object obj)
	{
		return (obj instanceof GenericArrayType) && .Gson.Types.equals(((Type) (this)), ((Type) ((GenericArrayType)obj)));
	//    0    0:aload_1         
	//    1    1:instanceof      #8   <Class GenericArrayType>
	//    2    4:ifeq            20
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #8   <Class GenericArrayType>
	//    6   12:invokestatic    #34  <Method boolean $Gson$Types.equals(Type, Type)>
	//    7   15:ifeq            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	public Type getGenericComponentType()
	{
		return componentType;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Type componentType>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ((Object) (componentType)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Type componentType>
	//    2    4:invokevirtual   #40  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(.Gson.Types.typeToString(componentType));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field Type componentType>
	//    7   13:invokestatic    #49  <Method String $Gson$Types.typeToString(Type)>
	//    8   16:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append("[]");
	//   10   20:aload_1         
	//   11   21:ldc1            #55  <String "[]">
	//   12   23:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	private static final long serialVersionUID = 0L;
	private final Type componentType;

	public $Gson$Types$GenericArrayTypeImpl(Type type)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		componentType = .Gson.Types.canonicalize(type);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method Type $Gson$Types.canonicalize(Type)>
	//    5    9:putfield        #28  <Field Type componentType>
	//    6   12:return          
	}
}
