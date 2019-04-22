// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.*;
import com.facebook.internal.Logger;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

private abstract class LikeActionController$AbstractRequestWrapper
	implements LikeActionController.RequestWrapper
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
		Logger.log(LoggingBehavior.REQUESTS, LikeActionController.access$100(), "Error running request for object '%s' with type '%s' : %s", new Object[] {
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
					graphresponse = ((GraphResponse) (LikeActionController.AbstractRequestWrapper.this));
			//    9   21:aload_0         
			//   10   22:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
			//   11   25:astore_1        
					((LikeActionController.AbstractRequestWrapper) (graphresponse)).processError(((LikeActionController.AbstractRequestWrapper) (graphresponse)).error);
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

			final LikeActionController.AbstractRequestWrapper this$1;

			
			{
				this$1 = LikeActionController.AbstractRequestWrapper.this;
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

	protected LikeActionController$AbstractRequestWrapper(String s, com.facebook.share.widget.LikeView.ObjectType objecttype)
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
