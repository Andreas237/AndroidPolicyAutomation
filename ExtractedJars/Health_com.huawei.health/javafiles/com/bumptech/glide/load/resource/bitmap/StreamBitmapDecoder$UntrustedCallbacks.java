// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.ExceptionCatchingInputStream;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			StreamBitmapDecoder, RecyclableBufferedInputStream

static class StreamBitmapDecoder$UntrustedCallbacks
	implements Downsampler.DecodeCallbacks
{

	public void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
		throws IOException
	{
		IOException ioexception = exceptionStream.getException();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field ExceptionCatchingInputStream exceptionStream>
	//    2    4:invokevirtual   #33  <Method IOException ExceptionCatchingInputStream.getException()>
	//    3    7:astore_3        
		if(ioexception != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          25
		{
			if(bitmap != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          23
				bitmappool.put(bitmap);
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #39  <Method void BitmapPool.put(Bitmap)>
			throw ioexception;
	//   11   23:aload_3         
	//   12   24:athrow          
		} else
		{
			return;
	//   13   25:return          
		}
	}

	public void onObtainBounds()
	{
		bufferedStream.fixMarkLimit();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RecyclableBufferedInputStream bufferedStream>
	//    2    4:invokevirtual   #46  <Method void RecyclableBufferedInputStream.fixMarkLimit()>
	//    3    7:return          
	}

	private final RecyclableBufferedInputStream bufferedStream;
	private final ExceptionCatchingInputStream exceptionStream;

	public StreamBitmapDecoder$UntrustedCallbacks(RecyclableBufferedInputStream recyclablebufferedinputstream, ExceptionCatchingInputStream exceptioncatchinginputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		bufferedStream = recyclablebufferedinputstream;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field RecyclableBufferedInputStream bufferedStream>
		exceptionStream = exceptioncatchinginputstream;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #22  <Field ExceptionCatchingInputStream exceptionStream>
	//    8   14:return          
	}
}
