// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtilLight;

// Referenced classes of package com.google.android.gms.common.internal:
//			IAccountAccessor

public class AccountAccessor extends IAccountAccessor.Stub
{

	public AccountAccessor(Context context, Account account)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void IAccountAccessor$Stub()>
		zzqu = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #17  <Field int zzqu>
		mContext = context.getApplicationContext();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #23  <Method Context Context.getApplicationContext()>
	//    8   14:putfield        #25  <Field Context mContext>
		zzs = account;
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:putfield        #27  <Field Account zzs>
	//   12   22:return          
	}

	public static AccountAccessor fromGoogleAccountName(Context context, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            12
			s = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:goto            23
			s = ((String) (new Account(s, "com.google")));
	//    6   12:new             #38  <Class Account>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:ldc1            #40  <String "com.google">
	//   10   19:invokespecial   #43  <Method void Account(String, String)>
	//   11   22:astore_1        
		return new AccountAccessor(context, ((Account) (s)));
	//   12   23:new             #2   <Class AccountAccessor>
	//   13   26:dup             
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:invokespecial   #45  <Method void AccountAccessor(Context, Account)>
	//   17   32:areturn         
	}

	public static Account getAccountBinderSafe(IAccountAccessor iaccountaccessor)
	{
		if(iaccountaccessor == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          46
_L1:
		long l = Binder.clearCallingIdentity();
	//    2    4:invokestatic    #55  <Method long Binder.clearCallingIdentity()>
	//    3    7:lstore_1        
		iaccountaccessor = ((IAccountAccessor) (iaccountaccessor.getAccount()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #61  <Method Account IAccountAccessor.getAccount()>
	//    6   14:astore_0        
		Binder.restoreCallingIdentity(l);
	//    7   15:lload_1         
	//    8   16:invokestatic    #65  <Method void Binder.restoreCallingIdentity(long)>
		return ((Account) (iaccountaccessor));
	//    9   19:aload_0         
	//   10   20:areturn         
		iaccountaccessor;
	//   11   21:astore_0        
		  goto _L3
	//*  12   22:goto            40
_L5:
		Log.w("AccountAccessor", "Remote account accessor probably died");
	//   13   25:ldc1            #67  <String "AccountAccessor">
	//   14   27:ldc1            #69  <String "Remote account accessor probably died">
	//   15   29:invokestatic    #75  <Method int Log.w(String, String)>
	//   16   32:pop             
		Binder.restoreCallingIdentity(l);
	//   17   33:lload_1         
	//   18   34:invokestatic    #65  <Method void Binder.restoreCallingIdentity(long)>
		  goto _L2
	//*  19   37:goto            46
_L3:
		Binder.restoreCallingIdentity(l);
	//   20   40:lload_1         
	//   21   41:invokestatic    #65  <Method void Binder.restoreCallingIdentity(long)>
		throw iaccountaccessor;
	//   22   44:aload_0         
	//   23   45:athrow          
_L2:
		return null;
	//   24   46:aconst_null     
	//   25   47:areturn         
		iaccountaccessor;
	//   26   48:astore_0        
		if(true) goto _L5; else goto _L4
_L4:
	//*  27   49:goto            25
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof AccountAccessor))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class AccountAccessor>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		else
			return zzs.equals(((Object) (((AccountAccessor)obj).zzs)));
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field Account zzs>
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class AccountAccessor>
	//   14   24:getfield        #27  <Field Account zzs>
	//   15   27:invokevirtual   #79  <Method boolean Account.equals(Object)>
	//   16   30:ireturn         
	}

	public Account getAccount()
	{
		int i = Binder.getCallingUid();
	//    0    0:invokestatic    #83  <Method int Binder.getCallingUid()>
	//    1    3:istore_1        
		if(i == zzqu)
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field int zzqu>
	//*   5    9:icmpne          17
			return zzs;
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Account zzs>
	//    8   16:areturn         
		if(GooglePlayServicesUtilLight.isGooglePlayServicesUid(mContext, i))
	//*   9   17:aload_0         
	//*  10   18:getfield        #25  <Field Context mContext>
	//*  11   21:iload_1         
	//*  12   22:invokestatic    #89  <Method boolean GooglePlayServicesUtilLight.isGooglePlayServicesUid(Context, int)>
	//*  13   25:ifeq            38
		{
			zzqu = i;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:putfield        #17  <Field int zzqu>
			return zzs;
	//   17   33:aload_0         
	//   18   34:getfield        #27  <Field Account zzs>
	//   19   37:areturn         
		} else
		{
			throw new SecurityException("Caller is not GooglePlayServices");
	//   20   38:new             #91  <Class SecurityException>
	//   21   41:dup             
	//   22   42:ldc1            #93  <String "Caller is not GooglePlayServices">
	//   23   44:invokespecial   #96  <Method void SecurityException(String)>
	//   24   47:athrow          
		}
	}

	private Context mContext;
	private int zzqu;
	private Account zzs;
}
