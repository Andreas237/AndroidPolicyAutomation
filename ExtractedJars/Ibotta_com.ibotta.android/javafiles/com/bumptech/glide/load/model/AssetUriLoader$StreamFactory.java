// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, AssetUriLoader, MultiModelLoaderFactory, ModelLoader

public static class AssetUriLoader$StreamFactory
	implements ctory, ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new AssetUriLoader(assetManager, ((ctory) (this)))));
	//    0    0:new             #11  <Class AssetUriLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field AssetManager assetManager>
	//    4    8:aload_0         
	//    5    9:invokespecial   #28  <Method void AssetUriLoader(AssetManager, AssetUriLoader$AssetFetcherFactory)>
	//    6   12:areturn         
	}

	public DataFetcher buildFetcher(AssetManager assetmanager, String s)
	{
		return ((DataFetcher) (new StreamAssetPathFetcher(assetmanager, s)));
	//    0    0:new             #35  <Class StreamAssetPathFetcher>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #38  <Method void StreamAssetPathFetcher(AssetManager, String)>
	//    5    9:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private final AssetManager assetManager;

	public AssetUriLoader$StreamFactory(AssetManager assetmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		assetManager = assetmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AssetManager assetManager>
	//    5    9:return          
	}
}
