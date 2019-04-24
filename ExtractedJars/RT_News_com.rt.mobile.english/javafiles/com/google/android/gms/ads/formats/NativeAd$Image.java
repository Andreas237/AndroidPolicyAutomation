// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;

// Referenced classes of package com.google.android.gms.ads.formats:
//			NativeAd

public static abstract class NativeAd$Image
{

	public abstract Drawable getDrawable();

	public abstract double getScale();

	public abstract Uri getUri();

	public NativeAd$Image()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
