// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInAccount

public class GoogleSignInResult
	implements Result
{

	public GoogleSignInResult(GoogleSignInAccount googlesigninaccount, Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzen = googlesigninaccount;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field GoogleSignInAccount zzen>
		mStatus = status;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Status mStatus>
	//    8   14:return          
	}

	public GoogleSignInAccount getSignInAccount()
	{
		return zzen;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field GoogleSignInAccount zzen>
	//    2    4:areturn         
	}

	public Status getStatus()
	{
		return mStatus;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status mStatus>
	//    2    4:areturn         
	}

	public boolean isSuccess()
	{
		return mStatus.isSuccess();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Status mStatus>
	//    2    4:invokevirtual   #34  <Method boolean Status.isSuccess()>
	//    3    7:ireturn         
	}

	private Status mStatus;
	private GoogleSignInAccount zzen;
}
