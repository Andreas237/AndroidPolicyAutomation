// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.GraphRequestBatch;
import com.facebook.LoggingBehavior;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$9$1
	implements com.facebook.k
{

	public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
	{
		if(val$likeRequestWrapper.getError() == null && val$engagementRequest.getError() == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
	//*   2    4:invokeinterface #36  <Method com.facebook.FacebookRequestError LikeActionController$LikeRequestWrapper.getError()>
	//*   3    9:ifnonnull       82
	//*   4   12:aload_0         
	//*   5   13:getfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
	//*   6   16:invokevirtual   #39  <Method com.facebook.FacebookRequestError LikeActionController$GetEngagementRequestWrapper.getError()>
	//*   7   19:ifnull          25
	//*   8   22:goto            82
		{
			LikeActionController.access$1300(this$0, val$likeRequestWrapper.isObjectLiked(), val$engagementRequest.likeCountStringWithLike, val$engagementRequest.likeCountStringWithoutLike, val$engagementRequest.socialSentenceStringWithLike, val$engagementRequest.socialSentenceStringWithoutLike, val$likeRequestWrapper.getUnlikeToken());
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
			Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Unable to refresh like state for id: '%s'", new Object[] {
				LikeActionController.access$2200(this$0)
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

	final LikeActionController._cls9 this$1;
	final ngagementRequestWrapper val$engagementRequest;
	final RequestWrapper val$likeRequestWrapper;

	LikeActionController$9$1()
	{
		this$1 = final__pcls9;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field LikeActionController$9 this$1>
		val$likeRequestWrapper = requestwrapper;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field LikeActionController$LikeRequestWrapper val$likeRequestWrapper>
		val$engagementRequest = ngagementRequestWrapper.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field LikeActionController$GetEngagementRequestWrapper val$engagementRequest>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}

	// Unreferenced inner class com/facebook/share/internal/LikeActionController$9

/* anonymous class */
	class LikeActionController._cls9
		implements LikeActionController.RequestCompletionCallback
	{

		public void onComplete()
		{
			final Object likeRequestWrapper;
			if(LikeActionController._cls12.$SwitchMap$com$facebook$share$widget$LikeView$ObjectType[LikeActionController.access$1700(LikeActionController.this).ordinal()] != 1)
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
				likeRequestWrapper = ((Object) (new LikeActionController.GetOGObjectLikesRequestWrapper(((LikeActionController) (likeRequestWrapper)), LikeActionController.access$1600(((LikeActionController) (likeRequestWrapper))), LikeActionController.access$1700(LikeActionController.this))));
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
				likeRequestWrapper = ((Object) (new LikeActionController.GetPageLikesRequestWrapper(((LikeActionController) (likeRequestWrapper)), LikeActionController.access$1600(((LikeActionController) (likeRequestWrapper))))));
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
			obj = ((Object) (new LikeActionController.GetEngagementRequestWrapper(((LikeActionController) (obj)), LikeActionController.access$1600(((LikeActionController) (obj))), LikeActionController.access$1700(LikeActionController.this))));
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
			((LikeActionController.LikeRequestWrapper) (likeRequestWrapper)).addToBatch(graphrequestbatch);
		//   49   97:aload_1         
		//   50   98:aload_3         
		//   51   99:invokeinterface #65  <Method void LikeActionController$LikeRequestWrapper.addToBatch(GraphRequestBatch)>
			((LikeActionController.GetEngagementRequestWrapper) (obj)).addToBatch(graphrequestbatch);
		//   52  104:aload_2         
		//   53  105:aload_3         
		//   54  106:invokevirtual   #66  <Method void LikeActionController$GetEngagementRequestWrapper.addToBatch(GraphRequestBatch)>
			graphrequestbatch.addCallback(((com.facebook.GraphRequestBatch.Callback) (((LikeActionController._cls9._cls1) (obj)). new LikeActionController._cls9._cls1())));
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

}
