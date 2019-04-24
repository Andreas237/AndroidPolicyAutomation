// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.graphics.Bitmap;

public final class BitmapCompat
{
	static class BitmapCompatApi18Impl extends BitmapCompatBaseImpl
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

		BitmapCompatApi18Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void BitmapCompat$BitmapCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class BitmapCompatApi19Impl extends BitmapCompatApi18Impl
	{

		public int getAllocationByteCount(Bitmap bitmap)
		{
			return bitmap.getAllocationByteCount();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int Bitmap.getAllocationByteCount()>
		//    2    4:ireturn         
		}

		BitmapCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void BitmapCompat$BitmapCompatApi18Impl()>
		//    2    4:return          
		}
	}

	static class BitmapCompatBaseImpl
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

		BitmapCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private BitmapCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	public static int getAllocationByteCount(Bitmap bitmap)
	{
		return IMPL.getAllocationByteCount(bitmap);
	//    0    0:getstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #36  <Method int BitmapCompat$BitmapCompatBaseImpl.getAllocationByteCount(Bitmap)>
	//    3    7:ireturn         
	}

	public static boolean hasMipMap(Bitmap bitmap)
	{
		return IMPL.hasMipMap(bitmap);
	//    0    0:getstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #40  <Method boolean BitmapCompat$BitmapCompatBaseImpl.hasMipMap(Bitmap)>
	//    3    7:ireturn         
	}

	public static void setHasMipMap(Bitmap bitmap, boolean flag)
	{
		IMPL.setHasMipMap(bitmap, flag);
	//    0    0:getstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #44  <Method void BitmapCompat$BitmapCompatBaseImpl.setHasMipMap(Bitmap, boolean)>
	//    4    8:return          
	}

	static final BitmapCompatBaseImpl IMPL;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 19)
	//*   2    4:iload_0         
	//*   3    5:bipush          19
	//*   4    7:icmplt          21
			IMPL = ((BitmapCompatBaseImpl) (new BitmapCompatApi19Impl()));
	//    5   10:new             #9   <Class BitmapCompat$BitmapCompatApi19Impl>
	//    6   13:dup             
	//    7   14:invokespecial   #26  <Method void BitmapCompat$BitmapCompatApi19Impl()>
	//    8   17:putstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//    9   20:return          
		else
		if(i >= 18)
	//*  10   21:iload_0         
	//*  11   22:bipush          18
	//*  12   24:icmplt          38
			IMPL = ((BitmapCompatBaseImpl) (new BitmapCompatApi18Impl()));
	//   13   27:new             #6   <Class BitmapCompat$BitmapCompatApi18Impl>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void BitmapCompat$BitmapCompatApi18Impl()>
	//   16   34:putstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//   17   37:return          
		else
			IMPL = new BitmapCompatBaseImpl();
	//   18   38:new             #12  <Class BitmapCompat$BitmapCompatBaseImpl>
	//   19   41:dup             
	//   20   42:invokespecial   #30  <Method void BitmapCompat$BitmapCompatBaseImpl()>
	//   21   45:putstatic       #28  <Field BitmapCompat$BitmapCompatBaseImpl IMPL>
	//*  22   48:return          
	}
}
