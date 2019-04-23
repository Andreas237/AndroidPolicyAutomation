// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.common.api.*;

public interface WorkAccountApi
{
	public static interface AddAccountResult
		extends Result
	{

		public abstract Account getAccount();
	}


	public abstract PendingResult addWorkAccount(GoogleApiClient googleapiclient, String s);

	public abstract PendingResult removeWorkAccount(GoogleApiClient googleapiclient, Account account);

	public abstract void setWorkAuthenticatorEnabled(GoogleApiClient googleapiclient, boolean flag);

	public abstract PendingResult setWorkAuthenticatorEnabledWithResult(GoogleApiClient googleapiclient, boolean flag);
}
