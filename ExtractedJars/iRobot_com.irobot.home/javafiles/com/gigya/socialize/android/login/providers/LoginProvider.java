// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.login.providers;

import android.app.Activity;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.ui.HostActivity;

public abstract class LoginProvider
{
	public static interface ProviderCallback
	{

		public abstract void onResponse(GSObject gsobject);
	}


	public LoginProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	protected static boolean isClassExist(String s)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		try
		{
			s = ((String) (Class.forName(s)));
	//    2    2:aload_0         
	//    3    3:invokestatic    #22  <Method Class Class.forName(String)>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:ifnull          13
	//*   7   11:iconst_1        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  11   15:astore_0        
		{
			return false;
	//   12   16:iconst_0        
	//   13   17:ireturn         
		}
		if(s != null)
			flag = true;
		return flag;
	}

	protected void cancel(ProviderCallback providercallback)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method void finish()>
		GSObject gsobject = new GSObject();
	//    2    4:new             #29  <Class GSObject>
	//    3    7:dup             
	//    4    8:invokespecial   #30  <Method void GSObject()>
	//    5   11:astore_2        
		gsobject.put("errorCode", 0x30d41);
	//    6   12:aload_2         
	//    7   13:ldc1            #32  <String "errorCode">
	//    8   15:ldc1            #33  <Int 0x30d41>
	//    9   17:invokevirtual   #37  <Method void GSObject.put(String, int)>
		gsobject.put("errorMessage", "Operation canceled");
	//   10   20:aload_2         
	//   11   21:ldc1            #39  <String "errorMessage">
	//   12   23:ldc1            #41  <String "Operation canceled">
	//   13   25:invokevirtual   #44  <Method void GSObject.put(String, String)>
		providercallback.onResponse(gsobject);
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:invokeinterface #48  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
	//   17   35:return          
	}

	public void clearSession()
	{
	//    0    0:return          
	}

	protected void createActivity(com.gigya.socialize.android.ui.HostActivity.HostActivityHandler hostactivityhandler)
	{
		HostActivity.create(GSAPI.getInstance().getContext(), hostactivityhandler);
	//    0    0:invokestatic    #57  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #61  <Method android.content.Context GSAPI.getContext()>
	//    2    6:aload_1         
	//    3    7:invokestatic    #67  <Method Integer HostActivity.create(android.content.Context, com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//    4   10:pop             
	//    5   11:return          
	}

	protected void fail(ProviderCallback providercallback, GSObject gsobject)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method void finish()>
		providercallback.onResponse(gsobject);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #48  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
	//    5   11:return          
	}

	protected void fail(ProviderCallback providercallback, String s)
	{
		GSObject gsobject = new GSObject();
	//    0    0:new             #29  <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void GSObject()>
	//    3    7:astore_3        
		gsobject.put("errorCode", 0x7a137);
	//    4    8:aload_3         
	//    5    9:ldc1            #32  <String "errorCode">
	//    6   11:ldc1            #71  <Int 0x7a137>
	//    7   13:invokevirtual   #37  <Method void GSObject.put(String, int)>
		gsobject.put("errorMessage", s);
	//    8   16:aload_3         
	//    9   17:ldc1            #39  <String "errorMessage">
	//   10   19:aload_2         
	//   11   20:invokevirtual   #44  <Method void GSObject.put(String, String)>
		fail(providercallback, gsobject);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:aload_3         
	//   15   26:invokevirtual   #73  <Method void fail(LoginProvider$ProviderCallback, GSObject)>
	//   16   29:return          
	}

	protected abstract void finish();

	public abstract void login(Activity activity, GSObject gsobject, Boolean boolean1, ProviderCallback providercallback);

	protected void success(ProviderCallback providercallback, String s, long l)
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method void finish()>
		GSObject gsobject = new GSObject();
	//    2    4:new             #29  <Class GSObject>
	//    3    7:dup             
	//    4    8:invokespecial   #30  <Method void GSObject()>
	//    5   11:astore          5
		gsobject.put("providerToken", s);
	//    6   13:aload           5
	//    7   15:ldc1            #79  <String "providerToken">
	//    8   17:aload_2         
	//    9   18:invokevirtual   #44  <Method void GSObject.put(String, String)>
		if(l != -1L)
	//*  10   21:lload_3         
	//*  11   22:ldc2w           #80  <Long -1L>
	//*  12   25:lcmp            
	//*  13   26:ifeq            37
			gsobject.put("providerTokenExpiration", l);
	//   14   29:aload           5
	//   15   31:ldc1            #83  <String "providerTokenExpiration">
	//   16   33:lload_3         
	//   17   34:invokevirtual   #86  <Method void GSObject.put(String, long)>
		providercallback.onResponse(gsobject);
	//   18   37:aload_1         
	//   19   38:aload           5
	//   20   40:invokeinterface #48  <Method void LoginProvider$ProviderCallback.onResponse(GSObject)>
	//   21   45:return          
	}
}
