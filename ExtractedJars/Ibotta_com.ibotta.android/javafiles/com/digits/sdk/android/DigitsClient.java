// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;
import java.util.*;

// Referenced classes of package com.digits.sdk.android:
//			Digits, DigitsAuthRequestQueue, DigitsGuestSessionProvider, DigitsApiClient, 
//			DigitsUserAgent, Verification

public class DigitsClient
{
	static abstract class CallbackWrapper extends Callback
	{

		public void failure(TwitterException twitterexception)
		{
			Callback callback1 = callback;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Callback callback>
		//    2    4:astore_2        
			if(callback1 != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          14
				callback1.failure(twitterexception);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #25  <Method void Callback.failure(TwitterException)>
		//    8   14:return          
		}

		final Callback callback;

		public CallbackWrapper(Callback callback1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Callback()>
			callback = callback1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field Callback callback>
		//    5    9:return          
		}
	}


	DigitsClient()
	{
		this(Digits.getInstance(), TwitterCore.getInstance(), Digits.getSessionManager(), ((DigitsAuthRequestQueue) (null)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method Digits Digits.getInstance()>
	//    2    4:invokestatic    #41  <Method TwitterCore TwitterCore.getInstance()>
	//    3    7:invokestatic    #45  <Method SessionManager Digits.getSessionManager()>
	//    4   10:aconst_null     
	//    5   11:invokespecial   #48  <Method void DigitsClient(Digits, TwitterCore, SessionManager, DigitsAuthRequestQueue)>
	//    6   14:return          
	}

	DigitsClient(Digits digits1, TwitterCore twittercore, SessionManager sessionmanager, DigitsAuthRequestQueue digitsauthrequestqueue)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		if(twittercore != null)
	//*   2    4:aload_2         
	//*   3    5:ifnull          81
		{
			if(digits1 != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          71
			{
				if(sessionmanager != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          61
				{
					twitterCore = twittercore;
	//    8   16:aload_0         
	//    9   17:aload_2         
	//   10   18:putfield        #53  <Field TwitterCore twitterCore>
					digits = digits1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #55  <Field Digits digits>
					sessionManager = sessionmanager;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #57  <Field SessionManager sessionManager>
					if(digitsauthrequestqueue == null)
	//*  17   31:aload           4
	//*  18   33:ifnonnull       54
					{
						authRequestQueue = createAuthRequestQueue(sessionmanager);
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:aload_3         
	//   22   39:invokevirtual   #61  <Method DigitsAuthRequestQueue createAuthRequestQueue(SessionManager)>
	//   23   42:putfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
						authRequestQueue.sessionRestored(((Session) (null)));
	//   24   45:aload_0         
	//   25   46:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//   26   49:aconst_null     
	//   27   50:invokevirtual   #69  <Method void DigitsAuthRequestQueue.sessionRestored(Session)>
						return;
	//   28   53:return          
					} else
					{
						authRequestQueue = digitsauthrequestqueue;
	//   29   54:aload_0         
	//   30   55:aload           4
	//   31   57:putfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
						return;
	//   32   60:return          
					}
				} else
				{
					throw new IllegalArgumentException("sessionManager must not be null");
	//   33   61:new             #71  <Class IllegalArgumentException>
	//   34   64:dup             
	//   35   65:ldc1            #73  <String "sessionManager must not be null">
	//   36   67:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   37   70:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("digits must not be null");
	//   38   71:new             #71  <Class IllegalArgumentException>
	//   39   74:dup             
	//   40   75:ldc1            #78  <String "digits must not be null">
	//   41   77:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   42   80:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("twitter must not be null");
	//   43   81:new             #71  <Class IllegalArgumentException>
	//   44   84:dup             
	//   45   85:ldc1            #80  <String "twitter must not be null">
	//   46   87:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   47   90:athrow          
		}
	}

	protected void authDevice(final String phoneNumber, Verification verification, final Callback final_callback)
	{
		authRequestQueue.addClientRequest(((Callback) (new CallbackWrapper(verification) {

			public void success(Result result)
			{
				((DigitsApiClient)result.data).getSdkService().auth(phoneNumber, verificationType.name(), callback);
			//    0    0:aload_1         
			//    1    1:getfield        #36  <Field Object Result.data>
			//    2    4:checkcast       #38  <Class DigitsApiClient>
			//    3    7:invokevirtual   #42  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field String val$phoneNumber>
			//    6   14:aload_0         
			//    7   15:getfield        #24  <Field Verification val$verificationType>
			//    8   18:invokevirtual   #48  <Method String Verification.name()>
			//    9   21:aload_0         
			//   10   22:getfield        #52  <Field Callback callback>
			//   11   25:invokeinterface #58  <Method void DigitsApiClient$SdkService.auth(String, String, Callback)>
			//   12   30:return          
			}

			final DigitsClient this$0;
			final String val$phoneNumber;
			final Verification val$verificationType;

			
			{
				this$0 = DigitsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DigitsClient this$0>
				phoneNumber = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field String val$phoneNumber>
				verificationType = verification;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field Verification val$verificationType>
				super(final_callback);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void DigitsClient$CallbackWrapper(Callback)>
			//   12   21:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//    2    4:new             #6   <Class DigitsClient$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #87  <Method void DigitsClient$1(DigitsClient, Callback, String, Verification)>
	//    9   15:invokevirtual   #91  <Method boolean DigitsAuthRequestQueue.addClientRequest(Callback)>
	//   10   18:pop             
	//   11   19:return          
	}

	protected void createAccount(String s, final String phoneNumber, final Callback final_callback)
	{
		authRequestQueue.addClientRequest(((Callback) (new CallbackWrapper(s) {

			public void success(Result result)
			{
				((DigitsApiClient)result.data).getSdkService().account(phoneNumber, pin, callback);
			//    0    0:aload_1         
			//    1    1:getfield        #35  <Field Object Result.data>
			//    2    4:checkcast       #37  <Class DigitsApiClient>
			//    3    7:invokevirtual   #41  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field String val$phoneNumber>
			//    6   14:aload_0         
			//    7   15:getfield        #23  <Field String val$pin>
			//    8   18:aload_0         
			//    9   19:getfield        #45  <Field Callback callback>
			//   10   22:invokeinterface #50  <Method void DigitsApiClient$SdkService.account(String, String, Callback)>
			//   11   27:return          
			}

			final DigitsClient this$0;
			final String val$phoneNumber;
			final String val$pin;

			
			{
				this$0 = DigitsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DigitsClient this$0>
				phoneNumber = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #21  <Field String val$phoneNumber>
				pin = s1;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #23  <Field String val$pin>
				super(final_callback);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #26  <Method void DigitsClient$CallbackWrapper(Callback)>
			//   12   21:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//    2    4:new             #8   <Class DigitsClient$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokespecial   #97  <Method void DigitsClient$2(DigitsClient, Callback, String, String)>
	//    9   15:invokevirtual   #91  <Method boolean DigitsAuthRequestQueue.addClientRequest(Callback)>
	//   10   18:pop             
	//   11   19:return          
	}

	protected DigitsAuthRequestQueue createAuthRequestQueue(SessionManager sessionmanager)
	{
		ArrayList arraylist = new ArrayList(1);
	//    0    0:new             #100 <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:invokespecial   #103 <Method void ArrayList(int)>
	//    4    8:astore_2        
		((List) (arraylist)).add(((Object) (sessionmanager)));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #109 <Method boolean List.add(Object)>
	//    8   16:pop             
		return new DigitsAuthRequestQueue(this, ((com.twitter.sdk.android.core.internal.SessionProvider) (new DigitsGuestSessionProvider(sessionmanager, ((List) (arraylist))))));
	//    9   17:new             #65  <Class DigitsAuthRequestQueue>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:new             #111 <Class DigitsGuestSessionProvider>
	//   13   25:dup             
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokespecial   #114 <Method void DigitsGuestSessionProvider(SessionManager, List)>
	//   17   31:invokespecial   #117 <Method void DigitsAuthRequestQueue(DigitsClient, com.twitter.sdk.android.core.internal.SessionProvider)>
	//   18   34:areturn         
	}

	DigitsApiClient getApiClient(Session session)
	{
		DigitsApiClient digitsapiclient = digitsApiClient;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field DigitsApiClient digitsApiClient>
	//    2    4:astore_2        
		if(digitsapiclient != null && digitsapiclient.getSession().equals(((Object) (session))))
	//*   3    5:aload_2         
	//*   4    6:ifnull          25
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #127 <Method Session DigitsApiClient.getSession()>
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #132 <Method boolean Session.equals(Object)>
	//*   9   17:ifeq            25
		{
			return digitsApiClient;
	//   10   20:aload_0         
	//   11   21:getfield        #121 <Field DigitsApiClient digitsApiClient>
	//   12   24:areturn         
		} else
		{
			digitsApiClient = new DigitsApiClient(session, twitterCore.getAuthConfig(), twitterCore.getSSLSocketFactory(), digits.getExecutorService(), new DigitsUserAgent(digits.getVersion(), android.os.Build.VERSION.RELEASE));
	//   13   25:aload_0         
	//   14   26:new             #123 <Class DigitsApiClient>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:aload_0         
	//   18   32:getfield        #53  <Field TwitterCore twitterCore>
	//   19   35:invokevirtual   #136 <Method com.twitter.sdk.android.core.TwitterAuthConfig TwitterCore.getAuthConfig()>
	//   20   38:aload_0         
	//   21   39:getfield        #53  <Field TwitterCore twitterCore>
	//   22   42:invokevirtual   #140 <Method javax.net.ssl.SSLSocketFactory TwitterCore.getSSLSocketFactory()>
	//   23   45:aload_0         
	//   24   46:getfield        #55  <Field Digits digits>
	//   25   49:invokevirtual   #144 <Method java.util.concurrent.ExecutorService Digits.getExecutorService()>
	//   26   52:new             #146 <Class DigitsUserAgent>
	//   27   55:dup             
	//   28   56:aload_0         
	//   29   57:getfield        #55  <Field Digits digits>
	//   30   60:invokevirtual   #150 <Method String Digits.getVersion()>
	//   31   63:getstatic       #156 <Field String android.os.Build$VERSION.RELEASE>
	//   32   66:invokespecial   #159 <Method void DigitsUserAgent(String, String)>
	//   33   69:invokespecial   #162 <Method void DigitsApiClient(Session, com.twitter.sdk.android.core.TwitterAuthConfig, javax.net.ssl.SSLSocketFactory, java.util.concurrent.ExecutorService, DigitsUserAgent)>
	//   34   72:putfield        #121 <Field DigitsApiClient digitsApiClient>
			return digitsApiClient;
	//   35   75:aload_0         
	//   36   76:getfield        #121 <Field DigitsApiClient digitsApiClient>
	//   37   79:areturn         
		}
	}

	protected void loginDevice(final String requestId, final long userId, String s, final Callback final_callback)
	{
		authRequestQueue.addClientRequest(((Callback) (new CallbackWrapper(s) {

			public void success(Result result)
			{
				((DigitsApiClient)result.data).getSdkService().login(requestId, userId, code, callback);
			//    0    0:aload_1         
			//    1    1:getfield        #39  <Field Object Result.data>
			//    2    4:checkcast       #41  <Class DigitsApiClient>
			//    3    7:invokevirtual   #45  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field String val$requestId>
			//    6   14:aload_0         
			//    7   15:getfield        #25  <Field long val$userId>
			//    8   18:aload_0         
			//    9   19:getfield        #27  <Field String val$code>
			//   10   22:aload_0         
			//   11   23:getfield        #49  <Field Callback callback>
			//   12   26:invokeinterface #54  <Method void DigitsApiClient$SdkService.login(String, long, String, Callback)>
			//   13   31:return          
			}

			final DigitsClient this$0;
			final String val$code;
			final String val$requestId;
			final long val$userId;

			
			{
				this$0 = DigitsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsClient this$0>
				requestId = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field String val$requestId>
				userId = l;
			//    6   10:aload_0         
			//    7   11:lload           4
			//    8   13:putfield        #25  <Field long val$userId>
				code = s1;
			//    9   16:aload_0         
			//   10   17:aload           6
			//   11   19:putfield        #27  <Field String val$code>
				super(final_callback);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #30  <Method void DigitsClient$CallbackWrapper(Callback)>
			//   15   27:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//    2    4:new             #10  <Class DigitsClient$3>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload           5
	//    6   11:aload_1         
	//    7   12:lload_2         
	//    8   13:aload           4
	//    9   15:invokespecial   #167 <Method void DigitsClient$3(DigitsClient, Callback, String, long, String)>
	//   10   18:invokevirtual   #91  <Method boolean DigitsAuthRequestQueue.addClientRequest(Callback)>
	//   11   21:pop             
	//   12   22:return          
	}

	protected void registerDevice(final String phoneNumber, Verification verification, final Callback final_callback)
	{
		authRequestQueue.addClientRequest(((Callback) (new CallbackWrapper(verification) {

			public void success(Result result)
			{
				((DigitsApiClient)result.data).getDeviceService().register(phoneNumber, "third_party_confirmation_code", Boolean.valueOf(true), Locale.getDefault().getLanguage(), "digits_sdk", verificationType.name(), callback);
			//    0    0:aload_1         
			//    1    1:getfield        #36  <Field Object Result.data>
			//    2    4:checkcast       #38  <Class DigitsApiClient>
			//    3    7:invokevirtual   #42  <Method DigitsApiClient$DeviceService DigitsApiClient.getDeviceService()>
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field String val$phoneNumber>
			//    6   14:ldc1            #44  <String "third_party_confirmation_code">
			//    7   16:iconst_1        
			//    8   17:invokestatic    #50  <Method Boolean Boolean.valueOf(boolean)>
			//    9   20:invokestatic    #56  <Method Locale Locale.getDefault()>
			//   10   23:invokevirtual   #60  <Method String Locale.getLanguage()>
			//   11   26:ldc1            #62  <String "digits_sdk">
			//   12   28:aload_0         
			//   13   29:getfield        #24  <Field Verification val$verificationType>
			//   14   32:invokevirtual   #67  <Method String Verification.name()>
			//   15   35:aload_0         
			//   16   36:getfield        #71  <Field Callback callback>
			//   17   39:invokeinterface #77  <Method void DigitsApiClient$DeviceService.register(String, String, Boolean, String, String, String, Callback)>
			//   18   44:return          
			}

			final DigitsClient this$0;
			final String val$phoneNumber;
			final Verification val$verificationType;

			
			{
				this$0 = DigitsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field DigitsClient this$0>
				phoneNumber = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #22  <Field String val$phoneNumber>
				verificationType = verification;
			//    6   10:aload_0         
			//    7   11:aload           4
			//    8   13:putfield        #24  <Field Verification val$verificationType>
				super(final_callback);
			//    9   16:aload_0         
			//   10   17:aload_2         
			//   11   18:invokespecial   #27  <Method void DigitsClient$CallbackWrapper(Callback)>
			//   12   21:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//    2    4:new             #12  <Class DigitsClient$4>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokespecial   #170 <Method void DigitsClient$4(DigitsClient, Callback, String, Verification)>
	//    9   15:invokevirtual   #91  <Method boolean DigitsAuthRequestQueue.addClientRequest(Callback)>
	//   10   18:pop             
	//   11   19:return          
	}

	protected void verifyPin(final String requestId, final long userId, String s, final Callback final_callback)
	{
		authRequestQueue.addClientRequest(((Callback) (new CallbackWrapper(s) {

			public void success(Result result)
			{
				((DigitsApiClient)result.data).getSdkService().verifyPin(requestId, userId, pin, callback);
			//    0    0:aload_1         
			//    1    1:getfield        #39  <Field Object Result.data>
			//    2    4:checkcast       #41  <Class DigitsApiClient>
			//    3    7:invokevirtual   #45  <Method DigitsApiClient$SdkService DigitsApiClient.getSdkService()>
			//    4   10:aload_0         
			//    5   11:getfield        #23  <Field String val$requestId>
			//    6   14:aload_0         
			//    7   15:getfield        #25  <Field long val$userId>
			//    8   18:aload_0         
			//    9   19:getfield        #27  <Field String val$pin>
			//   10   22:aload_0         
			//   11   23:getfield        #49  <Field Callback callback>
			//   12   26:invokeinterface #52  <Method void DigitsApiClient$SdkService.verifyPin(String, long, String, Callback)>
			//   13   31:return          
			}

			final DigitsClient this$0;
			final String val$pin;
			final String val$requestId;
			final long val$userId;

			
			{
				this$0 = DigitsClient.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field DigitsClient this$0>
				requestId = s;
			//    3    5:aload_0         
			//    4    6:aload_3         
			//    5    7:putfield        #23  <Field String val$requestId>
				userId = l;
			//    6   10:aload_0         
			//    7   11:lload           4
			//    8   13:putfield        #25  <Field long val$userId>
				pin = s1;
			//    9   16:aload_0         
			//   10   17:aload           6
			//   11   19:putfield        #27  <Field String val$pin>
				super(final_callback);
			//   12   22:aload_0         
			//   13   23:aload_2         
			//   14   24:invokespecial   #30  <Method void DigitsClient$CallbackWrapper(Callback)>
			//   15   27:return          
			}
		}
)));
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field DigitsAuthRequestQueue authRequestQueue>
	//    2    4:new             #14  <Class DigitsClient$5>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload           5
	//    6   11:aload_1         
	//    7   12:lload_2         
	//    8   13:aload           4
	//    9   15:invokespecial   #173 <Method void DigitsClient$5(DigitsClient, Callback, String, long, String)>
	//   10   18:invokevirtual   #91  <Method boolean DigitsAuthRequestQueue.addClientRequest(Callback)>
	//   11   21:pop             
	//   12   22:return          
	}

	private final DigitsAuthRequestQueue authRequestQueue;
	private final Digits digits;
	private DigitsApiClient digitsApiClient;
	private final SessionManager sessionManager;
	private final TwitterCore twitterCore;
}
