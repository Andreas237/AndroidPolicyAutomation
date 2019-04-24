// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import com.bumptech.glide.load.engine.cache.DiskCache;

// Referenced classes of package com.bumptech.glide:
//			GlideBuilder

class GlideBuilder$1
	implements com.bumptech.glide.load.engine.cache.ry
{

	public DiskCache build()
	{
		return val$diskCache;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field DiskCache val$diskCache>
	//    2    4:areturn         
	}

	final GlideBuilder this$0;
	final DiskCache val$diskCache;

	GlideBuilder$1()
	{
		this$0 = final_glidebuilder;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field GlideBuilder this$0>
		val$diskCache = DiskCache.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field DiskCache val$diskCache>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
