// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			Downsampler

public static interface Downsampler$DecodeCallbacks
{

	public abstract void onDecodeComplete(BitmapPool bitmappool, Bitmap bitmap)
		throws IOException;

	public abstract void onObtainBounds();
}
