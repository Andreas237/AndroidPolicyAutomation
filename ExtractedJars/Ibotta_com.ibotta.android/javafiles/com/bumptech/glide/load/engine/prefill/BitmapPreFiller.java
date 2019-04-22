// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.prefill;

import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;

public final class BitmapPreFiller
{

	public BitmapPreFiller(MemoryCache memorycache, BitmapPool bitmappool, DecodeFormat decodeformat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #25  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #28  <Method void Handler(Looper)>
	//    7   15:putfield        #30  <Field Handler handler>
		memoryCache = memorycache;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #32  <Field MemoryCache memoryCache>
		bitmapPool = bitmappool;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #34  <Field BitmapPool bitmapPool>
		defaultFormat = decodeformat;
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:putfield        #36  <Field DecodeFormat defaultFormat>
	//   17   33:return          
	}

	private final BitmapPool bitmapPool;
	private final DecodeFormat defaultFormat;
	private final Handler handler = new Handler(Looper.getMainLooper());
	private final MemoryCache memoryCache;
}
