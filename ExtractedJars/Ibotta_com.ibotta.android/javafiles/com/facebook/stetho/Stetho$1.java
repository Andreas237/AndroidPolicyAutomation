// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;

// Referenced classes of package com.facebook.stetho:
//			Stetho

static final class Stetho$1 extends itializer
{

	protected Iterable getDumperPlugins()
	{
		return (new faultDumperPluginsBuilder(val$context)).finish();
	//    0    0:new             #22  <Class Stetho$DefaultDumperPluginsBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Context val$context>
	//    4    8:invokespecial   #23  <Method void Stetho$DefaultDumperPluginsBuilder(Context)>
	//    5   11:invokevirtual   #26  <Method Iterable Stetho$DefaultDumperPluginsBuilder.finish()>
	//    6   14:areturn         
	}

	protected Iterable getInspectorModules()
	{
		return (new faultInspectorModulesBuilder(val$context)).finish();
	//    0    0:new             #31  <Class Stetho$DefaultInspectorModulesBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field Context val$context>
	//    4    8:invokespecial   #32  <Method void Stetho$DefaultInspectorModulesBuilder(Context)>
	//    5   11:invokevirtual   #33  <Method Iterable Stetho$DefaultInspectorModulesBuilder.finish()>
	//    6   14:areturn         
	}

	final Context val$context;

	Stetho$1(Context context1, Context context2)
	{
		val$context = context2;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #15  <Field Context val$context>
		super(context1);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #17  <Method void Stetho$Initializer(Context)>
	//    6   10:return          
	}
}
