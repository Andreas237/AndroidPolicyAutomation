// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.data.DataRewinder;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.resource.bytes:
//			ByteBufferRewinder

public static class ByteBufferRewinder$Factory
	implements com.bumptech.glide.load.data.DataRewinder.Factory
{

	public volatile DataRewinder build(Object obj)
	{
		return build((ByteBuffer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #19  <Class ByteBuffer>
	//    3    5:invokevirtual   #22  <Method DataRewinder build(ByteBuffer)>
	//    4    8:areturn         
	}

	public DataRewinder build(ByteBuffer bytebuffer)
	{
		return ((DataRewinder) (new ByteBufferRewinder(bytebuffer)));
	//    0    0:new             #9   <Class ByteBufferRewinder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #25  <Method void ByteBufferRewinder(ByteBuffer)>
	//    4    8:areturn         
	}

	public Class getDataClass()
	{
		return java/nio/ByteBuffer;
	//    0    0:ldc1            #19  <Class ByteBuffer>
	//    1    2:areturn         
	}

	public ByteBufferRewinder$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
