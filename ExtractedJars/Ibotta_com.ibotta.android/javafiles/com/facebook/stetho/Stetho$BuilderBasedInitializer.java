// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;


// Referenced classes of package com.facebook.stetho:
//			Stetho, DumperPluginsProvider, InspectorModulesProvider

private static class Stetho$BuilderBasedInitializer extends Stetho.Initializer
{

	protected Iterable getDumperPlugins()
	{
		DumperPluginsProvider dumperpluginsprovider = mDumperPlugins;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
	//    2    4:astore_1        
		if(dumperpluginsprovider != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return dumperpluginsprovider.get();
	//    5    9:aload_1         
	//    6   10:invokeinterface #40  <Method Iterable DumperPluginsProvider.get()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	protected Iterable getInspectorModules()
	{
		InspectorModulesProvider inspectormodulesprovider = mInspectorModules;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
	//    2    4:astore_1        
		if(inspectormodulesprovider != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
			return inspectormodulesprovider.get();
	//    5    9:aload_1         
	//    6   10:invokeinterface #47  <Method Iterable InspectorModulesProvider.get()>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
	}

	private final DumperPluginsProvider mDumperPlugins;
	private final InspectorModulesProvider mInspectorModules;

	private Stetho$BuilderBasedInitializer(Stetho.InitializerBuilder initializerbuilder)
	{
		super(initializerbuilder.mContext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #20  <Field android.content.Context Stetho$InitializerBuilder.mContext>
	//    3    5:invokespecial   #23  <Method void Stetho$Initializer(android.content.Context)>
		mDumperPlugins = initializerbuilder.mDumperPlugins;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #25  <Field DumperPluginsProvider Stetho$InitializerBuilder.mDumperPlugins>
	//    7   13:putfield        #26  <Field DumperPluginsProvider mDumperPlugins>
		mInspectorModules = initializerbuilder.mInspectorModules;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getfield        #28  <Field InspectorModulesProvider Stetho$InitializerBuilder.mInspectorModules>
	//   11   21:putfield        #29  <Field InspectorModulesProvider mInspectorModules>
	//   12   24:return          
	}

	Stetho$BuilderBasedInitializer(Stetho.InitializerBuilder initializerbuilder, Stetho._cls1 _pcls1)
	{
		this(initializerbuilder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #33  <Method void Stetho$BuilderBasedInitializer(Stetho$InitializerBuilder)>
	//    3    5:return          
	}
}
