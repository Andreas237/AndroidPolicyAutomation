// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.graphics.Bitmap;
import android.graphics.Canvas;

interface ShowcaseDrawer
{

	public abstract void drawShowcase(Bitmap bitmap, float f, float f1, float f2);

	public abstract void drawToCanvas(Canvas canvas, Bitmap bitmap);

	public abstract void erase(Bitmap bitmap);

	public abstract float getBlockedRadius();

	public abstract int getShowcaseHeight();

	public abstract int getShowcaseWidth();

	public abstract void setBackgroundColour(int i);

	public abstract void setShowcaseColour(int i);
}
