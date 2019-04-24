// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.accounts.Account;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

// Referenced classes of package com.gigya.socialize.android.login.providers:
//			GoogleProvider

class GoogleProvider$5 extends AsyncTask
{

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #32  <Class Void[]>
	//    3    5:invokevirtual   #35  <Method Void doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected Void doInBackground(Void avoid[])
	{
		try
		{
			avoid = ((Void []) (GSAPI.getInstance().getContext()));
	//    0    0:invokestatic    #43  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #47  <Method android.content.Context GSAPI.getContext()>
	//    2    6:astore_1        
			Account account = new Account(val$acc.getEmail(), "com.google");
	//    3    7:new             #49  <Class Account>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field GoogleSignInAccount val$acc>
	//    7   15:invokevirtual   #55  <Method String GoogleSignInAccount.getEmail()>
	//    8   18:ldc1            #57  <String "com.google">
	//    9   20:invokespecial   #60  <Method void Account(String, String)>
	//   10   23:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   11   24:new             #62  <Class StringBuilder>
	//   12   27:dup             
	//   13   28:invokespecial   #63  <Method void StringBuilder()>
	//   14   31:astore_3        
			stringbuilder.append("oauth2:");
	//   15   32:aload_3         
	//   16   33:ldc1            #65  <String "oauth2:">
	//   17   35:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
			stringbuilder.append(TextUtils.join(" ", ((Iterable) (val$acc.getGrantedScopes()))));
	//   19   39:aload_3         
	//   20   40:ldc1            #71  <String " ">
	//   21   42:aload_0         
	//   22   43:getfield        #22  <Field GoogleSignInAccount val$acc>
	//   23   46:invokevirtual   #75  <Method java.util.Set GoogleSignInAccount.getGrantedScopes()>
	//   24   49:invokestatic    #81  <Method String TextUtils.join(CharSequence, Iterable)>
	//   25   52:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
	//   26   55:pop             
			avoid = ((Void []) (GoogleAuthUtil.getToken(((android.content.Context) (avoid)), account, stringbuilder.toString())));
	//   27   56:aload_1         
	//   28   57:aload_2         
	//   29   58:aload_3         
	//   30   59:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   31   62:invokestatic    #90  <Method String GoogleAuthUtil.getToken(android.content.Context, Account, String)>
	//   32   65:astore_1        
		}
	//*  33   66:goto            118
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*  34   69:astore_1        
		{
			GSObject gsobject = new GSObject();
	//   35   70:new             #92  <Class GSObject>
	//   36   73:dup             
	//   37   74:invokespecial   #93  <Method void GSObject()>
	//   38   77:astore_2        
			gsobject.put("errorCode", 0x7a137);
	//   39   78:aload_2         
	//   40   79:ldc1            #95  <String "errorCode">
	//   41   81:ldc1            #96  <Int 0x7a137>
	//   42   83:invokevirtual   #100 <Method void GSObject.put(String, int)>
			gsobject.put("errorMessage", "error while getting google token");
	//   43   86:aload_2         
	//   44   87:ldc1            #102 <String "errorMessage">
	//   45   89:ldc1            #104 <String "error while getting google token">
	//   46   91:invokevirtual   #106 <Method void GSObject.put(String, String)>
			gsobject.put("providerError", ((Exception) (avoid)).getMessage());
	//   47   94:aload_2         
	//   48   95:ldc1            #108 <String "providerError">
	//   49   97:aload_1         
	//   50   98:invokevirtual   #111 <Method String Exception.getMessage()>
	//   51  101:invokevirtual   #106 <Method void GSObject.put(String, String)>
			fail(val$callback, gsobject);
	//   52  104:aload_0         
	//   53  105:getfield        #20  <Field GoogleProvider this$0>
	//   54  108:aload_0         
	//   55  109:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
	//   56  112:aload_2         
	//   57  113:invokevirtual   #115 <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
			avoid = null;
	//   58  116:aconst_null     
	//   59  117:astore_1        
		}
		if(avoid != null && !((String) (avoid)).isEmpty())
	//*  60  118:aload_1         
	//*  61  119:ifnull          149
	//*  62  122:aload_1         
	//*  63  123:invokevirtual   #121 <Method boolean String.isEmpty()>
	//*  64  126:ifeq            132
	//*  65  129:goto            149
		{
			success(val$callback, ((String) (avoid)), -1L);
	//   66  132:aload_0         
	//   67  133:getfield        #20  <Field GoogleProvider this$0>
	//   68  136:aload_0         
	//   69  137:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
	//   70  140:aload_1         
	//   71  141:ldc2w           #122 <Long -1L>
	//   72  144:invokevirtual   #127 <Method void GoogleProvider.success(LoginProvider$ProviderCallback, String, long)>
			return null;
	//   73  147:aconst_null     
	//   74  148:areturn         
		} else
		{
			avoid = ((Void []) (new GSObject()));
	//   75  149:new             #92  <Class GSObject>
	//   76  152:dup             
	//   77  153:invokespecial   #93  <Method void GSObject()>
	//   78  156:astore_1        
			((GSObject) (avoid)).put("errorCode", 0x7a137);
	//   79  157:aload_1         
	//   80  158:ldc1            #95  <String "errorCode">
	//   81  160:ldc1            #96  <Int 0x7a137>
	//   82  162:invokevirtual   #100 <Method void GSObject.put(String, int)>
			((GSObject) (avoid)).put("errorMessage", "no google token");
	//   83  165:aload_1         
	//   84  166:ldc1            #102 <String "errorMessage">
	//   85  168:ldc1            #129 <String "no google token">
	//   86  170:invokevirtual   #106 <Method void GSObject.put(String, String)>
			fail(val$callback, ((GSObject) (avoid)));
	//   87  173:aload_0         
	//   88  174:getfield        #20  <Field GoogleProvider this$0>
	//   89  177:aload_0         
	//   90  178:getfield        #24  <Field LoginProvider$ProviderCallback val$callback>
	//   91  181:aload_1         
	//   92  182:invokevirtual   #115 <Method void GoogleProvider.fail(LoginProvider$ProviderCallback, GSObject)>
			return null;
	//   93  185:aconst_null     
	//   94  186:areturn         
		}
	}

	final GoogleProvider this$0;
	final GoogleSignInAccount val$acc;
	final viderCallback val$callback;

	GoogleProvider$5()
	{
		this$0 = final_googleprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field GoogleProvider this$0>
		val$acc = googlesigninaccount;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field GoogleSignInAccount val$acc>
		val$callback = viderCallback.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #24  <Field LoginProvider$ProviderCallback val$callback>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void AsyncTask()>
	//   11   19:return          
	}
}
