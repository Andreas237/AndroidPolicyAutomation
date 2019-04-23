// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.*;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.util.Locale;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private class LikeActionController$GetEngagementRequestWrapper extends LikeActionController.AbstractRequestWrapper
{

	protected void processError(FacebookRequestError facebookrequesterror)
	{
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
			objectId, objectType, facebookrequesterror
		});
	//    0    0:getstatic       #96  <Field LoggingBehavior LoggingBehavior.REQUESTS>
	//    1    3:invokestatic    #99  <Method String LikeActionController.access$100()>
	//    2    6:ldc1            #101 <String "Error fetching engagement for object '%s' with type '%s' : %s">
	//    3    8:iconst_3        
	//    4    9:anewarray       Object[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:aload_0         
	//    8   15:getfield        #106 <Field String objectId>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:aload_0         
	//   13   22:getfield        #110 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_2        
	//   17   28:aload_1         
	//   18   29:aastore         
	//   19   30:invokestatic    #116 <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		LikeActionController.access$2400(LikeActionController.this, "get_engagement", facebookrequesterror);
	//   20   33:aload_0         
	//   21   34:getfield        #18  <Field LikeActionController this$0>
	//   22   37:ldc1            #118 <String "get_engagement">
	//   23   39:aload_1         
	//   24   40:invokestatic    #122 <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
	//   25   43:return          
	}

	protected void processSuccess(GraphResponse graphresponse)
	{
		graphresponse = ((GraphResponse) (Utility.tryGetJSONObjectFromResponse(graphresponse.getJSONObject(), "engagement")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #130 <Method JSONObject GraphResponse.getJSONObject()>
	//    2    4:ldc1            #132 <String "engagement">
	//    3    6:invokestatic    #138 <Method JSONObject Utility.tryGetJSONObjectFromResponse(JSONObject, String)>
	//    4    9:astore_1        
		if(graphresponse != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          70
		{
			likeCountStringWithLike = ((JSONObject) (graphresponse)).optString("count_string_with_like", likeCountStringWithLike);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #140 <String "count_string_with_like">
	//   10   18:aload_0         
	//   11   19:getfield        #26  <Field String likeCountStringWithLike>
	//   12   22:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//   13   25:putfield        #26  <Field String likeCountStringWithLike>
			likeCountStringWithoutLike = ((JSONObject) (graphresponse)).optString("count_string_without_like", likeCountStringWithoutLike);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:ldc1            #148 <String "count_string_without_like">
	//   17   32:aload_0         
	//   18   33:getfield        #31  <Field String likeCountStringWithoutLike>
	//   19   36:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//   20   39:putfield        #31  <Field String likeCountStringWithoutLike>
			socialSentenceStringWithLike = ((JSONObject) (graphresponse)).optString("social_sentence_with_like", socialSentenceStringWithLike);
	//   21   42:aload_0         
	//   22   43:aload_1         
	//   23   44:ldc1            #150 <String "social_sentence_with_like">
	//   24   46:aload_0         
	//   25   47:getfield        #36  <Field String socialSentenceStringWithLike>
	//   26   50:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//   27   53:putfield        #36  <Field String socialSentenceStringWithLike>
			socialSentenceStringWithoutLike = ((JSONObject) (graphresponse)).optString("social_sentence_without_like", socialSentenceStringWithoutLike);
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:ldc1            #152 <String "social_sentence_without_like">
	//   31   60:aload_0         
	//   32   61:getfield        #41  <Field String socialSentenceStringWithoutLike>
	//   33   64:invokevirtual   #146 <Method String JSONObject.optString(String, String)>
	//   34   67:putfield        #41  <Field String socialSentenceStringWithoutLike>
		}
	//   35   70:return          
	}

	String likeCountStringWithLike;
	String likeCountStringWithoutLike;
	String socialSentenceStringWithLike;
	String socialSentenceStringWithoutLike;
	final LikeActionController this$0;

	LikeActionController$GetEngagementRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
	{
		this$0 = LikeActionController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field LikeActionController this$0>
		super(LikeActionController.this, s, objecttype);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #20  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
		likeCountStringWithLike = LikeActionController.access$700(LikeActionController.this);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #18  <Field LikeActionController this$0>
	//   11   17:invokestatic    #24  <Method String LikeActionController.access$700(LikeActionController)>
	//   12   20:putfield        #26  <Field String likeCountStringWithLike>
		likeCountStringWithoutLike = LikeActionController.access$800(LikeActionController.this);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #18  <Field LikeActionController this$0>
	//   16   28:invokestatic    #29  <Method String LikeActionController.access$800(LikeActionController)>
	//   17   31:putfield        #31  <Field String likeCountStringWithoutLike>
		socialSentenceStringWithLike = LikeActionController.access$900(LikeActionController.this);
	//   18   34:aload_0         
	//   19   35:aload_0         
	//   20   36:getfield        #18  <Field LikeActionController this$0>
	//   21   39:invokestatic    #34  <Method String LikeActionController.access$900(LikeActionController)>
	//   22   42:putfield        #36  <Field String socialSentenceStringWithLike>
		socialSentenceStringWithoutLike = LikeActionController.access$1000(LikeActionController.this);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #18  <Field LikeActionController this$0>
	//   26   50:invokestatic    #39  <Method String LikeActionController.access$1000(LikeActionController)>
	//   27   53:putfield        #41  <Field String socialSentenceStringWithoutLike>
		likeactioncontroller = ((LikeActionController) (new Bundle()));
	//   28   56:new             #43  <Class Bundle>
	//   29   59:dup             
	//   30   60:invokespecial   #46  <Method void Bundle()>
	//   31   63:astore_1        
		putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
	//   32   64:aload_1         
	//   33   65:ldc1            #48  <String "fields">
	//   34   67:ldc1            #50  <String "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)">
	//   35   69:invokevirtual   #54  <Method void Bundle.putString(String, String)>
		putString("locale", Locale.getDefault().toString());
	//   36   72:aload_1         
	//   37   73:ldc1            #56  <String "locale">
	//   38   75:invokestatic    #62  <Method Locale Locale.getDefault()>
	//   39   78:invokevirtual   #66  <Method String Locale.toString()>
	//   40   81:invokevirtual   #54  <Method void Bundle.putString(String, String)>
		setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, ((Bundle) (LikeActionController.this)), HttpMethod.GET));
	//   41   84:aload_0         
	//   42   85:new             #68  <Class GraphRequest>
	//   43   88:dup             
	//   44   89:invokestatic    #74  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//   45   92:aload_2         
	//   46   93:aload_1         
	//   47   94:getstatic       #80  <Field HttpMethod HttpMethod.GET>
	//   48   97:invokespecial   #83  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
	//   49  100:invokevirtual   #87  <Method void setRequest(GraphRequest)>
	//   50  103:return          
	}
}
