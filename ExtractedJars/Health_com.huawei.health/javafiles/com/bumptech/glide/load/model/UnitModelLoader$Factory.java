// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, UnitModelLoader, MultiModelLoaderFactory, ModelLoader

public static class UnitModelLoader$Factory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new UnitModelLoader()));
	//    0    0:new             #9   <Class UnitModelLoader>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void UnitModelLoader()>
	//    3    7:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public UnitModelLoader$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
