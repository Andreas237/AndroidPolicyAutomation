// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			Credential, HintRequest, CredentialRequest

public interface CredentialsApi
{

	public abstract PendingResult delete(GoogleApiClient googleapiclient, Credential credential);

	public abstract PendingResult disableAutoSignIn(GoogleApiClient googleapiclient);

	public abstract PendingIntent getHintPickerIntent(GoogleApiClient googleapiclient, HintRequest hintrequest);

	public abstract PendingResult request(GoogleApiClient googleapiclient, CredentialRequest credentialrequest);

	public abstract PendingResult save(GoogleApiClient googleapiclient, Credential credential);

	public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
	public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
	public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
	public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;
}
