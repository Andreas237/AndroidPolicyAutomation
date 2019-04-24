// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.model:
//			ByteArrayLoader

class ByteArrayLoader$ByteBufferFactory$1
	implements ByteArrayLoader.Converter
{

	public volatile Object convert(byte abyte0[])
	{
		return ((Object) (convert(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method ByteBuffer convert(byte[])>
	//    3    5:areturn         
	}

	public ByteBuffer convert(byte abyte0[])
	{
		return ByteBuffer.wrap(abyte0);
	//    0    0:aload_1         
	//    1    1:invokestatic    #35  <Method ByteBuffer ByteBuffer.wrap(byte[])>
	//    2    4:areturn         
	}

	public Class getDataClass()
	{
		return java/nio/ByteBuffer;
	//    0    0:ldc1            #32  <Class ByteBuffer>
	//    1    2:areturn         
	}

	final ByteArrayLoader.ByteBufferFactory this$0;

	ByteArrayLoader$ByteBufferFactory$1()
	{
		this$0 = ByteArrayLoader.ByteBufferFactory.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ByteArrayLoader$ByteBufferFactory this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:return          
	}
}
