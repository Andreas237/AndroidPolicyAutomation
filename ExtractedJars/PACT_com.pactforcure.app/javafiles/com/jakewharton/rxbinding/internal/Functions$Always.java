// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.internal;

import rx.functions.Func0;
import rx.functions.Func1;

// Referenced classes of package com.jakewharton.rxbinding.internal:
//			Functions

private static final class Functions$Always
	implements Func1, Func0
{

	public Object call()
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object value>
	//    2    4:areturn         
	}

	public Object call(Object obj)
	{
		return value;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Object value>
	//    2    4:areturn         
	}

	private final Object value;

	private Functions$Always(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Object value>
	//    5    9:return          
	}

	Functions$Always(Object obj, Functions._cls1 _pcls1)
	{
		this(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void Functions$Always(Object)>
	//    3    5:return          
	}
}
