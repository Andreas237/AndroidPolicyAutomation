// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

// Referenced classes of package com.google.android.gms.common.internal:
//			IAccountAccessor

public class AccountAccessor extends IAccountAccessor.Stub
{

	public static Account getAccountBinderSafe(IAccountAccessor iaccountaccessor)
	{
		if(iaccountaccessor == null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:ifnull          46
_L1:
		long l = Binder.clearCallingIdentity();
	//    2    4:invokestatic    #15  <Method long Binder.clearCallingIdentity()>
	//    3    7:lstore_1        
		iaccountaccessor = ((IAccountAccessor) (iaccountaccessor.getAccount()));
	//    4    8:aload_0         
	//    5    9:invokeinterface #21  <Method Account IAccountAccessor.getAccount()>
	//    6   14:astore_0        
		Binder.restoreCallingIdentity(l);
	//    7   15:lload_1         
	//    8   16:invokestatic    #25  <Method void Binder.restoreCallingIdentity(long)>
		return ((Account) (iaccountaccessor));
	//    9   19:aload_0         
	//   10   20:areturn         
		iaccountaccessor;
	//   11   21:astore_0        
		  goto _L3
	//*  12   22:goto            40
_L5:
		Log.w("AccountAccessor", "Remote account accessor probably died");
	//   13   25:ldc1            #27  <String "AccountAccessor">
	//   14   27:ldc1            #29  <String "Remote account accessor probably died">
	//   15   29:invokestatic    #35  <Method int Log.w(String, String)>
	//   16   32:pop             
		Binder.restoreCallingIdentity(l);
	//   17   33:lload_1         
	//   18   34:invokestatic    #25  <Method void Binder.restoreCallingIdentity(long)>
		  goto _L2
	//*  19   37:goto            46
_L3:
		Binder.restoreCallingIdentity(l);
	//   20   40:lload_1         
	//   21   41:invokestatic    #25  <Method void Binder.restoreCallingIdentity(long)>
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
		throw new NoSuchMethodError();
	//    0    0:new             #41  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}

	public final Account getAccount()
	{
		throw new NoSuchMethodError();
	//    0    0:new             #41  <Class NoSuchMethodError>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void NoSuchMethodError()>
	//    3    7:athrow          
	}
}
