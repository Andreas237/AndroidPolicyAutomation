// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.*;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$4
	implements com.facebook.ck
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(DeviceAuthDialog.access$500(DeviceAuthDialog.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
	//*   2    4:invokestatic    #29  <Method AtomicBoolean DeviceAuthDialog.access$500(DeviceAuthDialog)>
	//*   3    7:invokevirtual   #35  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifeq            14
			return;
	//    5   13:return          
		FacebookRequestError facebookrequesterror = graphresponse.getError();
	//    6   14:aload_1         
	//    7   15:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
	//    8   18:astore_3        
		if(facebookrequesterror != null)
	//*   9   19:aload_3         
	//*  10   20:ifnull          91
		{
			int i = facebookrequesterror.getSubErrorCode();
	//   11   23:aload_3         
	//   12   24:invokevirtual   #47  <Method int FacebookRequestError.getSubErrorCode()>
	//   13   27:istore_2        
			if(i != 0x149620)
	//*  14   28:iload_2         
	//*  15   29:ldc1            #48  <Int 0x149620>
	//*  16   31:icmpeq          83
				switch(i)
	//*  17   34:iload_2         
				{
	//*  18   35:tableswitch     1349172 1349174: default 60
	//	               1349172 75
	//	               1349173 83
	//	               1349174 75
				default:
					DeviceAuthDialog.access$100(DeviceAuthDialog.this, graphresponse.getError().getException());
	//   19   60:aload_0         
	//   20   61:getfield        #17  <Field DeviceAuthDialog this$0>
	//   21   64:aload_1         
	//   22   65:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
	//   23   68:invokevirtual   #52  <Method FacebookException FacebookRequestError.getException()>
	//   24   71:invokestatic    #56  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
					return;
	//   25   74:return          

				case 1349172: 
				case 1349174: 
					DeviceAuthDialog.access$600(DeviceAuthDialog.this);
	//   26   75:aload_0         
	//   27   76:getfield        #17  <Field DeviceAuthDialog this$0>
	//   28   79:invokestatic    #59  <Method void DeviceAuthDialog.access$600(DeviceAuthDialog)>
					return;
	//   29   82:return          

				case 1349173: 
					break;
				}
			DeviceAuthDialog.access$300(DeviceAuthDialog.this);
	//   30   83:aload_0         
	//   31   84:getfield        #17  <Field DeviceAuthDialog this$0>
	//   32   87:invokestatic    #62  <Method void DeviceAuthDialog.access$300(DeviceAuthDialog)>
			return;
	//   33   90:return          
		}
		try
		{
			graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   34   91:aload_1         
	//   35   92:invokevirtual   #66  <Method JSONObject GraphResponse.getJSONObject()>
	//   36   95:astore_1        
			DeviceAuthDialog.access$700(DeviceAuthDialog.this, ((JSONObject) (graphresponse)).getString("access_token"));
	//   37   96:aload_0         
	//   38   97:getfield        #17  <Field DeviceAuthDialog this$0>
	//   39  100:aload_1         
	//   40  101:ldc1            #68  <String "access_token">
	//   41  103:invokevirtual   #74  <Method String JSONObject.getString(String)>
	//   42  106:invokestatic    #78  <Method void DeviceAuthDialog.access$700(DeviceAuthDialog, String)>
			return;
	//   43  109:return          
		}
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  44  110:astore_1        
		{
			DeviceAuthDialog.access$100(DeviceAuthDialog.this, new FacebookException(((Throwable) (graphresponse))));
	//   45  111:aload_0         
	//   46  112:getfield        #17  <Field DeviceAuthDialog this$0>
	//   47  115:new             #80  <Class FacebookException>
	//   48  118:dup             
	//   49  119:aload_1         
	//   50  120:invokespecial   #83  <Method void FacebookException(Throwable)>
	//   51  123:invokestatic    #56  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
		}
	//   52  126:return          
	}

	final DeviceAuthDialog this$0;

	DeviceAuthDialog$4()
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
