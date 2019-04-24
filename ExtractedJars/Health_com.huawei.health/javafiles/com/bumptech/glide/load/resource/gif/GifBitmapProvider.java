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

	public GifBitmapProvider(BitmapPool bitmappool)
	{
		this(bitmappool, ((ArrayPool) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #16  <Method void GifBitmapProvider(BitmapPool, ArrayPool)>
	//    4    6:return          
	}

	public GifBitmapProvider(BitmapPool bitmappool, ArrayPool arraypool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field BitmapPool bitmapPool>
		arrayPool = arraypool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ArrayPool arrayPool>
	//    8   14:return          
	}

	public Bitmap obtain(int i, int j, android.graphics.Bitmap.Config config)
	{
		return bitmapPool.getDirty(i, j, config);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field BitmapPool bitmapPool>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #32  <Method Bitmap BitmapPool.getDirty(int, int, android.graphics.Bitmap$Config)>
	//    6   12:areturn         
	}

	public byte[] obtainByteArray(int i)
	{
		if(arrayPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayPool arrayPool>
	//*   2    4:ifnonnull       11
			return new byte[i];
	//    3    7:iload_1         
	//    4    8:newarray        byte[]
	//    5   10:areturn         
		else
			return (byte[])arrayPool.get(i, [B);
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field ArrayPool arrayPool>
	//    8   15:iload_1         
	//    9   16:ldc1            #37  <Class byte[]>
	//   10   18:invokeinterface #43  <Method Object ArrayPool.get(int, Class)>
	//   11   23:checkcast       #37  <Class byte[]>
	//   12   26:areturn         
	}

	public int[] obtainIntArray(int i)
	{
		if(arrayPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayPool arrayPool>
	//*   2    4:ifnonnull       11
			return new int[i];
	//    3    7:iload_1         
	//    4    8:newarray        int[]
	//    5   10:areturn         
		else
			return (int[])arrayPool.get(i, [I);
	//    6   11:aload_0         
	//    7   12:getfield        #24  <Field ArrayPool arrayPool>
	//    8   15:iload_1         
	//    9   16:ldc1            #47  <Class int[]>
	//   10   18:invokeinterface #43  <Method Object ArrayPool.get(int, Class)>
	//   11   23:checkcast       #47  <Class int[]>
	//   12   26:areturn         
	}

	public void release(Bitmap bitmap)
	{
		bitmapPool.put(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field BitmapPool bitmapPool>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method void BitmapPool.put(Bitmap)>
	//    4   10:return          
	}

	public void release(byte abyte0[])
	{
		if(arrayPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayPool arrayPool>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			arrayPool.put(((Object) (abyte0)), [B);
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field ArrayPool arrayPool>
	//    6   12:aload_1         
	//    7   13:ldc1            #37  <Class byte[]>
	//    8   15:invokeinterface #56  <Method void ArrayPool.put(Object, Class)>
			return;
	//    9   20:return          
		}
	}

	public void release(int ai[])
	{
		if(arrayPool == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field ArrayPool arrayPool>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			arrayPool.put(((Object) (ai)), [I);
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field ArrayPool arrayPool>
	//    6   12:aload_1         
	//    7   13:ldc1            #47  <Class int[]>
	//    8   15:invokeinterface #56  <Method void ArrayPool.put(Object, Class)>
			return;
	//    9   20:return          
		}
	}

	private final ArrayPool arrayPool;
	private final BitmapPool bitmapPool;
}
