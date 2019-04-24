// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.graphics:
//			BitmapCompat

static class BitmapCompat$BitmapCompatBaseImpl
{

	public int getAllocationByteCount(Bitmap bitmap)
	{
		return bitmap.getByteCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method int Bitmap.getByteCount()>
	//    2    4:ireturn         
	}

	public boolean hasMipMap(Bitmap bitmap)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setHasMipMap(Bitmap bitmap, boolean flag)
	{
	//    0    0:return          
	}

	BitmapCompat$BitmapCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
