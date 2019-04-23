// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Options;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory, UnitModelLoader

public class ResourceLoader
	implements ModelLoader
{
	public static final class AssetFileDescriptorFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ResourceLoader(resources, multimodelloaderfactory.build(android/net/Uri, android/content/res/AssetFileDescriptor))));
		//    0    0:new             #9   <Class ResourceLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Resources resources>
		//    4    8:aload_1         
		//    5    9:ldc1            #24  <Class Uri>
		//    6   11:ldc1            #26  <Class AssetFileDescriptor>
		//    7   13:invokevirtual   #31  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    8   16:invokespecial   #34  <Method void ResourceLoader(Resources, ModelLoader)>
		//    9   19:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Resources resources;

		public AssetFileDescriptorFactory(Resources resources1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			resources = resources1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Resources resources>
		//    5    9:return          
		}
	}

	public static class FileDescriptorFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ResourceLoader(resources, multimodelloaderfactory.build(android/net/Uri, android/os/ParcelFileDescriptor))));
		//    0    0:new             #9   <Class ResourceLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Resources resources>
		//    4    8:aload_1         
		//    5    9:ldc1            #25  <Class Uri>
		//    6   11:ldc1            #27  <Class ParcelFileDescriptor>
		//    7   13:invokevirtual   #32  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    8   16:invokespecial   #35  <Method void ResourceLoader(Resources, ModelLoader)>
		//    9   19:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Resources resources;

		public FileDescriptorFactory(Resources resources1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			resources = resources1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Resources resources>
		//    5    9:return          
		}
	}

	public static class StreamFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ResourceLoader(resources, multimodelloaderfactory.build(android/net/Uri, java/io/InputStream))));
		//    0    0:new             #9   <Class ResourceLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Resources resources>
		//    4    8:aload_1         
		//    5    9:ldc1            #25  <Class Uri>
		//    6   11:ldc1            #27  <Class InputStream>
		//    7   13:invokevirtual   #32  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    8   16:invokespecial   #35  <Method void ResourceLoader(Resources, ModelLoader)>
		//    9   19:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Resources resources;

		public StreamFactory(Resources resources1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			resources = resources1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Resources resources>
		//    5    9:return          
		}
	}

	public static class UriFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new ResourceLoader(resources, ((ModelLoader) (UnitModelLoader.getInstance())))));
		//    0    0:new             #9   <Class ResourceLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Resources resources>
		//    4    8:invokestatic    #29  <Method UnitModelLoader UnitModelLoader.getInstance()>
		//    5   11:invokespecial   #32  <Method void ResourceLoader(Resources, ModelLoader)>
		//    6   14:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Resources resources;

		public UriFactory(Resources resources1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			resources = resources1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Resources resources>
		//    5    9:return          
		}
	}


	public ResourceLoader(Resources resources1, ModelLoader modelloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		resources = resources1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field Resources resources>
		uriLoader = modelloader;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field ModelLoader uriLoader>
	//    8   14:return          
	}

	private Uri getResourceUri(Integer integer)
	{
		Object obj;
		try
		{
			obj = ((Object) (new StringBuilder()));
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_2        
			((StringBuilder) (obj)).append("android.resource://");
	//    4    8:aload_2         
	//    5    9:ldc1            #50  <String "android.resource://">
	//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
			((StringBuilder) (obj)).append(resources.getResourcePackageName(integer.intValue()));
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field Resources resources>
	//   11   20:aload_1         
	//   12   21:invokevirtual   #60  <Method int Integer.intValue()>
	//   13   24:invokevirtual   #66  <Method String Resources.getResourcePackageName(int)>
	//   14   27:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (obj)).append('/');
	//   16   31:aload_2         
	//   17   32:bipush          47
	//   18   34:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//   19   37:pop             
			((StringBuilder) (obj)).append(resources.getResourceTypeName(integer.intValue()));
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field Resources resources>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #60  <Method int Integer.intValue()>
	//   25   47:invokevirtual   #72  <Method String Resources.getResourceTypeName(int)>
	//   26   50:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			((StringBuilder) (obj)).append('/');
	//   28   54:aload_2         
	//   29   55:bipush          47
	//   30   57:invokevirtual   #69  <Method StringBuilder StringBuilder.append(char)>
	//   31   60:pop             
			((StringBuilder) (obj)).append(resources.getResourceEntryName(integer.intValue()));
	//   32   61:aload_2         
	//   33   62:aload_0         
	//   34   63:getfield        #35  <Field Resources resources>
	//   35   66:aload_1         
	//   36   67:invokevirtual   #60  <Method int Integer.intValue()>
	//   37   70:invokevirtual   #75  <Method String Resources.getResourceEntryName(int)>
	//   38   73:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
			obj = ((Object) (Uri.parse(((StringBuilder) (obj)).toString())));
	//   40   77:aload_2         
	//   41   78:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   42   81:invokestatic    #85  <Method Uri Uri.parse(String)>
	//   43   84:astore_2        
		}
	//*  44   85:aload_2         
	//*  45   86:areturn         
		catch(android.content.res.Resources.NotFoundException notfoundexception)
	//*  46   87:astore_2        
		{
			if(Log.isLoggable("ResourceLoader", 5))
	//*  47   88:ldc1            #23  <String "ResourceLoader">
	//*  48   90:iconst_5        
	//*  49   91:invokestatic    #91  <Method boolean Log.isLoggable(String, int)>
	//*  50   94:ifeq            129
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   51   97:new             #47  <Class StringBuilder>
	//   52  100:dup             
	//   53  101:invokespecial   #48  <Method void StringBuilder()>
	//   54  104:astore_3        
				stringbuilder.append("Received invalid resource id: ");
	//   55  105:aload_3         
	//   56  106:ldc1            #93  <String "Received invalid resource id: ">
	//   57  108:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   58  111:pop             
				stringbuilder.append(((Object) (integer)));
	//   59  112:aload_3         
	//   60  113:aload_1         
	//   61  114:invokevirtual   #96  <Method StringBuilder StringBuilder.append(Object)>
	//   62  117:pop             
				Log.w("ResourceLoader", stringbuilder.toString(), ((Throwable) (notfoundexception)));
	//   63  118:ldc1            #23  <String "ResourceLoader">
	//   64  120:aload_3         
	//   65  121:invokevirtual   #79  <Method String StringBuilder.toString()>
	//   66  124:aload_2         
	//   67  125:invokestatic    #100 <Method int Log.w(String, String, Throwable)>
	//   68  128:pop             
			}
			return null;
	//   69  129:aconst_null     
	//   70  130:areturn         
		}
		return ((Uri) (obj));
	}

	public ModelLoader.LoadData buildLoadData(Integer integer, int i, int j, Options options)
	{
		integer = ((Integer) (getResourceUri(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #106 <Method Uri getResourceUri(Integer)>
	//    3    5:astore_1        
		if(integer == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		else
			return uriLoader.buildLoadData(((Object) (integer)), i, j, options);
	//    8   12:aload_0         
	//    9   13:getfield        #37  <Field ModelLoader uriLoader>
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:aload           4
	//   14   21:invokeinterface #109 <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   15   26:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Integer)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #56  <Class Integer>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #113 <Method ModelLoader$LoadData buildLoadData(Integer, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Integer integer)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Integer)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #56  <Class Integer>
	//    3    5:invokevirtual   #118 <Method boolean handles(Integer)>
	//    4    8:ireturn         
	}

	private static final String TAG = "ResourceLoader";
	private final Resources resources;
	private final ModelLoader uriLoader;
}
