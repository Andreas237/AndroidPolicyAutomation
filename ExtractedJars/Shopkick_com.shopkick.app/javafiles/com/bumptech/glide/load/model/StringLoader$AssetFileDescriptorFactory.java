// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, StringLoader, MultiModelLoaderFactory, ModelLoader

public static final class StringLoader$AssetFileDescriptorFactory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new StringLoader(multimodelloaderfactory.build(android/net/Uri, android/content/res/AssetFileDescriptor))));
	//    0    0:new             #9   <Class StringLoader>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <Class Uri>
	//    4    7:ldc1            #22  <Class AssetFileDescriptor>
	//    5    9:invokevirtual   #27  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
	//    6   12:invokespecial   #30  <Method void StringLoader(ModelLoader)>
	//    7   15:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	public StringLoader$AssetFileDescriptorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
