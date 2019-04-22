// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class UnresolvedId
{

	public UnresolvedId(Object obj, Class class1, JsonLocation jsonlocation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		_id = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Object _id>
		_type = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field Class _type>
		_location = jsonlocation;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field JsonLocation _location>
	//   11   19:return          
	}

	public String toString()
	{
		return String.format("Object id [%s] (for %s) at %s", new Object[] {
			_id, ClassUtil.nameOf(_type), _location
		});
	//    0    0:ldc1            #29  <String "Object id [%s] (for %s) at %s">
	//    1    2:iconst_3        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #18  <Field Object _id>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #20  <Field Class _type>
	//   12   19:invokestatic    #35  <Method String ClassUtil.nameOf(Class)>
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_2        
	//   16   25:aload_0         
	//   17   26:getfield        #22  <Field JsonLocation _location>
	//   18   29:aastore         
	//   19   30:invokestatic    #41  <Method String String.format(String, Object[])>
	//   20   33:areturn         
	}

	private final Object _id;
	private final JsonLocation _location;
	private final Class _type;
}
