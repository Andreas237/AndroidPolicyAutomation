// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			Credential

public interface CredentialRequestResult
	extends Result
{

	public abstract Credential getCredential();
}
