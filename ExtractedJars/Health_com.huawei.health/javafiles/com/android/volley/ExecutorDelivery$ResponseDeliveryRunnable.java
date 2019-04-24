// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;


// Referenced classes of package com.android.volley:
//			ExecutorDelivery, Request, Response

class ExecutorDelivery$ResponseDeliveryRunnable
	implements Runnable
{

	public void run()
	{
		if(mRequest.isCanceled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field Request mRequest>
	//*   2    4:invokevirtual   #38  <Method boolean Request.isCanceled()>
	//*   3    7:ifeq            20
		{
			mRequest.finish("canceled-at-delivery");
	//    4   10:aload_0         
	//    5   11:getfield        #26  <Field Request mRequest>
	//    6   14:ldc1            #40  <String "canceled-at-delivery">
	//    7   16:invokevirtual   #44  <Method void Request.finish(String)>
			return;
	//    8   19:return          
		}
		if(mResponse.isSuccess())
	//*   9   20:aload_0         
	//*  10   21:getfield        #28  <Field Response mResponse>
	//*  11   24:invokevirtual   #49  <Method boolean Response.isSuccess()>
	//*  12   27:ifeq            47
			mRequest.deliverResponse(mResponse.result);
	//   13   30:aload_0         
	//   14   31:getfield        #26  <Field Request mRequest>
	//   15   34:aload_0         
	//   16   35:getfield        #28  <Field Response mResponse>
	//   17   38:getfield        #53  <Field Object Response.result>
	//   18   41:invokevirtual   #57  <Method void Request.deliverResponse(Object)>
		else
	//*  19   44:goto            61
			mRequest.deliverError(mResponse.error);
	//   20   47:aload_0         
	//   21   48:getfield        #26  <Field Request mRequest>
	//   22   51:aload_0         
	//   23   52:getfield        #28  <Field Response mResponse>
	//   24   55:getfield        #61  <Field VolleyError Response.error>
	//   25   58:invokevirtual   #65  <Method void Request.deliverError(VolleyError)>
		if(mResponse.intermediate)
	//*  26   61:aload_0         
	//*  27   62:getfield        #28  <Field Response mResponse>
	//*  28   65:getfield        #69  <Field boolean Response.intermediate>
	//*  29   68:ifeq            83
			mRequest.addMarker("intermediate-response");
	//   30   71:aload_0         
	//   31   72:getfield        #26  <Field Request mRequest>
	//   32   75:ldc1            #71  <String "intermediate-response">
	//   33   77:invokevirtual   #74  <Method void Request.addMarker(String)>
		else
	//*  34   80:goto            92
			mRequest.finish("done");
	//   35   83:aload_0         
	//   36   84:getfield        #26  <Field Request mRequest>
	//   37   87:ldc1            #76  <String "done">
	//   38   89:invokevirtual   #44  <Method void Request.finish(String)>
		if(mRunnable != null)
	//*  39   92:aload_0         
	//*  40   93:getfield        #30  <Field Runnable mRunnable>
	//*  41   96:ifnull          108
			mRunnable.run();
	//   42   99:aload_0         
	//   43  100:getfield        #30  <Field Runnable mRunnable>
	//   44  103:invokeinterface #78  <Method void Runnable.run()>
	//   45  108:return          
	}

	private final Request mRequest;
	private final Response mResponse;
	private final Runnable mRunnable;
	final ExecutorDelivery this$0;

	public ExecutorDelivery$ResponseDeliveryRunnable(Request request, Response response, Runnable runnable)
	{
		this$0 = ExecutorDelivery.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ExecutorDelivery this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		mRequest = request;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field Request mRequest>
		mResponse = response;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field Response mResponse>
		mRunnable = runnable;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field Runnable mRunnable>
	//   14   25:return          
	}
}
