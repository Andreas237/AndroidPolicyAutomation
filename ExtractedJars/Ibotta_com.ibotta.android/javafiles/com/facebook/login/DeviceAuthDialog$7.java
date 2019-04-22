// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.*;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.*;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			DeviceAuthDialog

class DeviceAuthDialog$7
	implements com.facebook.ck
{

	public void onCompleted(GraphResponse graphresponse)
	{
		if(DeviceAuthDialog.access$500(DeviceAuthDialog.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field DeviceAuthDialog this$0>
	//*   2    4:invokestatic    #33  <Method AtomicBoolean DeviceAuthDialog.access$500(DeviceAuthDialog)>
	//*   3    7:invokevirtual   #39  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifeq            14
			return;
	//    5   13:return          
		if(graphresponse.getError() != null)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #45  <Method FacebookRequestError GraphResponse.getError()>
	//*   8   18:ifnull          36
		{
			DeviceAuthDialog.access$100(DeviceAuthDialog.this, graphresponse.getError().getException());
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field DeviceAuthDialog this$0>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #45  <Method FacebookRequestError GraphResponse.getError()>
	//   13   29:invokevirtual   #51  <Method FacebookException FacebookRequestError.getException()>
	//   14   32:invokestatic    #55  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
			return;
	//   15   35:return          
		}
		com.facebook.internal.Pair pair;
		Object obj;
		try
		{
			obj = ((Object) (graphresponse.getJSONObject()));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #59  <Method JSONObject GraphResponse.getJSONObject()>
	//   18   40:astore_3        
			graphresponse = ((GraphResponse) (((JSONObject) (obj)).getString("id")));
	//   19   41:aload_3         
	//   20   42:ldc1            #61  <String "id">
	//   21   44:invokevirtual   #67  <Method String JSONObject.getString(String)>
	//   22   47:astore_1        
			pair = Utility.handlePermissionResponse(((JSONObject) (obj)));
	//   23   48:aload_3         
	//   24   49:invokestatic    #73  <Method com.facebook.internal.Utility$PermissionsPair Utility.handlePermissionResponse(JSONObject)>
	//   25   52:astore_2        
			obj = ((Object) (((JSONObject) (obj)).getString("name")));
	//   26   53:aload_3         
	//   27   54:ldc1            #75  <String "name">
	//   28   56:invokevirtual   #67  <Method String JSONObject.getString(String)>
	//   29   59:astore_3        
		}
	//*  30   60:aload_0         
	//*  31   61:getfield        #19  <Field DeviceAuthDialog this$0>
	//*  32   64:invokestatic    #79  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$1200(DeviceAuthDialog)>
	//*  33   67:invokevirtual   #85  <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//*  34   70:invokestatic    #90  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
	//*  35   73:invokestatic    #95  <Method String FacebookSdk.getApplicationId()>
	//*  36   76:invokestatic    #101 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//*  37   79:invokevirtual   #107 <Method EnumSet FetchedAppSettings.getSmartLoginOptions()>
	//*  38   82:getstatic       #113 <Field SmartLoginOption SmartLoginOption.RequireConfirm>
	//*  39   85:invokevirtual   #119 <Method boolean EnumSet.contains(Object)>
	//*  40   88:ifeq            125
	//*  41   91:aload_0         
	//*  42   92:getfield        #19  <Field DeviceAuthDialog this$0>
	//*  43   95:invokestatic    #123 <Method boolean DeviceAuthDialog.access$1300(DeviceAuthDialog)>
	//*  44   98:ifne            125
	//*  45  101:aload_0         
	//*  46  102:getfield        #19  <Field DeviceAuthDialog this$0>
	//*  47  105:iconst_1        
	//*  48  106:invokestatic    #127 <Method boolean DeviceAuthDialog.access$1302(DeviceAuthDialog, boolean)>
	//*  49  109:pop             
	//*  50  110:aload_0         
	//*  51  111:getfield        #19  <Field DeviceAuthDialog this$0>
	//*  52  114:aload_1         
	//*  53  115:aload_2         
	//*  54  116:aload_0         
	//*  55  117:getfield        #21  <Field String val$accessToken>
	//*  56  120:aload_3         
	//*  57  121:invokestatic    #131 <Method void DeviceAuthDialog.access$1400(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, String)>
	//*  58  124:return          
	//*  59  125:aload_0         
	//*  60  126:getfield        #19  <Field DeviceAuthDialog this$0>
	//*  61  129:aload_1         
	//*  62  130:aload_2         
	//*  63  131:aload_0         
	//*  64  132:getfield        #21  <Field String val$accessToken>
	//*  65  135:invokestatic    #135 <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String)>
	//*  66  138:return          
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  67  139:astore_1        
		{
			DeviceAuthDialog.access$100(DeviceAuthDialog.this, new FacebookException(((Throwable) (graphresponse))));
	//   68  140:aload_0         
	//   69  141:getfield        #19  <Field DeviceAuthDialog this$0>
	//   70  144:new             #137 <Class FacebookException>
	//   71  147:dup             
	//   72  148:aload_1         
	//   73  149:invokespecial   #140 <Method void FacebookException(Throwable)>
	//   74  152:invokestatic    #55  <Method void DeviceAuthDialog.access$100(DeviceAuthDialog, FacebookException)>
			return;
	//   75  155:return          
		}
		DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$1200(DeviceAuthDialog.this).getUserCode());
		if(FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(((Object) (SmartLoginOption.RequireConfirm))) && !DeviceAuthDialog.access$1300(DeviceAuthDialog.this))
		{
			DeviceAuthDialog.access$1302(DeviceAuthDialog.this, true);
			DeviceAuthDialog.access$1400(DeviceAuthDialog.this, ((String) (graphresponse)), pair, val$accessToken, ((String) (obj)));
			return;
		} else
		{
			DeviceAuthDialog.access$1100(DeviceAuthDialog.this, ((String) (graphresponse)), pair, val$accessToken);
			return;
		}
	}

	final DeviceAuthDialog this$0;
	final String val$accessToken;

	DeviceAuthDialog$7()
	{
		this$0 = final_deviceauthdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DeviceAuthDialog this$0>
		val$accessToken = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String val$accessToken>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
