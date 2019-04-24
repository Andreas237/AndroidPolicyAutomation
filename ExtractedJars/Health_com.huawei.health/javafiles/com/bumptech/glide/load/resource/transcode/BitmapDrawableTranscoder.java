// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public class BitmapDrawableTranscoder
	implements ResourceTranscoder
{

	public BitmapDrawableTranscoder(Context context)
	{
		this(context.getResources(), Glide.get(context).getBitmapPool());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method Resources Context.getResources()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #25  <Method Glide Glide.get(Context)>
	//    5    9:invokevirtual   #29  <Method BitmapPool Glide.getBitmapPool()>
	//    6   12:invokespecial   #32  <Method void BitmapDrawableTranscoder(Resources, BitmapPool)>
	//    7   15:return          
	}

	public BitmapDrawableTranscoder(Resources resources1, BitmapPool bitmappool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #44  <Class Resources>
	//    6   12:putfield        #46  <Field Resources resources>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #42  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #48  <Class BitmapPool>
	//   11   23:putfield        #50  <Field BitmapPool bitmapPool>
	//   12   26:return          
	}

	public Resource transcode(Resource resource)
	{
		return ((Resource) (LazyBitmapDrawableResource.obtain(resources, bitmapPool, (Bitmap)resource.get())));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Resources resources>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field BitmapPool bitmapPool>
	//    4    8:aload_1         
	//    5    9:invokeinterface #57  <Method Object Resource.get()>
	//    6   14:checkcast       #59  <Class Bitmap>
	//    7   17:invokestatic    #65  <Method LazyBitmapDrawableResource LazyBitmapDrawableResource.obtain(Resources, BitmapPool, Bitmap)>
	//    8   20:areturn         
	}

	private final BitmapPool bitmapPool;
	private final Resources resources;
}
