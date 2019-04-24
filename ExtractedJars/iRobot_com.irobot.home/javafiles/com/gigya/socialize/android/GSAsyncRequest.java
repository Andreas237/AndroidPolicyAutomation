// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.os.AsyncTask;
import com.gigya.socialize.*;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.login.providers.LoginProvider;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSSession

class GSAsyncRequest extends GSRequest
{
	private class GSRequestTask extends AsyncTask
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
				gsresponse = ((GSRequest) (agsrequest)).send(timeoutMS);
		//    4    4:aload_1         
		//    5    5:aload_0         
		//    6    6:getfield        #20  <Field GSAsyncRequest this$0>
		//    7    9:invokestatic    #44  <Method int GSAsyncRequest.access$400(GSAsyncRequest)>
		//    8   12:invokevirtual   #50  <Method GSResponse GSRequest.send(int)>
		//    9   15:astore_2        
				GSAPI.getInstance().saveTimestampOffset(
// JavaClassFileOutputException: get_constant: invalid tag

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
					GSAPI.getInstance().reportError(
// JavaClassFileOutputException: get_constant: invalid tag

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

		public GSRequestTask(GSResponseListener gsresponselistener, Object obj)
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


	public GSAsyncRequest(String s, String s1, String s2, GSObject gsobject, boolean flag, int i, GSLogger gslogger)
	{
		((GSRequest)this).GSRequest(s, s1, ((String) (null)), s2, gsobject, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:aload_3         
	//    5    5:aload           4
	//    6    7:iload           5
	//    7    9:invokespecial   #20  <Method void GSRequest(String, String, String, String, GSObject, boolean)>
		setLogger(gslogger);
	//    8   12:aload_0         
	//    9   13:aload           7
	//   10   15:invokevirtual   #24  <Method void setLogger(GSLogger)>
		timeoutMS = i;
	//   11   18:aload_0         
	//   12   19:iload           6
	//   13   21:putfield        #26  <Field int timeoutMS>
		GSRequest.timestampOffsetSec = GSAPI.getInstance().loadTimestampOffset();
	//   14   24:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//   15   27:invokevirtual   #36  <Method long GSAPI.loadTimestampOffset()>
	//   16   30:putstatic       #40  <Field long GSRequest.timestampOffsetSec>
	//   17   33:return          
	}

	private void afterResponse(GSResponse gsresponse, Object obj)
	{
		if(!gsresponse.hasData())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #68  <Method boolean GSResponse.hasData()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(gsresponse.getErrorCode() == 0 && apiMethod.contains(".logout"))
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #72  <Method int GSResponse.getErrorCode()>
	//*   6   12:ifne            36
	//*   7   15:aload_0         
	//*   8   16:getfield        #57  <Field String apiMethod>
	//*   9   19:ldc1            #74  <String ".logout">
	//*  10   21:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//*  11   24:ifeq            36
		{
			clearSession();
	//   12   27:aload_0         
	//   13   28:invokevirtual   #84  <Method void clearSession()>
			invokeLogoutEvents();
	//   14   31:aload_0         
	//   15   32:invokevirtual   #87  <Method void invokeLogoutEvents()>
			return;
	//   16   35:return          
		}
		if(gsresponse.getErrorCode() == 0 && gsresponse.getObject("sessionInfo", ((GSObject) (null))) != null || gsresponse.getString("sessionToken", ((String) (null))) != null)
	//*  17   36:aload_1         
	//*  18   37:invokevirtual   #72  <Method int GSResponse.getErrorCode()>
	//*  19   40:ifne            53
	//*  20   43:aload_1         
	//*  21   44:ldc1            #89  <String "sessionInfo">
	//*  22   46:aconst_null     
	//*  23   47:invokevirtual   #93  <Method GSObject GSResponse.getObject(String, GSObject)>
	//*  24   50:ifnonnull       63
	//*  25   53:aload_1         
	//*  26   54:ldc1            #95  <String "sessionToken">
	//*  27   56:aconst_null     
	//*  28   57:invokevirtual   #99  <Method String GSResponse.getString(String, String)>
	//*  29   60:ifnull          163
		{
			Object obj1 = ((Object) (gsresponse.getObject("sessionInfo", ((GSObject) (null)))));
	//   30   63:aload_1         
	//   31   64:ldc1            #89  <String "sessionInfo">
	//   32   66:aconst_null     
	//   33   67:invokevirtual   #93  <Method GSObject GSResponse.getObject(String, GSObject)>
	//   34   70:astore          6
			GSObject gsobject = ((GSObject) (obj1));
	//   35   72:aload           6
	//   36   74:astore          5
			if(obj1 == null)
	//*  37   76:aload           6
	//*  38   78:ifnonnull       87
				gsobject = gsresponse.getData();
	//   39   81:aload_1         
	//   40   82:invokevirtual   #103 <Method GSObject GSResponse.getData()>
	//   41   85:astore          5
			gsresponse = ((GSResponse) (gsobject.getString("sessionToken", ((String) (null)))));
	//   42   87:aload           5
	//   43   89:ldc1            #95  <String "sessionToken">
	//   44   91:aconst_null     
	//   45   92:invokevirtual   #106 <Method String GSObject.getString(String, String)>
	//   46   95:astore_1        
			obj1 = ((Object) (gsobject.getString("sessionSecret", ((String) (null)))));
	//   47   96:aload           5
	//   48   98:ldc1            #108 <String "sessionSecret">
	//   49  100:aconst_null     
	//   50  101:invokevirtual   #106 <Method String GSObject.getString(String, String)>
	//   51  104:astore          6
			long l = gsobject.getLong("expires_in", -1L);
	//   52  106:aload           5
	//   53  108:ldc1            #110 <String "expires_in">
	//   54  110:ldc2w           #111 <Long -1L>
	//   55  113:invokevirtual   #116 <Method long GSObject.getLong(String, long)>
	//   56  116:lstore_3        
			if(gsresponse != null && obj1 != null)
	//*  57  117:aload_1         
	//*  58  118:ifnull          207
	//*  59  121:aload           6
	//*  60  123:ifnull          207
			{
				String s = getParams().getString("provider", "site");
	//   61  126:aload_0         
	//   62  127:invokevirtual   #119 <Method GSObject getParams()>
	//   63  130:ldc1            #121 <String "provider">
	//   64  132:ldc1            #123 <String "site">
	//   65  134:invokevirtual   #106 <Method String GSObject.getString(String, String)>
	//   66  137:astore          5
				gsresponse = ((GSResponse) (new GSSession(((String) (gsresponse)), ((String) (obj1)), l)));
	//   67  139:new             #125 <Class GSSession>
	//   68  142:dup             
	//   69  143:aload_1         
	//   70  144:aload           6
	//   71  146:lload_3         
	//   72  147:invokespecial   #128 <Method void GSSession(String, String, long)>
	//   73  150:astore_1        
				GSAPI.getInstance().setSession(((GSSession) (gsresponse)), s, ((GSResponseListener) (null)), obj);
	//   74  151:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//   75  154:aload_1         
	//   76  155:aload           5
	//   77  157:aconst_null     
	//   78  158:aload_2         
	//   79  159:invokevirtual   #132 <Method void GSAPI.setSession(GSSession, String, GSResponseListener, Object)>
				return;
	//   80  162:return          
			}
		} else
		if(gsresponse.getErrorCode() == 0 && apiMethod.contains(".removeConnection"))
	//*  81  163:aload_1         
	//*  82  164:invokevirtual   #72  <Method int GSResponse.getErrorCode()>
	//*  83  167:ifne            207
	//*  84  170:aload_0         
	//*  85  171:getfield        #57  <Field String apiMethod>
	//*  86  174:ldc1            #134 <String ".removeConnection">
	//*  87  176:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//*  88  179:ifeq            207
		{
			gsresponse = ((GSResponse) (getParams().getString("provider", "")));
	//   89  182:aload_0         
	//   90  183:invokevirtual   #119 <Method GSObject getParams()>
	//   91  186:ldc1            #121 <String "provider">
	//   92  188:ldc1            #136 <String "">
	//   93  190:invokevirtual   #106 <Method String GSObject.getString(String, String)>
	//   94  193:astore_1        
			GSAPI.getInstance().loginProviderFactory.getLoginProvider(((String) (gsresponse))).clearSession();
	//   95  194:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//   96  197:getfield        #140 <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//   97  200:aload_1         
	//   98  201:invokevirtual   #146 <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
	//   99  204:invokevirtual   #149 <Method void LoginProvider.clearSession()>
		}
	//  100  207:return          
	}

	private void beforeSend()
	{
		String s = getParams().getString("loginMode", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #119 <Method GSObject getParams()>
	//    2    4:ldc1            #152 <String "loginMode">
	//    3    6:aconst_null     
	//    4    7:invokevirtual   #106 <Method String GSObject.getString(String, String)>
	//    5   10:astore_2        
		boolean flag;
		if(s != null && s.equals("reAuth"))
	//*   6   11:aload_2         
	//*   7   12:ifnull          29
	//*   8   15:aload_2         
	//*   9   16:ldc1            #154 <String "reAuth">
	//*  10   18:invokevirtual   #158 <Method boolean String.equals(Object)>
	//*  11   21:ifeq            29
			flag = true;
	//   12   24:iconst_1        
	//   13   25:istore_1        
		else
	//*  14   26:goto            31
			flag = false;
	//   15   29:iconst_0        
	//   16   30:istore_1        
		if(!flag && (apiMethod.contains("accounts.login") || apiMethod.contains("notifyLogin")))
	//*  17   31:iload_1         
	//*  18   32:ifne            63
	//*  19   35:aload_0         
	//*  20   36:getfield        #57  <Field String apiMethod>
	//*  21   39:ldc1            #160 <String "accounts.login">
	//*  22   41:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//*  23   44:ifne            59
	//*  24   47:aload_0         
	//*  25   48:getfield        #57  <Field String apiMethod>
	//*  26   51:ldc1            #162 <String "notifyLogin">
	//*  27   53:invokevirtual   #80  <Method boolean String.contains(CharSequence)>
	//*  28   56:ifeq            63
			clearSession();
	//   29   59:aload_0         
	//   30   60:invokevirtual   #84  <Method void clearSession()>
	//   31   63:return          
	}

	protected void clearSession()
	{
		GSAPI.getInstance().clearSession();
	//    0    0:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #163 <Method void GSAPI.clearSession()>
	//    2    6:return          
	}

	protected void invokeLogoutEvents()
	{
		GSAPI.getInstance().invokeSocializeListeners("logout", new Object[] {
			context
		});
	//    0    0:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//    1    3:ldc1            #165 <String "logout">
	//    2    5:iconst_1        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #169 <Field Object context>
	//    8   15:aastore         
	//    9   16:invokevirtual   #173 <Method void GSAPI.invokeSocializeListeners(String, Object[])>
		GSAPI.getInstance().invokeAccountsListeners("logout", new Object[] {
			context
		});
	//   10   19:invokestatic    #32  <Method GSAPI GSAPI.getInstance()>
	//   11   22:ldc1            #165 <String "logout">
	//   12   24:iconst_1        
	//   13   25:anewarray       Object[]
	//   14   28:dup             
	//   15   29:iconst_0        
	//   16   30:aload_0         
	//   17   31:getfield        #169 <Field Object context>
	//   18   34:aastore         
	//   19   35:invokevirtual   #176 <Method void GSAPI.invokeAccountsListeners(String, Object[])>
	//   20   38:return          
	}

	public void send(GSResponseListener gsresponselistener, Object obj)
	{
		context = obj;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #169 <Field Object context>
		responseListener = gsresponselistener;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #51  <Field GSResponseListener responseListener>
		beforeSend();
	//    6   10:aload_0         
	//    7   11:invokespecial   #180 <Method void beforeSend()>
		(new ((GSRequestTask)this).GSRequestTask(new GSResponseListener() {

			public void onGSResponse(String s, GSResponse gsresponse, Object obj1)
			{
				afterResponse(gsresponse, obj1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field GSAsyncRequest this$0>
			//    2    4:aload_2         
			//    3    5:aload_3         
			//    4    6:invokestatic    #27  <Method void GSAsyncRequest.access$000(GSAsyncRequest, GSResponse, Object)>
				if(responseListener != null)
			//*   5    9:aload_0         
			//*   6   10:getfield        #17  <Field GSAsyncRequest this$0>
			//*   7   13:invokestatic    #31  <Method GSResponseListener GSAsyncRequest.access$100(GSAsyncRequest)>
			//*   8   16:ifnull          34
					responseListener.onGSResponse(s, gsresponse, obj1);
			//    9   19:aload_0         
			//   10   20:getfield        #17  <Field GSAsyncRequest this$0>
			//   11   23:invokestatic    #31  <Method GSResponseListener GSAsyncRequest.access$100(GSAsyncRequest)>
			//   12   26:aload_1         
			//   13   27:aload_2         
			//   14   28:aload_3         
			//   15   29:invokeinterface #33  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
			//   16   34:return          
			}

			final GSAsyncRequest this$0;

			
			{
				this$0 = GSAsyncRequest.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSAsyncRequest this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
, obj)).execute(((Object []) (new GSRequest[] {
			this
		})));
	//    8   14:new             #8   <Class GSAsyncRequest$GSRequestTask>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:new             #6   <Class GSAsyncRequest$1>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:invokespecial   #183 <Method void GSAsyncRequest$1(GSAsyncRequest)>
	//   15   27:aload_2         
	//   16   28:invokespecial   #186 <Method void GSAsyncRequest$GSRequestTask(GSAsyncRequest, GSResponseListener, Object)>
	//   17   31:iconst_1        
	//   18   32:anewarray       GSRequest[]
	//   19   35:dup             
	//   20   36:iconst_0        
	//   21   37:aload_0         
	//   22   38:aastore         
	//   23   39:invokevirtual   #190 <Method AsyncTask GSAsyncRequest$GSRequestTask.execute(Object[])>
	//   24   42:pop             
	//   25   43:return          
	}

	private Object context;
	private GSResponseListener responseListener;
	private int timeoutMS;


/*
	static void access$000(GSAsyncRequest gsasyncrequest, GSResponse gsresponse, Object obj)
	{
		gsasyncrequest.afterResponse(gsresponse, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #47  <Method void afterResponse(GSResponse, Object)>
		return;
	//    4    6:return          
	}

*/


/*
	static GSResponseListener access$100(GSAsyncRequest gsasyncrequest)
	{
		return gsasyncrequest.responseListener;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field GSResponseListener responseListener>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(GSAsyncRequest gsasyncrequest)
	{
		return gsasyncrequest.apiMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String apiMethod>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(GSAsyncRequest gsasyncrequest)
	{
		return gsasyncrequest.apiMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String apiMethod>
	//    2    4:areturn         
	}

*/


/*
	static int access$400(GSAsyncRequest gsasyncrequest)
	{
		return gsasyncrequest.timeoutMS;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int timeoutMS>
	//    2    4:ireturn         
	}

*/


/*
	static long access$500()
	{
		return timestampOffsetSec;
	//    0    0:getstatic       #62  <Field long timestampOffsetSec>
	//    1    3:lreturn         
	}

*/
}
