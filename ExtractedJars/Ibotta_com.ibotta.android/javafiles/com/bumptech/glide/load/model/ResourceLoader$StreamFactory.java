// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ResourceLoader, MultiModelLoaderFactory, ModelLoader

public static class ResourceLoader$StreamFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new ResourceLoader(resources, multimodelloaderfactory.build(android/net/Uri, java/io/InputStream))));
	//    0    0:new             #9   <Class ResourceLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Resources resources>
	//    4    8:aload_1         
	//    5    9:ldc1            #25  <Class Uri>
	//    6   11:ldc1            #27  <Class InputStream>
	//    7   13:invokevirtual   #32  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
	//    8   16:invokespecial   #35  <Method void ResourceLoader(Resources, ModelLoader)>
	//    9   19:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private final Resources resources;

	public ResourceLoader$StreamFactory(Resources resources1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		resources = resources1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Resources resources>
	//    5    9:return          
	}
}
