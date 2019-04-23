// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Options;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, MultiModelLoaderFactory

private static class MultiModelLoaderFactory$EmptyModelLoader
	implements ModelLoader
{

	public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean handles(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	MultiModelLoaderFactory$EmptyModelLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
