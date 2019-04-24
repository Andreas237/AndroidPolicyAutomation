// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.gms.internal:
//			zzzt

private class zzzt$zza
	implements com.google.android.gms.common.api.Client.OnConnectionFailedListener
{

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.append(((CharSequence) (s))).append("GoogleApiClient #").print(zzayy);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
	//    3    5:ldc1            #47  <String "GoogleApiClient #">
	//    4    7:invokevirtual   #45  <Method PrintWriter PrintWriter.append(CharSequence)>
	//    5   10:aload_0         
	//    6   11:getfield        #26  <Field int zzayy>
	//    7   14:invokevirtual   #51  <Method void PrintWriter.print(int)>
		printwriter.println(":");
	//    8   17:aload_3         
	//    9   18:ldc1            #53  <String ":">
	//   10   20:invokevirtual   #57  <Method void PrintWriter.println(String)>
		zzayz.dump(String.valueOf(((Object) (s))).concat("  "), filedescriptor, printwriter, as);
	//   11   23:aload_0         
	//   12   24:getfield        #28  <Field GoogleApiClient zzayz>
	//   13   27:aload_1         
	//   14   28:invokestatic    #63  <Method String String.valueOf(Object)>
	//   15   31:ldc1            #65  <String "  ">
	//   16   33:invokevirtual   #69  <Method String String.concat(String)>
	//   17   36:aload_2         
	//   18   37:aload_3         
	//   19   38:aload           4
	//   20   40:invokevirtual   #71  <Method void GoogleApiClient.dump(String, FileDescriptor, PrintWriter, String[])>
	//   21   43:return          
	}

	public void onConnectionFailed(ConnectionResult connectionresult)
	{
		String s = String.valueOf(((Object) (connectionresult)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method String String.valueOf(Object)>
	//    2    4:astore_2        
		Log.d("AutoManageHelper", (new StringBuilder(String.valueOf(((Object) (s))).length() + 27)).append("beginFailureResolution for ").append(s).toString());
	//    3    5:ldc1            #76  <String "AutoManageHelper">
	//    4    7:new             #78  <Class StringBuilder>
	//    5   10:dup             
	//    6   11:aload_2         
	//    7   12:invokestatic    #63  <Method String String.valueOf(Object)>
	//    8   15:invokevirtual   #82  <Method int String.length()>
	//    9   18:bipush          27
	//   10   20:iadd            
	//   11   21:invokespecial   #84  <Method void StringBuilder(int)>
	//   12   24:ldc1            #86  <String "beginFailureResolution for ">
	//   13   26:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:aload_2         
	//   15   30:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   17   36:invokestatic    #99  <Method int Log.d(String, String)>
	//   18   39:pop             
		zzayB.zzb(connectionresult, zzayy);
	//   19   40:aload_0         
	//   20   41:getfield        #21  <Field zzzt zzayB>
	//   21   44:aload_1         
	//   22   45:aload_0         
	//   23   46:getfield        #26  <Field int zzayy>
	//   24   49:invokevirtual   #103 <Method void zzzt.zzb(ConnectionResult, int)>
	//   25   52:return          
	}

	public void zzuX()
	{
		zzayz.unregisterConnectionFailedListener(((com.google.android.gms.common.api.Client.OnConnectionFailedListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field GoogleApiClient zzayz>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #108 <Method void GoogleApiClient.unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
		zzayz.disconnect();
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field GoogleApiClient zzayz>
	//    6   12:invokevirtual   #111 <Method void GoogleApiClient.disconnect()>
	//    7   15:return          
	}

	public final com.google.android.gms.common.api.Client.OnConnectionFailedListener zzayA;
	final zzzt zzayB;
	public final int zzayy;
	public final GoogleApiClient zzayz;

	public zzzt$zza(zzzt zzzt1, int i, GoogleApiClient googleapiclient, com.google.android.gms.common.api.Client.OnConnectionFailedListener onconnectionfailedlistener)
	{
		zzayB = zzzt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field zzzt zzayB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		zzayy = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int zzayy>
		zzayz = googleapiclient;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field GoogleApiClient zzayz>
		zzayA = onconnectionfailedlistener;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zzayA>
		googleapiclient.registerConnectionFailedListener(((com.google.android.gms.common.api.Client.OnConnectionFailedListener) (this)));
	//   14   25:aload_3         
	//   15   26:aload_0         
	//   16   27:invokevirtual   #36  <Method void GoogleApiClient.registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener)>
	//   17   30:return          
	}
}
