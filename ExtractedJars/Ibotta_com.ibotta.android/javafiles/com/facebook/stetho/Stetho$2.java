// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho;

import android.content.Context;

// Referenced classes of package com.facebook.stetho:
//			DumperPluginsProvider, Stetho

static final class Stetho$2
	implements DumperPluginsProvider
{

	public Iterable get()
	{
		return (new faultDumperPluginsBuilder(val$context)).finish();
	//    0    0:new             #25  <Class Stetho$DefaultDumperPluginsBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field Context val$context>
	//    4    8:invokespecial   #27  <Method void Stetho$DefaultDumperPluginsBuilder(Context)>
	//    5   11:invokevirtual   #30  <Method Iterable Stetho$DefaultDumperPluginsBuilder.finish()>
	//    6   14:areturn         
	}

	final Context val$context;

	Stetho$2(Context context1)
	{
		val$context = context1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
