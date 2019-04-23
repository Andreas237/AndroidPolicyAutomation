// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import com.facebook.*;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.*;
import java.util.Date;
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
		if(DeviceAuthDialog.access$300(DeviceAuthDialog.this).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field DeviceAuthDialog this$0>
	//*   2    4:invokestatic    #40  <Method AtomicBoolean DeviceAuthDialog.access$300(DeviceAuthDialog)>
	//*   3    7:invokevirtual   #46  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifeq            14
			return;
	//    5   13:return          
		if(graphresponse.getError() != null)
	//*   6   14:aload_1         
	//*   7   15:invokevirtual   #52  <Method FacebookRequestError GraphResponse.getError()>
	//*   8   18:ifnull          36
		{
			onError(graphresponse.getError().getException());
	//    9   21:aload_0         
	//   10   22:getfield        #22  <Field DeviceAuthDialog this$0>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #52  <Method FacebookRequestError GraphResponse.getError()>
	//   13   29:invokevirtual   #58  <Method FacebookException FacebookRequestError.getException()>
	//   14   32:invokevirtual   #62  <Method void DeviceAuthDialog.onError(FacebookException)>
			return;
	//   15   35:return          
		}
		com.facebook.internal.Pair pair;
		Object obj;
		try
		{
			obj = ((Object) (graphresponse.getJSONObject()));
	//   16   36:aload_1         
	//   17   37:invokevirtual   #66  <Method JSONObject GraphResponse.getJSONObject()>
	//   18   40:astore_3        
			graphresponse = ((GraphResponse) (((JSONObject) (obj)).getString("id")));
	//   19   41:aload_3         
	//   20   42:ldc1            #68  <String "id">
	//   21   44:invokevirtual   #74  <Method String JSONObject.getString(String)>
	//   22   47:astore_1        
			pair = Utility.handlePermissionResponse(((JSONObject) (obj)));
	//   23   48:aload_3         
	//   24   49:invokestatic    #80  <Method com.facebook.internal.Utility$PermissionsPair Utility.handlePermissionResponse(JSONObject)>
	//   25   52:astore_2        
			obj = ((Object) (((JSONObject) (obj)).getString("name")));
	//   26   53:aload_3         
	//   27   54:ldc1            #82  <String "name">
	//   28   56:invokevirtual   #74  <Method String JSONObject.getString(String)>
	//   29   59:astore_3        
		}
	//*  30   60:aload_0         
	//*  31   61:getfield        #22  <Field DeviceAuthDialog this$0>
	//*  32   64:invokestatic    #86  <Method DeviceAuthDialog$RequestState DeviceAuthDialog.access$500(DeviceAuthDialog)>
	//*  33   67:invokevirtual   #92  <Method String DeviceAuthDialog$RequestState.getUserCode()>
	//*  34   70:invokestatic    #98  <Method void DeviceRequestsHelper.cleanUpAdvertisementService(String)>
	//*  35   73:invokestatic    #103 <Method String FacebookSdk.getApplicationId()>
	//*  36   76:invokestatic    #109 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//*  37   79:invokevirtual   #115 <Method EnumSet FetchedAppSettings.getSmartLoginOptions()>
	//*  38   82:getstatic       #121 <Field SmartLoginOption SmartLoginOption.RequireConfirm>
	//*  39   85:invokevirtual   #127 <Method boolean EnumSet.contains(Object)>
	//*  40   88:ifeq            133
	//*  41   91:aload_0         
	//*  42   92:getfield        #22  <Field DeviceAuthDialog this$0>
	//*  43   95:invokestatic    #131 <Method boolean DeviceAuthDialog.access$1000(DeviceAuthDialog)>
	//*  44   98:ifne            133
	//*  45  101:aload_0         
	//*  46  102:getfield        #22  <Field DeviceAuthDialog this$0>
	//*  47  105:iconst_1        
	//*  48  106:invokestatic    #135 <Method boolean DeviceAuthDialog.access$1002(DeviceAuthDialog, boolean)>
	//*  49  109:pop             
	//*  50  110:aload_0         
	//*  51  111:getfield        #22  <Field DeviceAuthDialog this$0>
	//*  52  114:aload_1         
	//*  53  115:aload_2         
	//*  54  116:aload_0         
	//*  55  117:getfield        #24  <Field String val$accessToken>
	//*  56  120:aload_3         
	//*  57  121:aload_0         
	//*  58  122:getfield        #26  <Field Date val$expirationTime>
	//*  59  125:aload_0         
	//*  60  126:getfield        #28  <Field Date val$dataAccessExpirationTimeDate>
	//*  61  129:invokestatic    #139 <Method void DeviceAuthDialog.access$1100(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, String, Date, Date)>
	//*  62  132:return          
	//*  63  133:aload_0         
	//*  64  134:getfield        #22  <Field DeviceAuthDialog this$0>
	//*  65  137:aload_1         
	//*  66  138:aload_2         
	//*  67  139:aload_0         
	//*  68  140:getfield        #24  <Field String val$accessToken>
	//*  69  143:aload_0         
	//*  70  144:getfield        #26  <Field Date val$expirationTime>
	//*  71  147:aload_0         
	//*  72  148:getfield        #28  <Field Date val$dataAccessExpirationTimeDate>
	//*  73  151:invokestatic    #143 <Method void DeviceAuthDialog.access$900(DeviceAuthDialog, String, com.facebook.internal.Utility$PermissionsPair, String, Date, Date)>
	//*  74  154:return          
		// Misplaced declaration of an exception variable
		catch(GraphResponse graphresponse)
	//*  75  155:astore_1        
		{
			onError(new FacebookException(((Throwable) (graphresponse))));
	//   76  156:aload_0         
	//   77  157:getfield        #22  <Field DeviceAuthDialog this$0>
	//   78  160:new             #145 <Class FacebookException>
	//   79  163:dup             
	//   80  164:aload_1         
	//   81  165:invokespecial   #148 <Method void FacebookException(Throwable)>
	//   82  168:invokevirtual   #62  <Method void DeviceAuthDialog.onError(FacebookException)>
			return;
	//   83  171:return          
		}
		DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(DeviceAuthDialog.this).getUserCode());
		if(FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId()).getSmartLoginOptions().contains(((Object) (SmartLoginOption.RequireConfirm))) && !DeviceAuthDialog.access$1000(DeviceAuthDialog.this))
		{
			DeviceAuthDialog.access$1002(DeviceAuthDialog.this, true);
			DeviceAuthDialog.access$1100(DeviceAuthDialog.this, ((String) (graphresponse)), pair, val$accessToken, ((String) (obj)), val$expirationTime, val$dataAccessExpirationTimeDate);
			return;
		} else
		{
			DeviceAuthDialog.access$900(DeviceAuthDialog.this, ((String) (graphresponse)), pair, val$accessToken, val$expirationTime, val$dataAccessExpirationTimeDate);
			return;
		}
	}

	final DeviceAuthDialog this$0;
	final String val$accessToken;
	final Date val$dataAccessExpirationTimeDate;
	final Date val$expirationTime;

	DeviceAuthDialog$7()
	{
		this$0 = final_deviceauthdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field DeviceAuthDialog this$0>
		val$accessToken = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$accessToken>
		val$expirationTime = date;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field Date val$expirationTime>
		val$dataAccessExpirationTimeDate = Date.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field Date val$dataAccessExpirationTimeDate>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
