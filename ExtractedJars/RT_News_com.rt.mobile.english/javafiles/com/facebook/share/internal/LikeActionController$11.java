// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$11
	implements com.facebook.ck
{

	public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
	{
		LikeActionController.access$1602(LikeActionController.this, val$objectIdRequest.verifiedObjectId);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field LikeActionController this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
	//    4    8:getfield        #41  <Field String LikeActionController$GetOGObjectIdRequestWrapper.verifiedObjectId>
	//    5   11:invokestatic    #45  <Method String LikeActionController.access$1602(LikeActionController, String)>
	//    6   14:pop             
		if(Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
	//*   7   15:aload_0         
	//*   8   16:getfield        #23  <Field LikeActionController this$0>
	//*   9   19:invokestatic    #49  <Method String LikeActionController.access$1600(LikeActionController)>
	//*  10   22:invokestatic    #55  <Method boolean Utility.isNullOrEmpty(String)>
	//*  11   25:ifeq            58
		{
			LikeActionController.access$1602(LikeActionController.this, val$pageIdRequest.verifiedObjectId);
	//   12   28:aload_0         
	//   13   29:getfield        #23  <Field LikeActionController this$0>
	//   14   32:aload_0         
	//   15   33:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
	//   16   36:getfield        #58  <Field String LikeActionController$GetPageIdRequestWrapper.verifiedObjectId>
	//   17   39:invokestatic    #45  <Method String LikeActionController.access$1602(LikeActionController, String)>
	//   18   42:pop             
			LikeActionController.access$2302(LikeActionController.this, val$pageIdRequest.objectIsPage);
	//   19   43:aload_0         
	//   20   44:getfield        #23  <Field LikeActionController this$0>
	//   21   47:aload_0         
	//   22   48:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
	//   23   51:getfield        #62  <Field boolean LikeActionController$GetPageIdRequestWrapper.objectIsPage>
	//   24   54:invokestatic    #66  <Method boolean LikeActionController.access$2302(LikeActionController, boolean)>
	//   25   57:pop             
		}
		if(Utility.isNullOrEmpty(LikeActionController.access$1600(LikeActionController.this)))
	//*  26   58:aload_0         
	//*  27   59:getfield        #23  <Field LikeActionController this$0>
	//*  28   62:invokestatic    #49  <Method String LikeActionController.access$1600(LikeActionController)>
	//*  29   65:invokestatic    #55  <Method boolean Utility.isNullOrEmpty(String)>
	//*  30   68:ifeq            137
		{
			Logger.log(LoggingBehavior.DEVELOPER_ERRORS, LikeActionController.access$100(), "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", new Object[] {
				LikeActionController.access$2200(LikeActionController.this)
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
			if(val$pageIdRequest.getError() != null)
	//*  46  101:aload_0         
	//*  47  102:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
	//*  48  105:invokevirtual   #91  <Method com.facebook.FacebookRequestError LikeActionController$GetPageIdRequestWrapper.getError()>
	//*  49  108:ifnull          122
				graphrequestbatch = ((GraphRequestBatch) (val$pageIdRequest.getError()));
	//   50  111:aload_0         
	//   51  112:getfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
	//   52  115:invokevirtual   #91  <Method com.facebook.FacebookRequestError LikeActionController$GetPageIdRequestWrapper.getError()>
	//   53  118:astore_1        
			else
	//*  54  119:goto            130
				graphrequestbatch = ((GraphRequestBatch) (val$objectIdRequest.getError()));
	//   55  122:aload_0         
	//   56  123:getfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
	//   57  126:invokevirtual   #92  <Method com.facebook.FacebookRequestError LikeActionController$GetOGObjectIdRequestWrapper.getError()>
	//   58  129:astore_1        
			LikeActionController.access$2400(likeactioncontroller, "get_verified_id", ((com.facebook.FacebookRequestError) (graphrequestbatch)));
	//   59  130:aload_2         
	//   60  131:ldc1            #94  <String "get_verified_id">
	//   61  133:aload_1         
	//   62  134:invokestatic    #98  <Method void LikeActionController.access$2400(LikeActionController, String, com.facebook.FacebookRequestError)>
		}
		if(val$completionHandler != null)
	//*  63  137:aload_0         
	//*  64  138:getfield        #29  <Field LikeActionController$RequestCompletionCallback val$completionHandler>
	//*  65  141:ifnull          153
			val$completionHandler.onComplete();
	//   66  144:aload_0         
	//   67  145:getfield        #29  <Field LikeActionController$RequestCompletionCallback val$completionHandler>
	//   68  148:invokeinterface #103 <Method void LikeActionController$RequestCompletionCallback.onComplete()>
	//   69  153:return          
	}

	final LikeActionController this$0;
	final uestCompletionCallback val$completionHandler;
	final OGObjectIdRequestWrapper val$objectIdRequest;
	final PageIdRequestWrapper val$pageIdRequest;

	LikeActionController$11()
	{
		this$0 = final_likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field LikeActionController this$0>
		val$objectIdRequest = ogobjectidrequestwrapper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field LikeActionController$GetOGObjectIdRequestWrapper val$objectIdRequest>
		val$pageIdRequest = pageidrequestwrapper;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field LikeActionController$GetPageIdRequestWrapper val$pageIdRequest>
		val$completionHandler = uestCompletionCallback.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field LikeActionController$RequestCompletionCallback val$completionHandler>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
