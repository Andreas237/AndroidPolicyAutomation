// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzby

final class zzca
	implements Runnable
{

	zzca(zzby zzby1, SignInResponse signinresponse)
	{
		zzlx = zzby1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzby zzlx>
		zzid = signinresponse;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field SignInResponse zzid>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzby.zza(zzlx, zzid);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzby zzlx>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field SignInResponse zzid>
	//    4    8:invokestatic    #26  <Method void zzby.zza(zzby, SignInResponse)>
	//    5   11:return          
	}

	private final SignInResponse zzid;
	private final zzby zzlx;
}
