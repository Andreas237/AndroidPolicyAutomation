// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$7
	implements questCompletionCallback
{

	public void onComplete()
	{
		if(Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
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
			LikeActionController.access$1500(LikeActionController.this, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
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
			final blishLikeRequestWrapper likeRequest = new blishLikeRequestWrapper(LikeActionController.this, LikeActionController.access$1600(LikeActionController.this), LikeActionController.access$1700(LikeActionController.this));
	//   23   48:new             #60  <Class LikeActionController$PublishLikeRequestWrapper>
	//   24   51:dup             
	//   25   52:aload_0         
	//   26   53:getfield        #21  <Field LikeActionController this$0>
	//   27   56:aload_0         
	//   28   57:getfield        #21  <Field LikeActionController this$0>
	//   29   60:invokestatic    #32  <Method String LikeActionController.access$1600(LikeActionController)>
	//   30   63:aload_0         
	//   31   64:getfield        #21  <Field LikeActionController this$0>
	//   32   67:invokestatic    #64  <Method com.facebook.share.widget.LikeView$ObjectType LikeActionController.access$1700(LikeActionController)>
	//   33   70:invokespecial   #67  <Method void LikeActionController$PublishLikeRequestWrapper(LikeActionController, String, com.facebook.share.widget.LikeView$ObjectType)>
	//   34   73:astore_2        
			likeRequest.addToBatch(graphrequestbatch);
	//   35   74:aload_2         
	//   36   75:aload_1         
	//   37   76:invokevirtual   #71  <Method void LikeActionController$PublishLikeRequestWrapper.addToBatch(GraphRequestBatch)>
			graphrequestbatch.addCallback(new com.facebook.GraphRequestBatch.Callback() {

				public void onBatchCompleted(GraphRequestBatch graphrequestbatch1)
				{
					LikeActionController.access$1802(this$0, false);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field LikeActionController$7 this$1>
				//    2    4:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
				//    3    7:iconst_0        
				//    4    8:invokestatic    #36  <Method boolean LikeActionController.access$1802(LikeActionController, boolean)>
				//    5   11:pop             
					if(likeRequest.getError() != null)
				//*   6   12:aload_0         
				//*   7   13:getfield        #21  <Field LikeActionController$PublishLikeRequestWrapper val$likeRequest>
				//*   8   16:invokevirtual   #42  <Method com.facebook.FacebookRequestError LikeActionController$PublishLikeRequestWrapper.getError()>
				//*   9   19:ifnull          34
					{
						LikeActionController.access$1900(this$0, false);
				//   10   22:aload_0         
				//   11   23:getfield        #19  <Field LikeActionController$7 this$1>
				//   12   26:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
				//   13   29:iconst_0        
				//   14   30:invokestatic    #46  <Method void LikeActionController.access$1900(LikeActionController, boolean)>
						return;
				//   15   33:return          
					} else
					{
						LikeActionController.access$1102(this$0, Utility.coerceValueIfNullOrEmpty(likeRequest.unlikeToken, ((String) (null))));
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
						LikeActionController.access$2002(this$0, true);
				//   26   56:aload_0         
				//   27   57:getfield        #19  <Field LikeActionController$7 this$1>
				//   28   60:getfield        #30  <Field LikeActionController LikeActionController$7.this$0>
				//   29   63:iconst_1        
				//   30   64:invokestatic    #63  <Method boolean LikeActionController.access$2002(LikeActionController, boolean)>
				//   31   67:pop             
						LikeActionController.access$1200(this$0).logSdkEvent("fb_like_control_did_like", ((Double) (null)), analyticsParameters);
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
						LikeActionController.access$2100(this$0, analyticsParameters);
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

				final LikeActionController._cls7 this$1;
				final LikeActionController.PublishLikeRequestWrapper val$likeRequest;

			
			{
				this$1 = LikeActionController._cls7.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field LikeActionController$7 this$1>
				likeRequest = publishlikerequestwrapper;
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
	//   38   79:aload_1         
	//   39   80:new             #13  <Class LikeActionController$7$1>
	//   40   83:dup             
	//   41   84:aload_0         
	//   42   85:aload_2         
	//   43   86:invokespecial   #74  <Method void LikeActionController$7$1(LikeActionController$7, LikeActionController$PublishLikeRequestWrapper)>
	//   44   89:invokevirtual   #78  <Method void GraphRequestBatch.addCallback(com.facebook.GraphRequestBatch$Callback)>
			graphrequestbatch.executeAsync();
	//   45   92:aload_1         
	//   46   93:invokevirtual   #82  <Method com.facebook.GraphRequestAsyncTask GraphRequestBatch.executeAsync()>
	//   47   96:pop             
			return;
	//   48   97:return          
		}
	}

	final LikeActionController this$0;
	final Bundle val$analyticsParameters;

	LikeActionController$7()
	{
		this$0 = final_likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field LikeActionController this$0>
		val$analyticsParameters = Bundle.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Bundle val$analyticsParameters>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
