// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Bitmap;

public final class BitmapCompat
{

	private BitmapCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static int getAllocationByteCount(Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return bitmap.getAllocationByteCount();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #23  <Method int Bitmap.getAllocationByteCount()>
	//    5   12:ireturn         
		else
			return bitmap.getByteCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #26  <Method int Bitmap.getByteCount()>
	//    8   17:ireturn         
	}

	public static boolean hasMipMap(Bitmap bitmap)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			return bitmap.hasMipMap();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #32  <Method boolean Bitmap.hasMipMap()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void setHasMipMap(Bitmap bitmap, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          13
			bitmap.setHasMipMap(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #37  <Method void Bitmap.setHasMipMap(boolean)>
	//    6   13:return          
	}
}
