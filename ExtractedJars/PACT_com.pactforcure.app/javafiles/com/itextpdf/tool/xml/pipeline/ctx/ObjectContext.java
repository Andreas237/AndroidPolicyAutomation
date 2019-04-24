// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.ctx;

import com.itextpdf.tool.xml.CustomContext;

public class ObjectContext
	implements CustomContext
{

	public ObjectContext(Object obj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		obj = obj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field Object obj>
	//    5    9:return          
	}

	public Object get()
	{
		return obj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Object obj>
	//    2    4:areturn         
	}

	private Object obj;
}
