// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.twitter.sdk.android.core.SessionManager;

// Referenced classes of package com.digits.sdk.android:
//			DigitsSession, WeakAuthCallback, DigitsException

class LoginResultReceiver extends ResultReceiver
{

	public void onReceiveResult(int i, Bundle bundle)
	{
		WeakAuthCallback weakauthcallback = callback;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field WeakAuthCallback callback>
	//    2    4:astore_3        
		if(weakauthcallback != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          63
		{
			if(i == 200)
	//*   5    9:iload_1         
	//*   6   10:sipush          200
	//*   7   13:icmpne          39
			{
				weakauthcallback.success((DigitsSession)sessionManager.getActiveSession(), bundle.getString("phone_number"));
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field SessionManager sessionManager>
	//   11   21:invokeinterface #21  <Method com.twitter.sdk.android.core.Session SessionManager.getActiveSession()>
	//   12   26:checkcast       #23  <Class DigitsSession>
	//   13   29:aload_2         
	//   14   30:ldc1            #25  <String "phone_number">
	//   15   32:invokevirtual   #31  <Method String Bundle.getString(String)>
	//   16   35:invokevirtual   #37  <Method void WeakAuthCallback.success(DigitsSession, String)>
				return;
	//   17   38:return          
			}
			if(i == 400)
	//*  18   39:iload_1         
	//*  19   40:sipush          400
	//*  20   43:icmpne          63
				weakauthcallback.failure(new DigitsException(bundle.getString("login_error")));
	//   21   46:aload_3         
	//   22   47:new             #39  <Class DigitsException>
	//   23   50:dup             
	//   24   51:aload_2         
	//   25   52:ldc1            #41  <String "login_error">
	//   26   54:invokevirtual   #31  <Method String Bundle.getString(String)>
	//   27   57:invokespecial   #45  <Method void DigitsException(String)>
	//   28   60:invokevirtual   #49  <Method void WeakAuthCallback.failure(DigitsException)>
		}
	//   29   63:return          
	}

	final WeakAuthCallback callback;
	final SessionManager sessionManager;
}
