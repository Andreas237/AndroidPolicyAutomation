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

private class LikeActionController$GetOGObjectIdRequestWrapper extends LikeActionController.AbstractRequestWrapper
{

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		if(facebookrequesterror.getErrorMessage().contains("og_object"))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #64  <Method String FacebookRequestError.getErrorMessage()>
	//*   2    4:ldc1            #66  <String "og_object">
	//*   3    6:invokevirtual   #72  <Method boolean String.contains(CharSequence)>
	//*   4    9:ifeq            18
		{
			error = null;
	//    5   12:aload_0         
	//    6   13:aconst_null     
	//    7   14:putfield        #76  <Field FacebookRequestError error>
			return;
	//    8   17:return          
		} else
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
				objectId, objectType, facebookrequesterror
			});
	//    9   18:getstatic       #82  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//   10   21:invokestatic    #85  <Method String LikeActionController.access$100()>
	//   11   24:ldc1            #87  <String "Error getting the FB id for object '%s' with type '%s' : %s">
	//   12   26:iconst_3        
	//   13   27:anewarray       Object[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:aload_0         
	//   17   33:getfield        #92  <Field String objectId>
	//   18   36:aastore         
	//   19   37:dup             
	//   20   38:iconst_1        
	//   21   39:aload_0         
	//   22   40:getfield        #96  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   23   43:aastore         
	//   24   44:dup             
	//   25   45:iconst_2        
	//   26   46:aload_1         
	//   27   47:aastore         
	//   28   48:invokestatic    #102 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
			return;
	//   29   51:return          
		}
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), objectId)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #110 <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:aload_0         
	//    3    5:getfield        #92  <Field String objectId>
	//    4    8:invokestatic    #116 <Method JSONObject Utility.tryGetJSONObjectFromResponse(JSONObject, String)>
	//    5   11:astore_1        
		if(graphresponse != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          37
		{
			graphresponse = ((GraphResponse) (((JSONObject) (graphresponse)).optJSONObject("og_object")));
	//    8   16:aload_1         
	//    9   17:ldc1            #66  <String "og_object">
	//   10   19:invokevirtual   #122 <Method JSONObject JSONObject.optJSONObject(String)>
	//   11   22:astore_1        
			if(graphresponse != null)
	//*  12   23:aload_1         
	//*  13   24:ifnull          37
				verifiedObjectId = ((JSONObject) (graphresponse)).optString("id");
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:ldc1            #124 <String "id">
	//   17   31:invokevirtual   #128 <Method String JSONObject.optString(String)>
	//   18   34:putfield        #130 <Field String verifiedObjectId>
		}
	//   19   37:return          
	}

	final LikeActionController this$0;
	String verifiedObjectId;

	LikeActionController$GetOGObjectIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field LikeActionController this$0>
		super(LikeActionController.this, s, objecttype);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #17  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		likeactioncontroller = ((LikeActionController) (new Bundle()));
	//    8   12:new             #19  <Class Bundle>
	//    9   15:dup             
	//   10   16:invokespecial   #22  <Method void Bundle()>
	//   11   19:astore_1        
		putString("fields", "og_object.fields(id)");
	//   12   20:aload_1         
	//   13   21:ldc1            #24  <String "fields">
	//   14   23:ldc1            #26  <String "og_object.fields(id)">
	//   15   25:invokevirtual   #30  <Method void Bundle.putString(String, String)>
		putString("ids", s);
	//   16   28:aload_1         
	//   17   29:ldc1            #32  <String "ids">
	//   18   31:aload_2         
	//   19   32:invokevirtual   #30  <Method void Bundle.putString(String, String)>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "", ((Bundle) (LikeActionController.this)), HttpMethod.GET));
	//   20   35:aload_0         
	//   21   36:new             #34  <Class GraphRequest>
	//   22   39:dup             
	//   23   40:invokestatic    #40  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   24   43:ldc1            #42  <String "">
	//   25   45:aload_1         
	//   26   46:getstatic       #48  <Field HttpMethod HttpMethod.GET>
	//   27   49:invokespecial   #51  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   28   52:invokevirtual   #55  <Method void setRequest(GraphRequest)>
	//   29   55:return          
	}
}
