// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.cache.ValueLoader;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			InstallerPackageNameProvider

class InstallerPackageNameProvider$1
	implements ValueLoader
{

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

	InstallerPackageNameProvider$1()
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
