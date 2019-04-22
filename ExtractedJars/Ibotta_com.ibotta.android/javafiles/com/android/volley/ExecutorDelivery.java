// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//			ResponseDelivery, Request, Response, VolleyError

public class ExecutorDelivery
	implements ResponseDelivery
{
	private class ResponseDeliveryRunnable
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
			Runnable runnable = mRunnable;
		//   39   92:aload_0         
		//   40   93:getfield        #30  <Field Runnable mRunnable>
		//   41   96:astore_1        
			if(runnable != null)
		//*  42   97:aload_1         
		//*  43   98:ifnull          107
				runnable.run();
		//   44  101:aload_1         
		//   45  102:invokeinterface #78  <Method void Runnable.run()>
		//   46  107:return          
		}

		private final Request mRequest;
		private final Response mResponse;
		private final Runnable mRunnable;
		final ExecutorDelivery this$0;

		public ResponseDeliveryRunnable(Request request, Response response, Runnable runnable)
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


	public ExecutorDelivery(final Handler handler)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mResponsePoster = new Executor() {

			public void execute(Runnable runnable)
			{
				handler.post(runnable);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field Handler val$handler>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #32  <Method boolean Handler.post(Runnable)>
			//    4    8:pop             
			//    5    9:return          
			}

			final ExecutorDelivery this$0;
			final Handler val$handler;

			
			{
				this$0 = ExecutorDelivery.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ExecutorDelivery this$0>
				handler = handler1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Handler val$handler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #8   <Class ExecutorDelivery$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #21  <Method void ExecutorDelivery$1(ExecutorDelivery, Handler)>
	//    8   14:putfield        #23  <Field Executor mResponsePoster>
	//    9   17:return          
	}

	public void postError(Request request, VolleyError volleyerror)
	{
		request.addMarker("post-error");
	//    0    0:aload_1         
	//    1    1:ldc1            #28  <String "post-error">
	//    2    3:invokevirtual   #34  <Method void Request.addMarker(String)>
		volleyerror = ((VolleyError) (Response.error(volleyerror)));
	//    3    6:aload_2         
	//    4    7:invokestatic    #40  <Method Response Response.error(VolleyError)>
	//    5   10:astore_2        
		mResponsePoster.execute(((Runnable) (new ResponseDeliveryRunnable(request, ((Response) (volleyerror)), ((Runnable) (null))))));
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field Executor mResponsePoster>
	//    8   15:new             #10  <Class ExecutorDelivery$ResponseDeliveryRunnable>
	//    9   18:dup             
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:aload_2         
	//   13   22:aconst_null     
	//   14   23:invokespecial   #43  <Method void ExecutorDelivery$ResponseDeliveryRunnable(ExecutorDelivery, Request, Response, Runnable)>
	//   15   26:invokeinterface #49  <Method void Executor.execute(Runnable)>
	//   16   31:return          
	}

	public void postResponse(Request request, Response response)
	{
		postResponse(request, response, ((Runnable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #56  <Method void postResponse(Request, Response, Runnable)>
	//    5    7:return          
	}

	public void postResponse(Request request, Response response, Runnable runnable)
	{
		request.markDelivered();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #60  <Method void Request.markDelivered()>
		request.addMarker("post-response");
	//    2    4:aload_1         
	//    3    5:ldc1            #62  <String "post-response">
	//    4    7:invokevirtual   #34  <Method void Request.addMarker(String)>
		mResponsePoster.execute(((Runnable) (new ResponseDeliveryRunnable(request, response, runnable))));
	//    5   10:aload_0         
	//    6   11:getfield        #23  <Field Executor mResponsePoster>
	//    7   14:new             #10  <Class ExecutorDelivery$ResponseDeliveryRunnable>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_3         
	//   13   22:invokespecial   #43  <Method void ExecutorDelivery$ResponseDeliveryRunnable(ExecutorDelivery, Request, Response, Runnable)>
	//   14   25:invokeinterface #49  <Method void Executor.execute(Runnable)>
	//   15   30:return          
	}

	private final Executor mResponsePoster;
}
