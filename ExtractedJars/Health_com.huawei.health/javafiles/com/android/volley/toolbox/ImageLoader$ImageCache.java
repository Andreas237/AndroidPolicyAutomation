// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.graphics.Bitmap;

// Referenced classes of package com.android.volley.toolbox:
//			ImageLoader

public static interface ImageLoader$ImageCache
{

	public abstract Bitmap getBitmap(String s);

	public abstract void putBitmap(String s, Bitmap bitmap);
}
