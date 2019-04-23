// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

public class BitmapResource
	implements Resource, Initializable
{

	public BitmapResource(Bitmap bitmap1, BitmapPool bitmappool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		bitmap = (Bitmap)Preconditions.checkNotNull(((Object) (bitmap1)), "Bitmap must not be null");
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #21  <String "Bitmap must not be null">
	//    5    8:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object, String)>
	//    6   11:checkcast       #29  <Class Bitmap>
	//    7   14:putfield        #31  <Field Bitmap bitmap>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)), "BitmapPool must not be null");
	//    8   17:aload_0         
	//    9   18:aload_2         
	//   10   19:ldc1            #33  <String "BitmapPool must not be null">
	//   11   21:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object, String)>
	//   12   24:checkcast       #35  <Class BitmapPool>
	//   13   27:putfield        #37  <Field BitmapPool bitmapPool>
	//   14   30:return          
	}

	public static BitmapResource obtain(Bitmap bitmap1, BitmapPool bitmappool)
	{
		if(bitmap1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new BitmapResource(bitmap1, bitmappool);
	//    4    6:new             #2   <Class BitmapResource>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #44  <Method void BitmapResource(Bitmap, BitmapPool)>
	//    9   15:areturn         
	}

	public Bitmap get()
	{
		return bitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bitmap bitmap>
	//    2    4:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method Bitmap get()>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return android/graphics/Bitmap;
	//    0    0:ldc1            #29  <Class Bitmap>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bitmap bitmap>
	//    2    4:invokestatic    #62  <Method int Util.getBitmapByteSize(Bitmap)>
	//    3    7:ireturn         
	}

	public void initialize()
	{
		bitmap.prepareToDraw();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Bitmap bitmap>
	//    2    4:invokevirtual   #66  <Method void Bitmap.prepareToDraw()>
	//    3    7:return          
	}

	public void recycle()
	{
		bitmapPool.put(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field BitmapPool bitmapPool>
	//    2    4:aload_0         
	//    3    5:getfield        #31  <Field Bitmap bitmap>
	//    4    8:invokeinterface #71  <Method void BitmapPool.put(Bitmap)>
	//    5   13:return          
	}

	private final Bitmap bitmap;
	private final BitmapPool bitmapPool;
}
