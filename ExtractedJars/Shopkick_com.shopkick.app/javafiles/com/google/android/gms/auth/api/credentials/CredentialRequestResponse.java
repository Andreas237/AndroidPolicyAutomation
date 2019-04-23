// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			CredentialRequestResult, Credential

public class CredentialRequestResponse extends Response
{

	public CredentialRequestResponse()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void Response()>
	//    2    4:return          
	}

	public Credential getCredential()
	{
		return ((CredentialRequestResult)getResult()).getCredential();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #16  <Method com.google.android.gms.common.api.Result getResult()>
	//    2    4:checkcast       #18  <Class CredentialRequestResult>
	//    3    7:invokeinterface #20  <Method Credential CredentialRequestResult.getCredential()>
	//    4   12:areturn         
	}
}
