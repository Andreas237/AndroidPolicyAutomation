// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

public interface BitmapPool
{

	public abstract void clearMemory();

	public abstract Bitmap get(int i, int j, android.graphics.Bitmap.Config config);

	public abstract Bitmap getDirty(int i, int j, android.graphics.Bitmap.Config config);

	public abstract int getMaxSize();

	public abstract void put(Bitmap bitmap);

	public abstract void setSizeMultiplier(float f);

	public abstract void trimMemory(int i);
}
