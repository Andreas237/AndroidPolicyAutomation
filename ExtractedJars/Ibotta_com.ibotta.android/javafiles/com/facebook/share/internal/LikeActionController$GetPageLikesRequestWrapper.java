// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import org.json.JSONArray;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$GetPageLikesRequestWrapper extends LikeActionController.AbstractRequestWrapper
	implements LikeActionController.LikeRequestWrapper
{

	public String getUnlikeToken()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isObjectLiked()
	{
		return objectIsLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field boolean objectIsLiked>
	//    2    4:ireturn         
	}

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching like status for page id '%s': %s", new Object[] {
			pageId, facebookrequesterror
		});
	//    0    0:getstatic       #95  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #98  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #100 <String "Error fetching like status for page id '%s': %s">
	//    3    8:iconst_2        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:getfield        #36  <Field String pageId>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:aastore         
	//   14   23:invokestatic    #108 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		LikeActionController.access$2400(LikeActionController.this, "get_page_like", facebookrequesterror);
	//   15   26:aload_0         
	//   16   27:getfield        #19  <Field LikeActionController this$0>
	//   17   30:ldc1            #110 <String "get_page_like">
	//   18   32:aload_1         
	//   19   33:invokestatic    #114 <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
	//   20   36:return          
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (Utility.tryGetJSONArrayFromResponse(graphresponse.getJSONObject(), "data")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #122 <Method org.json.JSONObject GraphResponse.getJSONObject()>
	//    2    4:ldc1            #124 <String "data">
	//    3    6:invokestatic    #130 <Method JSONArray Utility.tryGetJSONArrayFromResponse(org.json.JSONObject, String)>
	//    4    9:astore_1        
		if(graphresponse != null && ((JSONArray) (graphresponse)).length() > 0)
	//*   5   10:aload_1         
	//*   6   11:ifnull          26
	//*   7   14:aload_1         
	//*   8   15:invokevirtual   #136 <Method int JSONArray.length()>
	//*   9   18:ifle            26
			objectIsLiked = true;
	//   10   21:aload_0         
	//   11   22:iconst_1        
	//   12   23:putfield        #34  <Field boolean objectIsLiked>
	//   13   26:return          
	}

	private boolean objectIsLiked;
	private String pageId;
	final LikeActionController this$0;

	LikeActionController$GetPageLikesRequestWrapper(String s)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field LikeActionController this$0>
		super(LikeActionController.this, s, com.facebook.share.widget.LikeView.ObjectType.PAGE);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #25  <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.PAGE>
	//    7   11:invokespecial   #28  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		objectIsLiked = LikeActionController.access$2500(LikeActionController.this);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field LikeActionController this$0>
	//   11   19:invokestatic    #32  <Method boolean LikeActionController.access$2500(LikeActionController)>
	//   12   22:putfield        #34  <Field boolean objectIsLiked>
		pageId = s;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #36  <Field String pageId>
		likeactioncontroller = ((LikeActionController) (new Bundle()));
	//   16   30:new             #38  <Class Bundle>
	//   17   33:dup             
	//   18   34:invokespecial   #41  <Method void Bundle()>
	//   19   37:astore_1        
		putString("fields", "id");
	//   20   38:aload_1         
	//   21   39:ldc1            #43  <String "fields">
	//   22   41:ldc1            #45  <String "id">
	//   23   43:invokevirtual   #49  <Method void Bundle.putString(String, String)>
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//   24   46:invokestatic    #55  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   25   49:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   26   50:new             #57  <Class StringBuilder>
	//   27   53:dup             
	//   28   54:invokespecial   #58  <Method void StringBuilder()>
	//   29   57:astore          4
		stringbuilder.append("me/likes/");
	//   30   59:aload           4
	//   31   61:ldc1            #60  <String "me/likes/">
	//   32   63:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   33   66:pop             
		stringbuilder.append(s);
	//   34   67:aload           4
	//   35   69:aload_2         
	//   36   70:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
		setRequest(new GraphRequest(accesstoken, stringbuilder.toString(), ((Bundle) (LikeActionController.this)), HttpMethod.GET));
	//   38   74:aload_0         
	//   39   75:new             #66  <Class GraphRequest>
	//   40   78:dup             
	//   41   79:aload_3         
	//   42   80:aload           4
	//   43   82:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   44   85:aload_1         
	//   45   86:getstatic       #76  <Field HttpMethod HttpMethod.GET>
	//   46   89:invokespecial   #79  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   47   92:invokevirtual   #83  <Method void setRequest(GraphRequest)>
	//   48   95:return          
	}
}
