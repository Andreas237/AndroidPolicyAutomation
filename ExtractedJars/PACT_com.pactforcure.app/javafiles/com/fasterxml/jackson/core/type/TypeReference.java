// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.type;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TypeReference
	implements Comparable
{

	protected TypeReference()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		Type type = ((Object)this).getClass().getGenericSuperclass();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #17  <Method Class Object.getClass()>
	//    4    8:invokevirtual   #23  <Method Type Class.getGenericSuperclass()>
	//    5   11:astore_1        
		if(type instanceof Class)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #19  <Class Class>
	//*   8   16:ifeq            29
		{
			throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
	//    9   19:new             #25  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #27  <String "Internal error: TypeReference constructed without actual type information">
	//   12   25:invokespecial   #30  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
		} else
		{
			_type = ((ParameterizedType)type).getActualTypeArguments()[0];
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:checkcast       #32  <Class ParameterizedType>
	//   17   34:invokeinterface #36  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   18   39:iconst_0        
	//   19   40:aaload          
	//   20   41:putfield        #38  <Field Type _type>
			return;
	//   21   44:return          
		}
	}

	public int compareTo(TypeReference typereference)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((TypeReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class TypeReference>
	//    3    5:invokevirtual   #46  <Method int compareTo(TypeReference)>
	//    4    8:ireturn         
	}

	public Type getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Type _type>
	//    2    4:areturn         
	}

	protected final Type _type;
}
