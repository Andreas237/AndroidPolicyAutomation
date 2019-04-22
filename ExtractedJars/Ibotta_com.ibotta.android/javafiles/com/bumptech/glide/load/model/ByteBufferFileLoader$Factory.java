// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, ByteBufferFileLoader, MultiModelLoaderFactory, ModelLoader

public static class ByteBufferFileLoader$Factory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new ByteBufferFileLoader()));
	//    0    0:new             #9   <Class ByteBufferFileLoader>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ByteBufferFileLoader()>
	//    3    7:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public ByteBufferFileLoader$Factory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
