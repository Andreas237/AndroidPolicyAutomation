// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.AppEventListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzlb

public final class zzjp extends zzlb
{

	public zzjp(AppEventListener appeventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzlb()>
		zzvo = appeventlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field AppEventListener zzvo>
	//    5    9:return          
	}

	public final AppEventListener getAppEventListener()
	{
		return zzvo;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppEventListener zzvo>
	//    2    4:areturn         
	}

	public final void onAppEvent(String s, String s1)
	{
		zzvo.onAppEvent(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field AppEventListener zzvo>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #23  <Method void AppEventListener.onAppEvent(String, String)>
	//    5   11:return          
	}

	private final AppEventListener zzvo;
}
