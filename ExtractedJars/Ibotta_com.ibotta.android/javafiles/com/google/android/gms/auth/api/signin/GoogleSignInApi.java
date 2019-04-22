// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.*;

// Referenced classes of package com.google.android.gms.auth.api.signin:
//			GoogleSignInResult

public interface GoogleSignInApi
{

	public abstract Intent getSignInIntent(GoogleApiClient googleapiclient);

	public abstract GoogleSignInResult getSignInResultFromIntent(Intent intent);

	public abstract PendingResult revokeAccess(GoogleApiClient googleapiclient);

	public abstract PendingResult signOut(GoogleApiClient googleapiclient);

	public abstract OptionalPendingResult silentSignIn(GoogleApiClient googleapiclient);

	public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";
}
