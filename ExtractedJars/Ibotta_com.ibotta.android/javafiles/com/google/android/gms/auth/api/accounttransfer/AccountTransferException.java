// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public class AccountTransferException extends ApiException
{

	public AccountTransferException(Status status)
	{
		super(status);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ApiException(Status)>
	//    3    5:return          
	}
}
