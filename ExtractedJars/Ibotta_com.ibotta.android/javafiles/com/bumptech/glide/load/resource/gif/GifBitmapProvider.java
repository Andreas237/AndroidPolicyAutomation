// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public final class GifBitmapProvider
	implements com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider
{

	public GifBitmapProvider(BitmapPool bitmappool, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field BitmapPool bitmapPool>
		arrayPool = arraypool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field ArrayPool arrayPool>
	//    8   14:return          
	}

	public Bitmap obtain(int i, int j, android.graphics.Bitmap.Config config)
	{
		return bitmapPool.getDirty(i, j, config);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BitmapPool bitmapPool>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #30  <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//    6   12:areturn         
	}

	public byte[] obtainByteArray(int i)
	{
		ArrayPool arraypool = arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool arrayPool>
	//    2    4:astore_2        
		if(arraypool == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       13
			return new byte[i];
	//    5    9:iload_1         
	//    6   10:newarray        byte[]
	//    7   12:areturn         
		else
			return (byte[])arraypool.get(i, [B);
	//    8   13:aload_2         
	//    9   14:iload_1         
	//   10   15:ldc1            #35  <Class byte[]>
	//   11   17:invokeinterface #41  <Method Object ArrayPool.get(int, Class)>
	//   12   22:checkcast       #35  <Class byte[]>
	//   13   25:areturn         
	}

	public int[] obtainIntArray(int i)
	{
		ArrayPool arraypool = arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool arrayPool>
	//    2    4:astore_2        
		if(arraypool == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       13
			return new int[i];
	//    5    9:iload_1         
	//    6   10:newarray        int[]
	//    7   12:areturn         
		else
			return (int[])arraypool.get(i, [I);
	//    8   13:aload_2         
	//    9   14:iload_1         
	//   10   15:ldc1            #45  <Class int[]>
	//   11   17:invokeinterface #41  <Method Object ArrayPool.get(int, Class)>
	//   12   22:checkcast       #45  <Class int[]>
	//   13   25:areturn         
	}

	public void release(Bitmap bitmap)
	{
		bitmapPool.put(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field BitmapPool bitmapPool>
	//    2    4:aload_1         
	//    3    5:invokeinterface #50  <Method void BitmapPool.put(Bitmap)>
	//    4   10:return          
	}

	public void release(byte abyte0[])
	{
		ArrayPool arraypool = arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool arrayPool>
	//    2    4:astore_2        
		if(arraypool == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			arraypool.put(((Object) (abyte0)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #54  <Method void ArrayPool.put(Object)>
			return;
	//    9   17:return          
		}
	}

	public void release(int ai[])
	{
		ArrayPool arraypool = arrayPool;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ArrayPool arrayPool>
	//    2    4:astore_2        
		if(arraypool == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			arraypool.put(((Object) (ai)));
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokeinterface #54  <Method void ArrayPool.put(Object)>
			return;
	//    9   17:return          
		}
	}

	private final ArrayPool arrayPool;
	private final BitmapPool bitmapPool;
}
