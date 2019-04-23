// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
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
	public static final class AssetFileDescriptorFactory
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

		public AssetFileDescriptorFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class FileDescriptorFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new StringLoader(multimodelloaderfactory.build(android/net/Uri, android/os/ParcelFileDescriptor))));
		//    0    0:new             #9   <Class StringLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #20  <Class Uri>
		//    4    7:ldc1            #22  <Class ParcelFileDescriptor>
		//    5    9:invokevirtual   #27  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #30  <Method void StringLoader(ModelLoader)>
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
		//    3    5:ldc1            #20  <Class Uri>
		//    4    7:ldc1            #22  <Class InputStream>
		//    5    9:invokevirtual   #27  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #30  <Method void StringLoader(ModelLoader)>
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
	//    1    1:invokespecial   #24  <Method void Object()>
		uriLoader = modelloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field ModelLoader uriLoader>
	//    5    9:return          
	}

	private static Uri parseUri(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(s.charAt(0) == '/')
	//*   5    9:aload_0         
	//*   6   10:iconst_0        
	//*   7   11:invokevirtual   #44  <Method char String.charAt(int)>
	//*   8   14:bipush          47
	//*   9   16:icmpne          24
			return toFileUri(s);
	//   10   19:aload_0         
	//   11   20:invokestatic    #47  <Method Uri toFileUri(String)>
	//   12   23:areturn         
		Uri uri = Uri.parse(s);
	//   13   24:aload_0         
	//   14   25:invokestatic    #52  <Method Uri Uri.parse(String)>
	//   15   28:astore_1        
		if(uri.getScheme() == null)
	//*  16   29:aload_1         
	//*  17   30:invokevirtual   #56  <Method String Uri.getScheme()>
	//*  18   33:ifnonnull       41
			return toFileUri(s);
	//   19   36:aload_0         
	//   20   37:invokestatic    #47  <Method Uri toFileUri(String)>
	//   21   40:areturn         
		else
			return uri;
	//   22   41:aload_1         
	//   23   42:areturn         
	}

	private static Uri toFileUri(String s)
	{
		return Uri.fromFile(new File(s));
	//    0    0:new             #59  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #62  <Method void File(String)>
	//    4    8:invokestatic    #66  <Method Uri Uri.fromFile(File)>
	//    5   11:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((String)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class String>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #72  <Method ModelLoader$LoadData buildLoadData(String, int, int, Options)>
	//    7   12:areturn         
	}

	public ModelLoader.LoadData buildLoadData(String s, int i, int j, Options options)
	{
		s = ((String) (parseUri(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #75  <Method Uri parseUri(String)>
	//    2    4:astore_1        
		if(s != null && uriLoader.handles(((Object) (s))))
	//*   3    5:aload_1         
	//*   4    6:ifnull          40
	//*   5    9:aload_0         
	//*   6   10:getfield        #26  <Field ModelLoader uriLoader>
	//*   7   13:aload_1         
	//*   8   14:invokeinterface #79  <Method boolean ModelLoader.handles(Object)>
	//*   9   19:ifne            25
	//*  10   22:goto            40
			return uriLoader.buildLoadData(((Object) (s)), i, j, options);
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field ModelLoader uriLoader>
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:iload_3         
	//   16   32:aload           4
	//   17   34:invokeinterface #81  <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   18   39:areturn         
		else
			return null;
	//   19   40:aconst_null     
	//   20   41:areturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((String)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #40  <Class String>
	//    3    5:invokevirtual   #85  <Method boolean handles(String)>
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
