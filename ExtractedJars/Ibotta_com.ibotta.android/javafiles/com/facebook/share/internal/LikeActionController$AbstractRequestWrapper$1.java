// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.internal;

import com.facebook.GraphResponse;

// Referenced classes of package com.facebook.share.internal:
//			LikeActionController

class LikeActionController$AbstractRequestWrapper$1
	implements com.facebook.GraphRequest.Callback
{

	public void onCompleted(GraphResponse graphresponse)
	{
		error = graphresponse.getError();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method com.facebook.FacebookRequestError GraphResponse.getError()>
	//    4    8:putfield        #36  <Field com.facebook.FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
		if(error != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//*   7   15:getfield        #36  <Field com.facebook.FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
	//*   8   18:ifnull          35
		{
			graphresponse = ((GraphResponse) (LikeActionController.AbstractRequestWrapper.this));
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//   11   25:astore_1        
			((LikeActionController.AbstractRequestWrapper) (graphresponse)).processError(((LikeActionController.AbstractRequestWrapper) (graphresponse)).error);
	//   12   26:aload_1         
	//   13   27:aload_1         
	//   14   28:getfield        #36  <Field com.facebook.FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
	//   15   31:invokevirtual   #40  <Method void LikeActionController$AbstractRequestWrapper.processError(com.facebook.FacebookRequestError)>
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

	LikeActionController$AbstractRequestWrapper$1()
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
