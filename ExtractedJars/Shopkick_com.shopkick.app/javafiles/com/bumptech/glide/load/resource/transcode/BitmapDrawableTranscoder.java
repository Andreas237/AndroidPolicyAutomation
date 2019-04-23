// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import com.bumptech.glide.load.Options;
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
		this(context.getResources());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method Resources Context.getResources()>
	//    3    5:invokespecial   #21  <Method void BitmapDrawableTranscoder(Resources)>
	//    4    8:return          
	}

	public BitmapDrawableTranscoder(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #34  <Class Resources>
	//    6   12:putfield        #36  <Field Resources resources>
	//    7   15:return          
	}

	public BitmapDrawableTranscoder(Resources resources1, BitmapPool bitmappool)
	{
		this(resources1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void BitmapDrawableTranscoder(Resources)>
	//    3    5:return          
	}

	public Resource transcode(Resource resource, Options options)
	{
		return LazyBitmapDrawableResource.obtain(resources, resource);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resources resources>
	//    2    4:aload_1         
	//    3    5:invokestatic    #48  <Method Resource LazyBitmapDrawableResource.obtain(Resources, Resource)>
	//    4    8:areturn         
	}

	private final Resources resources;
}
