// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.*;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
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
		if(DeviceAuthDialog.access$300(DeviceAuthDialog.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field DeviceAuthDialog this$0>
	//*   2    4:invokestatic    #29  <Method AtomicBoolean DeviceAuthDialog.access$300(DeviceAuthDialog)>
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
	//*  10   20:ifnull          146
		{
			int i = facebookrequesterror.getSubErrorCode();
	//   11   23:aload_3         
	//   12   24:invokevirtual   #47  <Method int FacebookRequestError.getSubErrorCode()>
	//   13   27:istore_2        
			if(i != 0x149620)
	//*  14   28:iload_2         
	//*  15   29:ldc1            #48  <Int 0x149620>
	//*  16   31:icmpeq          91
				switch(i)
	//*  17   34:iload_2         
				{
	//*  18   35:tableswitch     1349172 1349174: default 60
	//	               1349172 83
	//	               1349173 75
	//	               1349174 83
				default:
					onError(graphresponse.getError().getException());
	//   19   60:aload_0         
	//   20   61:getfield        #17  <Field DeviceAuthDialog this$0>
	//   21   64:aload_1         
	//   22   65:invokevirtual   #41  <Method FacebookRequestError GraphResponse.getError()>
	//   23   68:invokevirtual   #52  <Method FacebookException FacebookRequestError.getException()>
	//   24   71:invokevirtual   #56  <Method void DeviceAuthDialog.onError(FacebookException)>
					return;
	//   25   74:return          

				case 1349173: 
					onCancel();
	//   26   75:aload_0         
	//   27   76:getfield        #17  <Field DeviceAuthDialog this$0>
	//   28   79:invokevirtual   #59  <Method void DeviceAuthDialog.onCancel()>
					return;
	//   29   82:return          

				case 1349172: 
				case 1349174: 
					DeviceAuthDialog.access$400(DeviceAuthDialog.this);
	//   30   83:aload_0         
	//   31   84:getfield        #17  <Field DeviceAuthDialog this$0>
	//   32   87:invokestatic    #62  <Method void DeviceAuthDialog.access$400(DeviceAuthDialog)>
					return;
	//   33   90:return          
				}
			if(DeviceAuthDialog.access$500(DeviceAuthDialog.this) != null)
	//*  34   91:aload_0         
	//*  35   92:getfield        #17  <Field DeviceAuthDialog this$0>
	//*  36   95:invokestatic    #66  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
	//*  37   98:ifnull          114
				DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(DeviceAuthDialog.this).getUserCode());
	//   38  101:aload_0         
	//   39  102:getfield        #17  <Field DeviceAuthDialog this$0>
	//   40  105:invokestatic    #66  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
	//   41  108:invokevirtual   #72  <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//   42  111:invokestatic    #78  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
			if(DeviceAuthDialog.access$600(DeviceAuthDialog.this) != null)
	//*  43  114:aload_0         
	//*  44  115:getfield        #17  <Field DeviceAuthDialog this$0>
	//*  45  118:invokestatic    #82  <Method LoginClient$Request DeviceAuthDialog.access$600(DeviceAuthDialog)>
	//*  46  121:ifnull          138
			{
				graphresponse = ((GraphResponse) (DeviceAuthDialog.this));
	//   47  124:aload_0         
	//   48  125:getfield        #17  <Field DeviceAuthDialog this$0>
	//   49  128:astore_1        
				((DeviceAuthDialog) (graphresponse)).startLogin(DeviceAuthDialog.access$600(((DeviceAuthDialog) (graphresponse))));
	//   50  129:aload_1         
	//   51  130:aload_1         
	//   52  131:invokestatic    #82  <Method LoginClient$Request DeviceAuthDialog.access$600(DeviceAuthDialog)>
	//   53  134:invokevirtual   #86  <Method void DeviceAuthDialog.startLogin(LoginClient$Request)>
				return;
	//   54  137:return          
			} else
			{
				onCancel();
	//   55  138:aload_0         
	//   56  139:getfield        #17  <Field DeviceAuthDialog this$0>
	//   57  142:invokevirtual   #59  <Method void DeviceAuthDialog.onCancel()>
				return;
	//   58  145:return          
			}
		}
		try
		{
			graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   59  146:aload_1         
	//   60  147:invokevirtual   #90  <Method JSONObject GraphResponse.getJSONObject()>
	//   61  150:astore_1        
			DeviceAuthDialog.access$700(DeviceAuthDialog.this, ((JSONObject) (graphresponse)).getString("access_token"), Long.valueOf(((JSONObject) (graphresponse)).getLong("expires_in")), Long.valueOf(((JSONObject) (graphresponse)).optLong("data_access_expiration_time")));
	//   62  151:aload_0         
	//   63  152:getfield        #17  <Field DeviceAuthDialog this$0>
	//   64  155:aload_1         
	//   65  156:ldc1            #92  <String "access_token">
	//   66  158:invokevirtual   #98  <Method String JSONObject.getString(String)>
	//   67  161:aload_1         
	//   68  162:ldc1            #100 <String "expires_in">
	//   69  164:invokevirtual   #104 <Method long JSONObject.getLong(String)>
	//   70  167:invokestatic    #110 <Method Long Long.valueOf(long)>
	//   71  170:aload_1         
	//   72  171:ldc1            #112 <String "data_access_expiration_time">
	//   73  173:invokevirtual   #115 <Method long JSONObject.optLong(String)>
	//   74  176:invokestatic    #110 <Method Long Long.valueOf(long)>
	//   75  179:invokestatic    #119 <Method void DeviceAuthDialog.access$700(DeviceAuthDialog, String, Long, Long)>
			return;
	//   76  182:return          
		}
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  77  183:astore_1        
		{
			onError(new FacebookException(((Throwable) (graphresponse))));
	//   78  184:aload_0         
	//   79  185:getfield        #17  <Field DeviceAuthDialog this$0>
	//   80  188:new             #121 <Class FacebookException>
	//   81  191:dup             
	//   82  192:aload_1         
	//   83  193:invokespecial   #124 <Method void FacebookException(Throwable)>
	//   84  196:invokevirtual   #56  <Method void DeviceAuthDialog.onError(FacebookException)>
		}
	//   85  199:return          
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
