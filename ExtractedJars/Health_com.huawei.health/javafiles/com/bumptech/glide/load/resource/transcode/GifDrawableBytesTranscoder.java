// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public class GifDrawableBytesTranscoder
	implements ResourceTranscoder
{

	public GifDrawableBytesTranscoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public Resource transcode(Resource resource)
	{
		return ((Resource) (new BytesResource(ByteBufferUtil.toBytes(((GifDrawable)resource.get()).getBuffer()))));
	//    0    0:new             #16  <Class BytesResource>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #22  <Method Object Resource.get()>
	//    4   10:checkcast       #24  <Class GifDrawable>
	//    5   13:invokevirtual   #28  <Method java.nio.ByteBuffer GifDrawable.getBuffer()>
	//    6   16:invokestatic    #34  <Method byte[] ByteBufferUtil.toBytes(java.nio.ByteBuffer)>
	//    7   19:invokespecial   #37  <Method void BytesResource(byte[])>
	//    8   22:areturn         
	}
}
