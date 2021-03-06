// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.gifdecoder:
//			GifHeader

public interface GifDecoder
{
	public static interface BitmapProvider
	{

		public abstract Bitmap obtain(int i, int j, android.graphics.Bitmap.Config config);

		public abstract byte[] obtainByteArray(int i);

		public abstract int[] obtainIntArray(int i);

		public abstract void release(Bitmap bitmap);

		public abstract void release(byte abyte0[]);

		public abstract void release(int ai[]);
	}

	public static interface GifDecodeStatus
		extends Annotation
	{
	}


	public abstract void advance();

	public abstract void clear();

	public abstract int getByteSize();

	public abstract int getCurrentFrameIndex();

	public abstract ByteBuffer getData();

	public abstract int getDelay(int i);

	public abstract int getFrameCount();

	public abstract int getHeight();

	public abstract int getLoopCount();

	public abstract int getNetscapeLoopCount();

	public abstract int getNextDelay();

	public abstract Bitmap getNextFrame();

	public abstract int getStatus();

	public abstract int getTotalIterationCount();

	public abstract int getWidth();

	public abstract int read(InputStream inputstream, int i);

	public abstract int read(byte abyte0[]);

	public abstract void resetFrameIndex();

	public abstract void setData(GifHeader gifheader, ByteBuffer bytebuffer);

	public abstract void setData(GifHeader gifheader, ByteBuffer bytebuffer, int i);

	public abstract void setData(GifHeader gifheader, byte abyte0[]);

	public abstract void setDefaultBitmapConfig(android.graphics.Bitmap.Config config);
}
