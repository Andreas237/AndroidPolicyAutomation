// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.event.GSSocializeEventListener;

// Referenced classes of package com.gigya.socialize.android:
//			GSWebBridge

class GSWebBridge$4
	implements GSSocializeEventListener
{

	public void onConnectionAdded(String s, GSObject gsobject, Object obj)
	{
		if(obj == null || !obj.equals(((Object) (GSWebBridge.access$300(GSWebBridge.this)))))
	//*   0    0:aload_3         
	//*   1    1:ifnull          18
	//*   2    4:aload_3         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field GSWebBridge this$0>
	//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
	//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   7   15:ifne            50
		{
			obj = ((Object) (new GSObject()));
	//    8   18:new             #33  <Class GSObject>
	//    9   21:dup             
	//   10   22:invokespecial   #34  <Method void GSObject()>
	//   11   25:astore_3        
			((GSObject) (obj)).put("user", gsobject);
	//   12   26:aload_3         
	//   13   27:ldc1            #36  <String "user">
	//   14   29:aload_2         
	//   15   30:invokevirtual   #40  <Method void GSObject.put(String, GSObject)>
			((GSObject) (obj)).put("provider", s);
	//   16   33:aload_3         
	//   17   34:ldc1            #42  <String "provider">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #45  <Method void GSObject.put(String, String)>
			GSWebBridge.access$400(GSWebBridge.this, "socialize.connectionAdded", ((GSObject) (obj)));
	//   20   40:aload_0         
	//   21   41:getfield        #17  <Field GSWebBridge this$0>
	//   22   44:ldc1            #47  <String "socialize.connectionAdded">
	//   23   46:aload_3         
	//   24   47:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
		}
	//   25   50:return          
	}

	public void onConnectionRemoved(String s, Object obj)
	{
		if(obj == null || !obj.equals(((Object) (GSWebBridge.access$300(GSWebBridge.this)))))
	//*   0    0:aload_2         
	//*   1    1:ifnull          18
	//*   2    4:aload_2         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field GSWebBridge this$0>
	//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
	//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   7   15:ifne            43
		{
			obj = ((Object) (new GSObject()));
	//    8   18:new             #33  <Class GSObject>
	//    9   21:dup             
	//   10   22:invokespecial   #34  <Method void GSObject()>
	//   11   25:astore_2        
			((GSObject) (obj)).put("provider", s);
	//   12   26:aload_2         
	//   13   27:ldc1            #42  <String "provider">
	//   14   29:aload_1         
	//   15   30:invokevirtual   #45  <Method void GSObject.put(String, String)>
			GSWebBridge.access$400(GSWebBridge.this, "socialize.connectionRemoved", ((GSObject) (obj)));
	//   16   33:aload_0         
	//   17   34:getfield        #17  <Field GSWebBridge this$0>
	//   18   37:ldc1            #55  <String "socialize.connectionRemoved">
	//   19   39:aload_2         
	//   20   40:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
		}
	//   21   43:return          
	}

	public void onLogin(String s, GSObject gsobject, Object obj)
	{
		if(obj == null || !obj.equals(((Object) (GSWebBridge.access$300(GSWebBridge.this)))))
	//*   0    0:aload_3         
	//*   1    1:ifnull          18
	//*   2    4:aload_3         
	//*   3    5:aload_0         
	//*   4    6:getfield        #17  <Field GSWebBridge this$0>
	//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
	//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//*   7   15:ifne            50
		{
			obj = ((Object) (new GSObject()));
	//    8   18:new             #33  <Class GSObject>
	//    9   21:dup             
	//   10   22:invokespecial   #34  <Method void GSObject()>
	//   11   25:astore_3        
			((GSObject) (obj)).put("user", gsobject);
	//   12   26:aload_3         
	//   13   27:ldc1            #36  <String "user">
	//   14   29:aload_2         
	//   15   30:invokevirtual   #40  <Method void GSObject.put(String, GSObject)>
			((GSObject) (obj)).put("provider", s);
	//   16   33:aload_3         
	//   17   34:ldc1            #42  <String "provider">
	//   18   36:aload_1         
	//   19   37:invokevirtual   #45  <Method void GSObject.put(String, String)>
			GSWebBridge.access$400(GSWebBridge.this, "socialize.login", ((GSObject) (obj)));
	//   20   40:aload_0         
	//   21   41:getfield        #17  <Field GSWebBridge this$0>
	//   22   44:ldc1            #58  <String "socialize.login">
	//   23   46:aload_3         
	//   24   47:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
		}
	//   25   50:return          
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
	//   10   22:ldc1            #62  <String "socialize.logout">
	//   11   24:aconst_null     
	//   12   25:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
			GSWebBridge.access$400(GSWebBridge.this, "accounts.logout", ((GSObject) (null)));
	//   13   28:aload_0         
	//   14   29:getfield        #17  <Field GSWebBridge this$0>
	//   15   32:ldc1            #64  <String "accounts.logout">
	//   16   34:aconst_null     
	//   17   35:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
		}
	//   18   38:return          
	}

	final GSWebBridge this$0;

	GSWebBridge$4()
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
