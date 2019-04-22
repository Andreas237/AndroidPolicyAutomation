// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.SignInResponse;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbe, zzaj, zzaq, zzbc

final class zzar extends zzbe
{

	zzar(zzaq zzaq1, zzbc zzbc, zzaj zzaj1, SignInResponse signinresponse)
	{
		zzic = zzaj1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #12  <Field zzaj zzic>
		zzid = signinresponse;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #14  <Field SignInResponse zzid>
		super(zzbc);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #17  <Method void zzbe(zzbc)>
	//    9   16:return          
	}

	public final void zzaq()
	{
		zzaj.zza(zzic, zzid);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzaj zzic>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field SignInResponse zzid>
	//    4    8:invokestatic    #26  <Method void zzaj.zza(zzaj, SignInResponse)>
	//    5   11:return          
	}

	private final zzaj zzic;
	private final SignInResponse zzid;
}
