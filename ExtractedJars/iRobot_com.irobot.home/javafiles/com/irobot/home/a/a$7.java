// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.a;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.event.GSAccountsEventListener;
import com.irobot.core.*;
import com.irobot.home.util.o;

// Referenced classes of package com.irobot.home.a:
//			a

class a$7
	implements GSAccountsEventListener
{

	public void onLogin(GSObject gsobject, Object obj)
	{
		o.b(com.irobot.home.a.a.b(), "User was logged in");
	//    0    0:invokestatic    #26  <Method String a.b()>
	//    1    3:ldc1            #28  <String "User was logged in">
	//    2    5:invokestatic    #33  <Method void o.b(String, String)>
		gsobject = ((GSObject) (AccountInfo.create(gsobject.toJsonString())));
	//    3    8:aload_1         
	//    4    9:invokevirtual   #38  <Method String GSObject.toJsonString()>
	//    5   12:invokestatic    #44  <Method AccountInfo AccountInfo.create(String)>
	//    6   15:astore_1        
		if(gsobject != null)
	//*   7   16:aload_1         
	//*   8   17:ifnull          35
			com.irobot.home.a.a.a(a).onLogin(((AccountInfo) (gsobject)), false);
	//    9   20:aload_0         
	//   10   21:getfield        #16  <Field a a>
	//   11   24:invokestatic    #47  <Method AccountSessionDelegate a.a(a)>
	//   12   27:aload_1         
	//   13   28:iconst_0        
	//   14   29:invokevirtual   #52  <Method void AccountSessionDelegate.onLogin(AccountInfo, boolean)>
		else
	//*  15   32:goto            48
			com.irobot.home.a.a.a(a).onFailure(AccountError.AccountInfoRefreshFailed);
	//   16   35:aload_0         
	//   17   36:getfield        #16  <Field a a>
	//   18   39:invokestatic    #47  <Method AccountSessionDelegate a.a(a)>
	//   19   42:getstatic       #58  <Field AccountError AccountError.AccountInfoRefreshFailed>
	//   20   45:invokevirtual   #62  <Method void AccountSessionDelegate.onFailure(AccountError)>
		AnalyticsSubsystem.getInstance().trackUserLoggedIn();
	//   21   48:invokestatic    #68  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   22   51:invokevirtual   #71  <Method void AnalyticsSubsystem.trackUserLoggedIn()>
	//   23   54:return          
	}

	public void onLogout(Object obj)
	{
		o.b(com.irobot.home.a.a.b(), "User was logged out");
	//    0    0:invokestatic    #26  <Method String a.b()>
	//    1    3:ldc1            #75  <String "User was logged out">
	//    2    5:invokestatic    #33  <Method void o.b(String, String)>
		com.irobot.home.a.a.a(a).onLogout();
	//    3    8:aload_0         
	//    4    9:getfield        #16  <Field a a>
	//    5   12:invokestatic    #47  <Method AccountSessionDelegate a.a(a)>
	//    6   15:invokevirtual   #77  <Method void AccountSessionDelegate.onLogout()>
		AnalyticsSubsystem.getInstance().trackUserLoggedOut();
	//    7   18:invokestatic    #68  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    8   21:invokevirtual   #80  <Method void AnalyticsSubsystem.trackUserLoggedOut()>
	//    9   24:return          
	}

	final a a;

	a$7(a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
