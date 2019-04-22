// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.authentication;

import com.newrelic.agent.android.instrumentation.ApacheInstrumentation;
import java.io.IOException;
import java.util.Map;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.*;

// Referenced classes of package com.firebase.client.authentication:
//			RequestHandler, AuthenticationManager, JsonBasicResponseHandler

class AuthenticationManager$8$1
	implements Runnable
{

	public void run()
	{
		val$handler.onResult(val$result);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AuthenticationManager$8 this$1>
	//    2    4:getfield        #28  <Field RequestHandler AuthenticationManager$8.val$handler>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field Map val$result>
	//    5   11:invokeinterface #34  <Method void RequestHandler.onResult(Map)>
	//    6   16:return          
	}

	final AuthenticationManager._cls8 this$1;
	final Map val$result;

	AuthenticationManager$8$1()
	{
		this$1 = final__pcls8;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AuthenticationManager$8 this$1>
		val$result = Map.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Map val$result>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/firebase/client/authentication/AuthenticationManager$8

/* anonymous class */
	class AuthenticationManager._cls8
		implements Runnable
	{

		public void run()
		{
			Object obj;
			obj = ((Object) (new BasicHttpParams()));
		//    0    0:new             #39  <Class BasicHttpParams>
		//    1    3:dup             
		//    2    4:invokespecial   #40  <Method void BasicHttpParams()>
		//    3    7:astore_1        
			HttpConnectionParams.setConnectionTimeout(((HttpParams) (obj)), 20000);
		//    4    8:aload_1         
		//    5    9:sipush          20000
		//    6   12:invokestatic    #46  <Method void HttpConnectionParams.setConnectionTimeout(HttpParams, int)>
			HttpConnectionParams.setSoTimeout(((HttpParams) (obj)), 20000);
		//    7   15:aload_1         
		//    8   16:sipush          20000
		//    9   19:invokestatic    #49  <Method void HttpConnectionParams.setSoTimeout(HttpParams, int)>
			obj = ((Object) (new DefaultHttpClient(((HttpParams) (obj)))));
		//   10   22:new             #51  <Class DefaultHttpClient>
		//   11   25:dup             
		//   12   26:aload_1         
		//   13   27:invokespecial   #54  <Method void DefaultHttpClient(HttpParams)>
		//   14   30:astore_1        
			((DefaultHttpClient) (obj)).getParams().setParameter("http.protocol.cookie-policy", "compatibility");
		//   15   31:aload_1         
		//   16   32:invokevirtual   #58  <Method HttpParams DefaultHttpClient.getParams()>
		//   17   35:ldc1            #60  <String "http.protocol.cookie-policy">
		//   18   37:ldc1            #62  <String "compatibility">
		//   19   39:invokeinterface #68  <Method HttpParams HttpParams.setParameter(String, Object)>
		//   20   44:pop             
			HttpUriRequest httpurirequest;
			JsonBasicResponseHandler jsonbasicresponsehandler;
			httpurirequest = request;
		//   21   45:aload_0         
		//   22   46:getfield        #28  <Field HttpUriRequest val$request>
		//   23   49:astore_2        
			jsonbasicresponsehandler = new JsonBasicResponseHandler();
		//   24   50:new             #70  <Class JsonBasicResponseHandler>
		//   25   53:dup             
		//   26   54:invokespecial   #71  <Method void JsonBasicResponseHandler()>
		//   27   57:astore_3        
			if(!(obj instanceof HttpClient))
		//*  28   58:aload_1         
		//*  29   59:instanceof      #73  <Class HttpClient>
		//*  30   62:ifne            75
			{
				obj = ((DefaultHttpClient) (obj)).execute(httpurirequest, ((org.apache.http.client.ResponseHandler) (jsonbasicresponsehandler)));
		//   31   65:aload_1         
		//   32   66:aload_2         
		//   33   67:aload_3         
		//   34   68:invokevirtual   #77  <Method Object DefaultHttpClient.execute(HttpUriRequest, org.apache.http.client.ResponseHandler)>
		//   35   71:astore_1        
				break MISSING_BLOCK_LABEL_85;
		//   36   72:goto            85
			}
			obj = ApacheInstrumentation.execute((HttpClient)obj, httpurirequest, ((org.apache.http.client.ResponseHandler) (jsonbasicresponsehandler)));
		//   37   75:aload_1         
		//   38   76:checkcast       #73  <Class HttpClient>
		//   39   79:aload_2         
		//   40   80:aload_3         
		//   41   81:invokestatic    #82  <Method Object ApacheInstrumentation.execute(HttpClient, HttpUriRequest, org.apache.http.client.ResponseHandler)>
		//   42   84:astore_1        
			obj = ((Object) ((Map)obj));
		//   43   85:aload_1         
		//   44   86:checkcast       #84  <Class Map>
		//   45   89:astore_1        
			if(obj != null)
		//*  46   90:aload_1         
		//*  47   91:ifnull          111
			{
				try
				{
					AuthenticationManager.access$600(AuthenticationManager.this, ((Runnable) (((AuthenticationManager._cls8._cls1) (obj)). new AuthenticationManager._cls8._cls1())));
		//   48   94:aload_0         
		//   49   95:getfield        #26  <Field AuthenticationManager this$0>
		//   50   98:new             #13  <Class AuthenticationManager$8$1>
		//   51  101:dup             
		//   52  102:aload_0         
		//   53  103:aload_1         
		//   54  104:invokespecial   #87  <Method void AuthenticationManager$8$1(AuthenticationManager$8, Map)>
		//   55  107:invokestatic    #91  <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
					return;
		//   56  110:return          
				}
		//*  57  111:new             #37  <Class IOException>
		//*  58  114:dup             
		//*  59  115:ldc1            #93  <String "Authentication server did not respond with a valid response">
		//*  60  117:invokespecial   #96  <Method void IOException(String)>
		//*  61  120:athrow          
				catch(final IOException e)
		//*  62  121:astore_1        
				{
					AuthenticationManager.access$600(AuthenticationManager.this, new AuthenticationManager._cls8._cls2());
		//   63  122:aload_0         
		//   64  123:getfield        #26  <Field AuthenticationManager this$0>
		//   65  126:new             #15  <Class AuthenticationManager$8$2>
		//   66  129:dup             
		//   67  130:aload_0         
		//   68  131:aload_1         
		//   69  132:invokespecial   #99  <Method void AuthenticationManager$8$2(AuthenticationManager$8, IOException)>
		//   70  135:invokestatic    #91  <Method void AuthenticationManager.access$600(AuthenticationManager, Runnable)>
				}
				break MISSING_BLOCK_LABEL_138;
			}
			throw new IOException("Authentication server did not respond with a valid response");
		//   71  138:return          
		}

		final AuthenticationManager this$0;
		final RequestHandler val$handler;
		final HttpUriRequest val$request;

			
			{
				this$0 = final_authenticationmanager;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #26  <Field AuthenticationManager this$0>
				request = httpurirequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #28  <Field HttpUriRequest val$request>
				handler = RequestHandler.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #30  <Field RequestHandler val$handler>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #33  <Method void Object()>
			//   11   19:return          
			}

		// Unreferenced inner class com/firebase/client/authentication/AuthenticationManager$8$2

/* anonymous class */
		class AuthenticationManager._cls8._cls2
			implements Runnable
		{

			public void run()
			{
				handler.onError(e);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field AuthenticationManager$8 this$1>
			//    2    4:getfield        #28  <Field RequestHandler AuthenticationManager$8.val$handler>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field IOException val$e>
			//    5   11:invokeinterface #34  <Method void RequestHandler.onError(IOException)>
			//    6   16:return          
			}

			final AuthenticationManager._cls8 this$1;
			final IOException val$e;

					
					{
						this$1 = AuthenticationManager._cls8.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field AuthenticationManager$8 this$1>
						e = ioexception;
					//    3    5:aload_0         
					//    4    6:aload_2         
					//    5    7:putfield        #21  <Field IOException val$e>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #23  <Method void Object()>
					//    8   14:return          
					}
		}

	}

}
