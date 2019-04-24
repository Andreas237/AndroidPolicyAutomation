// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

public class BytesResource
	implements Resource
{

	public BytesResource(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bytes = (byte[])Preconditions.checkNotNull(((Object) (abyte0)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #20  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #21  <Class byte[]>
	//    6   12:putfield        #23  <Field byte[] bytes>
	//    7   15:return          
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #29  <Method byte[] get()>
	//    2    4:areturn         
	}

	public byte[] get()
	{
		return bytes;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field byte[] bytes>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return [B;
	//    0    0:ldc1            #21  <Class byte[]>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return bytes.length;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field byte[] bytes>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public void recycle()
	{
	//    0    0:return          
	}

	private final byte bytes[];
}
