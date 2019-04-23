// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.*;
import com.bumptech.glide.signature.ObjectKey;
import java.util.List;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class AssetUriLoader
	implements ModelLoader
{
	public static interface AssetFetcherFactory
	{

		public abstract DataFetcher buildFetcher(AssetManager assetmanager, String s);
	}

	public static class FileDescriptorFactory
		implements ModelLoaderFactory, AssetFetcherFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new AssetUriLoader(assetManager, ((AssetFetcherFactory) (this)))));
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
			return ((DataFetcher) (new FileDescriptorAssetPathFetcher(assetmanager, s)));
		//    0    0:new             #35  <Class FileDescriptorAssetPathFetcher>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokespecial   #38  <Method void FileDescriptorAssetPathFetcher(AssetManager, String)>
		//    5    9:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final AssetManager assetManager;

		public FileDescriptorFactory(AssetManager assetmanager)
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

	public static class StreamFactory
		implements ModelLoaderFactory, AssetFetcherFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new AssetUriLoader(assetManager, ((AssetFetcherFactory) (this)))));
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

		public StreamFactory(AssetManager assetmanager)
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


	public AssetUriLoader(AssetManager assetmanager, AssetFetcherFactory assetfetcherfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		assetManager = assetmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field AssetManager assetManager>
		factory = assetfetcherfactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #42  <Field AssetUriLoader$AssetFetcherFactory factory>
	//    8   14:return          
	}

	public ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		options = ((Options) (uri.toString().substring(ASSET_PREFIX_LENGTH)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #53  <Method String Uri.toString()>
	//    2    4:getstatic       #55  <Field int ASSET_PREFIX_LENGTH>
	//    3    7:invokevirtual   #61  <Method String String.substring(int)>
	//    4   10:astore          4
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (uri))))), factory.buildFetcher(assetManager, ((String) (options))));
	//    5   12:new             #63  <Class ModelLoader$LoadData>
	//    6   15:dup             
	//    7   16:new             #65  <Class ObjectKey>
	//    8   19:dup             
	//    9   20:aload_1         
	//   10   21:invokespecial   #68  <Method void ObjectKey(Object)>
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field AssetUriLoader$AssetFetcherFactory factory>
	//   13   28:aload_0         
	//   14   29:getfield        #40  <Field AssetManager assetManager>
	//   15   32:aload           4
	//   16   34:invokeinterface #72  <Method DataFetcher AssetUriLoader$AssetFetcherFactory.buildFetcher(AssetManager, String)>
	//   17   39:invokespecial   #75  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   18   42:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #80  <Method ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		boolean flag2 = "file".equals(((Object) (uri.getScheme())));
	//    0    0:ldc1            #84  <String "file">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #87  <Method String Uri.getScheme()>
	//    3    6:invokevirtual   #91  <Method boolean String.equals(Object)>
	//    4    9:istore          4
		boolean flag1 = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		boolean flag = flag1;
	//    7   13:iload_3         
	//    8   14:istore_2        
		if(flag2)
	//*   9   15:iload           4
	//*  10   17:ifeq            56
		{
			flag = flag1;
	//   11   20:iload_3         
	//   12   21:istore_2        
			if(!uri.getPathSegments().isEmpty())
	//*  13   22:aload_1         
	//*  14   23:invokevirtual   #95  <Method List Uri.getPathSegments()>
	//*  15   26:invokeinterface #101 <Method boolean List.isEmpty()>
	//*  16   31:ifne            56
			{
				flag = flag1;
	//   17   34:iload_3         
	//   18   35:istore_2        
				if("android_asset".equals(uri.getPathSegments().get(0)))
	//*  19   36:ldc1            #20  <String "android_asset">
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #95  <Method List Uri.getPathSegments()>
	//*  22   42:iconst_0        
	//*  23   43:invokeinterface #105 <Method Object List.get(int)>
	//*  24   48:invokevirtual   #91  <Method boolean String.equals(Object)>
	//*  25   51:ifeq            56
					flag = true;
	//   26   54:iconst_1        
	//   27   55:istore_2        
			}
		}
		return flag;
	//   28   56:iload_2         
	//   29   57:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #49  <Class Uri>
	//    3    5:invokevirtual   #107 <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	private static final String ASSET_PATH_SEGMENT = "android_asset";
	private static final String ASSET_PREFIX = "file:///android_asset/";
	private static final int ASSET_PREFIX_LENGTH = 22;
	private final AssetManager assetManager;
	private final AssetFetcherFactory factory;

	static 
	{
	//    0    0:return          
	}
}
