// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.graphics:
//			BitmapCompat

static class BitmapCompat$BitmapCompatApi18Impl extends BitmapCompat.BitmapCompatBaseImpl
{

	public boolean hasMipMap(Bitmap bitmap)
	{
		return bitmap.hasMipMap();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method boolean Bitmap.hasMipMap()>
	//    2    4:ireturn         
	}

	public void setHasMipMap(Bitmap bitmap, boolean flag)
	{
		bitmap.setHasMipMap(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #27  <Method void Bitmap.setHasMipMap(boolean)>
	//    3    5:return          
	}

	BitmapCompat$BitmapCompatApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BitmapCompat$BitmapCompatBaseImpl()>
	//    2    4:return          
	}
}
