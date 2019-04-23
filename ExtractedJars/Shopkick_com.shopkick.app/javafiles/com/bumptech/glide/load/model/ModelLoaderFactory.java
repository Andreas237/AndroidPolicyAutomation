// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;


// Referenced classes of package com.bumptech.glide.load.model:
//			MultiModelLoaderFactory, ModelLoader

public interface ModelLoaderFactory
{

	public abstract ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory);

	public abstract void teardown();
}
