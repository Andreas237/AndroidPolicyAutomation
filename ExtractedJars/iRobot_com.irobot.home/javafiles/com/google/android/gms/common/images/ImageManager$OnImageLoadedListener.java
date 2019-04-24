// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;

// Referenced classes of package com.google.android.gms.common.images:
//			ImageManager

public static interface ImageManager$OnImageLoadedListener
{

	public abstract void onImageLoaded(Uri uri, Drawable drawable, boolean flag);
}
