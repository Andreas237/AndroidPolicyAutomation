// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzw;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			zzd, AccountTransferClient, zze, zzt

public final class AccountTransfer
{

	private AccountTransfer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method void Object()>
	//    2    4:return          
	}

	public static AccountTransferClient getAccountTransferClient(Activity activity)
	{
		return new AccountTransferClient(activity);
	//    0    0:new             #68  <Class AccountTransferClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #71  <Method void AccountTransferClient(Activity)>
	//    4    8:areturn         
	}

	public static AccountTransferClient getAccountTransferClient(Context context)
	{
		return new AccountTransferClient(context);
	//    0    0:new             #68  <Class AccountTransferClient>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #76  <Method void AccountTransferClient(Context)>
	//    4    8:areturn         
	}

	public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
	public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
	public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
	public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
	private static final com.google.android.gms.common.api.Api.ClientKey zzau;
	private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzav;
	private static final Api zzaw;
	private static final zze zzax = new zzw();
	private static final zzt zzay = new zzw();

	static 
	{
		zzau = new com.google.android.gms.common.api.Api.ClientKey();
	//    0    0:new             #35  <Class com.google.android.gms.common.api.Api$ClientKey>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void com.google.android.gms.common.api.Api$ClientKey()>
	//    3    7:putstatic       #40  <Field com.google.android.gms.common.api.Api$ClientKey zzau>
		zzav = ((com.google.android.gms.common.api.Api.AbstractClientBuilder) (new zzd()));
	//    4   10:new             #42  <Class zzd>
	//    5   13:dup             
	//    6   14:invokespecial   #43  <Method void zzd()>
	//    7   17:putstatic       #45  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzav>
		zzaw = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzav, zzau);
	//    8   20:new             #47  <Class Api>
	//    9   23:dup             
	//   10   24:ldc1            #49  <String "AccountTransfer.ACCOUNT_TRANSFER_API">
	//   11   26:getstatic       #45  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzav>
	//   12   29:getstatic       #40  <Field com.google.android.gms.common.api.Api$ClientKey zzau>
	//   13   32:invokespecial   #52  <Method void Api(String, com.google.android.gms.common.api.Api$AbstractClientBuilder, com.google.android.gms.common.api.Api$ClientKey)>
	//   14   35:putstatic       #54  <Field Api zzaw>
	//   15   38:new             #56  <Class zzw>
	//   16   41:dup             
	//   17   42:invokespecial   #57  <Method void zzw()>
	//   18   45:putstatic       #59  <Field zze zzax>
	//   19   48:new             #56  <Class zzw>
	//   20   51:dup             
	//   21   52:invokespecial   #57  <Method void zzw()>
	//   22   55:putstatic       #61  <Field zzt zzay>
	//*  23   58:return          
	}
}
