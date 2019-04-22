// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

// Referenced classes of package com.appsflyer:
//			AFLogger, AppsFlyerProperties, d, y

public class FirebaseInstanceIdListener extends FirebaseInstanceIdService
{

	public FirebaseInstanceIdListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void FirebaseInstanceIdService()>
	//    2    4:return          
	}

	public void onTokenRefresh()
	{
		super.onTokenRefresh();
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void FirebaseInstanceIdService.onTokenRefresh()>
		long l = System.currentTimeMillis();
	//    2    4:invokestatic    #20  <Method long System.currentTimeMillis()>
	//    3    7:lstore_1        
		Object obj;
		try
		{
			obj = ((Object) (FirebaseInstanceId.getInstance().getToken()));
	//    4    8:invokestatic    #26  <Method FirebaseInstanceId FirebaseInstanceId.getInstance()>
	//    5   11:invokevirtual   #30  <Method String FirebaseInstanceId.getToken()>
	//    6   14:astore_3        
		}
	//*   7   15:goto            27
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   8   18:astore_3        
		{
			AFLogger.afErrorLog("Error registering for uninstall tracking", ((Throwable) (obj)));
	//    9   19:ldc1            #32  <String "Error registering for uninstall tracking">
	//   10   21:aload_3         
	//   11   22:invokestatic    #38  <Method void AFLogger.afErrorLog(String, Throwable)>
			obj = null;
	//   12   25:aconst_null     
	//   13   26:astore_3        
		}
		if(obj != null)
	//*  14   27:aload_3         
	//*  15   28:ifnull          83
		{
			AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(obj)));
	//   16   31:ldc1            #40  <String "Firebase Refreshed Token = ">
	//   17   33:aload_3         
	//   18   34:invokestatic    #46  <Method String String.valueOf(Object)>
	//   19   37:invokevirtual   #50  <Method String String.concat(String)>
	//   20   40:invokestatic    #54  <Method void AFLogger.afInfoLog(String)>
			d d1 = d._mth02CA(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
	//   21   43:invokestatic    #59  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   22   46:ldc1            #61  <String "afUninstallToken">
	//   23   48:invokevirtual   #64  <Method String AppsFlyerProperties.getString(String)>
	//   24   51:invokestatic    #70  <Method d d._mth02CA(String)>
	//   25   54:astore          4
			obj = ((Object) (new d(l, ((String) (obj)))));
	//   26   56:new             #66  <Class d>
	//   27   59:dup             
	//   28   60:lload_1         
	//   29   61:aload_3         
	//   30   62:invokespecial   #73  <Method void d(long, String)>
	//   31   65:astore_3        
			if(d1._mth02CF(((d) (obj))))
	//*  32   66:aload           4
	//*  33   68:aload_3         
	//*  34   69:invokevirtual   #77  <Method boolean d._mth02CF(d)>
	//*  35   72:ifeq            83
				y._mth02CA(((Context)this).getApplicationContext(), ((d) (obj)));
	//   36   75:aload_0         
	//   37   76:invokevirtual   #83  <Method Context Context.getApplicationContext()>
	//   38   79:aload_3         
	//   39   80:invokestatic    #88  <Method void y._mth02CA(Context, d)>
		}
	//   40   83:return          
	}
}
