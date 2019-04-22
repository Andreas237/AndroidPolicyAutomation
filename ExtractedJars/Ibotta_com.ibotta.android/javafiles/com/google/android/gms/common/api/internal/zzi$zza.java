// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzi, zzk

private final class zzi$zza
	implements com.google.android.gms.common.api.iClient.OnConnectionFailedListener
{

	public final void onConnectionFailed(ConnectionResult connectionresult)
	{
		String s = String.valueOf(((Object) (connectionresult)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method String String.valueOf(Object)>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 27);
	//    3    5:new             #48  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokestatic    #46  <Method String String.valueOf(Object)>
	//    7   13:invokevirtual   #52  <Method int String.length()>
	//    8   16:bipush          27
	//    9   18:iadd            
	//   10   19:invokespecial   #55  <Method void StringBuilder(int)>
	//   11   22:astore_3        
		stringbuilder.append("beginFailureResolution for ");
	//   12   23:aload_3         
	//   13   24:ldc1            #57  <String "beginFailureResolution for ">
	//   14   26:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(s);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		Log.d("AutoManageHelper", stringbuilder.toString());
	//   20   36:ldc1            #63  <String "AutoManageHelper">
	//   21   38:aload_3         
	//   22   39:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   42:invokestatic    #73  <Method int Log.d(String, String)>
	//   24   45:pop             
		((zzk) (zzeh)).zzb(connectionresult, zzee);
	//   25   46:aload_0         
	//   26   47:getfield        #21  <Field zzi zzeh>
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #26  <Field int zzee>
	//   30   55:invokevirtual   #79  <Method void zzk.zzb(ConnectionResult, int)>
	//   31   58:return          
	}

	public final int zzee;
	public final GoogleApiClient zzef;
	public final com.google.android.gms.common.api.iClient.OnConnectionFailedListener zzeg;
	private final zzi zzeh;

	public zzi$zza(zzi zzi1, int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.iClient.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzeh = zzi1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzi zzeh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		zzee = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int zzee>
		zzef = googleapiclient;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field GoogleApiClient zzef>
		zzeg = onconnectionfailedlistener;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzeg>
		googleapiclient.registerConnectionFailedListener(((com.google.android.gms.common.api.iClient.OnConnectionFailedListener) (this)));
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:invokevirtual   #36  <Method void GoogleApiClient.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   17   30:return          
	}
}
