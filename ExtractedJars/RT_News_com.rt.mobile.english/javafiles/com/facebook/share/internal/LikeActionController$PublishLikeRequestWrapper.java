// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$PublishLikeRequestWrapper extends LikeActionController.AbstractRequestWrapper
{

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		if(facebookrequesterror.getErrorCode() == 3501)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #60  <Method int FacebookRequestError.getErrorCode()>
	//*   2    4:sipush          3501
	//*   3    7:icmpne          16
		{
			error = null;
	//    4   10:aload_0         
	//    5   11:aconst_null     
	//    6   12:putfield        #64  <Field FacebookRequestError error>
			return;
	//    7   15:return          
		} else
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error liking object '%s' with type '%s' : %s", new Object[] {
				objectId, objectType, facebookrequesterror
			});
	//    8   16:getstatic       #70  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    9   19:invokestatic    #74  <Method String LikeActionController.access$100()>
	//   10   22:ldc1            #76  <String "Error liking object '%s' with type '%s' : %s">
	//   11   24:iconst_3        
	//   12   25:anewarray       Object[]
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:aload_0         
	//   16   31:getfield        #81  <Field String objectId>
	//   17   34:aastore         
	//   18   35:dup             
	//   19   36:iconst_1        
	//   20   37:aload_0         
	//   21   38:getfield        #85  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_2        
	//   25   44:aload_1         
	//   26   45:aastore         
	//   27   46:invokestatic    #91  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
			LikeActionController.access$2400(LikeActionController.this, "publish_like", facebookrequesterror);
	//   28   49:aload_0         
	//   29   50:getfield        #15  <Field LikeActionController this$0>
	//   30   53:ldc1            #93  <String "publish_like">
	//   31   55:aload_1         
	//   32   56:invokestatic    #97  <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
			return;
	//   33   59:return          
		}
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		unlikeToken = Utility.safeGetStringFromResponse(graphresponse.getJSONObject(), "id");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//    3    5:ldc1            #107 <String "id">
	//    4    7:invokestatic    #113 <Method String Utility.safeGetStringFromResponse(org.json.JSONObject, String)>
	//    5   10:putfield        #115 <Field String unlikeToken>
	//    6   13:return          
	}

	final LikeActionController this$0;
	String unlikeToken;

	LikeActionController$PublishLikeRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
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
		putString("object", s);
	//   12   20:aload_1         
	//   13   21:ldc1            #24  <String "object">
	//   14   23:aload_2         
	//   15   24:invokevirtual   #28  <Method void Bundle.putString(String, String)>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", ((Bundle) (LikeActionController.this)), HttpMethod.POST));
	//   16   27:aload_0         
	//   17   28:new             #30  <Class GraphRequest>
	//   18   31:dup             
	//   19   32:invokestatic    #36  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   20   35:ldc1            #38  <String "me/og.likes">
	//   21   37:aload_1         
	//   22   38:getstatic       #44  <Field HttpMethod HttpMethod.POST>
	//   23   41:invokespecial   #47  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   24   44:invokevirtual   #51  <Method void setRequest(GraphRequest)>
	//   25   47:return          
	}
}
