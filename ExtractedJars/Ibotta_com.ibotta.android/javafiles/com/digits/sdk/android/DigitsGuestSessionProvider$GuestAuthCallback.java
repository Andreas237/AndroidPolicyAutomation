// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;

// Referenced classes of package com.digits.sdk.android:
//			DigitsGuestSessionProvider, DigitsSession

static class DigitsGuestSessionProvider$GuestAuthCallback extends Callback
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

	DigitsGuestSessionProvider$GuestAuthCallback(SessionManager sessionmanager, Callback callback1)
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
