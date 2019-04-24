// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			Downsampler

public class ByteBufferBitmapDecoder
	implements ResourceDecoder
{

	public ByteBufferBitmapDecoder(Downsampler downsampler1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		downsampler = downsampler1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Downsampler downsampler>
	//    5    9:return          
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((ByteBuffer)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ByteBuffer>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #26  <Method Resource decode(ByteBuffer, int, int, Options)>
	//    7   12:areturn         
	}

	public Resource decode(ByteBuffer bytebuffer, int i, int j, Options options)
		throws IOException
	{
		bytebuffer = ((ByteBuffer) (ByteBufferUtil.toStream(bytebuffer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #33  <Method java.io.InputStream ByteBufferUtil.toStream(ByteBuffer)>
	//    2    4:astore_1        
		return downsampler.decode(((java.io.InputStream) (bytebuffer)), i, j, options);
	//    3    5:aload_0         
	//    4    6:getfield        #16  <Field Downsampler downsampler>
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:iload_3         
	//    8   12:aload           4
	//    9   14:invokevirtual   #38  <Method Resource Downsampler.decode(java.io.InputStream, int, int, Options)>
	//   10   17:areturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((ByteBuffer)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class ByteBuffer>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #45  <Method boolean handles(ByteBuffer, Options)>
	//    5    9:ireturn         
	}

	public boolean handles(ByteBuffer bytebuffer, Options options)
		throws IOException
	{
		return downsampler.handles(bytebuffer);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Downsampler downsampler>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #48  <Method boolean Downsampler.handles(ByteBuffer)>
	//    4    8:ireturn         
	}

	private final Downsampler downsampler;
}
