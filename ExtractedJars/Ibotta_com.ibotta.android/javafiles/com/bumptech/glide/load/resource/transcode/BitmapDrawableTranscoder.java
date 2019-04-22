// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import android.content.res.Resources;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public class BitmapDrawableTranscoder
	implements ResourceTranscoder
{

	public BitmapDrawableTranscoder(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #23  <Class Resources>
	//    6   12:putfield        #25  <Field Resources resources>
	//    7   15:return          
	}

	public Resource transcode(Resource resource, Options options)
	{
		return LazyBitmapDrawableResource.obtain(resources, resource);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Resources resources>
	//    2    4:aload_1         
	//    3    5:invokestatic    #36  <Method Resource LazyBitmapDrawableResource.obtain(Resources, Resource)>
	//    4    8:areturn         
	}

	private final Resources resources;
}
