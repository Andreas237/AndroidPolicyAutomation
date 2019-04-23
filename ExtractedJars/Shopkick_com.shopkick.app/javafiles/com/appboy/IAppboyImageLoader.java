// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.appboy.enums.AppboyViewBounds;

public interface IAppboyImageLoader
{

	public abstract Bitmap getBitmapFromUrl(Context context, String s, AppboyViewBounds appboyviewbounds);

	public abstract void renderUrlIntoView(Context context, String s, ImageView imageview, AppboyViewBounds appboyviewbounds);

	public abstract void setOffline(boolean flag);
}
