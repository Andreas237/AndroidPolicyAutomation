// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//			DeferredLifecycleHelper, LifecycleDelegate

final class zac
	implements DeferredLifecycleHelper.zaa
{

	zac(DeferredLifecycleHelper deferredlifecyclehelper, Bundle bundle)
	{
		zari = deferredlifecyclehelper;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field DeferredLifecycleHelper zari>
		zark = bundle;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Bundle zark>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final int getState()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void zaa(LifecycleDelegate lifecycledelegate)
	{
		DeferredLifecycleHelper.zab(zari).onCreate(zark);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field DeferredLifecycleHelper zari>
	//    2    4:invokestatic    #30  <Method LifecycleDelegate DeferredLifecycleHelper.zab(DeferredLifecycleHelper)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field Bundle zark>
	//    5   11:invokeinterface #36  <Method void LifecycleDelegate.onCreate(Bundle)>
	//    6   16:return          
	}

	private final DeferredLifecycleHelper zari;
	private final Bundle zark;
}
