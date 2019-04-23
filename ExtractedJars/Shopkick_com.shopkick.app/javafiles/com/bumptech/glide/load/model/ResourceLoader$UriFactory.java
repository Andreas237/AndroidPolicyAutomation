// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.Resources;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ResourceLoader, UnitModelLoader, MultiModelLoaderFactory, 
//			ModelLoader

public static class ResourceLoader$UriFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new ResourceLoader(resources, ((ModelLoader) (UnitModelLoader.getInstance())))));
	//    0    0:new             #9   <Class ResourceLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Resources resources>
	//    4    8:invokestatic    #29  <Method UnitModelLoader UnitModelLoader.getInstance()>
	//    5   11:invokespecial   #32  <Method void ResourceLoader(Resources, ModelLoader)>
	//    6   14:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private final Resources resources;

	public ResourceLoader$UriFactory(Resources resources1)
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
