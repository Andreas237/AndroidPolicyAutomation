// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


public class Mutable
{

	public Mutable(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object value>
	//    5    9:return          
	}

	public Object value;
}
