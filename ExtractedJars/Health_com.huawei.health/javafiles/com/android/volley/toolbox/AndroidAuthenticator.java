// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley.toolbox;

import android.accounts.*;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.AuthFailureError;

// Referenced classes of package com.android.volley.toolbox:
//			Authenticator

public class AndroidAuthenticator
	implements Authenticator
{

	AndroidAuthenticator(AccountManager accountmanager, Account account, String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mAccountManager = accountmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AccountManager mAccountManager>
		mAccount = account;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field Account mAccount>
		mAuthTokenType = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field String mAuthTokenType>
		mNotifyAuthFailure = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field boolean mNotifyAuthFailure>
	//   14   25:return          
	}

	public AndroidAuthenticator(Context context, Account account, String s)
	{
		this(context, account, s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:invokespecial   #32  <Method void AndroidAuthenticator(Context, Account, String, boolean)>
	//    6    8:return          
	}

	public AndroidAuthenticator(Context context, Account account, String s, boolean flag)
	{
		this(AccountManager.get(context), account, s, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #38  <Method AccountManager AccountManager.get(Context)>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #40  <Method void AndroidAuthenticator(AccountManager, Account, String, boolean)>
	//    7   12:return          
	}

	public Account getAccount()
	{
		return mAccount;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Account mAccount>
	//    2    4:areturn         
	}

	public String getAuthToken()
		throws AuthFailureError
	{
		AccountManagerFuture accountmanagerfuture = mAccountManager.getAuthToken(mAccount, mAuthTokenType, mNotifyAuthFailure, ((android.accounts.AccountManagerCallback) (null)), ((android.os.Handler) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AccountManager mAccountManager>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Account mAccount>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String mAuthTokenType>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field boolean mNotifyAuthFailure>
	//    8   16:aconst_null     
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #51  <Method AccountManagerFuture AccountManager.getAuthToken(Account, String, boolean, android.accounts.AccountManagerCallback, android.os.Handler)>
	//   11   21:astore_3        
		Bundle bundle;
		try
		{
			bundle = (Bundle)accountmanagerfuture.getResult();
	//   12   22:aload_3         
	//   13   23:invokeinterface #57  <Method Object AccountManagerFuture.getResult()>
	//   14   28:checkcast       #59  <Class Bundle>
	//   15   31:astore          4
		}
	//*  16   33:goto            48
		catch(Exception exception)
	//*  17   36:astore_1        
		{
			throw new AuthFailureError("Error while retrieving auth token", exception);
	//   18   37:new             #46  <Class AuthFailureError>
	//   19   40:dup             
	//   20   41:ldc1            #61  <String "Error while retrieving auth token">
	//   21   43:aload_1         
	//   22   44:invokespecial   #64  <Method void AuthFailureError(String, Exception)>
	//   23   47:athrow          
		}
		Object obj = null;
	//   24   48:aconst_null     
	//   25   49:astore_2        
		String s = ((String) (obj));
	//   26   50:aload_2         
	//   27   51:astore_1        
		if(accountmanagerfuture.isDone())
	//*  28   52:aload_3         
	//*  29   53:invokeinterface #68  <Method boolean AccountManagerFuture.isDone()>
	//*  30   58:ifeq            108
		{
			s = ((String) (obj));
	//   31   61:aload_2         
	//   32   62:astore_1        
			if(!accountmanagerfuture.isCancelled())
	//*  33   63:aload_3         
	//*  34   64:invokeinterface #71  <Method boolean AccountManagerFuture.isCancelled()>
	//*  35   69:ifne            108
			{
				if(bundle.containsKey("intent"))
	//*  36   72:aload           4
	//*  37   74:ldc1            #73  <String "intent">
	//*  38   76:invokevirtual   #77  <Method boolean Bundle.containsKey(String)>
	//*  39   79:ifeq            100
					throw new AuthFailureError((Intent)bundle.getParcelable("intent"));
	//   40   82:new             #46  <Class AuthFailureError>
	//   41   85:dup             
	//   42   86:aload           4
	//   43   88:ldc1            #73  <String "intent">
	//   44   90:invokevirtual   #81  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   45   93:checkcast       #83  <Class Intent>
	//   46   96:invokespecial   #86  <Method void AuthFailureError(Intent)>
	//   47   99:athrow          
				s = bundle.getString("authtoken");
	//   48  100:aload           4
	//   49  102:ldc1            #88  <String "authtoken">
	//   50  104:invokevirtual   #92  <Method String Bundle.getString(String)>
	//   51  107:astore_1        
			}
		}
		if(s == null)
	//*  52  108:aload_1         
	//*  53  109:ifnonnull       142
			throw new AuthFailureError((new StringBuilder()).append("Got null auth token for type: ").append(mAuthTokenType).toString());
	//   54  112:new             #46  <Class AuthFailureError>
	//   55  115:dup             
	//   56  116:new             #94  <Class StringBuilder>
	//   57  119:dup             
	//   58  120:invokespecial   #95  <Method void StringBuilder()>
	//   59  123:ldc1            #97  <String "Got null auth token for type: ">
	//   60  125:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   61  128:aload_0         
	//   62  129:getfield        #25  <Field String mAuthTokenType>
	//   63  132:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   64  135:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   65  138:invokespecial   #107 <Method void AuthFailureError(String)>
	//   66  141:athrow          
		else
			return s;
	//   67  142:aload_1         
	//   68  143:areturn         
	}

	public void invalidateAuthToken(String s)
	{
		mAccountManager.invalidateAuthToken(mAccount.type, s);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AccountManager mAccountManager>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Account mAccount>
	//    4    8:getfield        #114 <Field String Account.type>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #117 <Method void AccountManager.invalidateAuthToken(String, String)>
	//    7   15:return          
	}

	private final Account mAccount;
	private final AccountManager mAccountManager;
	private final String mAuthTokenType;
	private final boolean mNotifyAuthFailure;
}
