// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			DeviceShareDialogFragment

class DeviceShareDialogFragment$2
	implements com.facebook.GraphRequest.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		Object obj = ((Object) (graphresponse.getError()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method FacebookRequestError GraphResponse.getError()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          18
		{
			DeviceShareDialogFragment.access$100(DeviceShareDialogFragment.this, ((FacebookRequestError) (obj)));
	//    5    9:aload_0         
	//    6   10:getfield        #17  <Field DeviceShareDialogFragment this$0>
	//    7   13:aload_2         
	//    8   14:invokestatic    #34  <Method void DeviceShareDialogFragment.access$100(DeviceShareDialogFragment, FacebookRequestError)>
			return;
	//    9   17:return          
		}
		graphresponse = ((GraphResponse) (graphresponse.getJSONObject()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #38  <Method JSONObject GraphResponse.getJSONObject()>
	//   12   22:astore_1        
		obj = ((Object) (new questState()));
	//   13   23:new             #40  <Class DeviceShareDialogFragment$RequestState>
	//   14   26:dup             
	//   15   27:invokespecial   #41  <Method void DeviceShareDialogFragment$RequestState()>
	//   16   30:astore_2        
		try
		{
			((questState) (obj)).setUserCode(((JSONObject) (graphresponse)).getString("user_code"));
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:ldc1            #43  <String "user_code">
	//   20   35:invokevirtual   #49  <Method String JSONObject.getString(String)>
	//   21   38:invokevirtual   #53  <Method void DeviceShareDialogFragment$RequestState.setUserCode(String)>
			((questState) (obj)).setExpiresIn(((JSONObject) (graphresponse)).getLong("expires_in"));
	//   22   41:aload_2         
	//   23   42:aload_1         
	//   24   43:ldc1            #55  <String "expires_in">
	//   25   45:invokevirtual   #59  <Method long JSONObject.getLong(String)>
	//   26   48:invokevirtual   #63  <Method void DeviceShareDialogFragment$RequestState.setExpiresIn(long)>
		}
	//*  27   51:aload_0         
	//*  28   52:getfield        #17  <Field DeviceShareDialogFragment this$0>
	//*  29   55:aload_2         
	//*  30   56:invokestatic    #67  <Method void DeviceShareDialogFragment.access$200(DeviceShareDialogFragment, DeviceShareDialogFragment$RequestState)>
	//*  31   59:return          
	//*  32   60:aload_0         
	//*  33   61:getfield        #17  <Field DeviceShareDialogFragment this$0>
	//*  34   64:new             #69  <Class FacebookRequestError>
	//*  35   67:dup             
	//*  36   68:iconst_0        
	//*  37   69:ldc1            #71  <String "">
	//*  38   71:ldc1            #73  <String "Malformed server response">
	//*  39   73:invokespecial   #76  <Method void FacebookRequestError(int, String, String)>
	//*  40   76:invokestatic    #34  <Method void DeviceShareDialogFragment.access$100(DeviceShareDialogFragment, FacebookRequestError)>
	//*  41   79:return          
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
		{
			DeviceShareDialogFragment.access$100(DeviceShareDialogFragment.this, new FacebookRequestError(0, "", "Malformed server response"));
			return;
		}
		DeviceShareDialogFragment.access$200(DeviceShareDialogFragment.this, ((questState) (obj)));
	//*  42   80:astore_1        
	//*  43   81:goto            60
	}

	final DeviceShareDialogFragment this$0;

	DeviceShareDialogFragment$2()
	{
		this$0 = DeviceShareDialogFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeviceShareDialogFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
