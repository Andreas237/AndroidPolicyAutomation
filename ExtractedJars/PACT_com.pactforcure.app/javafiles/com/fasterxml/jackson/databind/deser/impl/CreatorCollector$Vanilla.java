// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			CreatorCollector

protected static final class CreatorCollector$Vanilla extends ValueInstantiator
	implements Serializable
{

	public boolean canCreateUsingDefault()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canInstantiate()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public Object createUsingDefault(DeserializationContext deserializationcontext)
		throws IOException
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int _type>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 62
	//	               2 70
	//	               3 78
		default:
			throw new IllegalStateException((new StringBuilder()).append("Unknown type ").append(_type).toString());
	//    3   32:new             #38  <Class IllegalStateException>
	//    4   35:dup             
	//    5   36:new             #40  <Class StringBuilder>
	//    6   39:dup             
	//    7   40:invokespecial   #41  <Method void StringBuilder()>
	//    8   43:ldc1            #43  <String "Unknown type ">
	//    9   45:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   10   48:aload_0         
	//   11   49:getfield        #28  <Field int _type>
	//   12   52:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   13   55:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   14   58:invokespecial   #57  <Method void IllegalStateException(String)>
	//   15   61:athrow          

		case 1: // '\001'
			return ((Object) (new ArrayList()));
	//   16   62:new             #59  <Class ArrayList>
	//   17   65:dup             
	//   18   66:invokespecial   #60  <Method void ArrayList()>
	//   19   69:areturn         

		case 2: // '\002'
			return ((Object) (new LinkedHashMap()));
	//   20   70:new             #62  <Class LinkedHashMap>
	//   21   73:dup             
	//   22   74:invokespecial   #63  <Method void LinkedHashMap()>
	//   23   77:areturn         

		case 3: // '\003'
			return ((Object) (new HashMap()));
	//   24   78:new             #65  <Class HashMap>
	//   25   81:dup             
	//   26   82:invokespecial   #66  <Method void HashMap()>
	//   27   85:areturn         
		}
	}

	public String getValueTypeDesc()
	{
		switch(_type)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int _type>
		{
	//*   2    4:tableswitch     1 3: default 32
	//	               1 38
	//	               2 44
	//	               3 50
		default:
			return ((Class) (java/lang/Object)).getName();
	//    3   32:ldc1            #70  <Class Object>
	//    4   34:invokevirtual   #75  <Method String Class.getName()>
	//    5   37:areturn         

		case 1: // '\001'
			return ((Class) (java/util/ArrayList)).getName();
	//    6   38:ldc1            #59  <Class ArrayList>
	//    7   40:invokevirtual   #75  <Method String Class.getName()>
	//    8   43:areturn         

		case 2: // '\002'
			return ((Class) (java/util/LinkedHashMap)).getName();
	//    9   44:ldc1            #62  <Class LinkedHashMap>
	//   10   46:invokevirtual   #75  <Method String Class.getName()>
	//   11   49:areturn         

		case 3: // '\003'
			return ((Class) (java/util/HashMap)).getName();
	//   12   50:ldc1            #65  <Class HashMap>
	//   13   52:invokevirtual   #75  <Method String Class.getName()>
	//   14   55:areturn         
		}
	}

	public static final int TYPE_COLLECTION = 1;
	public static final int TYPE_HASH_MAP = 3;
	public static final int TYPE_MAP = 2;
	private static final long serialVersionUID = 1L;
	private final int _type;

	public CreatorCollector$Vanilla(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ValueInstantiator()>
		_type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int _type>
	//    5    9:return          
	}
}
