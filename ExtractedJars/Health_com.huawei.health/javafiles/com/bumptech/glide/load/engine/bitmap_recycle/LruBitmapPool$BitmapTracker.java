// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			LruBitmapPool

static interface LruBitmapPool$BitmapTracker
{

	public abstract void add(Bitmap bitmap);

	public abstract void remove(Bitmap bitmap);
}
