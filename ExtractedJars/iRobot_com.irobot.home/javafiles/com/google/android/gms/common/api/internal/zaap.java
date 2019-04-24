// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zabf, zaan, zabd

final class zaap extends zabf
{

	zaap(zaan zaan1, zabd zabd, com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
	{
		zagn = connectionprogressreportcallbacks;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #10  <Field com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks zagn>
		super(zabd);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #13  <Method void zabf(zabd)>
	//    6   10:return          
	}

	public final void zaan()
	{
		zagn.onReportServiceBinding(new ConnectionResult(16, ((android.app.PendingIntent) (null))));
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks zagn>
	//    2    4:new             #21  <Class ConnectionResult>
	//    3    7:dup             
	//    4    8:bipush          16
	//    5   10:aconst_null     
	//    6   11:invokespecial   #24  <Method void ConnectionResult(int, android.app.PendingIntent)>
	//    7   14:invokeinterface #30  <Method void com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
	//    8   19:return          
	}

	private final com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks zagn;
}
