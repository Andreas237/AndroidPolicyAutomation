// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruBitmapPool

private static final class LruBitmapPool$NullBitmapTracker
	implements LruBitmapPool.BitmapTracker
{

	public void add(Bitmap bitmap)
	{
	//    0    0:return          
	}

	public void remove(Bitmap bitmap)
	{
	//    0    0:return          
	}

	LruBitmapPool$NullBitmapTracker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
