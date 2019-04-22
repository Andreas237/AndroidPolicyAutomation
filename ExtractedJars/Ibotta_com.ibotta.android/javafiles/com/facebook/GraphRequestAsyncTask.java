// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.*;
import android.util.Log;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.net.HttpURLConnection;
import java.util.List;

// Referenced classes of package com.facebook:
//			GraphRequestBatch, GraphRequest, FacebookSdk

public class GraphRequestAsyncTask extends AsyncTask
	implements TraceFieldInterface
{

	public GraphRequestAsyncTask(GraphRequestBatch graphrequestbatch)
	{
		this(((HttpURLConnection) (null)), graphrequestbatch);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #34  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    4    6:return          
	}

	public GraphRequestAsyncTask(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AsyncTask()>
		requests = graphrequestbatch;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #38  <Field GraphRequestBatch requests>
		connection = httpurlconnection;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #40  <Field HttpURLConnection connection>
	//    8   14:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "GraphRequestAsyncTask#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Trace _nr_trace>
	//    2    4:ldc1            #52  <String "GraphRequestAsyncTask#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #58  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "GraphRequestAsyncTask#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #52  <String "GraphRequestAsyncTask#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #58  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (doInBackground((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #60  <Class Void[]>
	//   13   25:invokevirtual   #63  <Method List doInBackground(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #66  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #70  <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   18   36:aload_1         
	//   19   37:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   20   38:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  21   39:goto            13
	}

	protected transient List doInBackground(Void avoid[])
	{
		try
		{
			if(connection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field HttpURLConnection connection>
	//*   2    4:ifnonnull       15
				return requests.executeAndWait();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field GraphRequestBatch requests>
	//    5   11:invokevirtual   #76  <Method List GraphRequestBatch.executeAndWait()>
	//    6   14:areturn         
			avoid = ((Void []) (GraphRequest.executeConnectionAndWait(connection, requests)));
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field HttpURLConnection connection>
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field GraphRequestBatch requests>
	//   11   23:invokestatic    #82  <Method List GraphRequest.executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
	//   12   26:astore_1        
		}
	//*  13   27:aload_1         
	//*  14   28:areturn         
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*  15   29:astore_1        
		{
			exception = ((Exception) (avoid));
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:putfield        #84  <Field Exception exception>
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
		return ((List) (avoid));
	}

	protected volatile void onPostExecute(Object obj)
	{
		TraceMachine.enterMethod(_nr_trace, "GraphRequestAsyncTask#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Trace _nr_trace>
	//    2    4:ldc1            #89  <String "GraphRequestAsyncTask#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #58  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "GraphRequestAsyncTask#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #89  <String "GraphRequestAsyncTask#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #58  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		onPostExecute((List)obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #91  <Class List>
	//   13   25:invokevirtual   #94  <Method void onPostExecute(List)>
		TraceMachine.exitMethod();
	//   14   28:invokestatic    #66  <Method void TraceMachine.exitMethod()>
		return;
	//   15   31:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   16   32:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  17   33:goto            13
	}

	protected void onPostExecute(List list)
	{
		super.onPostExecute(((Object) (list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void AsyncTask.onPostExecute(Object)>
		list = ((List) (exception));
	//    3    5:aload_0         
	//    4    6:getfield        #84  <Field Exception exception>
	//    5    9:astore_1        
		if(list != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          37
			Log.d(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
				((Exception) (list)).getMessage()
			}));
	//    8   14:getstatic       #28  <Field String TAG>
	//    9   17:ldc1            #98  <String "onPostExecute: exception encountered during request: %s">
	//   10   19:iconst_1        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #103 <Method String Exception.getMessage()>
	//   16   29:aastore         
	//   17   30:invokestatic    #109 <Method String String.format(String, Object[])>
	//   18   33:invokestatic    #115 <Method int Log.d(String, String)>
	//   19   36:pop             
	//   20   37:return          
	}

	protected void onPreExecute()
	{
		super.onPreExecute();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method void AsyncTask.onPreExecute()>
		if(FacebookSdk.isDebugEnabled())
	//*   2    4:invokestatic    #125 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   3    7:ifeq            30
			Log.d(TAG, String.format("execute async task: %s", new Object[] {
				this
			}));
	//    4   10:getstatic       #28  <Field String TAG>
	//    5   13:ldc1            #127 <String "execute async task: %s">
	//    6   15:iconst_1        
	//    7   16:anewarray       Object[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:aload_0         
	//   11   22:aastore         
	//   12   23:invokestatic    #109 <Method String String.format(String, Object[])>
	//   13   26:invokestatic    #115 <Method int Log.d(String, String)>
	//   14   29:pop             
		if(requests.getCallbackHandler() == null)
	//*  15   30:aload_0         
	//*  16   31:getfield        #38  <Field GraphRequestBatch requests>
	//*  17   34:invokevirtual   #131 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//*  18   37:ifnonnull       79
		{
			Handler handler;
			if(Thread.currentThread() instanceof HandlerThread)
	//*  19   40:invokestatic    #137 <Method Thread Thread.currentThread()>
	//*  20   43:instanceof      #139 <Class HandlerThread>
	//*  21   46:ifeq            60
				handler = new Handler();
	//   22   49:new             #141 <Class Handler>
	//   23   52:dup             
	//   24   53:invokespecial   #142 <Method void Handler()>
	//   25   56:astore_1        
			else
	//*  26   57:goto            71
				handler = new Handler(Looper.getMainLooper());
	//   27   60:new             #141 <Class Handler>
	//   28   63:dup             
	//   29   64:invokestatic    #148 <Method Looper Looper.getMainLooper()>
	//   30   67:invokespecial   #151 <Method void Handler(Looper)>
	//   31   70:astore_1        
			requests.setCallbackHandler(handler);
	//   32   71:aload_0         
	//   33   72:getfield        #38  <Field GraphRequestBatch requests>
	//   34   75:aload_1         
	//   35   76:invokevirtual   #155 <Method void GraphRequestBatch.setCallbackHandler(Handler)>
		}
	//   36   79:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #158 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #159 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{RequestAsyncTask: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #161 <String "{RequestAsyncTask: ">
	//    6   11:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(" connection: ");
	//    8   15:aload_1         
	//    9   16:ldc1            #167 <String " connection: ">
	//   10   18:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (connection)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #40  <Field HttpURLConnection connection>
	//   15   27:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append(", requests: ");
	//   17   31:aload_1         
	//   18   32:ldc1            #172 <String ", requests: ">
	//   19   34:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (requests)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #38  <Field GraphRequestBatch requests>
	//   24   43:invokevirtual   #170 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append("}");
	//   26   47:aload_1         
	//   27   48:ldc1            #174 <String "}">
	//   28   50:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		return stringbuilder.toString();
	//   30   54:aload_1         
	//   31   55:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   32   58:areturn         
	}

	private static final String TAG = ((Class) (com/facebook/GraphRequestAsyncTask)).getCanonicalName();
	public Trace _nr_trace;
	private final HttpURLConnection connection;
	private Exception exception;
	private final GraphRequestBatch requests;

	static 
	{
	//    0    0:ldc1            #2   <Class GraphRequestAsyncTask>
	//    1    2:invokevirtual   #26  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #28  <Field String TAG>
	//*   3    8:return          
	}
}
