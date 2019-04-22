// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;
import com.facebook.stetho.common.Util;

// Referenced classes of package com.facebook.stetho:
//			Stetho, DumperPluginsProvider, InspectorModulesProvider

public static class Stetho$InitializerBuilder
{

	public Stetho.Initializer build()
	{
		return ((Stetho.Initializer) (new izer(this, ((Stetho._cls1) (null)))));
	//    0    0:new             #35  <Class Stetho$BuilderBasedInitializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void Stetho$BuilderBasedInitializer(Stetho$InitializerBuilder, Stetho$1)>
	//    5    9:areturn         
	}

	public Stetho$InitializerBuilder enableDumpapp(DumperPluginsProvider dumperpluginsprovider)
	{
		mDumperPlugins = (DumperPluginsProvider)Util.throwIfNull(((Object) (dumperpluginsprovider)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #46  <Method Object Util.throwIfNull(Object)>
	//    3    5:checkcast       #48  <Class DumperPluginsProvider>
	//    4    8:putfield        #50  <Field DumperPluginsProvider mDumperPlugins>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public Stetho$InitializerBuilder enableWebKitInspector(InspectorModulesProvider inspectormodulesprovider)
	{
		mInspectorModules = inspectormodulesprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field InspectorModulesProvider mInspectorModules>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	final Context mContext;
	DumperPluginsProvider mDumperPlugins;
	InspectorModulesProvider mInspectorModules;

	private Stetho$InitializerBuilder(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mContext = context.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #25  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #27  <Field Context mContext>
	//    6   12:return          
	}

	Stetho$InitializerBuilder(Context context, Stetho._cls1 _pcls1)
	{
		this(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void Stetho$InitializerBuilder(Context)>
	//    3    5:return          
	}
}
