// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;

// Referenced classes of package com.bumptech.glide.load.engine.bitmap_recycle:
//			BitmapPool

public class BitmapPoolAdapter
	implements BitmapPool
{

	public BitmapPoolAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public void clearMemory()
	{
	//    0    0:return          
	}

	public Bitmap get(int i, int j, android.graphics.Bitmap.Config config)
	{
		return Bitmap.createBitmap(i, j, config);
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #20  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//    4    6:areturn         
	}

	public Bitmap getDirty(int i, int j, android.graphics.Bitmap.Config config)
	{
		return get(i, j, config);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #24  <Method Bitmap get(int, int, android.graphics.Bitmap$Config)>
	//    5    7:areturn         
	}

	public int getMaxSize()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void put(Bitmap bitmap)
	{
		bitmap.recycle();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method void Bitmap.recycle()>
	//    2    4:return          
	}

	public void setSizeMultiplier(float f)
	{
	//    0    0:return          
	}

	public void trimMemory(int i)
	{
	//    0    0:return          
	}
}
