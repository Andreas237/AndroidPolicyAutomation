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
		if(!(type instanceof Class))
	//*   6   12:aload_1         
	//*   7   13:instanceof      #19  <Class Class>
	//*   8   16:ifne            35
		{
			_type = ((ParameterizedType)type).getActualTypeArguments()[0];
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:checkcast       #25  <Class ParameterizedType>
	//   12   24:invokeinterface #29  <Method Type[] ParameterizedType.getActualTypeArguments()>
	//   13   29:iconst_0        
	//   14   30:aaload          
	//   15   31:putfield        #31  <Field Type _type>
			return;
	//   16   34:return          
		} else
		{
			throw new IllegalArgumentException("Internal error: TypeReference constructed without actual type information");
	//   17   35:new             #33  <Class IllegalArgumentException>
	//   18   38:dup             
	//   19   39:ldc1            #35  <String "Internal error: TypeReference constructed without actual type information">
	//   20   41:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//   21   44:athrow          
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
	//    1    1:getfield        #31  <Field Type _type>
	//    2    4:areturn         
	}

	protected final Type _type;
}
