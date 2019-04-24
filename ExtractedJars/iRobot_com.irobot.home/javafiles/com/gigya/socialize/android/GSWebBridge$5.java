// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.event.GSAccountsEventListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$5
	implements GSAccountsEventListener
{

	public void onLogin(GSObject gsobject, Object obj)
	{
		if(obj == null || !obj.equals(((Object) (GSWebBridge.access$300(GSWebBridge.this)))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          18
	//*   2    4:aload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field GSWebBridge this$0>
	//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
	//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   7   15:ifne            31
			GSWebBridge.access$400(GSWebBridge.this, "accounts.login", gsobject.clone());
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field GSWebBridge this$0>
	//   10   22:ldc1            #33  <String "accounts.login">
	//   11   24:aload_1         
	//   12   25:invokevirtual   #39  <Method GSObject GSObject.clone()>
	//   13   28:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
	//   14   31:return          
	}

	public void onLogout(Object obj)
	{
		if(obj == null || !obj.equals(((Object) (GSWebBridge.access$300(GSWebBridge.this)))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field GSWebBridge this$0>
	//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
	//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   7   15:ifne            38
		{
			GSWebBridge.access$400(GSWebBridge.this, "socialize.logout", ((GSObject) (null)));
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field GSWebBridge this$0>
	//   10   22:ldc1            #47  <String "socialize.logout">
	//   11   24:aconst_null     
	//   12   25:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
			GSWebBridge.access$400(GSWebBridge.this, "accounts.logout", ((GSObject) (null)));
	//   13   28:aload_0         
	//   14   29:getfield        #17  <Field GSWebBridge this$0>
	//   15   32:ldc1            #49  <String "accounts.logout">
	//   16   34:aconst_null     
	//   17   35:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
		}
	//   18   38:return          
	}

	final GSWebBridge this$0;

	GSWebBridge$5()
	{
		this$0 = GSWebBridge.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field GSWebBridge this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
