// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.graphics:
//			BitmapCompat

static class BitmapCompat$BitmapCompatApi19Impl extends BitmapCompat$BitmapCompatApi18Impl
{

	public int getAllocationByteCount(Bitmap bitmap)
	{
		return bitmap.getAllocationByteCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int Bitmap.getAllocationByteCount()>
	//    2    4:ireturn         
	}

	BitmapCompat$BitmapCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BitmapCompat$BitmapCompatApi18Impl()>
	//    2    4:return          
	}
}
