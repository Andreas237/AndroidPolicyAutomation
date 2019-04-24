// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, FileLoader, MultiModelLoaderFactory, ModelLoader

public static class FileLoader$Factory
	implements ModelLoaderFactory
{

	public final ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new FileLoader(opener)));
	//    0    0:new             #9   <Class FileLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field FileLoader$FileOpener opener>
	//    4    8:invokespecial   #27  <Method void FileLoader(FileLoader$FileOpener)>
	//    5   11:areturn         
	}

	public final void teardown()
	{
	//    0    0:return          
	}

	private final er opener;

	public FileLoader$Factory(er er)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		opener = er;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field FileLoader$FileOpener opener>
	//    5    9:return          
	}
}
