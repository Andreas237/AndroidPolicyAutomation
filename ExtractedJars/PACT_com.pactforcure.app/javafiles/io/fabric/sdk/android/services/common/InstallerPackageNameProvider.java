// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.cache.MemoryValueCache;
import io.fabric.sdk.android.services.cache.ValueLoader;

public class InstallerPackageNameProvider
{

	public InstallerPackageNameProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #6   <Class InstallerPackageNameProvider$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #23  <Method void InstallerPackageNameProvider$1(InstallerPackageNameProvider)>
	//    7   13:putfield        #25  <Field ValueLoader installerPackageNameLoader>
	//    8   16:aload_0         
	//    9   17:new             #27  <Class MemoryValueCache>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void MemoryValueCache()>
	//   12   24:putfield        #30  <Field MemoryValueCache installerPackageNameCache>
	//   13   27:return          
	}

	public String getInstallerPackageName(Context context)
	{
		boolean flag;
		try
		{
			context = ((Context) ((String)installerPackageNameCache.get(context, installerPackageNameLoader)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MemoryValueCache installerPackageNameCache>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field ValueLoader installerPackageNameLoader>
	//    5    9:invokevirtual   #39  <Method Object MemoryValueCache.get(Context, ValueLoader)>
	//    6   12:checkcast       #41  <Class String>
	//    7   15:astore_1        
			flag = "".equals(((Object) (context)));
	//    8   16:ldc1            #10  <String "">
	//    9   18:aload_1         
	//   10   19:invokevirtual   #45  <Method boolean String.equals(Object)>
	//   11   22:istore_2        
		}
	//*  12   23:iload_2         
	//*  13   24:ifeq            29
	//*  14   27:aconst_null     
	//*  15   28:astore_1        
	//*  16   29:aload_1         
	//*  17   30:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   31:astore_1        
		{
			Fabric.getLogger().e("Fabric", "Failed to determine installer package name", ((Throwable) (context)));
	//   19   32:invokestatic    #51  <Method Logger Fabric.getLogger()>
	//   20   35:ldc1            #53  <String "Fabric">
	//   21   37:ldc1            #55  <String "Failed to determine installer package name">
	//   22   39:aload_1         
	//   23   40:invokeinterface #61  <Method void Logger.e(String, String, Throwable)>
			return null;
	//   24   45:aconst_null     
	//   25   46:areturn         
		}
		if(flag)
			context = null;
		return ((String) (context));
	}

	private static final String NO_INSTALLER_PACKAGE_NAME = "";
	private final MemoryValueCache installerPackageNameCache = new MemoryValueCache();
	private final ValueLoader installerPackageNameLoader = new ValueLoader() {

		public volatile Object load(Context context)
			throws Exception
		{
			return ((Object) (load(context)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #26  <Method String load(Context)>
		//    3    5:areturn         
		}

		public String load(Context context)
			throws Exception
		{
			String s = context.getPackageManager().getInstallerPackageName(context.getPackageName());
		//    0    0:aload_1         
		//    1    1:invokevirtual   #33  <Method PackageManager Context.getPackageManager()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #37  <Method String Context.getPackageName()>
		//    4    8:invokevirtual   #43  <Method String PackageManager.getInstallerPackageName(String)>
		//    5   11:astore_2        
			context = ((Context) (s));
		//    6   12:aload_2         
		//    7   13:astore_1        
			if(s == null)
		//*   8   14:aload_2         
		//*   9   15:ifnonnull       21
				context = "";
		//   10   18:ldc1            #45  <String "">
		//   11   20:astore_1        
			return ((String) (context));
		//   12   21:aload_1         
		//   13   22:areturn         
		}

		final InstallerPackageNameProvider this$0;

			
			{
				this$0 = InstallerPackageNameProvider.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field InstallerPackageNameProvider this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
	}
;
}
