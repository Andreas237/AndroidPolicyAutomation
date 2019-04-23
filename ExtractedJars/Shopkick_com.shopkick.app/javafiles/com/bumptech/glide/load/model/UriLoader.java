// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.*;
import com.bumptech.glide.signature.ObjectKey;
import java.util.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class UriLoader
	implements ModelLoader
{
	public static final class AssetFileDescriptorFactory
		implements ModelLoaderFactory, LocalUriFetcherFactory
	{

		public DataFetcher build(Uri uri)
		{
			return ((DataFetcher) (new AssetFileDescriptorLocalUriFetcher(contentResolver, uri)));
		//    0    0:new             #26  <Class AssetFileDescriptorLocalUriFetcher>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field ContentResolver contentResolver>
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void AssetFileDescriptorLocalUriFetcher(ContentResolver, Uri)>
		//    6   12:areturn         
		}

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new UriLoader(((LocalUriFetcherFactory) (this)))));
		//    0    0:new             #11  <Class UriLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #35  <Method void UriLoader(UriLoader$LocalUriFetcherFactory)>
		//    4    8:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final ContentResolver contentResolver;

		public AssetFileDescriptorFactory(ContentResolver contentresolver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			contentResolver = contentresolver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ContentResolver contentResolver>
		//    5    9:return          
		}
	}

	public static class FileDescriptorFactory
		implements ModelLoaderFactory, LocalUriFetcherFactory
	{

		public DataFetcher build(Uri uri)
		{
			return ((DataFetcher) (new FileDescriptorLocalUriFetcher(contentResolver, uri)));
		//    0    0:new             #26  <Class FileDescriptorLocalUriFetcher>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field ContentResolver contentResolver>
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void FileDescriptorLocalUriFetcher(ContentResolver, Uri)>
		//    6   12:areturn         
		}

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new UriLoader(((LocalUriFetcherFactory) (this)))));
		//    0    0:new             #11  <Class UriLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #36  <Method void UriLoader(UriLoader$LocalUriFetcherFactory)>
		//    4    8:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final ContentResolver contentResolver;

		public FileDescriptorFactory(ContentResolver contentresolver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			contentResolver = contentresolver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ContentResolver contentResolver>
		//    5    9:return          
		}
	}

	public static interface LocalUriFetcherFactory
	{

		public abstract DataFetcher build(Uri uri);
	}

	public static class StreamFactory
		implements ModelLoaderFactory, LocalUriFetcherFactory
	{

		public DataFetcher build(Uri uri)
		{
			return ((DataFetcher) (new StreamLocalUriFetcher(contentResolver, uri)));
		//    0    0:new             #26  <Class StreamLocalUriFetcher>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field ContentResolver contentResolver>
		//    4    8:aload_1         
		//    5    9:invokespecial   #29  <Method void StreamLocalUriFetcher(ContentResolver, Uri)>
		//    6   12:areturn         
		}

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new UriLoader(((LocalUriFetcherFactory) (this)))));
		//    0    0:new             #11  <Class UriLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #36  <Method void UriLoader(UriLoader$LocalUriFetcherFactory)>
		//    4    8:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final ContentResolver contentResolver;

		public StreamFactory(ContentResolver contentresolver)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			contentResolver = contentresolver;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field ContentResolver contentResolver>
		//    5    9:return          
		}
	}


	public UriLoader(LocalUriFetcherFactory localurifetcherfactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void Object()>
		factory = localurifetcherfactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #61  <Field UriLoader$LocalUriFetcherFactory factory>
	//    5    9:return          
	}

	public ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (uri))))), factory.build(uri));
	//    0    0:new             #68  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #70  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #73  <Method void ObjectKey(Object)>
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field UriLoader$LocalUriFetcherFactory factory>
	//    8   16:aload_1         
	//    9   17:invokeinterface #77  <Method DataFetcher UriLoader$LocalUriFetcherFactory.build(Uri)>
	//   10   22:invokespecial   #80  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   11   25:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #87  <Method ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		return SCHEMES.contains(((Object) (uri.getScheme())));
	//    0    0:getstatic       #55  <Field Set SCHEMES>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #93  <Method String Uri.getScheme()>
	//    3    7:invokeinterface #99  <Method boolean Set.contains(Object)>
	//    4   12:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class Uri>
	//    3    5:invokevirtual   #101 <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	private static final Set SCHEMES = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"file", "android.resource", "content"
	})))))))));
	private final LocalUriFetcherFactory factory;

	static 
	{
	//    0    0:new             #29  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_3        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #33  <String "file">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #35  <String "android.resource">
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:ldc1            #37  <String "content">
	//   15   22:aastore         
	//   16   23:invokestatic    #43  <Method java.util.List Arrays.asList(Object[])>
	//   17   26:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//   18   29:invokestatic    #53  <Method Set Collections.unmodifiableSet(Set)>
	//   19   32:putstatic       #55  <Field Set SCHEMES>
	//*  20   35:return          
	}
}
