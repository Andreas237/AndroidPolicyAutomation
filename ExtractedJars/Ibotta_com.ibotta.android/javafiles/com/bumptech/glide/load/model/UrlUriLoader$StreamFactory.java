// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, UrlUriLoader, GlideUrl, MultiModelLoaderFactory, 
//			ModelLoader

public static class UrlUriLoader$StreamFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new UrlUriLoader(multimodelloaderfactory.build(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream))));
	//    0    0:new             #9   <Class UrlUriLoader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <Class GlideUrl>
	//    4    7:ldc1            #22  <Class InputStream>
	//    5    9:invokevirtual   #27  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
	//    6   12:invokespecial   #30  <Method void UrlUriLoader(ModelLoader)>
	//    7   15:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public UrlUriLoader$StreamFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
