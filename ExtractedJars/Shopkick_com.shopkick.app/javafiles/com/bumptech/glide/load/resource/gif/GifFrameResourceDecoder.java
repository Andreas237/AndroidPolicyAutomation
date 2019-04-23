// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import java.io.IOException;

public final class GifFrameResourceDecoder
	implements ResourceDecoder
{

	public GifFrameResourceDecoder(BitmapPool bitmappool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field BitmapPool bitmapPool>
	//    5    9:return          
	}

	public Resource decode(GifDecoder gifdecoder, int i, int j, Options options)
	{
		return ((Resource) (BitmapResource.obtain(gifdecoder.getNextFrame(), bitmapPool)));
	//    0    0:aload_1         
	//    1    1:invokeinterface #26  <Method android.graphics.Bitmap GifDecoder.getNextFrame()>
	//    2    6:aload_0         
	//    3    7:getfield        #16  <Field BitmapPool bitmapPool>
	//    4   10:invokestatic    #32  <Method BitmapResource BitmapResource.obtain(android.graphics.Bitmap, BitmapPool)>
	//    5   13:areturn         
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((GifDecoder)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class GifDecoder>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #40  <Method Resource decode(GifDecoder, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(GifDecoder gifdecoder, Options options)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((GifDecoder)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class GifDecoder>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #46  <Method boolean handles(GifDecoder, Options)>
	//    5    9:ireturn         
	}

	private final BitmapPool bitmapPool;
}
