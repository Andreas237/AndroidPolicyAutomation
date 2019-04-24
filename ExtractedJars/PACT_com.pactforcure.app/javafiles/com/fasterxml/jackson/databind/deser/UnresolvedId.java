// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;

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

	public Object getId()
	{
		return _id;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object _id>
	//    2    4:areturn         
	}

	public JsonLocation getLocation()
	{
		return _location;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field JsonLocation _location>
	//    2    4:areturn         
	}

	public Class getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Class _type>
	//    2    4:areturn         
	}

	public String toString()
	{
		Object obj = _id;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object _id>
	//    2    4:astore_2        
		String s;
		if(_type == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #20  <Field Class _type>
	//*   5    9:ifnonnull       40
			s = "NULL";
	//    6   12:ldc1            #36  <String "NULL">
	//    7   14:astore_1        
		else
	//*   8   15:ldc1            #38  <String "Object id [%s] (for %s) at %s">
	//*   9   17:iconst_3        
	//*  10   18:anewarray       Object[]
	//*  11   21:dup             
	//*  12   22:iconst_0        
	//*  13   23:aload_2         
	//*  14   24:aastore         
	//*  15   25:dup             
	//*  16   26:iconst_1        
	//*  17   27:aload_1         
	//*  18   28:aastore         
	//*  19   29:dup             
	//*  20   30:iconst_2        
	//*  21   31:aload_0         
	//*  22   32:getfield        #22  <Field JsonLocation _location>
	//*  23   35:aastore         
	//*  24   36:invokestatic    #44  <Method String String.format(String, Object[])>
	//*  25   39:areturn         
			s = _type.getName();
	//   26   40:aload_0         
	//   27   41:getfield        #20  <Field Class _type>
	//   28   44:invokevirtual   #49  <Method String Class.getName()>
	//   29   47:astore_1        
		return String.format("Object id [%s] (for %s) at %s", new Object[] {
			obj, s, _location
		});
	//*  30   48:goto            15
	}

	private final Object _id;
	private final JsonLocation _location;
	private final Class _type;
}
