// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.os.*;
import com.facebook.internal.Utility;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.facebook:
//			GraphRequestBatch, GraphRequest, FacebookSdk

public class GraphRequestAsyncTask extends AsyncTask
{

	public GraphRequestAsyncTask(GraphRequestBatch graphrequestbatch)
	{
		this(((HttpURLConnection) (null)), graphrequestbatch);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokespecial   #29  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    4    6:return          
	}

	public GraphRequestAsyncTask(HttpURLConnection httpurlconnection, GraphRequestBatch graphrequestbatch)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AsyncTask()>
		requests = graphrequestbatch;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #33  <Field GraphRequestBatch requests>
		connection = httpurlconnection;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #35  <Field HttpURLConnection connection>
	//    8   14:return          
	}

	public GraphRequestAsyncTask(HttpURLConnection httpurlconnection, Collection collection)
	{
		this(httpurlconnection, new GraphRequestBatch(collection));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #38  <Class GraphRequestBatch>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #41  <Method void GraphRequestBatch(Collection)>
	//    6   10:invokespecial   #29  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    7   13:return          
	}

	public transient GraphRequestAsyncTask(HttpURLConnection httpurlconnection, GraphRequest agraphrequest[])
	{
		this(httpurlconnection, new GraphRequestBatch(agraphrequest));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #38  <Class GraphRequestBatch>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #47  <Method void GraphRequestBatch(GraphRequest[])>
	//    6   10:invokespecial   #29  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    7   13:return          
	}

	public GraphRequestAsyncTask(Collection collection)
	{
		this(((HttpURLConnection) (null)), new GraphRequestBatch(collection));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #38  <Class GraphRequestBatch>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokespecial   #41  <Method void GraphRequestBatch(Collection)>
	//    6   10:invokespecial   #29  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    7   13:return          
	}

	public transient GraphRequestAsyncTask(GraphRequest agraphrequest[])
	{
		this(((HttpURLConnection) (null)), new GraphRequestBatch(agraphrequest));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:new             #38  <Class GraphRequestBatch>
	//    3    5:dup             
	//    4    6:aload_1         
	//    5    7:invokespecial   #47  <Method void GraphRequestBatch(GraphRequest[])>
	//    6   10:invokespecial   #29  <Method void GraphRequestAsyncTask(HttpURLConnection, GraphRequestBatch)>
	//    7   13:return          
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((Void[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class Void[]>
	//    3    5:invokevirtual   #55  <Method List doInBackground(Void[])>
	//    4    8:areturn         
	}

	protected transient List doInBackground(Void avoid[])
	{
		try
		{
			if(connection == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field HttpURLConnection connection>
	//*   2    4:ifnonnull       15
				return requests.executeAndWait();
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field GraphRequestBatch requests>
	//    5   11:invokevirtual   #61  <Method List GraphRequestBatch.executeAndWait()>
	//    6   14:areturn         
			avoid = ((Void []) (GraphRequest.executeConnectionAndWait(connection, requests)));
	//    7   15:aload_0         
	//    8   16:getfield        #35  <Field HttpURLConnection connection>
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field GraphRequestBatch requests>
	//   11   23:invokestatic    #67  <Method List GraphRequest.executeConnectionAndWait(HttpURLConnection, GraphRequestBatch)>
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
	//   18   32:putfield        #69  <Field Exception exception>
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		}
		return ((List) (avoid));
	}

	protected final Exception getException()
	{
		return exception;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Exception exception>
	//    2    4:areturn         
	}

	protected final GraphRequestBatch getRequests()
	{
		return requests;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field GraphRequestBatch requests>
	//    2    4:areturn         
	}

	protected volatile void onPostExecute(Object obj)
	{
		onPostExecute((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #78  <Class List>
	//    3    5:invokevirtual   #81  <Method void onPostExecute(List)>
	//    4    8:return          
	}

	protected void onPostExecute(List list)
	{
		super.onPostExecute(((Object) (list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void AsyncTask.onPostExecute(Object)>
		list = ((List) (exception));
	//    3    5:aload_0         
	//    4    6:getfield        #69  <Field Exception exception>
	//    5    9:astore_1        
		if(list != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          36
			Utility.logd(TAG, String.format("onPostExecute: exception encountered during request: %s", new Object[] {
				((Exception) (list)).getMessage()
			}));
	//    8   14:getstatic       #23  <Field String TAG>
	//    9   17:ldc1            #85  <String "onPostExecute: exception encountered during request: %s">
	//   10   19:iconst_1        
	//   11   20:anewarray       Object[]
	//   12   23:dup             
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #90  <Method String Exception.getMessage()>
	//   16   29:aastore         
	//   17   30:invokestatic    #96  <Method String String.format(String, Object[])>
	//   18   33:invokestatic    #102 <Method void Utility.logd(String, String)>
	//   19   36:return          
	}

	protected void onPreExecute()
	{
		super.onPreExecute();
	//    0    0:aload_0         
	//    1    1:invokespecial   #106 <Method void AsyncTask.onPreExecute()>
		if(FacebookSdk.isDebugEnabled())
	//*   2    4:invokestatic    #112 <Method boolean FacebookSdk.isDebugEnabled()>
	//*   3    7:ifeq            29
			Utility.logd(TAG, String.format("execute async task: %s", new Object[] {
				this
			}));
	//    4   10:getstatic       #23  <Field String TAG>
	//    5   13:ldc1            #114 <String "execute async task: %s">
	//    6   15:iconst_1        
	//    7   16:anewarray       Object[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:aload_0         
	//   11   22:aastore         
	//   12   23:invokestatic    #96  <Method String String.format(String, Object[])>
	//   13   26:invokestatic    #102 <Method void Utility.logd(String, String)>
		if(requests.getCallbackHandler() == null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #33  <Field GraphRequestBatch requests>
	//*  16   33:invokevirtual   #118 <Method Handler GraphRequestBatch.getCallbackHandler()>
	//*  17   36:ifnonnull       78
		{
			Handler handler;
			if(Thread.currentThread() instanceof HandlerThread)
	//*  18   39:invokestatic    #124 <Method Thread Thread.currentThread()>
	//*  19   42:instanceof      #126 <Class HandlerThread>
	//*  20   45:ifeq            59
				handler = new Handler();
	//   21   48:new             #128 <Class Handler>
	//   22   51:dup             
	//   23   52:invokespecial   #129 <Method void Handler()>
	//   24   55:astore_1        
			else
	//*  25   56:goto            70
				handler = new Handler(Looper.getMainLooper());
	//   26   59:new             #128 <Class Handler>
	//   27   62:dup             
	//   28   63:invokestatic    #135 <Method Looper Looper.getMainLooper()>
	//   29   66:invokespecial   #138 <Method void Handler(Looper)>
	//   30   69:astore_1        
			requests.setCallbackHandler(handler);
	//   31   70:aload_0         
	//   32   71:getfield        #33  <Field GraphRequestBatch requests>
	//   33   74:aload_1         
	//   34   75:invokevirtual   #142 <Method void GraphRequestBatch.setCallbackHandler(Handler)>
		}
	//   35   78:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #145 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{RequestAsyncTask: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #148 <String "{RequestAsyncTask: ">
	//    6   11:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(" connection: ");
	//    8   15:aload_1         
	//    9   16:ldc1            #154 <String " connection: ">
	//   10   18:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(((Object) (connection)));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #35  <Field HttpURLConnection connection>
	//   15   27:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   16   30:pop             
		stringbuilder.append(", requests: ");
	//   17   31:aload_1         
	//   18   32:ldc1            #159 <String ", requests: ">
	//   19   34:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(((Object) (requests)));
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #33  <Field GraphRequestBatch requests>
	//   24   43:invokevirtual   #157 <Method StringBuilder StringBuilder.append(Object)>
	//   25   46:pop             
		stringbuilder.append("}");
	//   26   47:aload_1         
	//   27   48:ldc1            #161 <String "}">
	//   28   50:invokevirtual   #152 <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
		return stringbuilder.toString();
	//   30   54:aload_1         
	//   31   55:invokevirtual   #163 <Method String StringBuilder.toString()>
	//   32   58:areturn         
	}

	private static final String TAG = ((Class) (com/facebook/GraphRequestAsyncTask)).getCanonicalName();
	private final HttpURLConnection connection;
	private Exception exception;
	private final GraphRequestBatch requests;

	static 
	{
	//    0    0:ldc1            #2   <Class GraphRequestAsyncTask>
	//    1    2:invokevirtual   #21  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #23  <Field String TAG>
	//*   3    8:return          
	}
}
