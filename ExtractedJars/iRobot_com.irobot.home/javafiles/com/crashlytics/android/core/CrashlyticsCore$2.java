// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.c;
import b.a.a.a.l;
import java.util.concurrent.Callable;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsCore, CrashlyticsFileMarker

class CrashlyticsCore$2
	implements Callable
{

	public volatile Object call()
	{
		return ((Object) (call()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Void call()>
	//    2    4:areturn         
	}

	public Void call()
	{
		CrashlyticsCore.access$100(CrashlyticsCore.this).create();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field CrashlyticsCore this$0>
	//    2    4:invokestatic    #30  <Method CrashlyticsFileMarker CrashlyticsCore.access$100(CrashlyticsCore)>
	//    3    7:invokevirtual   #36  <Method boolean CrashlyticsFileMarker.create()>
	//    4   10:pop             
		c.g().a("CrashlyticsCore", "Initialization marker file created.");
	//    5   11:invokestatic    #42  <Method l c.g()>
	//    6   14:ldc1            #44  <String "CrashlyticsCore">
	//    7   16:ldc1            #46  <String "Initialization marker file created.">
	//    8   18:invokeinterface #52  <Method void l.a(String, String)>
		return null;
	//    9   23:aconst_null     
	//   10   24:areturn         
	}

	final CrashlyticsCore this$0;

	CrashlyticsCore$2()
	{
		this$0 = CrashlyticsCore.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field CrashlyticsCore this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
