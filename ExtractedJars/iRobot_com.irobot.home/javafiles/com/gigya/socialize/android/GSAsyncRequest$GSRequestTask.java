// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.os.AsyncTask;
import com.gigya.socialize.*;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android:
//			GSAsyncRequest, GSAPI

private class GSAsyncRequest$GSRequestTask extends AsyncTask
{

	protected transient GSResponse doInBackground(GSRequest agsrequest[])
	{
		agsrequest = ((GSRequest []) (agsrequest[0]));
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_1        
		GSResponse gsresponse;
		try
		{
			gsresponse = ((GSRequest) (agsrequest)).send(GSAsyncRequest.access$400(GSAsyncRequest.this));
	//    4    4:aload_1         
	//    5    5:aload_0         
	//    6    6:getfield        #20  <Field GSAsyncRequest this$0>
	//    7    9:invokestatic    #44  <Method int GSAsyncRequest.access$400(GSAsyncRequest)>
	//    8   12:invokevirtual   #50  <Method GSResponse GSRequest.send(int)>
	//    9   15:astore_2        
			GSAPI.getInstance().saveTimestampOffset(GSAsyncRequest.access$500());
	//   10   16:invokestatic    #56  <Method GSAPI GSAPI.getInstance()>
	//   11   19:invokestatic    #60  <Method long GSAsyncRequest.access$500()>
	//   12   22:invokevirtual   #64  <Method void GSAPI.saveTimestampOffset(long)>
		}
	//*  13   25:aload_2         
	//*  14   26:areturn         
		catch(Exception exception)
	//*  15   27:astore_2        
	//*  16   28:goto            31
		{
			if(agsrequest != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          61
				return new GSResponse(((GSRequest) (agsrequest)).getMethod(), ((GSRequest) (agsrequest)).getParams(), 0x7a120, exception.toString(), ((GSRequest) (agsrequest)).getLogger());
	//   19   35:new             #66  <Class GSResponse>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokevirtual   #69  <Method String GSRequest.getMethod()>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #73  <Method GSObject GSRequest.getParams()>
	//   25   47:ldc1            #74  <Int 0x7a120>
	//   26   49:aload_2         
	//   27   50:invokevirtual   #77  <Method String Exception.toString()>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #81  <Method com.gigya.socialize.GSLogger GSRequest.getLogger()>
	//   30   57:invokespecial   #84  <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//   31   60:areturn         
			else
				return new GSResponse("", ((GSObject) (null)), 0x7a120, exception.toString(), ((com.gigya.socialize.GSLogger) (null)));
	//   32   61:new             #66  <Class GSResponse>
	//   33   64:dup             
	//   34   65:ldc1            #86  <String "">
	//   35   67:aconst_null     
	//   36   68:ldc1            #74  <Int 0x7a120>
	//   37   70:aload_2         
	//   38   71:invokevirtual   #77  <Method String Exception.toString()>
	//   39   74:aconst_null     
	//   40   75:invokespecial   #84  <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//   41   78:areturn         
		}
		return gsresponse;
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((GSRequest[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #89  <Class GSRequest[]>
	//    3    5:invokevirtual   #91  <Method GSResponse doInBackground(GSRequest[])>
	//    4    8:areturn         
	}

	protected void onPostExecute(GSResponse gsresponse)
	{
		GSAPI.getInstance().showProgress(Boolean.valueOf(false));
	//    0    0:invokestatic    #56  <Method GSAPI GSAPI.getInstance()>
	//    1    3:iconst_0        
	//    2    4:invokestatic    #99  <Method Boolean Boolean.valueOf(boolean)>
	//    3    7:invokevirtual   #103 <Method void GSAPI.showProgress(Boolean)>
		if(asyncListener != null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #33  <Field GSResponseListener asyncListener>
	//*   6   14:ifnull          100
		{
			if(gsresponse.getErrorCode() != 0)
	//*   7   17:aload_1         
	//*   8   18:invokevirtual   #107 <Method int GSResponse.getErrorCode()>
	//*   9   21:ifeq            38
				GigyaLog.e(TAG, gsresponse.getLog());
	//   10   24:aload_0         
	//   11   25:getfield        #31  <Field String TAG>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #110 <Method String GSResponse.getLog()>
	//   14   32:invokestatic    #116 <Method void GigyaLog.e(String, String)>
			else
	//*  15   35:goto            49
				GigyaLog.d(TAG, gsresponse.getLog());
	//   16   38:aload_0         
	//   17   39:getfield        #31  <Field String TAG>
	//   18   42:aload_1         
	//   19   43:invokevirtual   #110 <Method String GSResponse.getLog()>
	//   20   46:invokestatic    #119 <Method void GigyaLog.d(String, String)>
			if(getParams().getBool("reportError", true))
	//*  21   49:aload_0         
	//*  22   50:getfield        #20  <Field GSAsyncRequest this$0>
	//*  23   53:invokevirtual   #120 <Method GSObject GSAsyncRequest.getParams()>
	//*  24   56:ldc1            #122 <String "reportError">
	//*  25   58:iconst_1        
	//*  26   59:invokevirtual   #128 <Method boolean GSObject.getBool(String, boolean)>
	//*  27   62:ifeq            79
				GSAPI.getInstance().reportError(GSAsyncRequest.access$200(GSAsyncRequest.this), gsresponse);
	//   28   65:invokestatic    #56  <Method GSAPI GSAPI.getInstance()>
	//   29   68:aload_0         
	//   30   69:getfield        #20  <Field GSAsyncRequest this$0>
	//   31   72:invokestatic    #132 <Method String GSAsyncRequest.access$200(GSAsyncRequest)>
	//   32   75:aload_1         
	//   33   76:invokevirtual   #135 <Method void GSAPI.reportError(String, GSResponse)>
			asyncListener.onGSResponse(GSAsyncRequest.access$300(GSAsyncRequest.this), gsresponse, context);
	//   34   79:aload_0         
	//   35   80:getfield        #33  <Field GSResponseListener asyncListener>
	//   36   83:aload_0         
	//   37   84:getfield        #20  <Field GSAsyncRequest this$0>
	//   38   87:invokestatic    #138 <Method String GSAsyncRequest.access$300(GSAsyncRequest)>
	//   39   90:aload_1         
	//   40   91:aload_0         
	//   41   92:getfield        #35  <Field Object context>
	//   42   95:invokeinterface #144 <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
		}
	//   43  100:return          
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((GSResponse)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #66  <Class GSResponse>
	//    3    5:invokevirtual   #147 <Method void onPostExecute(GSResponse)>
	//    4    8:return          
	}

	private String TAG;
	GSResponseListener asyncListener;
	Object context;
	final GSAsyncRequest this$0;

	public GSAsyncRequest$GSRequestTask(GSResponseListener gsresponselistener, Object obj)
	{
		this$0 = GSAsyncRequest.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field GSAsyncRequest this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void AsyncTask()>
		TAG = ((Class) (com/gigya/socialize/android/GSAsyncRequest$GSRequestTask)).getCanonicalName();
	//    5    9:aload_0         
	//    6   10:ldc1            #2   <Class GSAsyncRequest$GSRequestTask>
	//    7   12:invokevirtual   #29  <Method String Class.getCanonicalName()>
	//    8   15:putfield        #31  <Field String TAG>
		asyncListener = gsresponselistener;
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:putfield        #33  <Field GSResponseListener asyncListener>
		context = obj;
	//   12   23:aload_0         
	//   13   24:aload_3         
	//   14   25:putfield        #35  <Field Object context>
	//   15   28:return          
	}
}
