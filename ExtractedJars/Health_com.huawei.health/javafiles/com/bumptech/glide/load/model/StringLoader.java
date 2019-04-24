// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import java.io.File;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class StringLoader
	implements ModelLoader
{
	public static class FileDescriptorFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new StringLoader(multimodelloaderfactory.build(android/net/Uri, android/os/ParcelFileDescriptor))));
		//    0    0:new             #9   <Class StringLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #19  <Class Uri>
		//    4    7:ldc1            #21  <Class ParcelFileDescriptor>
		//    5    9:invokevirtual   #26  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #29  <Method void StringLoader(ModelLoader)>
		//    7   15:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public FileDescriptorFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class StreamFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new StringLoader(multimodelloaderfactory.build(android/net/Uri, java/io/InputStream))));
		//    0    0:new             #9   <Class StringLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #19  <Class Uri>
		//    4    7:ldc1            #21  <Class InputStream>
		//    5    9:invokevirtual   #26  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #29  <Method void StringLoader(ModelLoader)>
		//    7   15:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public StreamFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public StringLoader(ModelLoader modelloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		uriLoader = modelloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field ModelLoader uriLoader>
	//    5    9:return          
	}

	private static Uri parseUri(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(s.startsWith("/"))
	//*   5    9:aload_0         
	//*   6   10:ldc1            #37  <String "/">
	//*   7   12:invokevirtual   #43  <Method boolean String.startsWith(String)>
	//*   8   15:ifeq            23
			return toFileUri(s);
	//    9   18:aload_0         
	//   10   19:invokestatic    #46  <Method Uri toFileUri(String)>
	//   11   22:areturn         
		Uri uri1 = Uri.parse(s);
	//   12   23:aload_0         
	//   13   24:invokestatic    #51  <Method Uri Uri.parse(String)>
	//   14   27:astore_2        
		Uri uri = uri1;
	//   15   28:aload_2         
	//   16   29:astore_1        
		if(uri1.getScheme() == null)
	//*  17   30:aload_2         
	//*  18   31:invokevirtual   #55  <Method String Uri.getScheme()>
	//*  19   34:ifnonnull       42
			uri = toFileUri(s);
	//   20   37:aload_0         
	//   21   38:invokestatic    #46  <Method Uri toFileUri(String)>
	//   22   41:astore_1        
		return uri;
	//   23   42:aload_1         
	//   24   43:areturn         
	}

	private static Uri toFileUri(String s)
	{
		return Uri.fromFile(new File(s));
	//    0    0:new             #58  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #61  <Method void File(String)>
	//    4    8:invokestatic    #65  <Method Uri Uri.fromFile(File)>
	//    5   11:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((String)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #70  <Method ModelLoader$LoadData buildLoadData(String, int, int, Options)>
	//    7   12:areturn         
	}

	public ModelLoader.LoadData buildLoadData(String s, int i, int j, Options options)
	{
		s = ((String) (parseUri(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method Uri parseUri(String)>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return uriLoader.buildLoadData(((Object) (s)), i, j, options);
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field ModelLoader uriLoader>
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:iload_3         
	//   12   18:aload           4
	//   13   20:invokeinterface #74  <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   14   25:areturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class String>
	//    3    5:invokevirtual   #79  <Method boolean handles(String)>
	//    4    8:ireturn         
	}

	public boolean handles(String s)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final ModelLoader uriLoader;
}
