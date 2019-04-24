// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

public class LazyBitmapDrawableResource
	implements Resource, Initializable
{

	LazyBitmapDrawableResource(Resources resources1, BitmapPool bitmappool, Bitmap bitmap1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #28  <Class Resources>
	//    6   12:putfield        #30  <Field Resources resources>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #32  <Class BitmapPool>
	//   11   23:putfield        #34  <Field BitmapPool bitmapPool>
		bitmap = (Bitmap)Preconditions.checkNotNull(((Object) (bitmap1)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   15   31:checkcast       #36  <Class Bitmap>
	//   16   34:putfield        #38  <Field Bitmap bitmap>
	//   17   37:return          
	}

	public static LazyBitmapDrawableResource obtain(Context context, Bitmap bitmap1)
	{
		return obtain(context.getResources(), Glide.get(context).getBitmapPool(), bitmap1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #47  <Method Resources Context.getResources()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #53  <Method Glide Glide.get(Context)>
	//    4    8:invokevirtual   #57  <Method BitmapPool Glide.getBitmapPool()>
	//    5   11:aload_1         
	//    6   12:invokestatic    #60  <Method LazyBitmapDrawableResource obtain(Resources, BitmapPool, Bitmap)>
	//    7   15:areturn         
	}

	public static LazyBitmapDrawableResource obtain(Resources resources1, BitmapPool bitmappool, Bitmap bitmap1)
	{
		return new LazyBitmapDrawableResource(resources1, bitmappool, bitmap1);
	//    0    0:new             #2   <Class LazyBitmapDrawableResource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #62  <Method void LazyBitmapDrawableResource(Resources, BitmapPool, Bitmap)>
	//    6   10:areturn         
	}

	public BitmapDrawable get()
	{
		return new BitmapDrawable(resources, bitmap);
	//    0    0:new             #65  <Class BitmapDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Resources resources>
	//    4    8:aload_0         
	//    5    9:getfield        #38  <Field Bitmap bitmap>
	//    6   12:invokespecial   #68  <Method void BitmapDrawable(Resources, Bitmap)>
	//    7   15:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method BitmapDrawable get()>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return android/graphics/drawable/BitmapDrawable;
	//    0    0:ldc1            #65  <Class BitmapDrawable>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return Util.getBitmapByteSize(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Bitmap bitmap>
	//    2    4:invokestatic    #83  <Method int Util.getBitmapByteSize(Bitmap)>
	//    3    7:ireturn         
	}

	public void initialize()
	{
		bitmap.prepareToDraw();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Bitmap bitmap>
	//    2    4:invokevirtual   #87  <Method void Bitmap.prepareToDraw()>
	//    3    7:return          
	}

	public void recycle()
	{
		bitmapPool.put(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field BitmapPool bitmapPool>
	//    2    4:aload_0         
	//    3    5:getfield        #38  <Field Bitmap bitmap>
	//    4    8:invokeinterface #92  <Method void BitmapPool.put(Bitmap)>
	//    5   13:return          
	}

	private final Bitmap bitmap;
	private final BitmapPool bitmapPool;
	private final Resources resources;
}
