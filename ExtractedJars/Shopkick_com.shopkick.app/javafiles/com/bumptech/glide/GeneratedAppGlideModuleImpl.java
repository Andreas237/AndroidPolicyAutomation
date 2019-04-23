// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.shopkick.app.util.MyAppGlideModule;
import java.util.Collections;
import java.util.Set;

// Referenced classes of package com.bumptech.glide:
//			GeneratedAppGlideModule, GeneratedRequestManagerFactory, GlideBuilder, Glide, 
//			Registry

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule
{

	GeneratedAppGlideModuleImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void GeneratedAppGlideModule()>
	//    2    4:aload_0         
	//    3    5:new             #12  <Class MyAppGlideModule>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void MyAppGlideModule()>
	//    6   12:putfield        #15  <Field MyAppGlideModule appGlideModule>
		if(Log.isLoggable("Glide", 3))
	//*   7   15:ldc1            #17  <String "Glide">
	//*   8   17:iconst_3        
	//*   9   18:invokestatic    #23  <Method boolean Log.isLoggable(String, int)>
	//*  10   21:ifeq            40
		{
			Log.d("Glide", "Discovered AppGlideModule from annotation: com.shopkick.app.util.MyAppGlideModule");
	//   11   24:ldc1            #17  <String "Glide">
	//   12   26:ldc1            #25  <String "Discovered AppGlideModule from annotation: com.shopkick.app.util.MyAppGlideModule">
	//   13   28:invokestatic    #29  <Method int Log.d(String, String)>
	//   14   31:pop             
			Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
	//   15   32:ldc1            #17  <String "Glide">
	//   16   34:ldc1            #31  <String "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule">
	//   17   36:invokestatic    #29  <Method int Log.d(String, String)>
	//   18   39:pop             
		}
	//   19   40:return          
	}

	public void applyOptions(Context context, GlideBuilder glidebuilder)
	{
		appGlideModule.applyOptions(context, glidebuilder);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MyAppGlideModule appGlideModule>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method void MyAppGlideModule.applyOptions(Context, GlideBuilder)>
	//    5    9:return          
	}

	public Set getExcludedModuleClasses()
	{
		return Collections.emptySet();
	//    0    0:invokestatic    #45  <Method Set Collections.emptySet()>
	//    1    3:areturn         
	}

	GeneratedRequestManagerFactory getRequestManagerFactory()
	{
		return new GeneratedRequestManagerFactory();
	//    0    0:new             #52  <Class GeneratedRequestManagerFactory>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void GeneratedRequestManagerFactory()>
	//    3    7:areturn         
	}

	volatile com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory getRequestManagerFactory()
	{
		return ((com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory) (getRequestManagerFactory()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #56  <Method GeneratedRequestManagerFactory getRequestManagerFactory()>
	//    2    4:areturn         
	}

	public boolean isManifestParsingEnabled()
	{
		return appGlideModule.isManifestParsingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field MyAppGlideModule appGlideModule>
	//    2    4:invokevirtual   #60  <Method boolean MyAppGlideModule.isManifestParsingEnabled()>
	//    3    7:ireturn         
	}

	public void registerComponents(Context context, Glide glide, Registry registry)
	{
		(new OkHttpLibraryGlideModule()).registerComponents(context, glide, registry);
	//    0    0:new             #64  <Class OkHttpLibraryGlideModule>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void OkHttpLibraryGlideModule()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokevirtual   #67  <Method void OkHttpLibraryGlideModule.registerComponents(Context, Glide, Registry)>
		appGlideModule.registerComponents(context, glide, registry);
	//    7   13:aload_0         
	//    8   14:getfield        #15  <Field MyAppGlideModule appGlideModule>
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_3         
	//   12   20:invokevirtual   #68  <Method void MyAppGlideModule.registerComponents(Context, Glide, Registry)>
	//   13   23:return          
	}

	private final MyAppGlideModule appGlideModule = new MyAppGlideModule();
}
