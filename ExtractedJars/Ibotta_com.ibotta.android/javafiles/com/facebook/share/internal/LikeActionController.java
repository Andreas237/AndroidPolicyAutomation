// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.app.Activity;
import android.content.*;
import android.os.*;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.IOException;
import java.io.OutputStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.json.*;

// Referenced classes of package com.facebook.share.internal:
//			ShareInternalUtility, LikeDialog, LikeStatusClient, ResultProcessor

public class LikeActionController
{
	private abstract class AbstractRequestWrapper
		implements RequestWrapper
	{

		public void addToBatch(GraphRequestBatch graphrequestbatch)
		{
			graphrequestbatch.add(request);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #37  <Field GraphRequest request>
		//    3    5:invokevirtual   #43  <Method boolean GraphRequestBatch.add(GraphRequest)>
		//    4    8:pop             
		//    5    9:return          
		}

		public FacebookRequestError getError()
		{
			return error;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field FacebookRequestError error>
		//    2    4:areturn         
		}

		protected void processError(FacebookRequestError facebookrequesterror)
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error running request for object '%s' with type '%s' : %s", new Object[] {
				objectId, objectType, facebookrequesterror
			});
		//    0    0:getstatic       #55  <Field LoggingBehavior LoggingBehavior.REQUESTS>
		//    1    3:invokestatic    #59  <Method String LikeActionController.access$100()>
		//    2    6:ldc1            #61  <String "Error running request for object '%s' with type '%s' : %s">
		//    3    8:iconst_3        
		//    4    9:anewarray       Object[]
		//    5   12:dup             
		//    6   13:iconst_0        
		//    7   14:aload_0         
		//    8   15:getfield        #30  <Field String objectId>
		//    9   18:aastore         
		//   10   19:dup             
		//   11   20:iconst_1        
		//   12   21:aload_0         
		//   13   22:getfield        #32  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
		//   14   25:aastore         
		//   15   26:dup             
		//   16   27:iconst_2        
		//   17   28:aload_1         
		//   18   29:aastore         
		//   19   30:invokestatic    #67  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
		//   20   33:return          
		}

		protected abstract void processSuccess(GraphResponse graphresponse);

		protected void setRequest(GraphRequest graphrequest)
		{
			request = graphrequest;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field GraphRequest request>
			graphrequest.setVersion(FacebookSdk.getGraphApiVersion());
		//    3    5:aload_1         
		//    4    6:invokestatic    #76  <Method String FacebookSdk.getGraphApiVersion()>
		//    5    9:invokevirtual   #82  <Method void GraphRequest.setVersion(String)>
			graphrequest.setCallback(new com.facebook.GraphRequest.Callback() {

				public void onCompleted(GraphResponse graphresponse)
				{
					error = graphresponse.getError();
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #32  <Method FacebookRequestError GraphResponse.getError()>
				//    4    8:putfield        #36  <Field FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
					if(error != null)
				//*   5   11:aload_0         
				//*   6   12:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
				//*   7   15:getfield        #36  <Field FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
				//*   8   18:ifnull          35
					{
						graphresponse = ((GraphResponse) (AbstractRequestWrapper.this));
				//    9   21:aload_0         
				//   10   22:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
				//   11   25:astore_1        
						((AbstractRequestWrapper) (graphresponse)).processError(((AbstractRequestWrapper) (graphresponse)).error);
				//   12   26:aload_1         
				//   13   27:aload_1         
				//   14   28:getfield        #36  <Field FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
				//   15   31:invokevirtual   #40  <Method void LikeActionController$AbstractRequestWrapper.processError(FacebookRequestError)>
						return;
				//   16   34:return          
					} else
					{
						processSuccess(graphresponse);
				//   17   35:aload_0         
				//   18   36:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
				//   19   39:aload_1         
				//   20   40:invokevirtual   #43  <Method void LikeActionController$AbstractRequestWrapper.processSuccess(GraphResponse)>
						return;
				//   21   43:return          
					}
				}

				final AbstractRequestWrapper this$1;

			
			{
				this$1 = AbstractRequestWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    6   12:aload_1         
		//    7   13:new             #11  <Class LikeActionController$AbstractRequestWrapper$1>
		//    8   16:dup             
		//    9   17:aload_0         
		//   10   18:invokespecial   #85  <Method void LikeActionController$AbstractRequestWrapper$1(LikeActionController$AbstractRequestWrapper)>
		//   11   21:invokevirtual   #89  <Method void GraphRequest.setCallback(com.facebook.GraphRequest$Callback)>
		//   12   24:return          
		}

		protected FacebookRequestError error;
		protected String objectId;
		protected com.facebook.share.widget.LikeView.ObjectType objectType;
		private GraphRequest request;
		final LikeActionController this$0;

		protected AbstractRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field LikeActionController this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #28  <Method void Object()>
			objectId = s;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #30  <Field String objectId>
			objectType = objecttype;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #32  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
		//   11   19:return          
		}
	}

	private static class CreateLikeActionControllerWorkItem
		implements Runnable
	{

		public void run()
		{
			LikeActionController.createControllerForObjectIdAndType(objectId, objectType, callback);
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field String objectId>
		//    2    4:aload_0         
		//    3    5:getfield        #24  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
		//    4    8:aload_0         
		//    5    9:getfield        #26  <Field LikeActionController$CreationCallback callback>
		//    6   12:invokestatic    #31  <Method void LikeActionController.access$2700(String, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
		//    7   15:return          
		}

		private CreationCallback callback;
		private String objectId;
		private com.facebook.share.widget.LikeView.ObjectType objectType;

		CreateLikeActionControllerWorkItem(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
			objectId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field String objectId>
			objectType = objecttype;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field com.facebook.share.widget.LikeView$ObjectType objectType>
			callback = creationcallback;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #26  <Field LikeActionController$CreationCallback callback>
		//   11   19:return          
		}
	}

	public static interface CreationCallback
	{

		public abstract void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception);
	}

	private class GetEngagementRequestWrapper extends AbstractRequestWrapper
	{

		protected void processError(FacebookRequestError facebookrequesterror)
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching engagement for object '%s' with type '%s' : %s", new Object[] {
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
			logAppEventForError("get_engagement", facebookrequesterror);
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

		GetEngagementRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field LikeActionController this$0>
			super(s, objecttype);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #20  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
			likeCountStringWithLike = LikeActionController.this.likeCountStringWithLike;
		//    8   12:aload_0         
		//    9   13:aload_0         
		//   10   14:getfield        #18  <Field LikeActionController this$0>
		//   11   17:invokestatic    #24  <Method String LikeActionController.access$700(LikeActionController)>
		//   12   20:putfield        #26  <Field String likeCountStringWithLike>
			likeCountStringWithoutLike = LikeActionController.this.likeCountStringWithoutLike;
		//   13   23:aload_0         
		//   14   24:aload_0         
		//   15   25:getfield        #18  <Field LikeActionController this$0>
		//   16   28:invokestatic    #29  <Method String LikeActionController.access$800(LikeActionController)>
		//   17   31:putfield        #31  <Field String likeCountStringWithoutLike>
			socialSentenceStringWithLike = socialSentenceWithLike;
		//   18   34:aload_0         
		//   19   35:aload_0         
		//   20   36:getfield        #18  <Field LikeActionController this$0>
		//   21   39:invokestatic    #34  <Method String LikeActionController.access$900(LikeActionController)>
		//   22   42:putfield        #36  <Field String socialSentenceStringWithLike>
			socialSentenceStringWithoutLike = socialSentenceWithoutLike;
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

	private class GetOGObjectIdRequestWrapper extends AbstractRequestWrapper
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
				Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
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

		GetOGObjectIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field LikeActionController this$0>
			super(s, objecttype);
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

	private class GetOGObjectLikesRequestWrapper extends AbstractRequestWrapper
		implements LikeRequestWrapper
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
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching like status for object '%s' with type '%s' : %s", new Object[] {
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
			logAppEventForError("get_og_object_like", facebookrequesterror);
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

		GetOGObjectLikesRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field LikeActionController this$0>
			super(s, objecttype);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokespecial   #24  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
			objectIsLiked = LikeActionController.this.isObjectLiked;
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

	private class GetPageIdRequestWrapper extends AbstractRequestWrapper
	{

		protected void processError(FacebookRequestError facebookrequesterror)
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error getting the FB id for object '%s' with type '%s' : %s", new Object[] {
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

		GetPageIdRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field LikeActionController this$0>
			super(s, objecttype);
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

	private class GetPageLikesRequestWrapper extends AbstractRequestWrapper
		implements LikeRequestWrapper
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
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error fetching like status for page id '%s': %s", new Object[] {
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
			logAppEventForError("get_page_like", facebookrequesterror);
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
		//    1    1:invokevirtual   #122 <Method JSONObject GraphResponse.getJSONObject()>
		//    2    4:ldc1            #124 <String "data">
		//    3    6:invokestatic    #130 <Method JSONArray Utility.tryGetJSONArrayFromResponse(JSONObject, String)>
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

		GetPageLikesRequestWrapper(String s)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field LikeActionController this$0>
			super(s, com.facebook.share.widget.LikeView.ObjectType.PAGE);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #25  <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.PAGE>
		//    7   11:invokespecial   #28  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
			objectIsLiked = LikeActionController.this.isObjectLiked;
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

	private static interface LikeRequestWrapper
		extends RequestWrapper
	{

		public abstract String getUnlikeToken();

		public abstract boolean isObjectLiked();
	}

	private static class MRUCacheWorkItem
		implements Runnable
	{

		public void run()
		{
			String s = cacheItem;
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field String cacheItem>
		//    2    4:astore_1        
			if(s != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          28
			{
				mruCachedItems.remove(((Object) (s)));
		//    5    9:getstatic       #25  <Field ArrayList mruCachedItems>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #37  <Method boolean ArrayList.remove(Object)>
		//    8   16:pop             
				mruCachedItems.add(0, ((Object) (cacheItem)));
		//    9   17:getstatic       #25  <Field ArrayList mruCachedItems>
		//   10   20:iconst_0        
		//   11   21:aload_0         
		//   12   22:getfield        #30  <Field String cacheItem>
		//   13   25:invokevirtual   #41  <Method void ArrayList.add(int, Object)>
			}
			if(shouldTrim && mruCachedItems.size() >= 128)
		//*  14   28:aload_0         
		//*  15   29:getfield        #32  <Field boolean shouldTrim>
		//*  16   32:ifeq            87
		//*  17   35:getstatic       #25  <Field ArrayList mruCachedItems>
		//*  18   38:invokevirtual   #45  <Method int ArrayList.size()>
		//*  19   41:sipush          128
		//*  20   44:icmplt          87
			{
				Object obj;
				for(; 64 < mruCachedItems.size(); LikeActionController.cache.remove(obj))
		//*  21   47:bipush          64
		//*  22   49:getstatic       #25  <Field ArrayList mruCachedItems>
		//*  23   52:invokevirtual   #45  <Method int ArrayList.size()>
		//*  24   55:icmpge          87
				{
					obj = ((Object) (mruCachedItems));
		//   25   58:getstatic       #25  <Field ArrayList mruCachedItems>
		//   26   61:astore_1        
					obj = ((Object) ((String)((ArrayList) (obj)).remove(((ArrayList) (obj)).size() - 1)));
		//   27   62:aload_1         
		//   28   63:aload_1         
		//   29   64:invokevirtual   #45  <Method int ArrayList.size()>
		//   30   67:iconst_1        
		//   31   68:isub            
		//   32   69:invokevirtual   #48  <Method Object ArrayList.remove(int)>
		//   33   72:checkcast       #50  <Class String>
		//   34   75:astore_1        
				}

		//   35   76:invokestatic    #54  <Method ConcurrentHashMap LikeActionController.access$400()>
		//   36   79:aload_1         
		//   37   80:invokevirtual   #59  <Method Object ConcurrentHashMap.remove(Object)>
		//   38   83:pop             
			}
		//*  39   84:goto            47
		//   40   87:return          
		}

		private static ArrayList mruCachedItems = new ArrayList();
		private String cacheItem;
		private boolean shouldTrim;

		static 
		{
		//    0    0:new             #20  <Class ArrayList>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void ArrayList()>
		//    3    7:putstatic       #25  <Field ArrayList mruCachedItems>
		//*   4   10:return          
		}

		MRUCacheWorkItem(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #28  <Method void Object()>
			cacheItem = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field String cacheItem>
			shouldTrim = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #32  <Field boolean shouldTrim>
		//    8   14:return          
		}
	}

	private class PublishLikeRequestWrapper extends AbstractRequestWrapper
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
				Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error liking object '%s' with type '%s' : %s", new Object[] {
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
				logAppEventForError("publish_like", facebookrequesterror);
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
		//    2    2:invokevirtual   #105 <Method JSONObject GraphResponse.getJSONObject()>
		//    3    5:ldc1            #107 <String "id">
		//    4    7:invokestatic    #113 <Method String Utility.safeGetStringFromResponse(JSONObject, String)>
		//    5   10:putfield        #115 <Field String unlikeToken>
		//    6   13:return          
		}

		final LikeActionController this$0;
		String unlikeToken;

		PublishLikeRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field LikeActionController this$0>
			super(s, objecttype);
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

	private class PublishUnlikeRequestWrapper extends AbstractRequestWrapper
	{

		protected void processError(FacebookRequestError facebookrequesterror)
		{
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Error unliking object with unlike token '%s' : %s", new Object[] {
				unlikeToken, facebookrequesterror
			});
		//    0    0:getstatic       #50  <Field LoggingBehavior LoggingBehavior.REQUESTS>
		//    1    3:invokestatic    #54  <Method String LikeActionController.access$100()>
		//    2    6:ldc1            #56  <String "Error unliking object with unlike token '%s' : %s">
		//    3    8:iconst_2        
		//    4    9:anewarray       Object[]
		//    5   12:dup             
		//    6   13:iconst_0        
		//    7   14:aload_0         
		//    8   15:getfield        #20  <Field String unlikeToken>
		//    9   18:aastore         
		//   10   19:dup             
		//   11   20:iconst_1        
		//   12   21:aload_1         
		//   13   22:aastore         
		//   14   23:invokestatic    #64  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
			logAppEventForError("publish_unlike", facebookrequesterror);
		//   15   26:aload_0         
		//   16   27:getfield        #15  <Field LikeActionController this$0>
		//   17   30:ldc1            #66  <String "publish_unlike">
		//   18   32:aload_1         
		//   19   33:invokestatic    #70  <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
		//   20   36:return          
		}

		protected void processSuccess(GraphResponse graphresponse)
		{
		//    0    0:return          
		}

		final LikeActionController this$0;
		private String unlikeToken;

		PublishUnlikeRequestWrapper(String s)
		{
			this$0 = LikeActionController.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field LikeActionController this$0>
			super(((String) (null)), ((com.facebook.share.widget.LikeView.ObjectType) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aconst_null     
		//    6    8:aconst_null     
		//    7    9:invokespecial   #18  <Method void LikeActionController$AbstractRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
			unlikeToken = s;
		//    8   12:aload_0         
		//    9   13:aload_2         
		//   10   14:putfield        #20  <Field String unlikeToken>
			setRequest(new GraphRequest(AccessToken.getCurrentAccessToken(), s, ((Bundle) (null)), HttpMethod.DELETE));
		//   11   17:aload_0         
		//   12   18:new             #22  <Class GraphRequest>
		//   13   21:dup             
		//   14   22:invokestatic    #28  <Method AccessToken AccessToken.getCurrentAccessToken()>
		//   15   25:aload_2         
		//   16   26:aconst_null     
		//   17   27:getstatic       #34  <Field HttpMethod HttpMethod.DELETE>
		//   18   30:invokespecial   #37  <Method void GraphRequest(AccessToken, String, Bundle, HttpMethod)>
		//   19   33:invokevirtual   #41  <Method void setRequest(GraphRequest)>
		//   20   36:return          
		}
	}

	private static interface RequestCompletionCallback
	{

		public abstract void onComplete();
	}

	private static interface RequestWrapper
	{

		public abstract void addToBatch(GraphRequestBatch graphrequestbatch);

		public abstract FacebookRequestError getError();
	}

	private static class SerializeToDiskWorkItem
		implements Runnable
	{

		public void run()
		{
			LikeActionController.serializeToDiskSynchronously(cacheKey, controllerJson);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field String cacheKey>
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field String controllerJson>
		//    4    8:invokestatic    #26  <Method void LikeActionController.access$2600(String, String)>
		//    5   11:return          
		}

		private String cacheKey;
		private String controllerJson;

		SerializeToDiskWorkItem(String s, String s1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			cacheKey = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String cacheKey>
			controllerJson = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field String controllerJson>
		//    8   14:return          
		}
	}


	private LikeActionController(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method void Object()>
		objectId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #142 <Field String objectId>
		objectType = objecttype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//    8   14:return          
	}

	private static void broadcastAction(LikeActionController likeactioncontroller, String s)
	{
		broadcastAction(likeactioncontroller, s, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #185 <Method void broadcastAction(LikeActionController, String, Bundle)>
	//    4    6:return          
	}

	private static void broadcastAction(LikeActionController likeactioncontroller, String s, Bundle bundle)
	{
		Intent intent = new Intent(s);
	//    0    0:new             #265 <Class Intent>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #268 <Method void Intent(String)>
	//    4    8:astore_3        
		s = ((String) (bundle));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(likeactioncontroller != null)
	//*   7   11:aload_0         
	//*   8   12:ifnull          40
		{
			s = ((String) (bundle));
	//    9   15:aload_2         
	//   10   16:astore_1        
			if(bundle == null)
	//*  11   17:aload_2         
	//*  12   18:ifnonnull       29
				s = ((String) (new Bundle()));
	//   13   21:new             #270 <Class Bundle>
	//   14   24:dup             
	//   15   25:invokespecial   #271 <Method void Bundle()>
	//   16   28:astore_1        
			((Bundle) (s)).putString("com.facebook.sdk.LikeActionController.OBJECT_ID", likeactioncontroller.getObjectId());
	//   17   29:aload_1         
	//   18   30:ldc2            #273 <String "com.facebook.sdk.LikeActionController.OBJECT_ID">
	//   19   33:aload_0         
	//   20   34:invokevirtual   #276 <Method String getObjectId()>
	//   21   37:invokevirtual   #279 <Method void Bundle.putString(String, String)>
		}
		if(s != null)
	//*  22   40:aload_1         
	//*  23   41:ifnull          50
			intent.putExtras(((Bundle) (s)));
	//   24   44:aload_3         
	//   25   45:aload_1         
	//   26   46:invokevirtual   #283 <Method Intent Intent.putExtras(Bundle)>
	//   27   49:pop             
		LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()).sendBroadcast(intent);
	//   28   50:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//   29   53:invokestatic    #295 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   30   56:aload_3         
	//   31   57:invokevirtual   #299 <Method boolean LocalBroadcastManager.sendBroadcast(Intent)>
	//   32   60:pop             
	//   33   61:return          
	}

	private boolean canUseOGPublish()
	{
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    0    0:invokestatic    #307 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    1    3:astore_1        
		return !objectIsPage && verifiedObjectId != null && AccessToken.isCurrentAccessTokenActive() && accesstoken.getPermissions() != null && accesstoken.getPermissions().contains("publish_actions");
	//    2    4:aload_0         
	//    3    5:getfield        #219 <Field boolean objectIsPage>
	//    4    8:ifne            48
	//    5   11:aload_0         
	//    6   12:getfield        #188 <Field String verifiedObjectId>
	//    7   15:ifnull          48
	//    8   18:invokestatic    #310 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//    9   21:ifeq            48
	//   10   24:aload_1         
	//   11   25:invokevirtual   #314 <Method Set AccessToken.getPermissions()>
	//   12   28:ifnull          48
	//   13   31:aload_1         
	//   14   32:invokevirtual   #314 <Method Set AccessToken.getPermissions()>
	//   15   35:ldc2            #316 <String "publish_actions">
	//   16   38:invokeinterface #322 <Method boolean Set.contains(Object)>
	//   17   43:ifeq            48
	//   18   46:iconst_1        
	//   19   47:ireturn         
	//   20   48:iconst_0        
	//   21   49:ireturn         
	}

	private void clearState()
	{
		facebookDialogAnalyticsBundle = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
		storeObjectIdForPendingController(((String) (null)));
	//    3    5:aconst_null     
	//    4    6:invokestatic    #328 <Method void storeObjectIdForPendingController(String)>
	//    5    9:return          
	}

	private static void createControllerForObjectIdAndType(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
	{
		LikeActionController likeactioncontroller = getControllerFromInMemoryCache(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #332 <Method LikeActionController getControllerFromInMemoryCache(String)>
	//    2    4:astore_3        
		if(likeactioncontroller != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			verifyControllerAndInvokeCallback(likeactioncontroller, objecttype, creationcallback);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokestatic    #336 <Method void verifyControllerAndInvokeCallback(LikeActionController, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
			return;
	//    9   15:return          
		}
		LikeActionController likeactioncontroller1 = deserializeFromDiskSynchronously(s);
	//   10   16:aload_0         
	//   11   17:invokestatic    #339 <Method LikeActionController deserializeFromDiskSynchronously(String)>
	//   12   20:astore          4
		likeactioncontroller = likeactioncontroller1;
	//   13   22:aload           4
	//   14   24:astore_3        
		if(likeactioncontroller1 == null)
	//*  15   25:aload           4
	//*  16   27:ifnonnull       44
		{
			likeactioncontroller = new LikeActionController(s, objecttype);
	//   17   30:new             #2   <Class LikeActionController>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokespecial   #341 <Method void LikeActionController(String, com.facebook.share.widget.LikeView$ObjectType)>
	//   22   39:astore_3        
			serializeToDiskAsync(likeactioncontroller);
	//   23   40:aload_3         
	//   24   41:invokestatic    #344 <Method void serializeToDiskAsync(LikeActionController)>
		}
		putControllerInMemoryCache(s, likeactioncontroller);
	//   25   44:aload_0         
	//   26   45:aload_3         
	//   27   46:invokestatic    #348 <Method void putControllerInMemoryCache(String, LikeActionController)>
		handler.post(new Runnable(likeactioncontroller) {

			public void run()
			{
				controllerToRefresh.refreshStatusAsync();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LikeActionController val$controllerToRefresh>
			//    2    4:invokestatic    #25  <Method void LikeActionController.access$200(LikeActionController)>
			//    3    7:return          
			}

			final LikeActionController val$controllerToRefresh;

			
			{
				controllerToRefresh = likeactioncontroller;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LikeActionController val$controllerToRefresh>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   28   49:getstatic       #350 <Field Handler handler>
	//   29   52:new             #14  <Class LikeActionController$2>
	//   30   55:dup             
	//   31   56:aload_3         
	//   32   57:invokespecial   #352 <Method void LikeActionController$2(LikeActionController)>
	//   33   60:invokevirtual   #358 <Method boolean Handler.post(Runnable)>
	//   34   63:pop             
		invokeCallbackWithController(creationcallback, likeactioncontroller, ((FacebookException) (null)));
	//   35   64:aload_2         
	//   36   65:aload_3         
	//   37   66:aconst_null     
	//   38   67:invokestatic    #362 <Method void invokeCallbackWithController(LikeActionController$CreationCallback, LikeActionController, FacebookException)>
	//   39   70:return          
	}

	private static LikeActionController deserializeFromDiskSynchronously(String s)
	{
		Object obj2;
		Object obj3;
		Object obj4;
		obj3 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		obj4 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		obj2 = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		Object obj;
		s = getCacheKeyForObjectId(s);
	//    6    8:aload_0         
	//    7    9:invokestatic    #368 <Method String getCacheKeyForObjectId(String)>
	//    8   12:astore_0        
		obj = ((Object) (controllerDiskCache.get(s)));
	//    9   13:getstatic       #250 <Field FileLruCache controllerDiskCache>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #374 <Method java.io.InputStream FileLruCache.get(String)>
	//   12   20:astore_1        
		s = ((String) (obj2));
	//   13   21:aload_3         
	//   14   22:astore_0        
		if(obj == null) goto _L2; else goto _L1
	//   15   23:aload_1         
	//   16   24:ifnull          64
_L1:
		Object obj1 = obj;
	//   17   27:aload_1         
	//   18   28:astore_2        
		String s1 = Utility.readStreamToString(((java.io.InputStream) (obj)));
	//   19   29:aload_1         
	//   20   30:invokestatic    #380 <Method String Utility.readStreamToString(java.io.InputStream)>
	//   21   33:astore          6
		s = ((String) (obj2));
	//   22   35:aload_3         
	//   23   36:astore_0        
		obj1 = obj;
	//   24   37:aload_1         
	//   25   38:astore_2        
		if(Utility.isNullOrEmpty(s1)) goto _L2; else goto _L3
	//   26   39:aload           6
	//   27   41:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//   28   44:ifne            64
_L3:
		obj1 = obj;
	//   29   47:aload_1         
	//   30   48:astore_2        
		s = ((String) (deserializeFromJson(s1)));
	//   31   49:aload           6
	//   32   51:invokestatic    #387 <Method LikeActionController deserializeFromJson(String)>
	//   33   54:astore_0        
		  goto _L2
	//*  34   55:goto            64
		IOException ioexception;
		ioexception;
	//   35   58:astore_3        
		s = ((String) (obj));
	//   36   59:aload_1         
	//   37   60:astore_0        
		  goto _L4
	//*  38   61:goto            89
_L2:
		obj1 = ((Object) (s));
	//   39   64:aload_0         
	//   40   65:astore_2        
		if(obj == null) goto _L6; else goto _L5
	//   41   66:aload_1         
	//   42   67:ifnull          117
_L5:
		obj1 = obj;
	//   43   70:aload_1         
	//   44   71:astore_2        
		obj = ((Object) (s));
	//   45   72:aload_0         
	//   46   73:astore_1        
_L7:
		Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   47   74:aload_2         
	//   48   75:invokestatic    #391 <Method void Utility.closeQuietly(java.io.Closeable)>
		return ((LikeActionController) (obj));
	//   49   78:aload_1         
	//   50   79:areturn         
		s;
	//   51   80:astore_0        
		obj1 = null;
	//   52   81:aconst_null     
	//   53   82:astore_2        
		break MISSING_BLOCK_LABEL_120;
	//   54   83:goto            120
		ioexception;
	//   55   86:astore_3        
		s = null;
	//   56   87:aconst_null     
	//   57   88:astore_0        
_L4:
		obj1 = ((Object) (s));
	//   58   89:aload_0         
	//   59   90:astore_2        
		Log.e(TAG, "Unable to deserialize controller from disk", ((Throwable) (ioexception)));
	//   60   91:getstatic       #154 <Field String TAG>
	//   61   94:ldc2            #393 <String "Unable to deserialize controller from disk">
	//   62   97:aload_3         
	//   63   98:invokestatic    #399 <Method int Log.e(String, String, Throwable)>
	//   64  101:pop             
		obj1 = ((Object) (obj4));
	//   65  102:aload           5
	//   66  104:astore_2        
		if(s == null)
			break; /* Loop/switch isn't completed */
	//   67  105:aload_0         
	//   68  106:ifnull          117
		obj = ((Object) (obj3));
	//   69  109:aload           4
	//   70  111:astore_1        
		obj1 = ((Object) (s));
	//   71  112:aload_0         
	//   72  113:astore_2        
		if(true) goto _L7; else goto _L6
	//   73  114:goto            74
_L6:
		return ((LikeActionController) (obj1));
	//   74  117:aload_2         
	//   75  118:areturn         
		s;
	//   76  119:astore_0        
		if(obj1 != null)
	//*  77  120:aload_2         
	//*  78  121:ifnull          128
			Utility.closeQuietly(((java.io.Closeable) (obj1)));
	//   79  124:aload_2         
	//   80  125:invokestatic    #391 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw s;
	//   81  128:aload_0         
	//   82  129:athrow          
	}

	private static LikeActionController deserializeFromJson(String s)
	{
		JSONObject jsonobject = JSONObjectInstrumentation.init(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #407 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_1        
		if(jsonobject.optInt("com.facebook.share.internal.LikeActionController.version", -1) != 3)
	//*   3    5:aload_1         
	//*   4    6:ldc2            #409 <String "com.facebook.share.internal.LikeActionController.version">
	//*   5    9:iconst_m1       
	//*   6   10:invokevirtual   #415 <Method int JSONObject.optInt(String, int)>
	//*   7   13:iconst_3        
	//*   8   14:icmpeq          19
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
		try
		{
			s = ((String) (new LikeActionController(jsonobject.getString("object_id"), com.facebook.share.widget.LikeView.ObjectType.fromInt(jsonobject.optInt("object_type", com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.getValue())))));
	//   11   19:new             #2   <Class LikeActionController>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:ldc2            #417 <String "object_id">
	//   15   27:invokevirtual   #420 <Method String JSONObject.getString(String)>
	//   16   30:aload_1         
	//   17   31:ldc2            #422 <String "object_type">
	//   18   34:getstatic       #427 <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.UNKNOWN>
	//   19   37:invokevirtual   #430 <Method int com.facebook.share.widget.LikeView$ObjectType.getValue()>
	//   20   40:invokevirtual   #415 <Method int JSONObject.optInt(String, int)>
	//   21   43:invokestatic    #434 <Method com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.fromInt(int)>
	//   22   46:invokespecial   #341 <Method void LikeActionController(String, com.facebook.share.widget.LikeView$ObjectType)>
	//   23   49:astore_0        
			s.likeCountStringWithLike = jsonobject.optString("like_count_string_with_like", ((String) (null)));
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:ldc2            #436 <String "like_count_string_with_like">
	//   27   55:aconst_null     
	//   28   56:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//   29   59:putfield        #257 <Field String likeCountStringWithLike>
			s.likeCountStringWithoutLike = jsonobject.optString("like_count_string_without_like", ((String) (null)));
	//   30   62:aload_0         
	//   31   63:aload_1         
	//   32   64:ldc2            #442 <String "like_count_string_without_like">
	//   33   67:aconst_null     
	//   34   68:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//   35   71:putfield        #260 <Field String likeCountStringWithoutLike>
			s.socialSentenceWithLike = jsonobject.optString("social_sentence_with_like", ((String) (null)));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:ldc2            #444 <String "social_sentence_with_like">
	//   39   79:aconst_null     
	//   40   80:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//   41   83:putfield        #263 <Field String socialSentenceWithLike>
			s.socialSentenceWithoutLike = jsonobject.optString("social_sentence_without_like", ((String) (null)));
	//   42   86:aload_0         
	//   43   87:aload_1         
	//   44   88:ldc2            #446 <String "social_sentence_without_like">
	//   45   91:aconst_null     
	//   46   92:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//   47   95:putfield        #158 <Field String socialSentenceWithoutLike>
			s.isObjectLiked = jsonobject.optBoolean("is_object_liked");
	//   48   98:aload_0         
	//   49   99:aload_1         
	//   50  100:ldc2            #448 <String "is_object_liked">
	//   51  103:invokevirtual   #451 <Method boolean JSONObject.optBoolean(String)>
	//   52  106:putfield        #228 <Field boolean isObjectLiked>
			s.unlikeToken = jsonobject.optString("unlike_token", ((String) (null)));
	//   53  109:aload_0         
	//   54  110:aload_1         
	//   55  111:ldc2            #453 <String "unlike_token">
	//   56  114:aconst_null     
	//   57  115:invokevirtual   #440 <Method String JSONObject.optString(String, String)>
	//   58  118:putfield        #161 <Field String unlikeToken>
			jsonobject = jsonobject.optJSONObject("facebook_dialog_analytics_bundle");
	//   59  121:aload_1         
	//   60  122:ldc2            #455 <String "facebook_dialog_analytics_bundle">
	//   61  125:invokevirtual   #458 <Method JSONObject JSONObject.optJSONObject(String)>
	//   62  128:astore_1        
		}
	//*  63  129:aload_1         
	//*  64  130:ifnull          141
	//*  65  133:aload_0         
	//*  66  134:aload_1         
	//*  67  135:invokestatic    #464 <Method Bundle BundleJSONConverter.convertToBundle(JSONObject)>
	//*  68  138:putfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
	//*  69  141:aload_0         
	//*  70  142:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  71  143:astore_0        
		{
			Log.e(TAG, "Unable to deserialize controller from JSON", ((Throwable) (s)));
	//   72  144:getstatic       #154 <Field String TAG>
	//   73  147:ldc2            #466 <String "Unable to deserialize controller from JSON">
	//   74  150:aload_0         
	//   75  151:invokestatic    #399 <Method int Log.e(String, String, Throwable)>
	//   76  154:pop             
			return null;
	//   77  155:aconst_null     
	//   78  156:areturn         
		}
		if(jsonobject == null)
			break MISSING_BLOCK_LABEL_141;
		s.facebookDialogAnalyticsBundle = BundleJSONConverter.convertToBundle(jsonobject);
		return ((LikeActionController) (s));
	}

	private void fetchVerifiedObjectId(final RequestCompletionCallback completionHandler)
	{
		if(!Utility.isNullOrEmpty(verifiedObjectId))
	//*   0    0:aload_0         
	//*   1    1:getfield        #188 <Field String verifiedObjectId>
	//*   2    4:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*   3    7:ifne            21
		{
			if(completionHandler != null)
	//*   4   10:aload_1         
	//*   5   11:ifnull          20
				completionHandler.onComplete();
	//    6   14:aload_1         
	//    7   15:invokeinterface #471 <Method void LikeActionController$RequestCompletionCallback.onComplete()>
			return;
	//    8   20:return          
		} else
		{
			final GetOGObjectIdRequestWrapper objectIdRequest = new GetOGObjectIdRequestWrapper(objectId, objectType);
	//    9   21:new             #48  <Class LikeActionController$GetOGObjectIdRequestWrapper>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:aload_0         
	//   13   27:getfield        #142 <Field String objectId>
	//   14   30:aload_0         
	//   15   31:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   16   34:invokespecial   #474 <Method void LikeActionController$GetOGObjectIdRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
	//   17   37:astore_2        
			final GetPageIdRequestWrapper pageIdRequest = new GetPageIdRequestWrapper(objectId, objectType);
	//   18   38:new             #54  <Class LikeActionController$GetPageIdRequestWrapper>
	//   19   41:dup             
	//   20   42:aload_0         
	//   21   43:aload_0         
	//   22   44:getfield        #142 <Field String objectId>
	//   23   47:aload_0         
	//   24   48:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   25   51:invokespecial   #475 <Method void LikeActionController$GetPageIdRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
	//   26   54:astore_3        
			GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
	//   27   55:new             #477 <Class GraphRequestBatch>
	//   28   58:dup             
	//   29   59:invokespecial   #478 <Method void GraphRequestBatch()>
	//   30   62:astore          4
			objectIdRequest.addToBatch(graphrequestbatch);
	//   31   64:aload_2         
	//   32   65:aload           4
	//   33   67:invokevirtual   #482 <Method void LikeActionController$GetOGObjectIdRequestWrapper.addToBatch(GraphRequestBatch)>
			pageIdRequest.addToBatch(graphrequestbatch);
	//   34   70:aload_3         
	//   35   71:aload           4
	//   36   73:invokevirtual   #483 <Method void LikeActionController$GetPageIdRequestWrapper.addToBatch(GraphRequestBatch)>
			graphrequestbatch.addCallback(new com.facebook.GraphRequestBatch.Callback() {

				public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
				{
					verifiedObjectId = objectIdRequest.verifiedObjectId;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field LikeActionController this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
				//    4    8:getfield        #41  <Field String LikeActionController$GetOGObjectIdRequestWrapper.verifiedObjectId>
				//    5   11:invokestatic    #45  <Method String LikeActionController.access$1602(LikeActionController, String)>
				//    6   14:pop             
					if(Utility.isNullOrEmpty(verifiedObjectId))
				//*   7   15:aload_0         
				//*   8   16:getfield        #23  <Field LikeActionController this$0>
				//*   9   19:invokestatic    #49  <Method String LikeActionController.access$1600(LikeActionController)>
				//*  10   22:invokestatic    #55  <Method boolean Utility.isNullOrEmpty(String)>
				//*  11   25:ifeq            58
					{
						verifiedObjectId = pageIdRequest.verifiedObjectId;
				//   12   28:aload_0         
				//   13   29:getfield        #23  <Field LikeActionController this$0>
				//   14   32:aload_0         
				//   15   33:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
				//   16   36:getfield        #58  <Field String LikeActionController$GetPageIdRequestWrapper.verifiedObjectId>
				//   17   39:invokestatic    #45  <Method String LikeActionController.access$1602(LikeActionController, String)>
				//   18   42:pop             
						objectIsPage = pageIdRequest.objectIsPage;
				//   19   43:aload_0         
				//   20   44:getfield        #23  <Field LikeActionController this$0>
				//   21   47:aload_0         
				//   22   48:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
				//   23   51:getfield        #62  <Field boolean LikeActionController$GetPageIdRequestWrapper.objectIsPage>
				//   24   54:invokestatic    #66  <Method boolean LikeActionController.access$2302(LikeActionController, boolean)>
				//   25   57:pop             
					}
					if(Utility.isNullOrEmpty(verifiedObjectId))
				//*  26   58:aload_0         
				//*  27   59:getfield        #23  <Field LikeActionController this$0>
				//*  28   62:invokestatic    #49  <Method String LikeActionController.access$1600(LikeActionController)>
				//*  29   65:invokestatic    #55  <Method boolean Utility.isNullOrEmpty(String)>
				//*  30   68:ifeq            137
					{
						Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.TAG, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
							objectId
						});
				//   31   71:getstatic       #72  <Field LoggingBehavior LoggingBehavior.DEVELOPER_ERRORS>
				//   32   74:invokestatic    #76  <Method String LikeActionController.access$100()>
				//   33   77:ldc1            #78  <String "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page">
				//   34   79:iconst_1        
				//   35   80:anewarray       Object[]
				//   36   83:dup             
				//   37   84:iconst_0        
				//   38   85:aload_0         
				//   39   86:getfield        #23  <Field LikeActionController this$0>
				//   40   89:invokestatic    #81  <Method String LikeActionController.access$2200(LikeActionController)>
				//   41   92:aastore         
				//   42   93:invokestatic    #87  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
						LikeActionController likeactioncontroller = LikeActionController.this;
				//   43   96:aload_0         
				//   44   97:getfield        #23  <Field LikeActionController this$0>
				//   45  100:astore_2        
						if(pageIdRequest.getError() != null)
				//*  46  101:aload_0         
				//*  47  102:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
				//*  48  105:invokevirtual   #91  <Method FacebookRequestError LikeActionController$GetPageIdRequestWrapper.getError()>
				//*  49  108:ifnull          122
							graphrequestbatch1 = ((GraphRequestBatch) (pageIdRequest.getError()));
				//   50  111:aload_0         
				//   51  112:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
				//   52  115:invokevirtual   #91  <Method FacebookRequestError LikeActionController$GetPageIdRequestWrapper.getError()>
				//   53  118:astore_1        
						else
				//*  54  119:goto            130
							graphrequestbatch1 = ((GraphRequestBatch) (objectIdRequest.getError()));
				//   55  122:aload_0         
				//   56  123:getfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
				//   57  126:invokevirtual   #92  <Method FacebookRequestError LikeActionController$GetOGObjectIdRequestWrapper.getError()>
				//   58  129:astore_1        
						likeactioncontroller.logAppEventForError("get_verified_id", ((FacebookRequestError) (graphrequestbatch1)));
				//   59  130:aload_2         
				//   60  131:ldc1            #94  <String "get_verified_id">
				//   61  133:aload_1         
				//   62  134:invokestatic    #98  <Method void LikeActionController.access$2400(LikeActionController, String, FacebookRequestError)>
					}
					graphrequestbatch1 = ((GraphRequestBatch) (completionHandler));
				//   63  137:aload_0         
				//   64  138:getfield        #29  <Field LikeActionController$RequestCompletionCallback val$completionHandler>
				//   65  141:astore_1        
					if(graphrequestbatch1 != null)
				//*  66  142:aload_1         
				//*  67  143:ifnull          152
						((RequestCompletionCallback) (graphrequestbatch1)).onComplete();
				//   68  146:aload_1         
				//   69  147:invokeinterface #103 <Method void LikeActionController$RequestCompletionCallback.onComplete()>
				//   70  152:return          
				}

				final LikeActionController this$0;
				final RequestCompletionCallback val$completionHandler;
				final GetOGObjectIdRequestWrapper val$objectIdRequest;
				final GetPageIdRequestWrapper val$pageIdRequest;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field LikeActionController this$0>
				objectIdRequest = getogobjectidrequestwrapper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
				pageIdRequest = getpageidrequestwrapper;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
				completionHandler = requestcompletioncallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field LikeActionController$RequestCompletionCallback val$completionHandler>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   37   76:aload           4
	//   38   78:new             #10  <Class LikeActionController$11>
	//   39   81:dup             
	//   40   82:aload_0         
	//   41   83:aload_2         
	//   42   84:aload_3         
	//   43   85:aload_1         
	//   44   86:invokespecial   #486 <Method void LikeActionController$11(LikeActionController, LikeActionController$GetOGObjectIdRequestWrapper, LikeActionController$GetPageIdRequestWrapper, LikeActionController$RequestCompletionCallback)>
	//   45   89:invokevirtual   #490 <Method void GraphRequestBatch.addCallback(com.facebook.GraphRequestBatch$Callback)>
			graphrequestbatch.executeAsync();
	//   46   92:aload           4
	//   47   94:invokevirtual   #494 <Method com.facebook.GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
	//   48   97:pop             
			return;
	//   49   98:return          
		}
	}

	private AppEventsLogger getAppEventsLogger()
	{
		if(appEventsLogger == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #496 <Field AppEventsLogger appEventsLogger>
	//*   2    4:ifnonnull       17
			appEventsLogger = AppEventsLogger.newLogger(FacebookSdk.getApplicationContext());
	//    3    7:aload_0         
	//    4    8:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//    5   11:invokestatic    #502 <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    6   14:putfield        #496 <Field AppEventsLogger appEventsLogger>
		return appEventsLogger;
	//    7   17:aload_0         
	//    8   18:getfield        #496 <Field AppEventsLogger appEventsLogger>
	//    9   21:areturn         
	}

	private static String getCacheKeyForObjectId(String s)
	{
		Object obj = ((Object) (AccessToken.getCurrentAccessToken()));
	//    0    0:invokestatic    #307 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    1    3:astore_1        
		if(AccessToken.isCurrentAccessTokenActive())
	//*   2    4:invokestatic    #310 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   3    7:ifeq            18
			obj = ((Object) (((AccessToken) (obj)).getToken()));
	//    4   10:aload_1         
	//    5   11:invokevirtual   #505 <Method String AccessToken.getToken()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			obj = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		String s1 = ((String) (obj));
	//   10   20:aload_1         
	//   11   21:astore_2        
		if(obj != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          31
			s1 = Utility.md5hash(((String) (obj)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #508 <Method String Utility.md5hash(String)>
	//   16   30:astore_2        
		return String.format(Locale.ROOT, "%s|%s|com.fb.sdk.like|%d", new Object[] {
			s, Utility.coerceValueIfNullOrEmpty(s1, ""), Integer.valueOf(objectSuffix)
		});
	//   17   31:getstatic       #514 <Field Locale Locale.ROOT>
	//   18   34:ldc2            #516 <String "%s|%s|com.fb.sdk.like|%d">
	//   19   37:iconst_3        
	//   20   38:anewarray       Object[]
	//   21   41:dup             
	//   22   42:iconst_0        
	//   23   43:aload_0         
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_1        
	//   27   47:aload_2         
	//   28   48:ldc2            #518 <String "">
	//   29   51:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   30   54:aastore         
	//   31   55:dup             
	//   32   56:iconst_2        
	//   33   57:getstatic       #242 <Field int objectSuffix>
	//   34   60:invokestatic    #527 <Method Integer Integer.valueOf(int)>
	//   35   63:aastore         
	//   36   64:invokestatic    #533 <Method String String.format(Locale, String, Object[])>
	//   37   67:areturn         
	}

	public static void getControllerForObjectId(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
	{
		if(!isInitialized)
	//*   0    0:getstatic       #536 <Field boolean isInitialized>
	//*   1    3:ifne            9
			performFirstInitialize();
	//    2    6:invokestatic    #539 <Method void performFirstInitialize()>
		LikeActionController likeactioncontroller = getControllerFromInMemoryCache(s);
	//    3    9:aload_0         
	//    4   10:invokestatic    #332 <Method LikeActionController getControllerFromInMemoryCache(String)>
	//    5   13:astore_3        
		if(likeactioncontroller != null)
	//*   6   14:aload_3         
	//*   7   15:ifnull          25
		{
			verifyControllerAndInvokeCallback(likeactioncontroller, objecttype, creationcallback);
	//    8   18:aload_3         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokestatic    #336 <Method void verifyControllerAndInvokeCallback(LikeActionController, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
			return;
	//   12   24:return          
		} else
		{
			diskIOWorkQueue.addActiveWorkItem(((Runnable) (new CreateLikeActionControllerWorkItem(s, objecttype, creationcallback))));
	//   13   25:getstatic       #137 <Field WorkQueue diskIOWorkQueue>
	//   14   28:new             #39  <Class LikeActionController$CreateLikeActionControllerWorkItem>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:invokespecial   #541 <Method void LikeActionController$CreateLikeActionControllerWorkItem(String, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
	//   20   38:invokevirtual   #545 <Method com.facebook.internal.WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   21   41:pop             
			return;
	//   22   42:return          
		}
	}

	private static LikeActionController getControllerFromInMemoryCache(String s)
	{
		s = getCacheKeyForObjectId(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #368 <Method String getCacheKeyForObjectId(String)>
	//    2    4:astore_0        
		LikeActionController likeactioncontroller = (LikeActionController)cache.get(((Object) (s)));
	//    3    5:getstatic       #128 <Field ConcurrentHashMap cache>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #549 <Method Object ConcurrentHashMap.get(Object)>
	//    6   12:checkcast       #2   <Class LikeActionController>
	//    7   15:astore_1        
		if(likeactioncontroller != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          36
			mruCacheWorkQueue.addActiveWorkItem(((Runnable) (new MRUCacheWorkItem(s, false))));
	//   10   20:getstatic       #135 <Field WorkQueue mruCacheWorkQueue>
	//   11   23:new             #63  <Class LikeActionController$MRUCacheWorkItem>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:iconst_0        
	//   15   29:invokespecial   #552 <Method void LikeActionController$MRUCacheWorkItem(String, boolean)>
	//   16   32:invokevirtual   #545 <Method com.facebook.internal.WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   17   35:pop             
		return likeactioncontroller;
	//   18   36:aload_1         
	//   19   37:areturn         
	}

	private ResultProcessor getResultProcessor(Bundle bundle)
	{
		return ((ResultProcessor) (new ResultProcessor(bundle) {

			public void onCancel(AppCall appcall)
			{
				onError(appcall, ((FacebookException) (new FacebookOperationCanceledException())));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:new             #27  <Class FacebookOperationCanceledException>
			//    3    5:dup             
			//    4    6:invokespecial   #30  <Method void FacebookOperationCanceledException()>
			//    5    9:invokevirtual   #34  <Method void onError(AppCall, FacebookException)>
			//    6   12:return          
			}

			public void onError(AppCall appcall, FacebookException facebookexception)
			{
				Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Like Dialog failed with error : %s", new Object[] {
					facebookexception
				});
			//    0    0:getstatic       #40  <Field LoggingBehavior LoggingBehavior.REQUESTS>
			//    1    3:invokestatic    #44  <Method String LikeActionController.access$100()>
			//    2    6:ldc1            #46  <String "Like Dialog failed with error : %s">
			//    3    8:iconst_1        
			//    4    9:anewarray       Object[]
			//    5   12:dup             
			//    6   13:iconst_0        
			//    7   14:aload_2         
			//    8   15:aastore         
			//    9   16:invokestatic    #54  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
				Bundle bundle2 = analyticsParameters;
			//   10   19:aload_0         
			//   11   20:getfield        #19  <Field Bundle val$analyticsParameters>
			//   12   23:astore          4
				Bundle bundle1 = bundle2;
			//   13   25:aload           4
			//   14   27:astore_3        
				if(bundle2 == null)
			//*  15   28:aload           4
			//*  16   30:ifnonnull       41
					bundle1 = new Bundle();
			//   17   33:new             #56  <Class Bundle>
			//   18   36:dup             
			//   19   37:invokespecial   #57  <Method void Bundle()>
			//   20   40:astore_3        
				bundle1.putString("call_id", appcall.getCallId().toString());
			//   21   41:aload_3         
			//   22   42:ldc1            #59  <String "call_id">
			//   23   44:aload_1         
			//   24   45:invokevirtual   #65  <Method UUID AppCall.getCallId()>
			//   25   48:invokevirtual   #70  <Method String UUID.toString()>
			//   26   51:invokevirtual   #74  <Method void Bundle.putString(String, String)>
				logAppEventForError("present_dialog", bundle1);
			//   27   54:aload_0         
			//   28   55:getfield        #17  <Field LikeActionController this$0>
			//   29   58:ldc1            #76  <String "present_dialog">
			//   30   60:aload_3         
			//   31   61:invokestatic    #80  <Method void LikeActionController.access$1400(LikeActionController, String, Bundle)>
				LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", NativeProtocol.createBundleForException(facebookexception));
			//   32   64:aload_0         
			//   33   65:getfield        #17  <Field LikeActionController this$0>
			//   34   68:ldc1            #82  <String "com.facebook.sdk.LikeActionController.DID_ERROR">
			//   35   70:aload_2         
			//   36   71:invokestatic    #88  <Method Bundle NativeProtocol.createBundleForException(FacebookException)>
			//   37   74:invokestatic    #91  <Method void LikeActionController.access$1500(LikeActionController, String, Bundle)>
			//   38   77:return          
			}

			public void onSuccess(AppCall appcall, Bundle bundle1)
			{
				if(bundle1 != null)
			//*   0    0:aload_2         
			//*   1    1:ifnull          203
				{
					if(!bundle1.containsKey("object_is_liked"))
			//*   2    4:aload_2         
			//*   3    5:ldc1            #95  <String "object_is_liked">
			//*   4    7:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
			//*   5   10:ifne            14
						return;
			//    6   13:return          
					boolean flag = bundle1.getBoolean("object_is_liked");
			//    7   14:aload_2         
			//    8   15:ldc1            #95  <String "object_is_liked">
			//    9   17:invokevirtual   #102 <Method boolean Bundle.getBoolean(String)>
			//   10   20:istore_3        
					String s = likeCountStringWithLike;
			//   11   21:aload_0         
			//   12   22:getfield        #17  <Field LikeActionController this$0>
			//   13   25:invokestatic    #106 <Method String LikeActionController.access$700(LikeActionController)>
			//   14   28:astore          4
					String s1 = likeCountStringWithoutLike;
			//   15   30:aload_0         
			//   16   31:getfield        #17  <Field LikeActionController this$0>
			//   17   34:invokestatic    #109 <Method String LikeActionController.access$800(LikeActionController)>
			//   18   37:astore          5
					if(bundle1.containsKey("like_count_string"))
			//*  19   39:aload_2         
			//*  20   40:ldc1            #111 <String "like_count_string">
			//*  21   42:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
			//*  22   45:ifeq            63
					{
						s = bundle1.getString("like_count_string");
			//   23   48:aload_2         
			//   24   49:ldc1            #111 <String "like_count_string">
			//   25   51:invokevirtual   #115 <Method String Bundle.getString(String)>
			//   26   54:astore          4
						s1 = s;
			//   27   56:aload           4
			//   28   58:astore          5
					}
			//*  29   60:goto            63
					String s2 = socialSentenceWithLike;
			//   30   63:aload_0         
			//   31   64:getfield        #17  <Field LikeActionController this$0>
			//   32   67:invokestatic    #118 <Method String LikeActionController.access$900(LikeActionController)>
			//   33   70:astore          6
					String s3 = socialSentenceWithoutLike;
			//   34   72:aload_0         
			//   35   73:getfield        #17  <Field LikeActionController this$0>
			//   36   76:invokestatic    #121 <Method String LikeActionController.access$1000(LikeActionController)>
			//   37   79:astore          7
					if(bundle1.containsKey("social_sentence"))
			//*  38   81:aload_2         
			//*  39   82:ldc1            #123 <String "social_sentence">
			//*  40   84:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
			//*  41   87:ifeq            105
					{
						s2 = bundle1.getString("social_sentence");
			//   42   90:aload_2         
			//   43   91:ldc1            #123 <String "social_sentence">
			//   44   93:invokevirtual   #115 <Method String Bundle.getString(String)>
			//   45   96:astore          6
						s3 = s2;
			//   46   98:aload           6
			//   47  100:astore          7
					}
			//*  48  102:goto            105
					if(bundle1.containsKey("object_is_liked"))
			//*  49  105:aload_2         
			//*  50  106:ldc1            #95  <String "object_is_liked">
			//*  51  108:invokevirtual   #99  <Method boolean Bundle.containsKey(String)>
			//*  52  111:ifeq            124
						bundle1 = ((Bundle) (bundle1.getString("unlike_token")));
			//   53  114:aload_2         
			//   54  115:ldc1            #125 <String "unlike_token">
			//   55  117:invokevirtual   #115 <Method String Bundle.getString(String)>
			//   56  120:astore_2        
					else
			//*  57  121:goto            132
						bundle1 = ((Bundle) (unlikeToken));
			//   58  124:aload_0         
			//   59  125:getfield        #17  <Field LikeActionController this$0>
			//   60  128:invokestatic    #128 <Method String LikeActionController.access$1100(LikeActionController)>
			//   61  131:astore_2        
					Bundle bundle3 = analyticsParameters;
			//   62  132:aload_0         
			//   63  133:getfield        #19  <Field Bundle val$analyticsParameters>
			//   64  136:astore          9
					Bundle bundle2 = bundle3;
			//   65  138:aload           9
			//   66  140:astore          8
					if(bundle3 == null)
			//*  67  142:aload           9
			//*  68  144:ifnonnull       156
						bundle2 = new Bundle();
			//   69  147:new             #56  <Class Bundle>
			//   70  150:dup             
			//   71  151:invokespecial   #57  <Method void Bundle()>
			//   72  154:astore          8
					bundle2.putString("call_id", appcall.getCallId().toString());
			//   73  156:aload           8
			//   74  158:ldc1            #59  <String "call_id">
			//   75  160:aload_1         
			//   76  161:invokevirtual   #65  <Method UUID AppCall.getCallId()>
			//   77  164:invokevirtual   #70  <Method String UUID.toString()>
			//   78  167:invokevirtual   #74  <Method void Bundle.putString(String, String)>
					getAppEventsLogger().logSdkEvent("fb_like_control_dialog_did_succeed", ((Double) (null)), bundle2);
			//   79  170:aload_0         
			//   80  171:getfield        #17  <Field LikeActionController this$0>
			//   81  174:invokestatic    #132 <Method AppEventsLogger LikeActionController.access$1200(LikeActionController)>
			//   82  177:ldc1            #134 <String "fb_like_control_dialog_did_succeed">
			//   83  179:aconst_null     
			//   84  180:aload           8
			//   85  182:invokevirtual   #140 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
					updateState(flag, s, s1, s2, s3, ((String) (bundle1)));
			//   86  185:aload_0         
			//   87  186:getfield        #17  <Field LikeActionController this$0>
			//   88  189:iload_3         
			//   89  190:aload           4
			//   90  192:aload           5
			//   91  194:aload           6
			//   92  196:aload           7
			//   93  198:aload_2         
			//   94  199:invokestatic    #144 <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
					return;
			//   95  202:return          
				} else
				{
					return;
			//   96  203:return          
				}
			}

			final LikeActionController this$0;
			final Bundle val$analyticsParameters;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LikeActionController this$0>
				analyticsParameters = bundle;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #19  <Field Bundle val$analyticsParameters>
				super(final_facebookcallback);
			//    6   10:aload_0         
			//    7   11:aload_2         
			//    8   12:invokespecial   #22  <Method void ResultProcessor(FacebookCallback)>
			//    9   15:return          
			}
		}
));
	//    0    0:new             #22  <Class LikeActionController$6>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:aload_1         
	//    5    7:invokespecial   #557 <Method void LikeActionController$6(LikeActionController, FacebookCallback, Bundle)>
	//    6   10:areturn         
	}

	public static boolean handleOnActivityResult(int i, int j, Intent intent)
	{
		if(Utility.isNullOrEmpty(objectIdForPendingController))
	//*   0    0:getstatic       #561 <Field String objectIdForPendingController>
	//*   1    3:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*   2    6:ifeq            31
			objectIdForPendingController = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getString("PENDING_CONTROLLER_KEY", ((String) (null)));
	//    3    9:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//    4   12:ldc2            #563 <String "com.facebook.LikeActionController.CONTROLLER_STORE_KEY">
	//    5   15:iconst_0        
	//    6   16:invokevirtual   #569 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   19:ldc2            #571 <String "PENDING_CONTROLLER_KEY">
	//    8   22:aconst_null     
	//    9   23:invokeinterface #575 <Method String SharedPreferences.getString(String, String)>
	//   10   28:putstatic       #561 <Field String objectIdForPendingController>
		if(Utility.isNullOrEmpty(objectIdForPendingController))
	//*  11   31:getstatic       #561 <Field String objectIdForPendingController>
	//*  12   34:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*  13   37:ifeq            42
		{
			return false;
	//   14   40:iconst_0        
	//   15   41:ireturn         
		} else
		{
			getControllerForObjectId(objectIdForPendingController, com.facebook.share.widget.LikeView.ObjectType.UNKNOWN, new CreationCallback(i, j, intent) {

				public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
				{
					if(facebookexception == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       21
					{
						likeactioncontroller.onActivityResult(requestCode, resultCode, data);
				//    2    4:aload_1         
				//    3    5:aload_0         
				//    4    6:getfield        #20  <Field int val$requestCode>
				//    5    9:aload_0         
				//    6   10:getfield        #22  <Field int val$resultCode>
				//    7   13:aload_0         
				//    8   14:getfield        #24  <Field Intent val$data>
				//    9   17:invokestatic    #34  <Method void LikeActionController.access$000(LikeActionController, int, int, Intent)>
						return;
				//   10   20:return          
					} else
					{
						Utility.logd(LikeActionController.TAG, ((Exception) (facebookexception)));
				//   11   21:invokestatic    #38  <Method String LikeActionController.access$100()>
				//   12   24:aload_2         
				//   13   25:invokestatic    #44  <Method void Utility.logd(String, Exception)>
						return;
				//   14   28:return          
					}
				}

				final Intent val$data;
				final int val$requestCode;
				final int val$resultCode;

			
			{
				requestCode = i;
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:putfield        #20  <Field int val$requestCode>
				resultCode = j;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #22  <Field int val$resultCode>
				data = intent;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field Intent val$data>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//   16   42:getstatic       #561 <Field String objectIdForPendingController>
	//   17   45:getstatic       #427 <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.UNKNOWN>
	//   18   48:new             #6   <Class LikeActionController$1>
	//   19   51:dup             
	//   20   52:iload_0         
	//   21   53:iload_1         
	//   22   54:aload_2         
	//   23   55:invokespecial   #577 <Method void LikeActionController$1(int, int, Intent)>
	//   24   58:invokestatic    #579 <Method void getControllerForObjectId(String, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
			return true;
	//   25   61:iconst_1        
	//   26   62:ireturn         
		}
	}

	private static void invokeCallbackWithController(CreationCallback creationcallback, LikeActionController likeactioncontroller, FacebookException facebookexception)
	{
		if(creationcallback == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			handler.post(new Runnable(creationcallback, likeactioncontroller, facebookexception) {

				public void run()
				{
					callback.onComplete(controller, error);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field LikeActionController$CreationCallback val$callback>
				//    2    4:aload_0         
				//    3    5:getfield        #22  <Field LikeActionController val$controller>
				//    4    8:aload_0         
				//    5    9:getfield        #24  <Field FacebookException val$error>
				//    6   12:invokeinterface #35  <Method void LikeActionController$CreationCallback.onComplete(LikeActionController, FacebookException)>
				//    7   17:return          
				}

				final CreationCallback val$callback;
				final LikeActionController val$controller;
				final FacebookException val$error;

			
			{
				callback = creationcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field LikeActionController$CreationCallback val$callback>
				controller = likeactioncontroller;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field LikeActionController val$controller>
				error = facebookexception;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #24  <Field FacebookException val$error>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    3    5:getstatic       #350 <Field Handler handler>
	//    4    8:new             #18  <Class LikeActionController$4>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokespecial   #581 <Method void LikeActionController$4(LikeActionController$CreationCallback, LikeActionController, FacebookException)>
	//   10   18:invokevirtual   #358 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
			return;
	//   12   22:return          
		}
	}

	private void logAppEventForError(String s, Bundle bundle)
	{
		bundle = new Bundle(bundle);
	//    0    0:new             #270 <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokespecial   #583 <Method void Bundle(Bundle)>
	//    4    8:astore_2        
		bundle.putString("object_id", objectId);
	//    5    9:aload_2         
	//    6   10:ldc2            #417 <String "object_id">
	//    7   13:aload_0         
	//    8   14:getfield        #142 <Field String objectId>
	//    9   17:invokevirtual   #279 <Method void Bundle.putString(String, String)>
		bundle.putString("object_type", objectType.toString());
	//   10   20:aload_2         
	//   11   21:ldc2            #422 <String "object_type">
	//   12   24:aload_0         
	//   13   25:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   14   28:invokevirtual   #586 <Method String com.facebook.share.widget.LikeView$ObjectType.toString()>
	//   15   31:invokevirtual   #279 <Method void Bundle.putString(String, String)>
		bundle.putString("current_action", s);
	//   16   34:aload_2         
	//   17   35:ldc2            #588 <String "current_action">
	//   18   38:aload_1         
	//   19   39:invokevirtual   #279 <Method void Bundle.putString(String, String)>
		getAppEventsLogger().logSdkEvent("fb_like_control_error", ((Double) (null)), bundle);
	//   20   42:aload_0         
	//   21   43:invokespecial   #169 <Method AppEventsLogger getAppEventsLogger()>
	//   22   46:ldc2            #590 <String "fb_like_control_error">
	//   23   49:aconst_null     
	//   24   50:aload_2         
	//   25   51:invokevirtual   #594 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   26   54:return          
	}

	private void logAppEventForError(String s, FacebookRequestError facebookrequesterror)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #270 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #271 <Method void Bundle()>
	//    3    7:astore_3        
		if(facebookrequesterror != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          52
		{
			facebookrequesterror = ((FacebookRequestError) (facebookrequesterror.getRequestResult()));
	//    6   12:aload_2         
	//    7   13:invokevirtual   #600 <Method JSONObject FacebookRequestError.getRequestResult()>
	//    8   16:astore_2        
			if(facebookrequesterror != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          52
			{
				if(!(facebookrequesterror instanceof JSONObject))
	//*  11   21:aload_2         
	//*  12   22:instanceof      #411 <Class JSONObject>
	//*  13   25:ifne            36
					facebookrequesterror = ((FacebookRequestError) (((JSONObject) (facebookrequesterror)).toString()));
	//   14   28:aload_2         
	//   15   29:invokevirtual   #601 <Method String JSONObject.toString()>
	//   16   32:astore_2        
				else
	//*  17   33:goto            44
					facebookrequesterror = ((FacebookRequestError) (JSONObjectInstrumentation.toString((JSONObject)facebookrequesterror)));
	//   18   36:aload_2         
	//   19   37:checkcast       #411 <Class JSONObject>
	//   20   40:invokestatic    #604 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   21   43:astore_2        
				bundle.putString("error", ((String) (facebookrequesterror)));
	//   22   44:aload_3         
	//   23   45:ldc2            #606 <String "error">
	//   24   48:aload_2         
	//   25   49:invokevirtual   #279 <Method void Bundle.putString(String, String)>
			}
		}
		logAppEventForError(s, bundle);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:aload_3         
	//   29   55:invokespecial   #181 <Method void logAppEventForError(String, Bundle)>
	//   30   58:return          
	}

	private void onActivityResult(int i, int j, Intent intent)
	{
		ShareInternalUtility.handleActivityResult(i, j, intent, getResultProcessor(facebookDialogAnalyticsBundle));
	//    0    0:iload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:aload_0         
	//    5    5:getfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
	//    6    8:invokespecial   #608 <Method ResultProcessor getResultProcessor(Bundle)>
	//    7   11:invokestatic    #614 <Method boolean ShareInternalUtility.handleActivityResult(int, int, Intent, ResultProcessor)>
	//    8   14:pop             
		clearState();
	//    9   15:aload_0         
	//   10   16:invokespecial   #616 <Method void clearState()>
	//   11   19:return          
	}

	private static void performFirstInitialize()
	{
		com/facebook/share/internal/LikeActionController;
	//    0    0:ldc1            #2   <Class LikeActionController>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag = isInitialized;
	//    2    3:getstatic       #536 <Field boolean isInitialized>
	//    3    6:istore_0        
		if(!flag)
			break MISSING_BLOCK_LABEL_15;
	//    4    7:iload_0         
	//    5    8:ifeq            15
		com/facebook/share/internal/LikeActionController;
	//    6   11:ldc1            #2   <Class LikeActionController>
		JVM INSTR monitorexit ;
	//    7   13:monitorexit     
		return;
	//    8   14:return          
		handler = new Handler(Looper.getMainLooper());
	//    9   15:new             #354 <Class Handler>
	//   10   18:dup             
	//   11   19:invokestatic    #622 <Method Looper Looper.getMainLooper()>
	//   12   22:invokespecial   #625 <Method void Handler(Looper)>
	//   13   25:putstatic       #350 <Field Handler handler>
		objectSuffix = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).getInt("OBJECT_SUFFIX", 1);
	//   14   28:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//   15   31:ldc2            #563 <String "com.facebook.LikeActionController.CONTROLLER_STORE_KEY">
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #569 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   18   38:ldc2            #627 <String "OBJECT_SUFFIX">
	//   19   41:iconst_1        
	//   20   42:invokeinterface #630 <Method int SharedPreferences.getInt(String, int)>
	//   21   47:putstatic       #242 <Field int objectSuffix>
		controllerDiskCache = new FileLruCache(TAG, new com.facebook.internal.FileLruCache.Limits());
	//   22   50:new             #370 <Class FileLruCache>
	//   23   53:dup             
	//   24   54:getstatic       #154 <Field String TAG>
	//   25   57:new             #632 <Class com.facebook.internal.FileLruCache$Limits>
	//   26   60:dup             
	//   27   61:invokespecial   #633 <Method void com.facebook.internal.FileLruCache$Limits()>
	//   28   64:invokespecial   #636 <Method void FileLruCache(String, com.facebook.internal.FileLruCache$Limits)>
	//   29   67:putstatic       #250 <Field FileLruCache controllerDiskCache>
		registerAccessTokenTracker();
	//   30   70:invokestatic    #639 <Method void registerAccessTokenTracker()>
		CallbackManagerImpl.registerStaticCallback(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), new com.facebook.internal.CallbackManagerImpl.Callback() {

			public boolean onActivityResult(int i, Intent intent)
			{
				return LikeActionController.handleOnActivityResult(com.facebook.internal.CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), i, intent);
			//    0    0:getstatic       #23  <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Like>
			//    1    3:invokevirtual   #27  <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
			//    2    6:iload_1         
			//    3    7:aload_2         
			//    4    8:invokestatic    #31  <Method boolean LikeActionController.handleOnActivityResult(int, int, Intent)>
			//    5   11:ireturn         
			}

		}
);
	//   31   73:getstatic       #645 <Field com.facebook.internal.CallbackManagerImpl$RequestCodeOffset com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.Like>
	//   32   76:invokevirtual   #648 <Method int com.facebook.internal.CallbackManagerImpl$RequestCodeOffset.toRequestCode()>
	//   33   79:new             #16  <Class LikeActionController$3>
	//   34   82:dup             
	//   35   83:invokespecial   #649 <Method void LikeActionController$3()>
	//   36   86:invokestatic    #655 <Method void CallbackManagerImpl.registerStaticCallback(int, com.facebook.internal.CallbackManagerImpl$Callback)>
		isInitialized = true;
	//   37   89:iconst_1        
	//   38   90:putstatic       #536 <Field boolean isInitialized>
		com/facebook/share/internal/LikeActionController;
	//   39   93:ldc1            #2   <Class LikeActionController>
		JVM INSTR monitorexit ;
	//   40   95:monitorexit     
		return;
	//   41   96:return          
		Exception exception;
		exception;
	//   42   97:astore_1        
	//*  43   98:ldc1            #2   <Class LikeActionController>
		throw exception;
	//   44  100:monitorexit     
	//   45  101:aload_1         
	//   46  102:athrow          
	}

	private void presentLikeDialog(Activity activity, FragmentWrapper fragmentwrapper, Bundle bundle)
	{
		String s;
		if(LikeDialog.canShowNativeDialog())
	//*   0    0:invokestatic    #662 <Method boolean LikeDialog.canShowNativeDialog()>
	//*   1    3:ifeq            14
			s = "fb_like_control_did_present_dialog";
	//    2    6:ldc2            #664 <String "fb_like_control_did_present_dialog">
	//    3    9:astore          4
		else
	//*   4   11:goto            55
		if(LikeDialog.canShowWebFallback())
	//*   5   14:invokestatic    #667 <Method boolean LikeDialog.canShowWebFallback()>
	//*   6   17:ifeq            28
		{
			s = "fb_like_control_did_present_fallback_dialog";
	//    7   20:ldc2            #669 <String "fb_like_control_did_present_fallback_dialog">
	//    8   23:astore          4
		} else
	//*   9   25:goto            55
		{
			logAppEventForError("present_dialog", bundle);
	//   10   28:aload_0         
	//   11   29:ldc2            #671 <String "present_dialog">
	//   12   32:aload_3         
	//   13   33:invokespecial   #181 <Method void logAppEventForError(String, Bundle)>
			Utility.logd(TAG, "Cannot show the Like Dialog on this device.");
	//   14   36:getstatic       #154 <Field String TAG>
	//   15   39:ldc2            #673 <String "Cannot show the Like Dialog on this device.">
	//   16   42:invokestatic    #676 <Method void Utility.logd(String, String)>
			broadcastAction(((LikeActionController) (null)), "com.facebook.sdk.LikeActionController.UPDATED");
	//   17   45:aconst_null     
	//   18   46:ldc2            #678 <String "com.facebook.sdk.LikeActionController.UPDATED">
	//   19   49:invokestatic    #254 <Method void broadcastAction(LikeActionController, String)>
			s = null;
	//   20   52:aconst_null     
	//   21   53:astore          4
		}
		if(s != null)
	//*  22   55:aload           4
	//*  23   57:ifnull          163
		{
			Object obj = ((Object) (objectType));
	//   24   60:aload_0         
	//   25   61:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   26   64:astore          4
			if(obj != null)
	//*  27   66:aload           4
	//*  28   68:ifnull          81
				obj = ((Object) (((com.facebook.share.widget.LikeView.ObjectType) (obj)).toString()));
	//   29   71:aload           4
	//   30   73:invokevirtual   #586 <Method String com.facebook.share.widget.LikeView$ObjectType.toString()>
	//   31   76:astore          4
			else
	//*  32   78:goto            89
				obj = ((Object) (com.facebook.share.widget.LikeView.ObjectType.UNKNOWN.toString()));
	//   33   81:getstatic       #427 <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.UNKNOWN>
	//   34   84:invokevirtual   #586 <Method String com.facebook.share.widget.LikeView$ObjectType.toString()>
	//   35   87:astore          4
			obj = ((Object) ((new LikeContent.Builder()).setObjectId(objectId).setObjectType(((String) (obj))).build()));
	//   36   89:new             #680 <Class LikeContent$Builder>
	//   37   92:dup             
	//   38   93:invokespecial   #681 <Method void LikeContent$Builder()>
	//   39   96:aload_0         
	//   40   97:getfield        #142 <Field String objectId>
	//   41  100:invokevirtual   #685 <Method LikeContent$Builder LikeContent$Builder.setObjectId(String)>
	//   42  103:aload           4
	//   43  105:invokevirtual   #688 <Method LikeContent$Builder LikeContent$Builder.setObjectType(String)>
	//   44  108:invokevirtual   #692 <Method LikeContent LikeContent$Builder.build()>
	//   45  111:astore          4
			if(fragmentwrapper != null)
	//*  46  113:aload_2         
	//*  47  114:ifnull          133
				(new LikeDialog(fragmentwrapper)).show(((LikeContent) (obj)));
	//   48  117:new             #659 <Class LikeDialog>
	//   49  120:dup             
	//   50  121:aload_2         
	//   51  122:invokespecial   #695 <Method void LikeDialog(FragmentWrapper)>
	//   52  125:aload           4
	//   53  127:invokevirtual   #699 <Method void LikeDialog.show(LikeContent)>
			else
	//*  54  130:goto            146
				(new LikeDialog(activity)).show(((LikeContent) (obj)));
	//   55  133:new             #659 <Class LikeDialog>
	//   56  136:dup             
	//   57  137:aload_1         
	//   58  138:invokespecial   #702 <Method void LikeDialog(Activity)>
	//   59  141:aload           4
	//   60  143:invokevirtual   #699 <Method void LikeDialog.show(LikeContent)>
			saveState(bundle);
	//   61  146:aload_0         
	//   62  147:aload_3         
	//   63  148:invokespecial   #705 <Method void saveState(Bundle)>
			getAppEventsLogger().logSdkEvent("fb_like_control_did_present_dialog", ((Double) (null)), bundle);
	//   64  151:aload_0         
	//   65  152:invokespecial   #169 <Method AppEventsLogger getAppEventsLogger()>
	//   66  155:ldc2            #664 <String "fb_like_control_did_present_dialog">
	//   67  158:aconst_null     
	//   68  159:aload_3         
	//   69  160:invokevirtual   #594 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
		}
	//   70  163:return          
	}

	private void publishAgainIfNeeded(Bundle bundle)
	{
		boolean flag = isObjectLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field boolean isObjectLiked>
	//    2    4:istore_2        
		if(flag != isObjectLikedOnServer && !publishLikeOrUnlikeAsync(flag, bundle))
	//*   3    5:iload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #209 <Field boolean isObjectLikedOnServer>
	//*   6   10:icmpeq          32
	//*   7   13:aload_0         
	//*   8   14:iload_2         
	//*   9   15:aload_1         
	//*  10   16:invokespecial   #709 <Method boolean publishLikeOrUnlikeAsync(boolean, Bundle)>
	//*  11   19:ifne            32
			publishDidError(isObjectLiked ^ true);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #228 <Field boolean isObjectLiked>
	//   15   27:iconst_1        
	//   16   28:ixor            
	//   17   29:invokespecial   #201 <Method void publishDidError(boolean)>
	//   18   32:return          
	}

	private void publishDidError(boolean flag)
	{
		updateLikeState(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #712 <Method void updateLikeState(boolean)>
		Bundle bundle = new Bundle();
	//    3    5:new             #270 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #271 <Method void Bundle()>
	//    6   12:astore_2        
		bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Unable to publish the like/unlike action");
	//    7   13:aload_2         
	//    8   14:ldc2            #714 <String "com.facebook.platform.status.ERROR_DESCRIPTION">
	//    9   17:ldc2            #716 <String "Unable to publish the like/unlike action">
	//   10   20:invokevirtual   #279 <Method void Bundle.putString(String, String)>
		broadcastAction(this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
	//   11   23:aload_0         
	//   12   24:ldc2            #718 <String "com.facebook.sdk.LikeActionController.DID_ERROR">
	//   13   27:aload_2         
	//   14   28:invokestatic    #185 <Method void broadcastAction(LikeActionController, String, Bundle)>
	//   15   31:return          
	}

	private void publishLikeAsync(final Bundle analyticsParameters)
	{
		isPendingLikeOrUnlike = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #195 <Field boolean isPendingLikeOrUnlike>
		fetchVerifiedObjectId(new RequestCompletionCallback() {

			public void onComplete()
			{
				if(Utility.isNullOrEmpty(verifiedObjectId))
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field LikeActionController this$0>
			//*   2    4:invokestatic    #32  <Method String LikeActionController.access$1600(LikeActionController)>
			//*   3    7:invokestatic    #38  <Method boolean Utility.isNullOrEmpty(String)>
			//*   4   10:ifeq            40
				{
					Bundle bundle = new Bundle();
			//    5   13:new             #40  <Class Bundle>
			//    6   16:dup             
			//    7   17:invokespecial   #41  <Method void Bundle()>
			//    8   20:astore_1        
					bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
			//    9   21:aload_1         
			//   10   22:ldc1            #43  <String "com.facebook.platform.status.ERROR_DESCRIPTION">
			//   11   24:ldc1            #45  <String "Invalid Object Id">
			//   12   26:invokevirtual   #49  <Method void Bundle.putString(String, String)>
					LikeActionController.broadcastAction(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
			//   13   29:aload_0         
			//   14   30:getfield        #21  <Field LikeActionController this$0>
			//   15   33:ldc1            #51  <String "com.facebook.sdk.LikeActionController.DID_ERROR">
			//   16   35:aload_1         
			//   17   36:invokestatic    #55  <Method void LikeActionController.access$1500(LikeActionController, String, Bundle)>
					return;
			//   18   39:return          
				} else
				{
					GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
			//   19   40:new             #57  <Class GraphRequestBatch>
			//   20   43:dup             
			//   21   44:invokespecial   #58  <Method void GraphRequestBatch()>
			//   22   47:astore_1        
					Object obj = ((Object) (LikeActionController.this));
			//   23   48:aload_0         
			//   24   49:getfield        #21  <Field LikeActionController this$0>
			//   25   52:astore_2        
					obj = ((Object) (((PublishLikeRequestWrapper) (obj)). new PublishLikeRequestWrapper(((LikeActionController) (obj)).verifiedObjectId, objectType)));
			//   26   53:new             #60  <Class LikeActionController$PublishLikeRequestWrapper>
			//   27   56:dup             
			//   28   57:aload_2         
			//   29   58:aload_2         
			//   30   59:invokestatic    #32  <Method String LikeActionController.access$1600(LikeActionController)>
			//   31   62:aload_0         
			//   32   63:getfield        #21  <Field LikeActionController this$0>
			//   33   66:invokestatic    #64  <Method com.facebook.share.widget.LikeView$ObjectType LikeActionController.access$1700(LikeActionController)>
			//   34   69:invokespecial   #67  <Method void LikeActionController$PublishLikeRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
			//   35   72:astore_2        
					((PublishLikeRequestWrapper) (obj)).addToBatch(graphrequestbatch);
			//   36   73:aload_2         
			//   37   74:aload_1         
			//   38   75:invokevirtual   #71  <Method void LikeActionController$PublishLikeRequestWrapper.addToBatch(GraphRequestBatch)>
					graphrequestbatch.addCallback(((_cls1) (obj)). new com.facebook.GraphRequestBatch.Callback() {

						public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
						{
							isPendingLikeOrUnlike = false;
						//    0    0:aload_0         
						//    1    1:getfield        #19  <Field LikeActionController$7 this$1>
						//    2    4:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//    3    7:iconst_0        
						//    4    8:invokestatic    #36  <Method boolean LikeActionController.access$1802(LikeActionController, boolean)>
						//    5   11:pop             
							if(likeRequest.getError() != null)
						//*   6   12:aload_0         
						//*   7   13:getfield        #21  <Field LikeActionController$PublishLikeRequestWrapper val$likeRequest>
						//*   8   16:invokevirtual   #42  <Method FacebookRequestError LikeActionController$PublishLikeRequestWrapper.getError()>
						//*   9   19:ifnull          34
							{
								publishDidError(false);
						//   10   22:aload_0         
						//   11   23:getfield        #19  <Field LikeActionController$7 this$1>
						//   12   26:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//   13   29:iconst_0        
						//   14   30:invokestatic    #46  <Method void LikeActionController.access$1900(LikeActionController, boolean)>
								return;
						//   15   33:return          
							} else
							{
								unlikeToken = Utility.coerceValueIfNullOrEmpty(likeRequest.unlikeToken, ((String) (null)));
						//   16   34:aload_0         
						//   17   35:getfield        #19  <Field LikeActionController$7 this$1>
						//   18   38:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//   19   41:aload_0         
						//   20   42:getfield        #21  <Field LikeActionController$PublishLikeRequestWrapper val$likeRequest>
						//   21   45:getfield        #50  <Field String LikeActionController$PublishLikeRequestWrapper.unlikeToken>
						//   22   48:aconst_null     
						//   23   49:invokestatic    #56  <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
						//   24   52:invokestatic    #60  <Method String LikeActionController.access$1102(LikeActionController, String)>
						//   25   55:pop             
								isObjectLikedOnServer = true;
						//   26   56:aload_0         
						//   27   57:getfield        #19  <Field LikeActionController$7 this$1>
						//   28   60:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//   29   63:iconst_1        
						//   30   64:invokestatic    #63  <Method boolean LikeActionController.access$2002(LikeActionController, boolean)>
						//   31   67:pop             
								getAppEventsLogger().logSdkEvent("fb_like_control_did_like", ((Double) (null)), analyticsParameters);
						//   32   68:aload_0         
						//   33   69:getfield        #19  <Field LikeActionController$7 this$1>
						//   34   72:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//   35   75:invokestatic    #67  <Method AppEventsLogger LikeActionController.access$1200(LikeActionController)>
						//   36   78:ldc1            #69  <String "fb_like_control_did_like">
						//   37   80:aconst_null     
						//   38   81:aload_0         
						//   39   82:getfield        #19  <Field LikeActionController$7 this$1>
						//   40   85:getfield        #73  <Field Bundle LikeActionController$7.val$analyticsParameters>
						//   41   88:invokevirtual   #79  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
								publishAgainIfNeeded(analyticsParameters);
						//   42   91:aload_0         
						//   43   92:getfield        #19  <Field LikeActionController$7 this$1>
						//   44   95:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
						//   45   98:aload_0         
						//   46   99:getfield        #19  <Field LikeActionController$7 this$1>
						//   47  102:getfield        #73  <Field Bundle LikeActionController$7.val$analyticsParameters>
						//   48  105:invokestatic    #83  <Method void LikeActionController.access$2100(LikeActionController, Bundle)>
								return;
						//   49  108:return          
							}
						}

						final _cls7 this$1;
						final PublishLikeRequestWrapper val$likeRequest;

			
			{
				this$1 = final__pcls7;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LikeActionController$7 this$1>
				likeRequest = PublishLikeRequestWrapper.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field LikeActionController$PublishLikeRequestWrapper val$likeRequest>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
					}
);
			//   39   78:aload_1         
			//   40   79:new             #13  <Class LikeActionController$7$1>
			//   41   82:dup             
			//   42   83:aload_0         
			//   43   84:aload_2         
			//   44   85:invokespecial   #74  <Method void LikeActionController$7$1(LikeActionController$7, LikeActionController$PublishLikeRequestWrapper)>
			//   45   88:invokevirtual   #78  <Method void GraphRequestBatch.addCallback(com.facebook.GraphRequestBatch$Callback)>
					graphrequestbatch.executeAsync();
			//   46   91:aload_1         
			//   47   92:invokevirtual   #82  <Method com.facebook.GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
			//   48   95:pop             
					return;
			//   49   96:return          
				}
			}

			final LikeActionController this$0;
			final Bundle val$analyticsParameters;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LikeActionController this$0>
				analyticsParameters = bundle;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field Bundle val$analyticsParameters>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    3    5:aload_0         
	//    4    6:new             #24  <Class LikeActionController$7>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #721 <Method void LikeActionController$7(LikeActionController, Bundle)>
	//    9   15:invokespecial   #723 <Method void fetchVerifiedObjectId(LikeActionController$RequestCompletionCallback)>
	//   10   18:return          
	}

	private boolean publishLikeOrUnlikeAsync(boolean flag, Bundle bundle)
	{
		if(canUseOGPublish())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #725 <Method boolean canUseOGPublish()>
	//*   2    4:ifeq            35
		{
			if(flag)
	//*   3    7:iload_1         
	//*   4    8:ifeq            18
			{
				publishLikeAsync(bundle);
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:invokespecial   #727 <Method void publishLikeAsync(Bundle)>
				return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
			}
			if(!Utility.isNullOrEmpty(unlikeToken))
	//*  10   18:aload_0         
	//*  11   19:getfield        #161 <Field String unlikeToken>
	//*  12   22:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*  13   25:ifne            35
			{
				publishUnlikeAsync(bundle);
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokespecial   #730 <Method void publishUnlikeAsync(Bundle)>
				return true;
	//   17   33:iconst_1        
	//   18   34:ireturn         
			}
		}
		return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
	}

	private void publishUnlikeAsync(final Bundle analyticsParameters)
	{
		isPendingLikeOrUnlike = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #195 <Field boolean isPendingLikeOrUnlike>
		GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
	//    3    5:new             #477 <Class GraphRequestBatch>
	//    4    8:dup             
	//    5    9:invokespecial   #478 <Method void GraphRequestBatch()>
	//    6   12:astore_2        
		final PublishUnlikeRequestWrapper unlikeRequest = new PublishUnlikeRequestWrapper(unlikeToken);
	//    7   13:new             #69  <Class LikeActionController$PublishUnlikeRequestWrapper>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #161 <Field String unlikeToken>
	//   12   22:invokespecial   #732 <Method void LikeActionController$PublishUnlikeRequestWrapper(LikeActionController, String)>
	//   13   25:astore_3        
		unlikeRequest.addToBatch(graphrequestbatch);
	//   14   26:aload_3         
	//   15   27:aload_2         
	//   16   28:invokevirtual   #733 <Method void LikeActionController$PublishUnlikeRequestWrapper.addToBatch(GraphRequestBatch)>
		graphrequestbatch.addCallback(new com.facebook.GraphRequestBatch.Callback() {

			public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
			{
				isPendingLikeOrUnlike = false;
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field LikeActionController this$0>
			//    2    4:iconst_0        
			//    3    5:invokestatic    #35  <Method boolean LikeActionController.access$1802(LikeActionController, boolean)>
			//    4    8:pop             
				if(unlikeRequest.getError() != null)
			//*   5    9:aload_0         
			//*   6   10:getfield        #23  <Field LikeActionController$PublishUnlikeRequestWrapper val$unlikeRequest>
			//*   7   13:invokevirtual   #41  <Method FacebookRequestError LikeActionController$PublishUnlikeRequestWrapper.getError()>
			//*   8   16:ifnull          28
				{
					publishDidError(true);
			//    9   19:aload_0         
			//   10   20:getfield        #21  <Field LikeActionController this$0>
			//   11   23:iconst_1        
			//   12   24:invokestatic    #45  <Method void LikeActionController.access$1900(LikeActionController, boolean)>
					return;
			//   13   27:return          
				} else
				{
					unlikeToken = null;
			//   14   28:aload_0         
			//   15   29:getfield        #21  <Field LikeActionController this$0>
			//   16   32:aconst_null     
			//   17   33:invokestatic    #49  <Method String LikeActionController.access$1102(LikeActionController, String)>
			//   18   36:pop             
					isObjectLikedOnServer = false;
			//   19   37:aload_0         
			//   20   38:getfield        #21  <Field LikeActionController this$0>
			//   21   41:iconst_0        
			//   22   42:invokestatic    #52  <Method boolean LikeActionController.access$2002(LikeActionController, boolean)>
			//   23   45:pop             
					getAppEventsLogger().logSdkEvent("fb_like_control_did_unlike", ((Double) (null)), analyticsParameters);
			//   24   46:aload_0         
			//   25   47:getfield        #21  <Field LikeActionController this$0>
			//   26   50:invokestatic    #56  <Method AppEventsLogger LikeActionController.access$1200(LikeActionController)>
			//   27   53:ldc1            #58  <String "fb_like_control_did_unlike">
			//   28   55:aconst_null     
			//   29   56:aload_0         
			//   30   57:getfield        #25  <Field Bundle val$analyticsParameters>
			//   31   60:invokevirtual   #64  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
					publishAgainIfNeeded(analyticsParameters);
			//   32   63:aload_0         
			//   33   64:getfield        #21  <Field LikeActionController this$0>
			//   34   67:aload_0         
			//   35   68:getfield        #25  <Field Bundle val$analyticsParameters>
			//   36   71:invokestatic    #68  <Method void LikeActionController.access$2100(LikeActionController, Bundle)>
					return;
			//   37   74:return          
				}
			}

			final LikeActionController this$0;
			final Bundle val$analyticsParameters;
			final PublishUnlikeRequestWrapper val$unlikeRequest;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LikeActionController this$0>
				unlikeRequest = publishunlikerequestwrapper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field LikeActionController$PublishUnlikeRequestWrapper val$unlikeRequest>
				analyticsParameters = bundle;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field Bundle val$analyticsParameters>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   17   31:aload_2         
	//   18   32:new             #28  <Class LikeActionController$8>
	//   19   35:dup             
	//   20   36:aload_0         
	//   21   37:aload_3         
	//   22   38:aload_1         
	//   23   39:invokespecial   #736 <Method void LikeActionController$8(LikeActionController, LikeActionController$PublishUnlikeRequestWrapper, Bundle)>
	//   24   42:invokevirtual   #490 <Method void GraphRequestBatch.addCallback(com.facebook.GraphRequestBatch$Callback)>
		graphrequestbatch.executeAsync();
	//   25   45:aload_2         
	//   26   46:invokevirtual   #494 <Method com.facebook.GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
	//   27   49:pop             
	//   28   50:return          
	}

	private static void putControllerInMemoryCache(String s, LikeActionController likeactioncontroller)
	{
		s = getCacheKeyForObjectId(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #368 <Method String getCacheKeyForObjectId(String)>
	//    2    4:astore_0        
		mruCacheWorkQueue.addActiveWorkItem(((Runnable) (new MRUCacheWorkItem(s, true))));
	//    3    5:getstatic       #135 <Field WorkQueue mruCacheWorkQueue>
	//    4    8:new             #63  <Class LikeActionController$MRUCacheWorkItem>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #552 <Method void LikeActionController$MRUCacheWorkItem(String, boolean)>
	//    9   17:invokevirtual   #545 <Method com.facebook.internal.WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   10   20:pop             
		cache.put(((Object) (s)), ((Object) (likeactioncontroller)));
	//   11   21:getstatic       #128 <Field ConcurrentHashMap cache>
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #740 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void refreshStatusAsync()
	{
		if(!AccessToken.isCurrentAccessTokenActive())
	//*   0    0:invokestatic    #310 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   1    3:ifne            11
		{
			refreshStatusViaService();
	//    2    6:aload_0         
	//    3    7:invokespecial   #743 <Method void refreshStatusViaService()>
			return;
	//    4   10:return          
		} else
		{
			fetchVerifiedObjectId(new RequestCompletionCallback() {

				public void onComplete()
				{
					static class _cls12
					{

						static final int $SwitchMap$com$facebook$share$widget$LikeView$ObjectType[];

						static 
						{
							$SwitchMap$com$facebook$share$widget$LikeView$ObjectType = new int[com.facebook.share.widget.LikeView.ObjectType.values().length];
						//    0    0:invokestatic    #18  <Method com.facebook.share.widget.LikeView$ObjectType[] com.facebook.share.widget.LikeView$ObjectType.values()>
						//    1    3:arraylength     
						//    2    4:newarray        int[]
						//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$ObjectType>
							try
							{
								$SwitchMap$com$facebook$share$widget$LikeView$ObjectType[com.facebook.share.widget.LikeView.ObjectType.PAGE.ordinal()] = 1;
						//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$ObjectType>
						//    5   12:getstatic       #24  <Field com.facebook.share.widget.LikeView$ObjectType com.facebook.share.widget.LikeView$ObjectType.PAGE>
						//    6   15:invokevirtual   #28  <Method int com.facebook.share.widget.LikeView$ObjectType.ordinal()>
						//    7   18:iconst_1        
						//    8   19:iastore         
						//    9   20:return          
							}
							catch(NoSuchFieldError nosuchfielderror) { }
						//   10   21:astore_0        
						//*  11   22:return          
						}
					}

					final Object likeRequestWrapper;
					if(_cls12..SwitchMap.com.facebook.share.widget.LikeView.ObjectType[objectType.ordinal()] != 1)
				//*   0    0:getstatic       #29  <Field int[] LikeActionController$12.$SwitchMap$com$facebook$share$widget$LikeView$ObjectType>
				//*   1    3:aload_0         
				//*   2    4:getfield        #19  <Field LikeActionController this$0>
				//*   3    7:invokestatic    #33  <Method com.facebook.share.widget.LikeView$ObjectType LikeActionController.access$1700(LikeActionController)>
				//*   4   10:invokevirtual   #39  <Method int com.facebook.share.widget.LikeView$ObjectType.ordinal()>
				//*   5   13:iaload          
				//*   6   14:iconst_1        
				//*   7   15:icmpeq          46
					{
						likeRequestWrapper = ((Object) (LikeActionController.this));
				//    8   18:aload_0         
				//    9   19:getfield        #19  <Field LikeActionController this$0>
				//   10   22:astore_1        
						likeRequestWrapper = ((Object) (((GetOGObjectLikesRequestWrapper) (likeRequestWrapper)). new GetOGObjectLikesRequestWrapper(((LikeActionController) (likeRequestWrapper)).verifiedObjectId, objectType)));
				//   11   23:new             #41  <Class LikeActionController$GetOGObjectLikesRequestWrapper>
				//   12   26:dup             
				//   13   27:aload_1         
				//   14   28:aload_1         
				//   15   29:invokestatic    #45  <Method String LikeActionController.access$1600(LikeActionController)>
				//   16   32:aload_0         
				//   17   33:getfield        #19  <Field LikeActionController this$0>
				//   18   36:invokestatic    #33  <Method com.facebook.share.widget.LikeView$ObjectType LikeActionController.access$1700(LikeActionController)>
				//   19   39:invokespecial   #48  <Method void LikeActionController$GetOGObjectLikesRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
				//   20   42:astore_1        
					} else
				//*  21   43:goto            64
					{
						likeRequestWrapper = ((Object) (LikeActionController.this));
				//   22   46:aload_0         
				//   23   47:getfield        #19  <Field LikeActionController this$0>
				//   24   50:astore_1        
						likeRequestWrapper = ((Object) (((GetPageLikesRequestWrapper) (likeRequestWrapper)). new GetPageLikesRequestWrapper(((LikeActionController) (likeRequestWrapper)).verifiedObjectId)));
				//   25   51:new             #50  <Class LikeActionController$GetPageLikesRequestWrapper>
				//   26   54:dup             
				//   27   55:aload_1         
				//   28   56:aload_1         
				//   29   57:invokestatic    #45  <Method String LikeActionController.access$1600(LikeActionController)>
				//   30   60:invokespecial   #53  <Method void LikeActionController$GetPageLikesRequestWrapper(LikeActionController, String)>
				//   31   63:astore_1        
					}
					Object obj = ((Object) (LikeActionController.this));
				//   32   64:aload_0         
				//   33   65:getfield        #19  <Field LikeActionController this$0>
				//   34   68:astore_2        
					obj = ((Object) (((GetEngagementRequestWrapper) (obj)). new GetEngagementRequestWrapper(((LikeActionController) (obj)).verifiedObjectId, objectType)));
				//   35   69:new             #55  <Class LikeActionController$GetEngagementRequestWrapper>
				//   36   72:dup             
				//   37   73:aload_2         
				//   38   74:aload_2         
				//   39   75:invokestatic    #45  <Method String LikeActionController.access$1600(LikeActionController)>
				//   40   78:aload_0         
				//   41   79:getfield        #19  <Field LikeActionController this$0>
				//   42   82:invokestatic    #33  <Method com.facebook.share.widget.LikeView$ObjectType LikeActionController.access$1700(LikeActionController)>
				//   43   85:invokespecial   #56  <Method void LikeActionController$GetEngagementRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
				//   44   88:astore_2        
					GraphRequestBatch graphrequestbatch = new GraphRequestBatch();
				//   45   89:new             #58  <Class GraphRequestBatch>
				//   46   92:dup             
				//   47   93:invokespecial   #59  <Method void GraphRequestBatch()>
				//   48   96:astore_3        
					((LikeRequestWrapper) (likeRequestWrapper)).addToBatch(graphrequestbatch);
				//   49   97:aload_1         
				//   50   98:aload_3         
				//   51   99:invokeinterface #65  <Method void LikeActionController$LikeRequestWrapper.addToBatch(GraphRequestBatch)>
					((GetEngagementRequestWrapper) (obj)).addToBatch(graphrequestbatch);
				//   52  104:aload_2         
				//   53  105:aload_3         
				//   54  106:invokevirtual   #66  <Method void LikeActionController$GetEngagementRequestWrapper.addToBatch(GraphRequestBatch)>
					graphrequestbatch.addCallback(((_cls1) (obj)). new com.facebook.GraphRequestBatch.Callback() {

						public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
						{
							if(likeRequestWrapper.getError() == null && engagementRequest.getError() == null)
						//*   0    0:aload_0         
						//*   1    1:getfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
						//*   2    4:invokeinterface #36  <Method FacebookRequestError LikeActionController$LikeRequestWrapper.getError()>
						//*   3    9:ifnonnull       82
						//*   4   12:aload_0         
						//*   5   13:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
						//*   6   16:invokevirtual   #39  <Method FacebookRequestError LikeActionController$GetEngagementRequestWrapper.getError()>
						//*   7   19:ifnull          25
						//*   8   22:goto            82
							{
								updateState(likeRequestWrapper.isObjectLiked(), engagementRequest.likeCountStringWithLike, engagementRequest.likeCountStringWithoutLike, engagementRequest.socialSentenceStringWithLike, engagementRequest.socialSentenceStringWithoutLike, likeRequestWrapper.getUnlikeToken());
						//    9   25:aload_0         
						//   10   26:getfield        #21  <Field LikeActionController$9 this$1>
						//   11   29:getfield        #43  <Field LikeActionController LikeActionController$9.this$0>
						//   12   32:aload_0         
						//   13   33:getfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
						//   14   36:invokeinterface #47  <Method boolean LikeActionController$LikeRequestWrapper.isObjectLiked()>
						//   15   41:aload_0         
						//   16   42:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
						//   17   45:getfield        #51  <Field String LikeActionController$GetEngagementRequestWrapper.likeCountStringWithLike>
						//   18   48:aload_0         
						//   19   49:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
						//   20   52:getfield        #54  <Field String LikeActionController$GetEngagementRequestWrapper.likeCountStringWithoutLike>
						//   21   55:aload_0         
						//   22   56:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
						//   23   59:getfield        #57  <Field String LikeActionController$GetEngagementRequestWrapper.socialSentenceStringWithLike>
						//   24   62:aload_0         
						//   25   63:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
						//   26   66:getfield        #60  <Field String LikeActionController$GetEngagementRequestWrapper.socialSentenceStringWithoutLike>
						//   27   69:aload_0         
						//   28   70:getfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
						//   29   73:invokeinterface #64  <Method String LikeActionController$LikeRequestWrapper.getUnlikeToken()>
						//   30   78:invokestatic    #70  <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
								return;
						//   31   81:return          
							} else
							{
								Logger.log(LoggingBehavior.REQUESTS, LikeActionController.TAG, "Unable to refresh like state for id: '%s'", new Object[] {
									objectId
								});
						//   32   82:getstatic       #76  <Field LoggingBehavior LoggingBehavior.REQUESTS>
						//   33   85:invokestatic    #79  <Method String LikeActionController.access$100()>
						//   34   88:ldc1            #81  <String "Unable to refresh like state for id: '%s'">
						//   35   90:iconst_1        
						//   36   91:anewarray       Object[]
						//   37   94:dup             
						//   38   95:iconst_0        
						//   39   96:aload_0         
						//   40   97:getfield        #21  <Field LikeActionController$9 this$1>
						//   41  100:getfield        #43  <Field LikeActionController LikeActionController$9.this$0>
						//   42  103:invokestatic    #85  <Method String LikeActionController.access$2200(LikeActionController)>
						//   43  106:aastore         
						//   44  107:invokestatic    #91  <Method void Logger.log(LoggingBehavior, String, String, Object[])>
								return;
						//   45  110:return          
							}
						}

						final _cls9 this$1;
						final GetEngagementRequestWrapper val$engagementRequest;
						final LikeRequestWrapper val$likeRequestWrapper;

			
			{
				this$1 = final__pcls9;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field LikeActionController$9 this$1>
				likeRequestWrapper = likerequestwrapper;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
				engagementRequest = GetEngagementRequestWrapper.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #27  <Method void Object()>
			//   11   19:return          
			}
					}
);
				//   55  109:aload_3         
				//   56  110:new             #13  <Class LikeActionController$9$1>
				//   57  113:dup             
				//   58  114:aload_0         
				//   59  115:aload_1         
				//   60  116:aload_2         
				//   61  117:invokespecial   #69  <Method void LikeActionController$9$1(LikeActionController$9, LikeActionController$LikeRequestWrapper, LikeActionController$GetEngagementRequestWrapper)>
				//   62  120:invokevirtual   #73  <Method void GraphRequestBatch.addCallback(com.facebook.GraphRequestBatch$Callback)>
					graphrequestbatch.executeAsync();
				//   63  123:aload_3         
				//   64  124:invokevirtual   #77  <Method com.facebook.GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
				//   65  127:pop             
				//   66  128:return          
				}

				final LikeActionController this$0;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LikeActionController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    5   11:aload_0         
	//    6   12:new             #30  <Class LikeActionController$9>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokespecial   #744 <Method void LikeActionController$9(LikeActionController)>
	//   10   20:invokespecial   #723 <Method void fetchVerifiedObjectId(LikeActionController$RequestCompletionCallback)>
			return;
	//   11   23:return          
		}
	}

	private void refreshStatusViaService()
	{
		LikeStatusClient likestatusclient = new LikeStatusClient(FacebookSdk.getApplicationContext(), FacebookSdk.getApplicationId(), objectId);
	//    0    0:new             #746 <Class LikeStatusClient>
	//    1    3:dup             
	//    2    4:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//    3    7:invokestatic    #749 <Method String FacebookSdk.getApplicationId()>
	//    4   10:aload_0         
	//    5   11:getfield        #142 <Field String objectId>
	//    6   14:invokespecial   #752 <Method void LikeStatusClient(Context, String, String)>
	//    7   17:astore_1        
		if(!likestatusclient.start())
	//*   8   18:aload_1         
	//*   9   19:invokevirtual   #755 <Method boolean LikeStatusClient.start()>
	//*  10   22:ifne            26
		{
			return;
	//   11   25:return          
		} else
		{
			likestatusclient.setCompletedListener(new com.facebook.internal.PlatformServiceClient.CompletedListener() {

				public void completed(Bundle bundle)
				{
					if(bundle != null)
				//*   0    0:aload_1         
				//*   1    1:ifnull          179
					{
						if(!bundle.containsKey("com.facebook.platform.extra.OBJECT_IS_LIKED"))
				//*   2    4:aload_1         
				//*   3    5:ldc1            #24  <String "com.facebook.platform.extra.OBJECT_IS_LIKED">
				//*   4    7:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*   5   10:ifne            14
							return;
				//    6   13:return          
						boolean flag = bundle.getBoolean("com.facebook.platform.extra.OBJECT_IS_LIKED");
				//    7   14:aload_1         
				//    8   15:ldc1            #24  <String "com.facebook.platform.extra.OBJECT_IS_LIKED">
				//    9   17:invokevirtual   #33  <Method boolean Bundle.getBoolean(String)>
				//   10   20:istore_2        
						String s;
						if(bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE"))
				//*  11   21:aload_1         
				//*  12   22:ldc1            #35  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE">
				//*  13   24:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*  14   27:ifeq            40
							s = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE");
				//   15   30:aload_1         
				//   16   31:ldc1            #35  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITH_LIKE">
				//   17   33:invokevirtual   #39  <Method String Bundle.getString(String)>
				//   18   36:astore_3        
						else
				//*  19   37:goto            48
							s = likeCountStringWithLike;
				//   20   40:aload_0         
				//   21   41:getfield        #17  <Field LikeActionController this$0>
				//   22   44:invokestatic    #43  <Method String LikeActionController.access$700(LikeActionController)>
				//   23   47:astore_3        
						String s1;
						if(bundle.containsKey("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE"))
				//*  24   48:aload_1         
				//*  25   49:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
				//*  26   51:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*  27   54:ifeq            68
							s1 = bundle.getString("com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE");
				//   28   57:aload_1         
				//   29   58:ldc1            #45  <String "com.facebook.platform.extra.LIKE_COUNT_STRING_WITHOUT_LIKE">
				//   30   60:invokevirtual   #39  <Method String Bundle.getString(String)>
				//   31   63:astore          4
						else
				//*  32   65:goto            77
							s1 = likeCountStringWithoutLike;
				//   33   68:aload_0         
				//   34   69:getfield        #17  <Field LikeActionController this$0>
				//   35   72:invokestatic    #48  <Method String LikeActionController.access$800(LikeActionController)>
				//   36   75:astore          4
						String s2;
						if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE"))
				//*  37   77:aload_1         
				//*  38   78:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
				//*  39   80:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*  40   83:ifeq            97
							s2 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE");
				//   41   86:aload_1         
				//   42   87:ldc1            #50  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITH_LIKE">
				//   43   89:invokevirtual   #39  <Method String Bundle.getString(String)>
				//   44   92:astore          5
						else
				//*  45   94:goto            106
							s2 = socialSentenceWithLike;
				//   46   97:aload_0         
				//   47   98:getfield        #17  <Field LikeActionController this$0>
				//   48  101:invokestatic    #53  <Method String LikeActionController.access$900(LikeActionController)>
				//   49  104:astore          5
						String s3;
						if(bundle.containsKey("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE"))
				//*  50  106:aload_1         
				//*  51  107:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
				//*  52  109:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*  53  112:ifeq            126
							s3 = bundle.getString("com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE");
				//   54  115:aload_1         
				//   55  116:ldc1            #55  <String "com.facebook.platform.extra.SOCIAL_SENTENCE_WITHOUT_LIKE">
				//   56  118:invokevirtual   #39  <Method String Bundle.getString(String)>
				//   57  121:astore          6
						else
				//*  58  123:goto            135
							s3 = socialSentenceWithoutLike;
				//   59  126:aload_0         
				//   60  127:getfield        #17  <Field LikeActionController this$0>
				//   61  130:invokestatic    #58  <Method String LikeActionController.access$1000(LikeActionController)>
				//   62  133:astore          6
						if(bundle.containsKey("com.facebook.platform.extra.UNLIKE_TOKEN"))
				//*  63  135:aload_1         
				//*  64  136:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
				//*  65  138:invokevirtual   #30  <Method boolean Bundle.containsKey(String)>
				//*  66  141:ifeq            154
							bundle = ((Bundle) (bundle.getString("com.facebook.platform.extra.UNLIKE_TOKEN")));
				//   67  144:aload_1         
				//   68  145:ldc1            #60  <String "com.facebook.platform.extra.UNLIKE_TOKEN">
				//   69  147:invokevirtual   #39  <Method String Bundle.getString(String)>
				//   70  150:astore_1        
						else
				//*  71  151:goto            162
							bundle = ((Bundle) (unlikeToken));
				//   72  154:aload_0         
				//   73  155:getfield        #17  <Field LikeActionController this$0>
				//   74  158:invokestatic    #63  <Method String LikeActionController.access$1100(LikeActionController)>
				//   75  161:astore_1        
						updateState(flag, s, s1, s2, s3, ((String) (bundle)));
				//   76  162:aload_0         
				//   77  163:getfield        #17  <Field LikeActionController this$0>
				//   78  166:iload_2         
				//   79  167:aload_3         
				//   80  168:aload           4
				//   81  170:aload           5
				//   82  172:aload           6
				//   83  174:aload_1         
				//   84  175:invokestatic    #67  <Method void LikeActionController.access$1300(LikeActionController, boolean, String, String, String, String, String)>
						return;
				//   85  178:return          
					} else
					{
						return;
				//   86  179:return          
					}
				}

				final LikeActionController this$0;

			
			{
				this$0 = LikeActionController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LikeActionController this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   12   26:aload_1         
	//   13   27:new             #8   <Class LikeActionController$10>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #756 <Method void LikeActionController$10(LikeActionController)>
	//   17   35:invokevirtual   #760 <Method void LikeStatusClient.setCompletedListener(com.facebook.internal.PlatformServiceClient$CompletedListener)>
			return;
	//   18   38:return          
		}
	}

	private static void registerAccessTokenTracker()
	{
		accessTokenTracker = ((AccessTokenTracker) (new AccessTokenTracker() {

			protected void onCurrentAccessTokenChanged(AccessToken accesstoken, AccessToken accesstoken1)
			{
				accesstoken = ((AccessToken) (FacebookSdk.getApplicationContext()));
			//    0    0:invokestatic    #21  <Method Context FacebookSdk.getApplicationContext()>
			//    1    3:astore_1        
				if(accesstoken1 == null)
			//*   2    4:aload_2         
			//*   3    5:ifnonnull       60
				{
					LikeActionController.objectSuffix = (LikeActionController.objectSuffix + 1) % 1000;
			//    4    8:invokestatic    #25  <Method int LikeActionController.access$300()>
			//    5   11:iconst_1        
			//    6   12:iadd            
			//    7   13:sipush          1000
			//    8   16:irem            
			//    9   17:invokestatic    #29  <Method int LikeActionController.access$302(int)>
			//   10   20:pop             
					((Context) (accesstoken)).getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putInt("OBJECT_SUFFIX", LikeActionController.objectSuffix).apply();
			//   11   21:aload_1         
			//   12   22:ldc1            #31  <String "com.facebook.LikeActionController.CONTROLLER_STORE_KEY">
			//   13   24:iconst_0        
			//   14   25:invokevirtual   #37  <Method SharedPreferences Context.getSharedPreferences(String, int)>
			//   15   28:invokeinterface #43  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
			//   16   33:ldc1            #45  <String "OBJECT_SUFFIX">
			//   17   35:invokestatic    #25  <Method int LikeActionController.access$300()>
			//   18   38:invokeinterface #51  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
			//   19   43:invokeinterface #54  <Method void android.content.SharedPreferences$Editor.apply()>
					LikeActionController.cache.clear();
			//   20   48:invokestatic    #58  <Method ConcurrentHashMap LikeActionController.access$400()>
			//   21   51:invokevirtual   #63  <Method void ConcurrentHashMap.clear()>
					LikeActionController.controllerDiskCache.clearCache();
			//   22   54:invokestatic    #67  <Method FileLruCache LikeActionController.access$500()>
			//   23   57:invokevirtual   #72  <Method void FileLruCache.clearCache()>
				}
				LikeActionController.broadcastAction(((LikeActionController) (null)), "com.facebook.sdk.LikeActionController.DID_RESET");
			//   24   60:aconst_null     
			//   25   61:ldc1            #74  <String "com.facebook.sdk.LikeActionController.DID_RESET">
			//   26   63:invokestatic    #78  <Method void LikeActionController.access$600(LikeActionController, String)>
			//   27   66:return          
			}

		}
));
	//    0    0:new             #20  <Class LikeActionController$5>
	//    1    3:dup             
	//    2    4:invokespecial   #761 <Method void LikeActionController$5()>
	//    3    7:putstatic       #763 <Field AccessTokenTracker accessTokenTracker>
	//    4   10:return          
	}

	private void saveState(Bundle bundle)
	{
		storeObjectIdForPendingController(objectId);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String objectId>
	//    2    4:invokestatic    #328 <Method void storeObjectIdForPendingController(String)>
		facebookDialogAnalyticsBundle = bundle;
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:putfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
		serializeToDiskAsync(this);
	//    6   12:aload_0         
	//    7   13:invokestatic    #344 <Method void serializeToDiskAsync(LikeActionController)>
	//    8   16:return          
	}

	private static void serializeToDiskAsync(LikeActionController likeactioncontroller)
	{
		String s = serializeToJson(likeactioncontroller);
	//    0    0:aload_0         
	//    1    1:invokestatic    #766 <Method String serializeToJson(LikeActionController)>
	//    2    4:astore_1        
		likeactioncontroller = ((LikeActionController) (getCacheKeyForObjectId(likeactioncontroller.objectId)));
	//    3    5:aload_0         
	//    4    6:getfield        #142 <Field String objectId>
	//    5    9:invokestatic    #368 <Method String getCacheKeyForObjectId(String)>
	//    6   12:astore_0        
		if(!Utility.isNullOrEmpty(s) && !Utility.isNullOrEmpty(((String) (likeactioncontroller))))
	//*   7   13:aload_1         
	//*   8   14:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*   9   17:ifne            43
	//*  10   20:aload_0         
	//*  11   21:invokestatic    #384 <Method boolean Utility.isNullOrEmpty(String)>
	//*  12   24:ifne            43
			diskIOWorkQueue.addActiveWorkItem(((Runnable) (new SerializeToDiskWorkItem(((String) (likeactioncontroller)), s))));
	//   13   27:getstatic       #137 <Field WorkQueue diskIOWorkQueue>
	//   14   30:new             #78  <Class LikeActionController$SerializeToDiskWorkItem>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:invokespecial   #768 <Method void LikeActionController$SerializeToDiskWorkItem(String, String)>
	//   19   39:invokevirtual   #545 <Method com.facebook.internal.WorkQueue$WorkItem WorkQueue.addActiveWorkItem(Runnable)>
	//   20   42:pop             
	//   21   43:return          
	}

	private static void serializeToDiskSynchronously(String s, String s1)
	{
		String s2;
		String s3;
		s2 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		s3 = null;
	//    2    2:aconst_null     
	//    3    3:astore_3        
		s = ((String) (controllerDiskCache.openPutStream(s)));
	//    4    4:getstatic       #250 <Field FileLruCache controllerDiskCache>
	//    5    7:aload_0         
	//    6    8:invokevirtual   #772 <Method OutputStream FileLruCache.openPutStream(String)>
	//    7   11:astore_0        
		s3 = s;
	//    8   12:aload_0         
	//    9   13:astore_3        
		s2 = s;
	//   10   14:aload_0         
	//   11   15:astore_2        
		((OutputStream) (s)).write(s1.getBytes());
	//   12   16:aload_0         
	//   13   17:aload_1         
	//   14   18:invokevirtual   #776 <Method byte[] String.getBytes()>
	//   15   21:invokevirtual   #782 <Method void OutputStream.write(byte[])>
		if(s == null) goto _L2; else goto _L1
	//   16   24:aload_0         
	//   17   25:ifnull          60
_L1:
		Utility.closeQuietly(((java.io.Closeable) (s)));
	//   18   28:aload_0         
	//   19   29:invokestatic    #391 <Method void Utility.closeQuietly(java.io.Closeable)>
		return;
	//   20   32:return          
		s;
	//   21   33:astore_0        
		break MISSING_BLOCK_LABEL_61;
	//   22   34:goto            61
		s;
	//   23   37:astore_0        
		s3 = s2;
	//   24   38:aload_2         
	//   25   39:astore_3        
		Log.e(TAG, "Unable to serialize controller to disk", ((Throwable) (s)));
	//   26   40:getstatic       #154 <Field String TAG>
	//   27   43:ldc2            #784 <String "Unable to serialize controller to disk">
	//   28   46:aload_0         
	//   29   47:invokestatic    #399 <Method int Log.e(String, String, Throwable)>
	//   30   50:pop             
		if(s2 == null)
			break; /* Loop/switch isn't completed */
	//   31   51:aload_2         
	//   32   52:ifnull          60
		s = s2;
	//   33   55:aload_2         
	//   34   56:astore_0        
		if(true) goto _L1; else goto _L2
	//   35   57:goto            28
_L2:
		return;
	//   36   60:return          
		if(s3 != null)
	//*  37   61:aload_3         
	//*  38   62:ifnull          69
			Utility.closeQuietly(((java.io.Closeable) (s3)));
	//   39   65:aload_3         
	//   40   66:invokestatic    #391 <Method void Utility.closeQuietly(java.io.Closeable)>
		throw s;
	//   41   69:aload_0         
	//   42   70:athrow          
	}

	private static String serializeToJson(LikeActionController likeactioncontroller)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #411 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #785 <Method void JSONObject()>
	//    3    7:astore_1        
		jsonobject.put("com.facebook.share.internal.LikeActionController.version", 3);
	//    4    8:aload_1         
	//    5    9:ldc2            #409 <String "com.facebook.share.internal.LikeActionController.version">
	//    6   12:iconst_3        
	//    7   13:invokevirtual   #788 <Method JSONObject JSONObject.put(String, int)>
	//    8   16:pop             
		jsonobject.put("object_id", ((Object) (likeactioncontroller.objectId)));
	//    9   17:aload_1         
	//   10   18:ldc2            #417 <String "object_id">
	//   11   21:aload_0         
	//   12   22:getfield        #142 <Field String objectId>
	//   13   25:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   14   28:pop             
		jsonobject.put("object_type", likeactioncontroller.objectType.getValue());
	//   15   29:aload_1         
	//   16   30:ldc2            #422 <String "object_type">
	//   17   33:aload_0         
	//   18   34:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   19   37:invokevirtual   #430 <Method int com.facebook.share.widget.LikeView$ObjectType.getValue()>
	//   20   40:invokevirtual   #788 <Method JSONObject JSONObject.put(String, int)>
	//   21   43:pop             
		jsonobject.put("like_count_string_with_like", ((Object) (likeactioncontroller.likeCountStringWithLike)));
	//   22   44:aload_1         
	//   23   45:ldc2            #436 <String "like_count_string_with_like">
	//   24   48:aload_0         
	//   25   49:getfield        #257 <Field String likeCountStringWithLike>
	//   26   52:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   27   55:pop             
		jsonobject.put("like_count_string_without_like", ((Object) (likeactioncontroller.likeCountStringWithoutLike)));
	//   28   56:aload_1         
	//   29   57:ldc2            #442 <String "like_count_string_without_like">
	//   30   60:aload_0         
	//   31   61:getfield        #260 <Field String likeCountStringWithoutLike>
	//   32   64:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   33   67:pop             
		jsonobject.put("social_sentence_with_like", ((Object) (likeactioncontroller.socialSentenceWithLike)));
	//   34   68:aload_1         
	//   35   69:ldc2            #444 <String "social_sentence_with_like">
	//   36   72:aload_0         
	//   37   73:getfield        #263 <Field String socialSentenceWithLike>
	//   38   76:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   39   79:pop             
		jsonobject.put("social_sentence_without_like", ((Object) (likeactioncontroller.socialSentenceWithoutLike)));
	//   40   80:aload_1         
	//   41   81:ldc2            #446 <String "social_sentence_without_like">
	//   42   84:aload_0         
	//   43   85:getfield        #158 <Field String socialSentenceWithoutLike>
	//   44   88:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   45   91:pop             
		jsonobject.put("is_object_liked", likeactioncontroller.isObjectLiked);
	//   46   92:aload_1         
	//   47   93:ldc2            #448 <String "is_object_liked">
	//   48   96:aload_0         
	//   49   97:getfield        #228 <Field boolean isObjectLiked>
	//   50  100:invokevirtual   #794 <Method JSONObject JSONObject.put(String, boolean)>
	//   51  103:pop             
		jsonobject.put("unlike_token", ((Object) (likeactioncontroller.unlikeToken)));
	//   52  104:aload_1         
	//   53  105:ldc2            #453 <String "unlike_token">
	//   54  108:aload_0         
	//   55  109:getfield        #161 <Field String unlikeToken>
	//   56  112:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   57  115:pop             
		if(likeactioncontroller.facebookDialogAnalyticsBundle == null)
			break MISSING_BLOCK_LABEL_144;
	//   58  116:aload_0         
	//   59  117:getfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
	//   60  120:ifnull          144
		likeactioncontroller = ((LikeActionController) (BundleJSONConverter.convertToJSON(likeactioncontroller.facebookDialogAnalyticsBundle)));
	//   61  123:aload_0         
	//   62  124:getfield        #325 <Field Bundle facebookDialogAnalyticsBundle>
	//   63  127:invokestatic    #798 <Method JSONObject BundleJSONConverter.convertToJSON(Bundle)>
	//   64  130:astore_0        
		if(likeactioncontroller != null)
	//*  65  131:aload_0         
	//*  66  132:ifnull          144
			try
			{
				jsonobject.put("facebook_dialog_analytics_bundle", ((Object) (likeactioncontroller)));
	//   67  135:aload_1         
	//   68  136:ldc2            #455 <String "facebook_dialog_analytics_bundle">
	//   69  139:aload_0         
	//   70  140:invokevirtual   #791 <Method JSONObject JSONObject.put(String, Object)>
	//   71  143:pop             
			}
	//*  72  144:aload_1         
	//*  73  145:instanceof      #411 <Class JSONObject>
	//*  74  148:ifne            156
	//*  75  151:aload_1         
	//*  76  152:invokevirtual   #601 <Method String JSONObject.toString()>
	//*  77  155:areturn         
	//*  78  156:aload_1         
	//*  79  157:checkcast       #411 <Class JSONObject>
	//*  80  160:invokestatic    #604 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//*  81  163:areturn         
			// Misplaced declaration of an exception variable
			catch(LikeActionController likeactioncontroller)
	//*  82  164:astore_0        
			{
				Log.e(TAG, "Unable to serialize controller to JSON", ((Throwable) (likeactioncontroller)));
	//   83  165:getstatic       #154 <Field String TAG>
	//   84  168:ldc2            #800 <String "Unable to serialize controller to JSON">
	//   85  171:aload_0         
	//   86  172:invokestatic    #399 <Method int Log.e(String, String, Throwable)>
	//   87  175:pop             
				return null;
	//   88  176:aconst_null     
	//   89  177:areturn         
			}
		if(!(jsonobject instanceof JSONObject))
			return jsonobject.toString();
		else
			return JSONObjectInstrumentation.toString((JSONObject)jsonobject);
	}

	private static void storeObjectIdForPendingController(String s)
	{
		objectIdForPendingController = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #561 <Field String objectIdForPendingController>
		FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.LikeActionController.CONTROLLER_STORE_KEY", 0).edit().putString("PENDING_CONTROLLER_KEY", objectIdForPendingController).apply();
	//    2    4:invokestatic    #289 <Method Context FacebookSdk.getApplicationContext()>
	//    3    7:ldc2            #563 <String "com.facebook.LikeActionController.CONTROLLER_STORE_KEY">
	//    4   10:iconst_0        
	//    5   11:invokevirtual   #569 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   14:invokeinterface #804 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   19:ldc2            #571 <String "PENDING_CONTROLLER_KEY">
	//    8   22:getstatic       #561 <Field String objectIdForPendingController>
	//    9   25:invokeinterface #809 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   10   30:invokeinterface #812 <Method void android.content.SharedPreferences$Editor.apply()>
	//   11   35:return          
	}

	private void updateLikeState(boolean flag)
	{
		updateState(flag, likeCountStringWithLike, likeCountStringWithoutLike, socialSentenceWithLike, socialSentenceWithoutLike, unlikeToken);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #257 <Field String likeCountStringWithLike>
	//    4    6:aload_0         
	//    5    7:getfield        #260 <Field String likeCountStringWithoutLike>
	//    6   10:aload_0         
	//    7   11:getfield        #263 <Field String socialSentenceWithLike>
	//    8   14:aload_0         
	//    9   15:getfield        #158 <Field String socialSentenceWithoutLike>
	//   10   18:aload_0         
	//   11   19:getfield        #161 <Field String unlikeToken>
	//   12   22:invokespecial   #175 <Method void updateState(boolean, String, String, String, String, String)>
	//   13   25:return          
	}

	private void updateState(boolean flag, String s, String s1, String s2, String s3, String s4)
	{
		s = Utility.coerceValueIfNullOrEmpty(s, ((String) (null)));
	//    0    0:aload_2         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//    3    5:astore_2        
		s1 = Utility.coerceValueIfNullOrEmpty(s1, ((String) (null)));
	//    4    6:aload_3         
	//    5    7:aconst_null     
	//    6    8:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//    7   11:astore_3        
		s2 = Utility.coerceValueIfNullOrEmpty(s2, ((String) (null)));
	//    8   12:aload           4
	//    9   14:aconst_null     
	//   10   15:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   11   18:astore          4
		s3 = Utility.coerceValueIfNullOrEmpty(s3, ((String) (null)));
	//   12   20:aload           5
	//   13   22:aconst_null     
	//   14   23:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   15   26:astore          5
		s4 = Utility.coerceValueIfNullOrEmpty(s4, ((String) (null)));
	//   16   28:aload           6
	//   17   30:aconst_null     
	//   18   31:invokestatic    #521 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   19   34:astore          6
		boolean flag1;
		if(flag == isObjectLiked && Utility.areObjectsEqual(((Object) (s)), ((Object) (likeCountStringWithLike))) && Utility.areObjectsEqual(((Object) (s1)), ((Object) (likeCountStringWithoutLike))) && Utility.areObjectsEqual(((Object) (s2)), ((Object) (socialSentenceWithLike))) && Utility.areObjectsEqual(((Object) (s3)), ((Object) (socialSentenceWithoutLike))) && Utility.areObjectsEqual(((Object) (s4)), ((Object) (unlikeToken))))
	//*  20   36:iload_1         
	//*  21   37:aload_0         
	//*  22   38:getfield        #228 <Field boolean isObjectLiked>
	//*  23   41:icmpne          111
	//*  24   44:aload_2         
	//*  25   45:aload_0         
	//*  26   46:getfield        #257 <Field String likeCountStringWithLike>
	//*  27   49:invokestatic    #816 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  28   52:ifeq            111
	//*  29   55:aload_3         
	//*  30   56:aload_0         
	//*  31   57:getfield        #260 <Field String likeCountStringWithoutLike>
	//*  32   60:invokestatic    #816 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  33   63:ifeq            111
	//*  34   66:aload           4
	//*  35   68:aload_0         
	//*  36   69:getfield        #263 <Field String socialSentenceWithLike>
	//*  37   72:invokestatic    #816 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  38   75:ifeq            111
	//*  39   78:aload           5
	//*  40   80:aload_0         
	//*  41   81:getfield        #158 <Field String socialSentenceWithoutLike>
	//*  42   84:invokestatic    #816 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  43   87:ifeq            111
	//*  44   90:aload           6
	//*  45   92:aload_0         
	//*  46   93:getfield        #161 <Field String unlikeToken>
	//*  47   96:invokestatic    #816 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  48   99:ifne            105
	//*  49  102:goto            111
			flag1 = false;
	//   50  105:iconst_0        
	//   51  106:istore          7
		else
	//*  52  108:goto            114
			flag1 = true;
	//   53  111:iconst_1        
	//   54  112:istore          7
		if(!flag1)
	//*  55  114:iload           7
	//*  56  116:ifne            120
		{
			return;
	//   57  119:return          
		} else
		{
			isObjectLiked = flag;
	//   58  120:aload_0         
	//   59  121:iload_1         
	//   60  122:putfield        #228 <Field boolean isObjectLiked>
			likeCountStringWithLike = s;
	//   61  125:aload_0         
	//   62  126:aload_2         
	//   63  127:putfield        #257 <Field String likeCountStringWithLike>
			likeCountStringWithoutLike = s1;
	//   64  130:aload_0         
	//   65  131:aload_3         
	//   66  132:putfield        #260 <Field String likeCountStringWithoutLike>
			socialSentenceWithLike = s2;
	//   67  135:aload_0         
	//   68  136:aload           4
	//   69  138:putfield        #263 <Field String socialSentenceWithLike>
			socialSentenceWithoutLike = s3;
	//   70  141:aload_0         
	//   71  142:aload           5
	//   72  144:putfield        #158 <Field String socialSentenceWithoutLike>
			unlikeToken = s4;
	//   73  147:aload_0         
	//   74  148:aload           6
	//   75  150:putfield        #161 <Field String unlikeToken>
			serializeToDiskAsync(this);
	//   76  153:aload_0         
	//   77  154:invokestatic    #344 <Method void serializeToDiskAsync(LikeActionController)>
			broadcastAction(this, "com.facebook.sdk.LikeActionController.UPDATED");
	//   78  157:aload_0         
	//   79  158:ldc2            #678 <String "com.facebook.sdk.LikeActionController.UPDATED">
	//   80  161:invokestatic    #254 <Method void broadcastAction(LikeActionController, String)>
			return;
	//   81  164:return          
		}
	}

	private static void verifyControllerAndInvokeCallback(LikeActionController likeactioncontroller, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
	{
		com.facebook.share.widget.LikeView.ObjectType objecttype1 = ShareInternalUtility.getMostSpecificObjectType(objecttype, likeactioncontroller.objectType);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//    3    5:invokestatic    #820 <Method com.facebook.share.widget.LikeView$ObjectType ShareInternalUtility.getMostSpecificObjectType(com.facebook.share.widget.LikeView$ObjectType, com.facebook.share.widget.LikeView$ObjectType)>
	//    4    8:astore_3        
		if(objecttype1 == null)
	//*   5    9:aload_3         
	//*   6   10:ifnonnull       57
		{
			likeactioncontroller = ((LikeActionController) (new FacebookException("Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"", new Object[] {
				likeactioncontroller.objectId, likeactioncontroller.objectType.toString(), objecttype.toString()
			})));
	//    7   13:new             #822 <Class FacebookException>
	//    8   16:dup             
	//    9   17:ldc2            #824 <String "Object with id:\"%s\" is already marked as type:\"%s\". Cannot change the type to:\"%s\"">
	//   10   20:iconst_3        
	//   11   21:anewarray       Object[]
	//   12   24:dup             
	//   13   25:iconst_0        
	//   14   26:aload_0         
	//   15   27:getfield        #142 <Field String objectId>
	//   16   30:aastore         
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:aload_0         
	//   20   34:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//   21   37:invokevirtual   #586 <Method String com.facebook.share.widget.LikeView$ObjectType.toString()>
	//   22   40:aastore         
	//   23   41:dup             
	//   24   42:iconst_2        
	//   25   43:aload_1         
	//   26   44:invokevirtual   #586 <Method String com.facebook.share.widget.LikeView$ObjectType.toString()>
	//   27   47:aastore         
	//   28   48:invokespecial   #827 <Method void FacebookException(String, Object[])>
	//   29   51:astore_0        
			objecttype = null;
	//   30   52:aconst_null     
	//   31   53:astore_1        
		} else
	//*  32   54:goto            68
		{
			likeactioncontroller.objectType = objecttype1;
	//   33   57:aload_0         
	//   34   58:aload_3         
	//   35   59:putfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
			objecttype1 = null;
	//   36   62:aconst_null     
	//   37   63:astore_3        
			objecttype = ((com.facebook.share.widget.LikeView.ObjectType) (likeactioncontroller));
	//   38   64:aload_0         
	//   39   65:astore_1        
			likeactioncontroller = ((LikeActionController) (objecttype1));
	//   40   66:aload_3         
	//   41   67:astore_0        
		}
		invokeCallbackWithController(creationcallback, ((LikeActionController) (objecttype)), ((FacebookException) (likeactioncontroller)));
	//   42   68:aload_2         
	//   43   69:aload_1         
	//   44   70:aload_0         
	//   45   71:invokestatic    #362 <Method void invokeCallbackWithController(LikeActionController$CreationCallback, LikeActionController, FacebookException)>
	//   46   74:return          
	}

	public String getLikeCountString()
	{
		if(isObjectLiked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field boolean isObjectLiked>
	//*   2    4:ifeq            12
			return likeCountStringWithLike;
	//    3    7:aload_0         
	//    4    8:getfield        #257 <Field String likeCountStringWithLike>
	//    5   11:areturn         
		else
			return likeCountStringWithoutLike;
	//    6   12:aload_0         
	//    7   13:getfield        #260 <Field String likeCountStringWithoutLike>
	//    8   16:areturn         
	}

	public String getObjectId()
	{
		return objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String objectId>
	//    2    4:areturn         
	}

	public String getSocialSentence()
	{
		if(isObjectLiked)
	//*   0    0:aload_0         
	//*   1    1:getfield        #228 <Field boolean isObjectLiked>
	//*   2    4:ifeq            12
			return socialSentenceWithLike;
	//    3    7:aload_0         
	//    4    8:getfield        #263 <Field String socialSentenceWithLike>
	//    5   11:areturn         
		else
			return socialSentenceWithoutLike;
	//    6   12:aload_0         
	//    7   13:getfield        #158 <Field String socialSentenceWithoutLike>
	//    8   16:areturn         
	}

	public boolean isObjectLiked()
	{
		return isObjectLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field boolean isObjectLiked>
	//    2    4:ireturn         
	}

	public boolean shouldEnableView()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void toggleLike(Activity activity, FragmentWrapper fragmentwrapper, Bundle bundle)
	{
		boolean flag1 = isObjectLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field boolean isObjectLiked>
	//    2    4:istore          5
		boolean flag = true;
	//    3    6:iconst_1        
	//    4    7:istore          4
		flag1 ^= true;
	//    5    9:iload           5
	//    6   11:iconst_1        
	//    7   12:ixor            
	//    8   13:istore          5
		if(canUseOGPublish())
	//*   9   15:aload_0         
	//*  10   16:invokespecial   #725 <Method boolean canUseOGPublish()>
	//*  11   19:ifeq            83
		{
			updateLikeState(flag1);
	//   12   22:aload_0         
	//   13   23:iload           5
	//   14   25:invokespecial   #712 <Method void updateLikeState(boolean)>
			if(isPendingLikeOrUnlike)
	//*  15   28:aload_0         
	//*  16   29:getfield        #195 <Field boolean isPendingLikeOrUnlike>
	//*  17   32:ifeq            48
			{
				getAppEventsLogger().logSdkEvent("fb_like_control_did_undo_quickly", ((Double) (null)), bundle);
	//   18   35:aload_0         
	//   19   36:invokespecial   #169 <Method AppEventsLogger getAppEventsLogger()>
	//   20   39:ldc2            #833 <String "fb_like_control_did_undo_quickly">
	//   21   42:aconst_null     
	//   22   43:aload_3         
	//   23   44:invokevirtual   #594 <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
				return;
	//   24   47:return          
			}
			if(!publishLikeOrUnlikeAsync(flag1, bundle))
	//*  25   48:aload_0         
	//*  26   49:iload           5
	//*  27   51:aload_3         
	//*  28   52:invokespecial   #709 <Method boolean publishLikeOrUnlikeAsync(boolean, Bundle)>
	//*  29   55:ifne            90
			{
				if(flag1)
	//*  30   58:iload           5
	//*  31   60:ifne            66
	//*  32   63:goto            69
					flag = false;
	//   33   66:iconst_0        
	//   34   67:istore          4
				updateLikeState(flag);
	//   35   69:aload_0         
	//   36   70:iload           4
	//   37   72:invokespecial   #712 <Method void updateLikeState(boolean)>
				presentLikeDialog(activity, fragmentwrapper, bundle);
	//   38   75:aload_0         
	//   39   76:aload_1         
	//   40   77:aload_2         
	//   41   78:aload_3         
	//   42   79:invokespecial   #835 <Method void presentLikeDialog(Activity, FragmentWrapper, Bundle)>
				return;
	//   43   82:return          
			}
		} else
		{
			presentLikeDialog(activity, fragmentwrapper, bundle);
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:aload_2         
	//   47   86:aload_3         
	//   48   87:invokespecial   #835 <Method void presentLikeDialog(Activity, FragmentWrapper, Bundle)>
		}
	//   49   90:return          
	}

	private static final String TAG = "LikeActionController";
	private static AccessTokenTracker accessTokenTracker;
	private static final ConcurrentHashMap cache = new ConcurrentHashMap();
	private static FileLruCache controllerDiskCache;
	private static WorkQueue diskIOWorkQueue = new WorkQueue(1);
	private static Handler handler;
	private static boolean isInitialized;
	private static WorkQueue mruCacheWorkQueue = new WorkQueue(1);
	private static String objectIdForPendingController;
	private static volatile int objectSuffix;
	private AppEventsLogger appEventsLogger;
	private Bundle facebookDialogAnalyticsBundle;
	private boolean isObjectLiked;
	private boolean isObjectLikedOnServer;
	private boolean isPendingLikeOrUnlike;
	private String likeCountStringWithLike;
	private String likeCountStringWithoutLike;
	private String objectId;
	private boolean objectIsPage;
	private com.facebook.share.widget.LikeView.ObjectType objectType;
	private String socialSentenceWithLike;
	private String socialSentenceWithoutLike;
	private String unlikeToken;
	private String verifiedObjectId;

	static 
	{
	//    0    0:new             #123 <Class ConcurrentHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #126 <Method void ConcurrentHashMap()>
	//    3    7:putstatic       #128 <Field ConcurrentHashMap cache>
	//    4   10:new             #130 <Class WorkQueue>
	//    5   13:dup             
	//    6   14:iconst_1        
	//    7   15:invokespecial   #133 <Method void WorkQueue(int)>
	//    8   18:putstatic       #135 <Field WorkQueue mruCacheWorkQueue>
	//    9   21:new             #130 <Class WorkQueue>
	//   10   24:dup             
	//   11   25:iconst_1        
	//   12   26:invokespecial   #133 <Method void WorkQueue(int)>
	//   13   29:putstatic       #137 <Field WorkQueue diskIOWorkQueue>
	//*  14   32:return          
	}


/*
	static void access$000(LikeActionController likeactioncontroller, int i, int j, Intent intent)
	{
		likeactioncontroller.onActivityResult(i, j, intent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #150 <Method void onActivityResult(int, int, Intent)>
		return;
	//    5    7:return          
	}

*/


/*
	static String access$100()
	{
		return TAG;
	//    0    0:getstatic       #154 <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static String access$1000(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.socialSentenceWithoutLike;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String socialSentenceWithoutLike>
	//    2    4:areturn         
	}

*/


/*
	static String access$1100(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.unlikeToken;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field String unlikeToken>
	//    2    4:areturn         
	}

*/


/*
	static String access$1102(LikeActionController likeactioncontroller, String s)
	{
		likeactioncontroller.unlikeToken = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field String unlikeToken>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static AppEventsLogger access$1200(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.getAppEventsLogger();
	//    0    0:aload_0         
	//    1    1:invokespecial   #169 <Method AppEventsLogger getAppEventsLogger()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1300(LikeActionController likeactioncontroller, boolean flag, String s, String s1, String s2, String s3, String s4)
	{
		likeactioncontroller.updateState(flag, s, s1, s2, s3, s4);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:invokespecial   #175 <Method void updateState(boolean, String, String, String, String, String)>
		return;
	//    8   13:return          
	}

*/


/*
	static void access$1400(LikeActionController likeactioncontroller, String s, Bundle bundle)
	{
		likeactioncontroller.logAppEventForError(s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #181 <Method void logAppEventForError(String, Bundle)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1500(LikeActionController likeactioncontroller, String s, Bundle bundle)
	{
		broadcastAction(likeactioncontroller, s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #185 <Method void broadcastAction(LikeActionController, String, Bundle)>
		return;
	//    4    6:return          
	}

*/


/*
	static String access$1600(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.verifiedObjectId;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field String verifiedObjectId>
	//    2    4:areturn         
	}

*/


/*
	static String access$1602(LikeActionController likeactioncontroller, String s)
	{
		likeactioncontroller.verifiedObjectId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #188 <Field String verifiedObjectId>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static com.facebook.share.widget.LikeView.ObjectType access$1700(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.objectType;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field com.facebook.share.widget.LikeView$ObjectType objectType>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1802(LikeActionController likeactioncontroller, boolean flag)
	{
		likeactioncontroller.isPendingLikeOrUnlike = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #195 <Field boolean isPendingLikeOrUnlike>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$1900(LikeActionController likeactioncontroller, boolean flag)
	{
		likeactioncontroller.publishDidError(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #201 <Method void publishDidError(boolean)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$200(LikeActionController likeactioncontroller)
	{
		likeactioncontroller.refreshStatusAsync();
	//    0    0:aload_0         
	//    1    1:invokespecial   #206 <Method void refreshStatusAsync()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$2002(LikeActionController likeactioncontroller, boolean flag)
	{
		likeactioncontroller.isObjectLikedOnServer = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field boolean isObjectLikedOnServer>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$2100(LikeActionController likeactioncontroller, Bundle bundle)
	{
		likeactioncontroller.publishAgainIfNeeded(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #215 <Method void publishAgainIfNeeded(Bundle)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$2200(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field String objectId>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$2302(LikeActionController likeactioncontroller, boolean flag)
	{
		likeactioncontroller.objectIsPage = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #219 <Field boolean objectIsPage>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$2400(LikeActionController likeactioncontroller, String s, FacebookRequestError facebookrequesterror)
	{
		likeactioncontroller.logAppEventForError(s, facebookrequesterror);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #224 <Method void logAppEventForError(String, FacebookRequestError)>
		return;
	//    4    6:return          
	}

*/


/*
	static boolean access$2500(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.isObjectLiked;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field boolean isObjectLiked>
	//    2    4:ireturn         
	}

*/


/*
	static void access$2600(String s, String s1)
	{
		serializeToDiskSynchronously(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #233 <Method void serializeToDiskSynchronously(String, String)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$2700(String s, com.facebook.share.widget.LikeView.ObjectType objecttype, CreationCallback creationcallback)
	{
		createControllerForObjectIdAndType(s, objecttype, creationcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #238 <Method void createControllerForObjectIdAndType(String, com.facebook.share.widget.LikeView$ObjectType, LikeActionController$CreationCallback)>
		return;
	//    4    6:return          
	}

*/


/*
	static int access$300()
	{
		return objectSuffix;
	//    0    0:getstatic       #242 <Field int objectSuffix>
	//    1    3:ireturn         
	}

*/


/*
	static int access$302(int i)
	{
		objectSuffix = i;
	//    0    0:iload_0         
	//    1    1:putstatic       #242 <Field int objectSuffix>
		return i;
	//    2    4:iload_0         
	//    3    5:ireturn         
	}

*/


/*
	static ConcurrentHashMap access$400()
	{
		return cache;
	//    0    0:getstatic       #128 <Field ConcurrentHashMap cache>
	//    1    3:areturn         
	}

*/


/*
	static FileLruCache access$500()
	{
		return controllerDiskCache;
	//    0    0:getstatic       #250 <Field FileLruCache controllerDiskCache>
	//    1    3:areturn         
	}

*/


/*
	static void access$600(LikeActionController likeactioncontroller, String s)
	{
		broadcastAction(likeactioncontroller, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #254 <Method void broadcastAction(LikeActionController, String)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$700(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.likeCountStringWithLike;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field String likeCountStringWithLike>
	//    2    4:areturn         
	}

*/


/*
	static String access$800(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.likeCountStringWithoutLike;
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field String likeCountStringWithoutLike>
	//    2    4:areturn         
	}

*/


/*
	static String access$900(LikeActionController likeactioncontroller)
	{
		return likeactioncontroller.socialSentenceWithLike;
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field String socialSentenceWithLike>
	//    2    4:areturn         
	}

*/
}
