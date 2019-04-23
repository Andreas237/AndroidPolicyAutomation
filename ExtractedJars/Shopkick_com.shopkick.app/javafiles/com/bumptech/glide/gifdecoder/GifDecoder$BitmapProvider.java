// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.gifdecoder:
//			GifDecoder

public static interface GifDecoder$BitmapProvider
{

	public abstract Bitmap obtain(int i, int j, android.graphics.Bitmap.Config config);

	public abstract byte[] obtainByteArray(int i);

	public abstract int[] obtainIntArray(int i);

	public abstract void release(Bitmap bitmap);

	public abstract void release(byte abyte0[]);

	public abstract void release(int ai[]);
}
