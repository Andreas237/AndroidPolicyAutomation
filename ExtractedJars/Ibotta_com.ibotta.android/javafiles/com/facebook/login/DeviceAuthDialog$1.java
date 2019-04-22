// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$1
	implements com.facebook.ck
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(DeviceAuthDialog.access$000(DeviceAuthDialog.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
	//*   2    4:invokestatic    #29  <Method boolean DeviceAuthDialog.access$000(DeviceAuthDialog)>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		if(graphresponse.getError() != null)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #35  <Method FacebookRequestError GraphResponse.getError()>
	//*   7   15:ifnull          33
		{
			DeviceAuthDialog.access$100(DeviceAuthDialog.this, graphresponse.getError().getException());
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field DeviceAuthDialog this$0>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #35  <Method FacebookRequestError GraphResponse.getError()>
	//   12   26:invokevirtual   #41  <Method FacebookException FacebookRequestError.getException()>
	//   13   29:invokestatic    #45  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
			return;
	//   14   32:return          
		}
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   15   33:aload_1         
	//   16   34:invokevirtual   #49  <Method JSONObject GraphResponse.getJSONObject()>
	//   17   37:astore_1        
		questState queststate = new questState();
	//   18   38:new             #51  <Class DeviceAuthDialog$RequestState>
	//   19   41:dup             
	//   20   42:invokespecial   #52  <Method void DeviceAuthDialog$RequestState()>
	//   21   45:astore_2        
		try
		{
			queststate.setUserCode(((JSONObject) (graphresponse)).getString("user_code"));
	//   22   46:aload_2         
	//   23   47:aload_1         
	//   24   48:ldc1            #54  <String "user_code">
	//   25   50:invokevirtual   #60  <Method String JSONObject.getString(String)>
	//   26   53:invokevirtual   #64  <Method void DeviceAuthDialog$RequestState.setUserCode(String)>
			queststate.setRequestCode(((JSONObject) (graphresponse)).getString("code"));
	//   27   56:aload_2         
	//   28   57:aload_1         
	//   29   58:ldc1            #66  <String "code">
	//   30   60:invokevirtual   #60  <Method String JSONObject.getString(String)>
	//   31   63:invokevirtual   #69  <Method void DeviceAuthDialog$RequestState.setRequestCode(String)>
			queststate.setInterval(((JSONObject) (graphresponse)).getLong("interval"));
	//   32   66:aload_2         
	//   33   67:aload_1         
	//   34   68:ldc1            #71  <String "interval">
	//   35   70:invokevirtual   #75  <Method long JSONObject.getLong(String)>
	//   36   73:invokevirtual   #79  <Method void DeviceAuthDialog$RequestState.setInterval(long)>
		}
	//*  37   76:aload_0         
	//*  38   77:getfield        #17  <Field DeviceAuthDialog this$0>
	//*  39   80:aload_2         
	//*  40   81:invokestatic    #83  <Method void DeviceAuthDialog.access$200(DeviceAuthDialog, DeviceAuthDialog$RequestState)>
	//*  41   84:return          
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  42   85:astore_1        
		{
			DeviceAuthDialog.access$100(DeviceAuthDialog.this, new FacebookException(((Throwable) (graphresponse))));
	//   43   86:aload_0         
	//   44   87:getfield        #17  <Field DeviceAuthDialog this$0>
	//   45   90:new             #85  <Class FacebookException>
	//   46   93:dup             
	//   47   94:aload_1         
	//   48   95:invokespecial   #88  <Method void FacebookException(Throwable)>
	//   49   98:invokestatic    #45  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
			return;
	//   50  101:return          
		}
		DeviceAuthDialog.access$200(DeviceAuthDialog.this, queststate);
	}

	final DeviceAuthDialog this$0;

	DeviceAuthDialog$1()
	{
		this$0 = DeviceAuthDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeviceAuthDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
