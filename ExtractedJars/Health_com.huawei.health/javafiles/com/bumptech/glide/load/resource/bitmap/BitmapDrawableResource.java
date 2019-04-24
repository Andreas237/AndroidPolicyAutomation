// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

public class BitmapDrawableResource extends DrawableResource
	implements Initializable
{

	public BitmapDrawableResource(BitmapDrawable bitmapdrawable, BitmapPool bitmappool)
	{
		super(((android.graphics.drawable.Drawable) (bitmapdrawable)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void DrawableResource(android.graphics.drawable.Drawable)>
		bitmapPool = bitmappool;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field BitmapPool bitmapPool>
	//    6   10:return          
	}

	public Class getResourceClass()
	{
		return android/graphics/drawable/BitmapDrawable;
	//    0    0:ldc1            #21  <Class BitmapDrawable>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return Util.getBitmapByteSize(((BitmapDrawable)drawable).getBitmap());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field android.graphics.drawable.Drawable drawable>
	//    2    4:checkcast       #21  <Class BitmapDrawable>
	//    3    7:invokevirtual   #33  <Method Bitmap BitmapDrawable.getBitmap()>
	//    4   10:invokestatic    #39  <Method int Util.getBitmapByteSize(Bitmap)>
	//    5   13:ireturn         
	}

	public void initialize()
	{
		((BitmapDrawable)drawable).getBitmap().prepareToDraw();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field android.graphics.drawable.Drawable drawable>
	//    2    4:checkcast       #21  <Class BitmapDrawable>
	//    3    7:invokevirtual   #33  <Method Bitmap BitmapDrawable.getBitmap()>
	//    4   10:invokevirtual   #46  <Method void Bitmap.prepareToDraw()>
	//    5   13:return          
	}

	public void recycle()
	{
		bitmapPool.put(((BitmapDrawable)drawable).getBitmap());
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field BitmapPool bitmapPool>
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field android.graphics.drawable.Drawable drawable>
	//    4    8:checkcast       #21  <Class BitmapDrawable>
	//    5   11:invokevirtual   #33  <Method Bitmap BitmapDrawable.getBitmap()>
	//    6   14:invokeinterface #53  <Method void BitmapPool.put(Bitmap)>
	//    7   19:return          
	}

	private final BitmapPool bitmapPool;
}
