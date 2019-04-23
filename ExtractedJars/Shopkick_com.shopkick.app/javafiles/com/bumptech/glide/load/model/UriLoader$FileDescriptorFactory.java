// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.net.Uri;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, UriLoader, MultiModelLoaderFactory, ModelLoader

public static class UriLoader$FileDescriptorFactory
	implements ModelLoaderFactory, 
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
		return ((ModelLoader) (new UriLoader((() (this)))));
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

	public UriLoader$FileDescriptorFactory(ContentResolver contentresolver)
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
