// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

interface LruPoolStrategy
{

	public abstract Bitmap get(int i, int j, android.graphics.Bitmap.Config config);

	public abstract int getSize(Bitmap bitmap);

	public abstract String logBitmap(int i, int j, android.graphics.Bitmap.Config config);

	public abstract String logBitmap(Bitmap bitmap);

	public abstract void put(Bitmap bitmap);

	public abstract Bitmap removeLast();
}
