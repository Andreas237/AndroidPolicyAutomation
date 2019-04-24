// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//			ReadableObjectId

public static abstract class ReadableObjectId$Referring
{

	public Class getBeanType()
	{
		return _beanType;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Class _beanType>
	//    2    4:areturn         
	}

	public JsonLocation getLocation()
	{
		return _reference.getLocation();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field UnresolvedForwardReference _reference>
	//    2    4:invokevirtual   #33  <Method JsonLocation UnresolvedForwardReference.getLocation()>
	//    3    7:areturn         
	}

	public abstract void handleResolvedForwardReference(Object obj, Object obj1)
		throws IOException;

	public boolean hasId(Object obj)
	{
		return obj.equals(_reference.getUnresolvedId());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field UnresolvedForwardReference _reference>
	//    3    5:invokevirtual   #43  <Method Object UnresolvedForwardReference.getUnresolvedId()>
	//    4    8:invokevirtual   #46  <Method boolean Object.equals(Object)>
	//    5   11:ireturn         
	}

	private final Class _beanType;
	private final UnresolvedForwardReference _reference;

	public ReadableObjectId$Referring(UnresolvedForwardReference unresolvedforwardreference, Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		_reference = unresolvedforwardreference;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field UnresolvedForwardReference _reference>
		_beanType = class1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Class _beanType>
	//    8   14:return          
	}
}
