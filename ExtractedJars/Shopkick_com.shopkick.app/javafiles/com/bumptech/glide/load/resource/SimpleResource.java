// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class SimpleResource
	implements Resource
{

	public SimpleResource(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		data = Preconditions.checkNotNull(obj);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #22  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:putfield        #24  <Field Object data>
	//    6   12:return          
	}

	public final Object get()
	{
		return data;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object data>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return data.getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object data>
	//    2    4:invokevirtual   #37  <Method Class Object.getClass()>
	//    3    7:areturn         
	}

	public final int getSize()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void recycle()
	{
	//    0    0:return          
	}

	protected final Object data;
}
