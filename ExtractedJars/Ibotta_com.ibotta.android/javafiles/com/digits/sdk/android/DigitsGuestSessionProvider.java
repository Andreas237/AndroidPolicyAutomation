// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.core.internal.SessionProvider;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Service;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.util.List;

// Referenced classes of package com.digits.sdk.android:
//			DigitsApi, DigitsSession

class DigitsGuestSessionProvider extends SessionProvider
{
	static class GuestAuthCallback extends Callback
	{

		public void failure(TwitterException twitterexception)
		{
			Callback callback1 = callback;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Callback callback>
		//    2    4:astore_2        
			if(callback1 != null)
		//*   3    5:aload_2         
		//*   4    6:ifnull          14
				callback1.failure(twitterexception);
		//    5    9:aload_2         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #30  <Method void Callback.failure(TwitterException)>
		//    8   14:return          
		}

		public void success(Result result)
		{
			DigitsSession digitssession = new DigitsSession((OAuth2Token)result.data);
		//    0    0:new             #34  <Class DigitsSession>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:getfield        #40  <Field Object Result.data>
		//    4    8:checkcast       #42  <Class OAuth2Token>
		//    5   11:invokespecial   #45  <Method void DigitsSession(OAuth2Token)>
		//    6   14:astore_2        
			sessionManager.setSession(digitssession.getId(), ((com.twitter.sdk.android.core.Session) (digitssession)));
		//    7   15:aload_0         
		//    8   16:getfield        #21  <Field SessionManager sessionManager>
		//    9   19:aload_2         
		//   10   20:invokevirtual   #49  <Method long DigitsSession.getId()>
		//   11   23:aload_2         
		//   12   24:invokeinterface #55  <Method void SessionManager.setSession(long, com.twitter.sdk.android.core.Session)>
			Callback callback1 = callback;
		//   13   29:aload_0         
		//   14   30:getfield        #23  <Field Callback callback>
		//   15   33:astore_3        
			if(callback1 != null)
		//*  16   34:aload_3         
		//*  17   35:ifnull          54
				callback1.success(new Result(((Object) (digitssession)), result.response));
		//   18   38:aload_3         
		//   19   39:new             #36  <Class Result>
		//   20   42:dup             
		//   21   43:aload_2         
		//   22   44:aload_1         
		//   23   45:getfield        #59  <Field retrofit.client.Response Result.response>
		//   24   48:invokespecial   #62  <Method void Result(Object, retrofit.client.Response)>
		//   25   51:invokevirtual   #64  <Method void Callback.success(Result)>
		//   26   54:return          
		}

		final Callback callback;
		final SessionManager sessionManager;

		GuestAuthCallback(SessionManager sessionmanager, Callback callback1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Callback()>
			sessionManager = sessionmanager;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field SessionManager sessionManager>
			callback = callback1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #23  <Field Callback callback>
		//    8   14:return          
		}
	}


	DigitsGuestSessionProvider(SessionManager sessionmanager, List list)
	{
		this(sessionmanager, list, new OAuth2Service(TwitterCore.getInstance(), ((javax.net.ssl.SSLSocketFactory) (null)), ((com.twitter.sdk.android.core.internal.TwitterApi) (new DigitsApi()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #16  <Class OAuth2Service>
	//    4    6:dup             
	//    5    7:invokestatic    #22  <Method TwitterCore TwitterCore.getInstance()>
	//    6   10:aconst_null     
	//    7   11:new             #24  <Class DigitsApi>
	//    8   14:dup             
	//    9   15:invokespecial   #27  <Method void DigitsApi()>
	//   10   18:invokespecial   #30  <Method void OAuth2Service(TwitterCore, javax.net.ssl.SSLSocketFactory, com.twitter.sdk.android.core.internal.TwitterApi)>
	//   11   21:invokespecial   #33  <Method void DigitsGuestSessionProvider(SessionManager, List, OAuth2Service)>
	//   12   24:return          
	}

	DigitsGuestSessionProvider(SessionManager sessionmanager, List list, OAuth2Service oauth2service)
	{
		super(list);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #39  <Method void SessionProvider(List)>
		defaultSessionManager = sessionmanager;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #41  <Field SessionManager defaultSessionManager>
		oAuth2Service = oauth2service;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #43  <Field OAuth2Service oAuth2Service>
	//    9   15:return          
	}

	public void requestAuth(Callback callback)
	{
		oAuth2Service.requestGuestAuthToken(((Callback) (new GuestAuthCallback(defaultSessionManager, callback))));
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field OAuth2Service oAuth2Service>
	//    2    4:new             #6   <Class DigitsGuestSessionProvider$GuestAuthCallback>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #41  <Field SessionManager defaultSessionManager>
	//    6   12:aload_1         
	//    7   13:invokespecial   #49  <Method void DigitsGuestSessionProvider$GuestAuthCallback(SessionManager, Callback)>
	//    8   16:invokevirtual   #52  <Method void OAuth2Service.requestGuestAuthToken(Callback)>
	//    9   19:return          
	}

	final SessionManager defaultSessionManager;
	final OAuth2Service oAuth2Service;
}
