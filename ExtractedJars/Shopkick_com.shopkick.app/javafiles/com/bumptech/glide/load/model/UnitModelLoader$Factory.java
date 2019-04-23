// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, UnitModelLoader, MultiModelLoaderFactory, ModelLoader

public static class UnitModelLoader$Factory
	implements ModelLoaderFactory
{

	public static UnitModelLoader$Factory getInstance()
	{
		return FACTORY;
	//    0    0:getstatic       #20  <Field UnitModelLoader$Factory FACTORY>
	//    1    3:areturn         
	}

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (UnitModelLoader.getInstance()));
	//    0    0:invokestatic    #34  <Method UnitModelLoader UnitModelLoader.getInstance()>
	//    1    3:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private static final UnitModelLoader$Factory FACTORY = new UnitModelLoader$Factory();

	static 
	{
	//    0    0:new             #2   <Class UnitModelLoader$Factory>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void UnitModelLoader$Factory()>
	//    3    7:putstatic       #20  <Field UnitModelLoader$Factory FACTORY>
	//*   4   10:return          
	}

	public UnitModelLoader$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}
}
