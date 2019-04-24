// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.GraphRequestBatch;
import com.facebook.appevents.AppEventsLogger;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$8
	implements com.facebook.ack
{

	public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
	{
		LikeActionController.access$1802(LikeActionController.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field LikeActionController this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #35  <Method boolean LikeActionController.access$1802(LikeActionController, boolean)>
	//    4    8:pop             
		if(val$unlikeRequest.getError() != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #23  <Field LikeActionController$PublishUnlikeRequestWrapper val$unlikeRequest>
	//*   7   13:invokevirtual   #41  <Method com.facebook.FacebookRequestError LikeActionController$PublishUnlikeRequestWrapper.getError()>
	//*   8   16:ifnull          28
		{
			LikeActionController.access$1900(LikeActionController.this, true);
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field LikeActionController this$0>
	//   11   23:iconst_1        
	//   12   24:invokestatic    #45  <Method void LikeActionController.access$1900(LikeActionController, boolean)>
			return;
	//   13   27:return          
		} else
		{
			LikeActionController.access$1102(LikeActionController.this, ((String) (null)));
	//   14   28:aload_0         
	//   15   29:getfield        #21  <Field LikeActionController this$0>
	//   16   32:aconst_null     
	//   17   33:invokestatic    #49  <Method String LikeActionController.access$1102(LikeActionController, String)>
	//   18   36:pop             
			LikeActionController.access$2002(LikeActionController.this, false);
	//   19   37:aload_0         
	//   20   38:getfield        #21  <Field LikeActionController this$0>
	//   21   41:iconst_0        
	//   22   42:invokestatic    #52  <Method boolean LikeActionController.access$2002(LikeActionController, boolean)>
	//   23   45:pop             
			LikeActionController.access$1200(LikeActionController.this).logSdkEvent("fb_like_control_did_unlike", ((Double) (null)), val$analyticsParameters);
	//   24   46:aload_0         
	//   25   47:getfield        #21  <Field LikeActionController this$0>
	//   26   50:invokestatic    #56  <Method AppEventsLogger LikeActionController.access$1200(LikeActionController)>
	//   27   53:ldc1            #58  <String "fb_like_control_did_unlike">
	//   28   55:aconst_null     
	//   29   56:aload_0         
	//   30   57:getfield        #25  <Field Bundle val$analyticsParameters>
	//   31   60:invokevirtual   #64  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
			LikeActionController.access$2100(LikeActionController.this, val$analyticsParameters);
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
	final blishUnlikeRequestWrapper val$unlikeRequest;

	LikeActionController$8()
	{
		this$0 = final_likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field LikeActionController this$0>
		val$unlikeRequest = blishunlikerequestwrapper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field LikeActionController$PublishUnlikeRequestWrapper val$unlikeRequest>
		val$analyticsParameters = Bundle.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field Bundle val$analyticsParameters>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
