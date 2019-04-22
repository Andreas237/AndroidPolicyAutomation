// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$GetPageIdRequestWrapper extends LikeActionController.AbstractRequestWrapper
{

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
			objectId, objectType, facebookrequesterror
		});
	//    0    0:getstatic       #66  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #70  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #72  <String "Error getting the FB id for object '%s' with type '%s' : %s">
	//    3    8:iconst_3        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:getfield        #77  <Field String objectId>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #81  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_1         
	//   18   29:aastore         
	//   19   30:invokestatic    #87  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
	//   20   33:return          
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), objectId)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #95  <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:aload_0         
	//    3    5:getfield        #77  <Field String objectId>
	//    4    8:invokestatic    #101 <Method JSONObject Utility.tryGetJSONObjectFromResponse(JSONObject, String)>
	//    5   11:astore_1        
		if(graphresponse != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          39
		{
			verifiedObjectId = ((JSONObject) (graphresponse)).optString("id");
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:ldc1            #28  <String "id">
	//   11   20:invokevirtual   #107 <Method String JSONObject.optString(String)>
	//   12   23:putfield        #109 <Field String verifiedObjectId>
			objectIsPage = Utility.isNullOrEmpty(verifiedObjectId) ^ true;
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #109 <Field String verifiedObjectId>
	//   16   31:invokestatic    #113 <Method boolean Utility.isNullOrEmpty(String)>
	//   17   34:iconst_1        
	//   18   35:ixor            
	//   19   36:putfield        #115 <Field boolean objectIsPage>
		}
	//   20   39:return          
	}

	boolean objectIsPage;
	final LikeActionController this$0;
	String verifiedObjectId;

	LikeActionController$GetPageIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field LikeActionController this$0>
		super(LikeActionController.this, s, objecttype);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #19  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		likeactioncontroller = ((LikeActionController) (new Bundle()));
	//    8   12:new             #21  <Class Bundle>
	//    9   15:dup             
	//   10   16:invokespecial   #24  <Method void Bundle()>
	//   11   19:astore_1        
		putString("fields", "id");
	//   12   20:aload_1         
	//   13   21:ldc1            #26  <String "fields">
	//   14   23:ldc1            #28  <String "id">
	//   15   25:invokevirtual   #32  <Method void Bundle.putString(String, String)>
		putString("ids", s);
	//   16   28:aload_1         
	//   17   29:ldc1            #34  <String "ids">
	//   18   31:aload_2         
	//   19   32:invokevirtual   #32  <Method void Bundle.putString(String, String)>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", ((Bundle) (LikeActionController.this)), HttpMethod.GET));
	//   20   35:aload_0         
	//   21   36:new             #36  <Class GraphRequest>
	//   22   39:dup             
	//   23   40:invokestatic    #42  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   24   43:ldc1            #44  <String "">
	//   25   45:aload_1         
	//   26   46:getstatic       #50  <Field HttpMethod HttpMethod.GET>
	//   27   49:invokespecial   #53  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   28   52:invokevirtual   #57  <Method void setRequest(GraphRequest)>
	//   29   55:return          
	}
}
