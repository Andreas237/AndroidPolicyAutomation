// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbfy

public final class zzbfx extends CustomTabsServiceConnection
{

	public zzbfx(zzbfy zzbfy1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void CustomTabsServiceConnection()>
		zzedz = new WeakReference(((Object) (zzbfy1)));
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakReference>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #17  <Method void WeakReference(Object)>
	//    7   13:putfield        #19  <Field WeakReference zzedz>
	//    8   16:return          
	}

	public final void onCustomTabsServiceConnected(ComponentName componentname, CustomTabsClient customtabsclient)
	{
		componentname = ((ComponentName) ((zzbfy)zzedz.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference zzedz>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class zzbfy>
	//    4   10:astore_1        
		if(componentname != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          22
			((zzbfy) (componentname)).zza(customtabsclient);
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokeinterface #32  <Method void zzbfy.zza(CustomTabsClient)>
	//   10   22:return          
	}

	public final void onServiceDisconnected(ComponentName componentname)
	{
		componentname = ((ComponentName) ((zzbfy)zzedz.get()));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field WeakReference zzedz>
	//    2    4:invokevirtual   #26  <Method Object WeakReference.get()>
	//    3    7:checkcast       #28  <Class zzbfy>
	//    4   10:astore_1        
		if(componentname != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          21
			((zzbfy) (componentname)).zzjo();
	//    7   15:aload_1         
	//    8   16:invokeinterface #37  <Method void zzbfy.zzjo()>
	//    9   21:return          
	}

	private WeakReference zzedz;
}
