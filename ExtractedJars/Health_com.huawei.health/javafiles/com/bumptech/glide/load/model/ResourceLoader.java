// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Options;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class ResourceLoader
	implements ModelLoader
{
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
		//    5    9:ldc1            #24  <Class Uri>
		//    6   11:ldc1            #26  <Class ParcelFileDescriptor>
		//    7   13:invokevirtual   #31  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    8   16:invokespecial   #34  <Method void ResourceLoader(Resources, ModelLoader)>
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
		//    5    9:ldc1            #24  <Class Uri>
		//    6   11:ldc1            #26  <Class InputStream>
		//    7   13:invokevirtual   #31  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    8   16:invokespecial   #34  <Method void ResourceLoader(Resources, ModelLoader)>
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


	public ResourceLoader(Resources resources1, ModelLoader modelloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		resources = resources1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field Resources resources>
		uriLoader = modelloader;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #31  <Field ModelLoader uriLoader>
	//    8   14:return          
	}

	private Uri getResourceUri(Integer integer)
	{
		Uri uri;
		try
		{
			uri = Uri.parse((new StringBuilder()).append("android.resource://").append(resources.getResourcePackageName(integer.intValue())).append('/').append(resources.getResourceTypeName(integer.intValue())).append('/').append(resources.getResourceEntryName(integer.intValue())).toString());
	//    0    0:new             #41  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void StringBuilder()>
	//    3    7:ldc1            #44  <String "android.resource://">
	//    4    9:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #29  <Field Resources resources>
	//    7   16:aload_1         
	//    8   17:invokevirtual   #54  <Method int Integer.intValue()>
	//    9   20:invokevirtual   #60  <Method String Resources.getResourcePackageName(int)>
	//   10   23:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:bipush          47
	//   12   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   13   31:aload_0         
	//   14   32:getfield        #29  <Field Resources resources>
	//   15   35:aload_1         
	//   16   36:invokevirtual   #54  <Method int Integer.intValue()>
	//   17   39:invokevirtual   #66  <Method String Resources.getResourceTypeName(int)>
	//   18   42:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   19   45:bipush          47
	//   20   47:invokevirtual   #63  <Method StringBuilder StringBuilder.append(char)>
	//   21   50:aload_0         
	//   22   51:getfield        #29  <Field Resources resources>
	//   23   54:aload_1         
	//   24   55:invokevirtual   #54  <Method int Integer.intValue()>
	//   25   58:invokevirtual   #69  <Method String Resources.getResourceEntryName(int)>
	//   26   61:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   27   64:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   28   67:invokestatic    #79  <Method Uri Uri.parse(String)>
	//   29   70:astore_2        
		}
	//*  30   71:aload_2         
	//*  31   72:areturn         
		catch(android.content.res.Resources.NotFoundException notfoundexception)
	//*  32   73:astore_2        
		{
			if(Log.isLoggable("ResourceLoader", 5))
	//*  33   74:ldc1            #17  <String "ResourceLoader">
	//*  34   76:iconst_5        
	//*  35   77:invokestatic    #85  <Method boolean Log.isLoggable(String, int)>
	//*  36   80:ifeq            109
				Log.w("ResourceLoader", (new StringBuilder()).append("Received invalid resource id: ").append(((Object) (integer))).toString(), ((Throwable) (notfoundexception)));
	//   37   83:ldc1            #17  <String "ResourceLoader">
	//   38   85:new             #41  <Class StringBuilder>
	//   39   88:dup             
	//   40   89:invokespecial   #42  <Method void StringBuilder()>
	//   41   92:ldc1            #87  <String "Received invalid resource id: ">
	//   42   94:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   43   97:aload_1         
	//   44   98:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   45  101:invokevirtual   #73  <Method String StringBuilder.toString()>
	//   46  104:aload_2         
	//   47  105:invokestatic    #94  <Method int Log.w(String, String, Throwable)>
	//   48  108:pop             
			return null;
	//   49  109:aconst_null     
	//   50  110:areturn         
		}
		return uri;
	}

	public ModelLoader.LoadData buildLoadData(Integer integer, int i, int j, Options options)
	{
		integer = ((Integer) (getResourceUri(integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #99  <Method Uri getResourceUri(Integer)>
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
	//    9   13:getfield        #31  <Field ModelLoader uriLoader>
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:iload_3         
	//   13   19:aload           4
	//   14   21:invokeinterface #102 <Method ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   15   26:areturn         
	}

	public volatile ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Integer)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #50  <Class Integer>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #105 <Method ModelLoader$LoadData buildLoadData(Integer, int, int, Options)>
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
	//    2    2:checkcast       #50  <Class Integer>
	//    3    5:invokevirtual   #110 <Method boolean handles(Integer)>
	//    4    8:ireturn         
	}

	private static final String TAG = "ResourceLoader";
	private final Resources resources;
	private final ModelLoader uriLoader;
}
