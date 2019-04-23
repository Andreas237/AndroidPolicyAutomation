// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.util.List;

// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoaderFactory, MultiModelLoader

static class MultiModelLoaderFactory$Factory
{

	public MultiModelLoader build(List list, android.support.v4.util.Pools.Pool pool)
	{
		return new MultiModelLoader(list, pool);
	//    0    0:new             #17  <Class MultiModelLoader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #20  <Method void MultiModelLoader(List, android.support.v4.util.Pools$Pool)>
	//    5    9:areturn         
	}

	MultiModelLoaderFactory$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
