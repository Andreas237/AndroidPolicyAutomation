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
		if(mDumperPlugins != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
	//*   2    4:ifnull          17
			return mDumperPlugins.get();
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field DumperPluginsProvider mDumperPlugins>
	//    5   11:invokeinterface #40  <Method Iterable DumperPluginsProvider.get()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
	}

	protected Iterable getInspectorModules()
	{
		if(mInspectorModules != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
	//*   2    4:ifnull          17
			return mInspectorModules.get();
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field InspectorModulesProvider mInspectorModules>
	//    5   11:invokeinterface #47  <Method Iterable InspectorModulesProvider.get()>
	//    6   16:areturn         
		else
			return null;
	//    7   17:aconst_null     
	//    8   18:areturn         
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
