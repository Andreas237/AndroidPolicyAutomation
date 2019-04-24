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
	//*   8   18:ifnull          36
		{
			processError(error);
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//   11   25:aload_0         
	//   12   26:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//   13   29:getfield        #36  <Field com.facebook.FacebookRequestError LikeActionController$AbstractRequestWrapper.error>
	//   14   32:invokevirtual   #40  <Method void LikeActionController$AbstractRequestWrapper.processError(com.facebook.FacebookRequestError)>
			return;
	//   15   35:return          
		} else
		{
			processSuccess(graphresponse);
	//   16   36:aload_0         
	//   17   37:getfield        #20  <Field LikeActionController$AbstractRequestWrapper this$1>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #43  <Method void LikeActionController$AbstractRequestWrapper.processSuccess(GraphResponse)>
			return;
	//   20   44:return          
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
