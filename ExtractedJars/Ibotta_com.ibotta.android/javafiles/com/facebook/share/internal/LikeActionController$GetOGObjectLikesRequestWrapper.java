// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$GetOGObjectLikesRequestWrapper extends LikeActionController.AbstractRequestWrapper
	implements LikeActionController.LikeRequestWrapper
{

	public String getUnlikeToken()
	{
		return unlikeToken;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String unlikeToken>
	//    2    4:areturn         
	}

	public boolean isObjectLiked()
	{
		return objectIsLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean objectIsLiked>
	//    2    4:ireturn         
	}

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
			objectId, objectType, facebookrequesterror
		});
	//    0    0:getstatic       #87  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #90  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #92  <String "Error fetching like status for object '%s' with type '%s' : %s">
	//    3    8:iconst_3        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:getfield        #32  <Field String objectId>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #34  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_1         
	//   18   29:aastore         
	//   19   30:invokestatic    #100 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		LikeActionController.access$2400(LikeActionController.this, "get_og_object_like", facebookrequesterror);
	//   20   33:aload_0         
	//   21   34:getfield        #22  <Field LikeActionController this$0>
	//   22   37:ldc1            #102 <String "get_og_object_like">
	//   23   39:aload_1         
	//   24   40:invokestatic    #106 <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
	//   25   43:return          
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #114 <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:ldc1            #116 <String "data">
	//    3    6:invokestatic    #122 <Method JSONArray Utility.tryGetJSONArrayFromResponse(JSONObject, String)>
	//    4    9:astore_1        
		if(graphresponse != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          98
		{
			for(int i = 0; i < ((JSONArray) (graphresponse)).length(); i++)
	//*   7   14:iconst_0        
	//*   8   15:istore_2        
	//*   9   16:iload_2         
	//*  10   17:aload_1         
	//*  11   18:invokevirtual   #128 <Method int JSONArray.length()>
	//*  12   21:icmpge          98
			{
				JSONObject jsonobject = ((JSONArray) (graphresponse)).optJSONObject(i);
	//   13   24:aload_1         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #132 <Method JSONObject JSONArray.optJSONObject(int)>
	//   16   29:astore_3        
				if(jsonobject == null)
					continue;
	//   17   30:aload_3         
	//   18   31:ifnull          91
				objectIsLiked = true;
	//   19   34:aload_0         
	//   20   35:iconst_1        
	//   21   36:putfield        #30  <Field boolean objectIsLiked>
				JSONObject jsonobject1 = jsonobject.optJSONObject("application");
	//   22   39:aload_3         
	//   23   40:ldc1            #134 <String "application">
	//   24   42:invokevirtual   #139 <Method JSONObject JSONObject.optJSONObject(String)>
	//   25   45:astore          4
				AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//   26   47:invokestatic    #57  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   27   50:astore          5
				if(jsonobject1 != null && AccessToken.isCurrentAccessTokenActive() && Utility.areObjectsEqual(((Object) (accesstoken.getApplicationId())), ((Object) (jsonobject1.optString("id")))))
	//*  28   52:aload           4
	//*  29   54:ifnull          91
	//*  30   57:invokestatic    #142 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*  31   60:ifeq            91
	//*  32   63:aload           5
	//*  33   65:invokevirtual   #145 <Method String AccessToken.getApplicationId()>
	//*  34   68:aload           4
	//*  35   70:ldc1            #147 <String "id">
	//*  36   72:invokevirtual   #151 <Method String JSONObject.optString(String)>
	//*  37   75:invokestatic    #155 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  38   78:ifeq            91
					unlikeToken = jsonobject.optString("id");
	//   39   81:aload_0         
	//   40   82:aload_3         
	//   41   83:ldc1            #147 <String "id">
	//   42   85:invokevirtual   #151 <Method String JSONObject.optString(String)>
	//   43   88:putfield        #77  <Field String unlikeToken>
			}

	//   44   91:iload_2         
	//   45   92:iconst_1        
	//   46   93:iadd            
	//   47   94:istore_2        
		}
	//*  48   95:goto            16
	//   49   98:return          
	}

	private final String objectId;
	private boolean objectIsLiked;
	private final com.facebook.share.widget.LikeView.ObjectType objectType;
	final LikeActionController this$0;
	private String unlikeToken;

	LikeActionController$GetOGObjectLikesRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field LikeActionController this$0>
		super(LikeActionController.this, s, objecttype);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #24  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #22  <Field LikeActionController this$0>
	//   11   17:invokestatic    #28  <Method boolean LikeActionController.access$2500(LikeActionController)>
	//   12   20:putfield        #30  <Field boolean objectIsLiked>
		objectId = s;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #32  <Field String objectId>
		objectType = objecttype;
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:putfield        #34  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
		likeactioncontroller = ((LikeActionController) (new Bundle()));
	//   19   33:new             #36  <Class Bundle>
	//   20   36:dup             
	//   21   37:invokespecial   #39  <Method void Bundle()>
	//   22   40:astore_1        
		putString("fields", "id,application");
	//   23   41:aload_1         
	//   24   42:ldc1            #41  <String "fields">
	//   25   44:ldc1            #43  <String "id,application">
	//   26   46:invokevirtual   #47  <Method void Bundle.putString(String, String)>
		putString("object", objectId);
	//   27   49:aload_1         
	//   28   50:ldc1            #49  <String "object">
	//   29   52:aload_0         
	//   30   53:getfield        #32  <Field String objectId>
	//   31   56:invokevirtual   #47  <Method void Bundle.putString(String, String)>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), "me/og.likes", ((Bundle) (LikeActionController.this)), HttpMethod.GET));
	//   32   59:aload_0         
	//   33   60:new             #51  <Class GraphRequest>
	//   34   63:dup             
	//   35   64:invokestatic    #57  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   36   67:ldc1            #59  <String "me/og.likes">
	//   37   69:aload_1         
	//   38   70:getstatic       #65  <Field HttpMethod HttpMethod.GET>
	//   39   73:invokespecial   #68  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   40   76:invokevirtual   #72  <Method void setRequest(GraphRequest)>
	//   41   79:return          
	}
}
